/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypestorage;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author tgrady4
 */
public class DataTypeStorage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("What number would you like to store?");
        Scanner sc = new Scanner(System.in);
        byte bVal = 0;
        short sVal = 0;
        int iVal = 0;
        BigInteger userInput = new BigInteger(sc.nextLine());
        if ((userInput.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) < 0) && (userInput.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) > 0))
        {     
            bVal = (byte)userInput.floatValue(); 
            System.out.println("Your number was stored in a byte value.");
        }
        else if((userInput.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) < 0) && (userInput.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) > 0))
        {    
            sVal = (short)userInput.floatValue(); 
            System.out.println("Your number was stored in a short value.");
        }
        else if((userInput.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) < 0) && (userInput.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) > 0))
        {    
            iVal = (int)userInput.floatValue(); 
            System.out.println("Your number was stored in an int value.");
        }
        else if((userInput.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0) && (userInput.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) > 0))
        {
            System.out.println("Your number was stored in a long value.");
        }
        else{
            System.out.println("Wow! This number can only be stored in a big integer! Congrats!");
        }
    }
    
}
