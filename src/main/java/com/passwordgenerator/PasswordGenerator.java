package com.passwordgenerator;

import java.util.Scanner;
import java.util.Random;
        
public class PasswordGenerator {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static String password = "";
    
    private static String generatePassword(int passwordLength){
        for(int i=0;i<passwordLength;i++){
            String charactersList = "!@#$%^&*()_+-=[]{}|;':\"<>,.?/~`0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            char randomCharacter = charactersList.charAt(random.nextInt(charactersList.length()));
            password += randomCharacter;
        }
        return password;
    }
    
    public static void main(String[] args) {
        System.out.println("What is the desired characters lenght for the password?");
        int passwordLength = scan.nextInt();
        System.out.println(generatePassword(passwordLength));
    }
}