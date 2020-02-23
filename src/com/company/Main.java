package com.company;

/*

0921 Method in try..catch
Write a program that will enter numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
Wrap the whole body (code inside readData) of this method in try..catch.
If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as the result.
Print numbers from a new line while maintaining input order.

Requirements:
1. The program should read data from the keyboard.
2. The main method should not be changed.
3. The main method should not throw exceptions.
4. The readData method must contain a try..catch block.
5. If the user entered text, not a number, the program should display all previously entered numbers.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.util.*;


public class Main {

        public static void main(String[] args) {
       readData();
        }

        public static void readData() {
                ArrayList<Integer> list = new ArrayList<Integer>();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                try {
                        while(true) {
                                list.add(Integer.parseInt(reader.readLine()));
                        }
                }
                catch (Exception e) {
                        for (int x : list) {
                                System.out.println(x);
                        }
                }
        }
    }






