/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.*;
import java.io.*;


    public class Solution42 {

        public void outputFileInfo() {


            try {
                File inputFile = new File("C:\\Users\\brand\\OneDrive\\Desktop\\Java stuff\\code\\assignment4\\exercise42\\data\\exercise42_input.txt");

                Scanner fileReader = new Scanner(inputFile);

                while (fileReader.hasNextLine()) {

                    String currentEmployee = fileReader.nextLine();

                    String[] stringBuffer;

                    stringBuffer = currentEmployee.split(",");

                    System.out.printf("%-20s%-20s%-20s %n", stringBuffer[0], stringBuffer[1], stringBuffer[2]);
                }

            } catch (FileNotFoundException e) {

                System.out.println(e);
            }

        }

        public static void main(String[] args) {

            Solution42 dataInput;

            dataInput = new Solution42();

            System.out.printf("%-20s%-20s%-20s %n", "Last Name", "First Name", "Employee Salary");

            System.out.println("============================================");

            dataInput.outputFileInfo();
        }
    }

