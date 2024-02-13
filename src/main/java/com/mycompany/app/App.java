package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int result = addNumbers(5, 3);
        System.out.println("Result of adding numbers: " + result);
    }
    
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}