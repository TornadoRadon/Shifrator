package com.company;

import java.util.Arrays;

public class Main {

    static String str = "RIFAT WORLD";
    static String key = "grapes";

    public static void main(String[] args) {

        String shifrlangan = encode(str);
        System.out.println(shifrlangan);

//        String deshifrlangan = decode(str);
//        System.out.println(deshifrlangan);


    }

    public static String encode(String str){
        char[] charArr = str.toCharArray();//H E L L O W O R L D
        String[] strArr = new String[charArr.length];//RR GE RS RS AA
        for (int i = 0 ; i < charArr.length; i++){
            if (charArr[i] == ' '){
                strArr[i] = " ";
                continue;
            }
            strArr[i] =  getX(charArr[i]) + "" + getY(charArr[i]);
        }
        String finish = "";
        for (int i = 0; i < strArr.length; i++) {
            finish += strArr[i];
        }
        return finish;
    }

    public static char getX(char x){
        return (char) (key.charAt((x - 65) / key.length()));
    }
    public static char getY(char x){
        return (char) (key.charAt((x - 65) % key.length()));
    }


    public static String decode(String str){

        return str;
    }
}
