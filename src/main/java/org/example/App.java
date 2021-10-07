/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Koby Montenegro
 */

package org.example;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        Map<String, String> nameInfo = new HashMap<String, String>();

        nameInfo.put("John","Johnson");
        nameInfo.put("Tou","Xiong");
        nameInfo.put("Michaela","Michaelson");
        nameInfo.put("Jake","Jacobson");
        nameInfo.put("Jacquelyn","Jackson");
        nameInfo.put("Sally","Webber");

        Map<String, String> positionInfo = new HashMap<String, String>();

        positionInfo.put("John","Manager");
        positionInfo.put("Tou","Software Engineer");
        positionInfo.put("Michaela","District Manager");
        positionInfo.put("Jake","Programmer");
        positionInfo.put("Jacquelyn","DBA");
        positionInfo.put("Sally","Web Developer");

        Map<String, String> dateInfo = new HashMap<String, String>();

        dateInfo.put("John","2016-12-31");
        dateInfo.put("Tou","2016-10-05");
        dateInfo.put("Michaela","2015-12-19");
        dateInfo.put("Jake"," ");
        dateInfo.put("Jacquelyn"," ");
        dateInfo.put("Sally","2015-12-18");

        System.out.print("Enter a search string: ");
        String search = scan.nextLine();

        System.out.println("Results: ");
        System.out.println("");

        System.out.print("Name                | Position          | Separation date\n");
        System.out.print("--------------------|-------------------|----------------\n");

        String[] first = {"Jacquelyn", "Jake", "John", "Michaela", "Sally", "Tou"};
        String[] last = {"Jackson", "Jacobson", "Johnson", "Michealson", "Webber", "Xiong"};

        //
        //Printing loop
        for(int i = 0; i<6; i++)
        {
            if(first[i].contains(search) || last[i].contains(search))
                System.out.println(first[i]+ " " + nameInfo.get(first[i]) + "   | "
            + positionInfo.get(first[i]) + "               | "+ dateInfo.get(first[i]) + "");
        }
    }
}
