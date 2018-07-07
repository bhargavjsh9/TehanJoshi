package com.tehanjoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class UserTest {
    //User u;
    public static void main(String[] args) throws IOException
    {
        Scanner scanInputs = new Scanner(System.in);
        UserTest ut = new UserTest();
//User users = new User();
        System.out.println("Enter the total number of users");
        int totalNumberOfUsers = scanInputs.nextInt();
        User[] userArray = new User[totalNumberOfUsers];
        if(totalNumberOfUsers > 0 )
        {
            System.out.println("Enter user details");
        }
        for (int i =0 ; i<totalNumberOfUsers;i++)
        {
            String userName;
            String firstName;
            String lastName;
            String contact;
            String line;
            String[] lineVector = new String[4];
            line = scanInputs.next();
            lineVector = line.split(",");
            userName = lineVector[0];
            firstName = lineVector[1];
            lastName = lineVector[2];
            contact = lineVector[3];
            userArray[i] = new User(userName,firstName,lastName,contact);
        }
        System.out.println("1)Search user by user name");
        System.out.println("2)Search user by first name and last name");
        int optionValue = scanInputs.nextInt();
        if(optionValue == 1)
        {
            System.out.println("Enter the user name to search");
            String searchUsername = scanInputs.next();
            if(userArray[0].findUser(userArray,searchUsername) == null)
            {
                System.out.println("User not found");;
            }
            else
            {
                User u1 = userArray[0].findUser(userArray,searchUsername);
                System.out.println("User details :");
                System.out.println("Username :" + u1.getUserName());
                System.out.println("FirstName :" + u1.getFirstName());
                System.out.println("LastName :" + u1.getLastName());
                System.out.println("Contact :" + u1.getContact());
            }
        }
        else if (optionValue == 2)
        {
            System.out.println("Enter the first name and last name to search");
            String searchFirstName = scanInputs.next();
            String searchLastName = scanInputs.next();
            if(userArray[0].findUser(userArray,searchFirstName,searchLastName) == null)
            {
                System.out.println("User not found");;
            }
            else
            {
                User u1 = userArray[0].findUser(userArray,searchFirstName,searchLastName);
                System.out.println("User details :");
                System.out.println("Username :" + u1.getUserName());
                System.out.println("FirstName :" + u1.getFirstName());
                System.out.println("LastName :" + u1.getLastName());
                System.out.println("Contact :" + u1.getContact());
            }
        }
//users.findUser(userArray, userName)
    }
}
