package org.example;

import java.util.Arrays;
import java.util.Random;

public class Convay {
    public static int [][] next_state(int [][] arr){
        int[][] copy = Arrays.stream(arr)
                .map(int[]::clone)
                .toArray(int[][]::new);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                int count=0;
                //Column count
                if(i!= arr.length-1){ //all cases except bottom one
                    count+=arr[i+1][j];
                }
                if(i!=0){
                    count+=arr[i-1][j]; //all cases except top one
                }
                //Row Count
                if(j!=0){
                    count+=arr[i][j-1]; //except left
                }
                if(j!=arr[0].length-1){
                    count+=arr[i][j+1]; //except right
                }
                if(i!=0&&j!=0){
                    count+=arr[i-1][j-1];
                }
//
                if(i!= arr.length-1&&j!=0){
                    count+=arr[i+1][j-1];
                }

                if(i!=0&&j!=arr[0].length-1){
                    count+=arr[i-1][j+1];
                }

                if(i!=arr.length-1&&j!=arr[0].length-1){
                    count+=arr[i+1][j+1];
                }

                if(arr[i][j]==0){
                    if(count==3) {
                        copy[i][j]=1; //if exactly 3 neighbours set to 1
                    }
                }
                if(arr[i][j]==1){
                    if(count==2||count==3){
                        copy[i][j]=1;
                    }
                    else copy[i][j]=0;
                }
            }
        }
        return copy;
    }
    public static int [][] rand_state(int [][] arr){
        Random random = new Random();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = random.nextInt(2);

            }
        }
        return arr;

    }
    public static int[][] dead_state(int width, int height){
        return new int[height][width];
    }
    public static void display(int [][] arr){
        System.out.print(" ");
        for(int i=0;i<arr[0].length+1;i++)
            System.out.print("-");

        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print("|");
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1){
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        System.out.print(" ");
        for(int i=0;i<arr[0].length+1;i++)
            System.out.print("-");
        System.out.println();
    }
}

