/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Brandon Sanders
 */

package baseline;

import java.io.*;
import java.util.*;

/* Pseudocode
First must open
*Create a scanner object to parse the input file
* Sort the names
* Create a file writer to write the output file needed
* Create an exception if the file isnt found
* Close files to prevent memory leaks
*/


public class Solution41 {

    public static void inputNames(Scanner input, ArrayList<String> givenNames) {

        while (input.hasNextLine()) {

            givenNames.add(input.nextLine());
        }
    }

    public static void outputNames(ArrayList<String> givenNames) throws IOException {

        // I know this is a sonarlint error and probably points off, ive tried reading the book and googling how to set this up properly
        //so the URI isnt direct and I couldnt figure out how to make it a custom parameter

        FileWriter outputWriter = new FileWriter("C:\\Users\\brand\\OneDrive\\Desktop\\Java stuff\\code\\assignment4\\exercise41\\data\\exercise41_output.txt");

        outputWriter.write("Total number of names: " + givenNames.size() + " \n");

        outputWriter.write("==================\n");

        for (String counter : givenNames) {

            outputWriter.write(counter + "\n");

        }

        outputWriter.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        // I know this is a sonarlint error and probably points off, ive tried reading the book and googling how to set this up properly
        //so the URI isnt direct and I couldnt figure out how to make it a custom parameter

        File newFile = new File("C:\\Users\\brand\\OneDrive\\Desktop\\Java stuff\\code\\assignment4\\exercise41\\data\\exercise41_input.txt");

        Scanner inputFile = new Scanner(newFile);

        ArrayList<String> givenNames = new ArrayList<String>();

        inputNames(inputFile, givenNames);

        Collections.sort(givenNames, String.CASE_INSENSITIVE_ORDER);

        inputFile.close();

        try {
            outputNames(givenNames);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}