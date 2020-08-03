package com.caesar;

import java.util.Scanner;

public class Caesar {

    //key
    private Scanner scanner;

    private int key(int key) {
        while(key > 26) {
            key -= 25;
        }
        return key;
    }
}
