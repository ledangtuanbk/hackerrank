package com.ldt.java;

/**
 * @author tledang
 */
import java.util.*;

public class Java1DArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        // Return true if you can win the game; otherwise, return false.
        int index = 0;
        int size = game.length;
        int[] mark = new int[size];
        List<Integer> buff = new ArrayList<>();
        buff.add(0);
        mark[0]=1;

        while(buff.size()>0){
            int position = buff.get(0);

            int newPosition = position-leap;
            if(newPosition>=0 && game[newPosition]==0 && mark[newPosition]==0){
                buff.add(newPosition);
                mark[newPosition]=1;
            }

            newPosition = position-1;
            if(newPosition>=0 && game[newPosition]==0 && mark[newPosition]==0){
                buff.add(newPosition);
                mark[newPosition]=1;
            }

            newPosition = position+1;
            if(newPosition>=0 && game[newPosition]==0 && mark[newPosition]==0){
                buff.add(newPosition);
                mark[newPosition]=1;
            }
            newPosition = position+leap;
            if(newPosition>=0 && game[newPosition]==0 && mark[newPosition]==0){
                buff.add(newPosition);
                mark[newPosition]=1;
                if(newPosition>size){
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}


