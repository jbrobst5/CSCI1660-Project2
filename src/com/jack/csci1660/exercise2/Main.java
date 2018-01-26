package com.jack.csci1660.exercise2;

public class Main {

    /*
    Project 2 should make use of topics covered during weeks four though six.

    Create a program that allows a user to add, remove, edit, and list to-do items
    similar to the program created for Project 1.

    Individual to-do items should be represented by a class and should allow
    a title, description, and priority to be tracked with each to-do item.
    Priority should be specified using a numeric value between 0 and 5 where 5
    indicates high priority and 0 indicates low priority.

    Users should be prompted to specify the title, description, and priority when
    adding tasks.  The user should have the ability to list all tasks or list
    only tasks of a specified priority.

    The program should implement exception handling to deal with bad input from
    the user and any other exceptions that might arise.
     */

    public static void main(String[] args) {
        (new TaskManager()).main();
    }
}
