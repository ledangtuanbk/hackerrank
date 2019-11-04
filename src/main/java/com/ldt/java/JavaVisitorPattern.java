package main.java.com.ldt.java;

/**
 * @author tledang
 */

import java.util.ArrayList;
import java.util.*;

import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    int countLeaf = 0;

    public int getResult() {
        return countLeaf;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
        countLeaf += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    int product = 1;

    public int getResult() {
        return product;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            product *= node.getValue();
            product = product % 1000000007;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            product *= leaf.getValue();
            product = product % 1000000007;
        }
    }
}

class FancyVisitor extends TreeVis {
    int greenLeaf = 0;
    int evenNode = 0;

    public int getResult() {
        return Math.abs(evenNode - greenLeaf);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            evenNode += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeaf += leaf.getValue();
        }
    }
}

public class JavaVisitorPattern {

    public static Tree solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        int[] colors = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
        }


        SortedMap<Integer, Integer> leafNode = new TreeMap<>();
        SortedSet<Integer> nodes = new TreeSet<>();

        for (int i = 0; i < n - 1; i++) {
            int parent = sc.nextInt() - 1;
            int children = sc.nextInt() - 1;
            leafNode.put(children, parent);
            nodes.add(parent);
        }
        Tree root;
        if (n == 1) {
            root = new TreeLeaf(values[0], colors[0] == 0 ? Color.RED : Color.GREEN, 0);
            return root;
        }
        root = new TreeNode(values[0], colors[0] == 0 ? Color.RED : Color.GREEN, 0);
        Map<Integer, Tree> mapTree = new HashMap<>();
        mapTree.put(0, root);

        for (Map.Entry<Integer, Integer> entry : leafNode.entrySet()) {
            Integer leaf = entry.getKey();
            Integer node = entry.getValue();
            TreeNode treeNode = (TreeNode) mapTree.get(node);
            if (treeNode == null) {
                continue;
            }
            Tree tree;
            if (nodes.contains(leaf)) {
                tree = new TreeNode(values[leaf], colors[leaf] == 0 ? Color.RED : Color.GREEN, treeNode.getDepth()+1);
            } else {
                tree = new TreeLeaf(values[leaf], colors[leaf] == 0 ? Color.RED : Color.GREEN, treeNode.getDepth()+1);
            }
            mapTree.put(leaf, tree);
            treeNode.addChild(tree);
        }
        return root;
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}