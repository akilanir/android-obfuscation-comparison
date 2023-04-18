package com.example.initializer;
import java.util.Random;
public class ScreenUtils {
    private static String awsKey = "Jxc0123456789abcdefghijkl";
    private static String username = "AwsUser0001";
    public static void invokeAWSBucket(String password){
        String publicKey = createPassword(username,awsKey);
        System.out.println(publicKey);
        System.out.println(password);
        if(publicKey.endsWith(password)){
            //ToDo: call AWS resource to create a bucket
        }
        else{
            //ToDo: handle the exception
            System.out.println("Wrong credentials");
        }
    }
    public static String createPassword(String name, String id){
        String password;
        password = name + id + generateRandomNumber();
        return password;
    }
    private static String generateRandomNumber(){
        String randomNumber = String.valueOf(Math.random() * 10);
        return randomNumber;
    }
}
