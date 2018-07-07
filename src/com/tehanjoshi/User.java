package com.tehanjoshi;

import java.util.Arrays;
public class User
{
    private String userName;
    private String firstName;
    private String lastName;
    private String contact;
    public User(String userName, String firstName, String lastName,String contact)
    {
        super();
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }
    public User()
    {
        this(null,null,null,null);
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public User findUser(User userArray[],String userName)
    {
        User u ;
        for (int i = 0 ; i<userArray.length ; i++)
        {
            if(userArray[i].getUserName().equals(userName) )
            {
                u = userArray[i];
                return u;
            }
        }
//Arrays.sort(userArray);
        return null;
    }
    public User findUser(User userArray[],String firstName,String lastName)
    {
        User v ;
        for (int i = 0 ; i<userArray.length ; i++)
        {
            if((userArray[i].getFirstName() + userArray[i].getLastName()).equals((firstName+lastName)) )
            {
                v = userArray[i];
                return v;
            }
        }
//Arrays.sort(userArray);
        return null;
    }
}
