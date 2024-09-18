package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int sayi) {
        int newNumber = sayi ;
        if(sayi < 0) {
            newNumber = -1 * sayi;
        }
        int kalan = 0 ;

        String value = Integer.toString(newNumber);
        String reverseNumber = "";



        for(int i = 0; i < value.length(); i++ ) {
            kalan = newNumber % 10;
            reverseNumber = reverseNumber + kalan;
            newNumber = (newNumber - kalan) / 10;

        }
        return reverseNumber.equals(value);

    }

    public static boolean isPerfectNumber(int sayi) {
        int sum = 0;
        if(sayi<0) {
            return false;
        }
        else {
            for(int i = 1; i < sayi; i++) {
                if(sayi % i == 0){
                    sum+=i;
                }
            }
            return sum == sayi;
        }

    }

    public static String numberToWords(int sayi) {
        if(sayi < 0) {
            return "Invalid Value";
        }
        else{

            String value = String.valueOf(sayi);
            int length = value.length();
            String[] arry1 = new String[length];
            for(int i = 0; i < length; i++) {
                switch (value.charAt(i)){
                    case '0':
                        arry1[i] = "Zero";
                        break;

                    case '1':
                        arry1[i] = "One";
                        break;
                    case '2': arry1[i] = "Two"; break;
                    case '3': arry1[i] = "Three"; break;
                    case '4': arry1[i] = "Four"; break;
                    case '5': arry1[i] = "Five"; break;
                    case '6': arry1[i] = "Six"; break;
                    case '7': arry1[i] = "Seven"; break;
                    case '8': arry1[i] = "Eight"; break;
                    case '9': arry1[i] = "Nine"; break;

                }

            }
            return String.join(" ", arry1);
        }



    }
}
