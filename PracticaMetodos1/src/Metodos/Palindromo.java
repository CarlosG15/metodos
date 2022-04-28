package Metodos;

import java.util.Scanner;

public class Palindromo {

        public static String strValue = "ana";

        public static void main(String[] args) {
            System.out.println(strValue);
            strValue=strValue.replace(" ","");
            StringBuilder strb = new StringBuilder(strValue);
            strb = strb.reverse();
            if(strValue.equalsIgnoreCase(strb.toString())){
                System.out.println("is palindrome");
            }
            else{
                System.out.println("is NOT palindrome");
            }

        }
        }

