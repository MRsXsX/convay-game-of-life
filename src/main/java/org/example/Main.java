package org.example;

import java.util.Arrays;
import java.util.Random;

import static org.example.Convay.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        int [][]blank = Convay.dead_state(20,10);
        int [][]start = Convay.rand_state(blank);


        while(true){
            Convay.display(start);
            int [][]next = Convay.next_state(start);
            Convay.display(next);
            Thread.sleep(500);
            start = next;

        }


    }}
