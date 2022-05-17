package com.company;

public class UC5 <T extends Comparable<T>>{

        T a,b,c;

        //Generic Constructor for Handling Different Type Object

        UC5(T a, T b, T c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        //compareTo method for Checking Maximum from 3 Integer Object

        public T compareTo() {
            if(a.compareTo(b) > 0){
                if(a.compareTo(c) > 0) {
                    return a;
                } else {
                    return c;
                }
            } else {
                if(b.compareTo(c) > 0) {
                    return b;
                } else {
                    return c;
                }
            }
        }

        public static void main(String[] args) {
            //Welcome message for User
            System.out.println("Welcome to Java Core - Generics Test Maximum using Genric Class.");

            //Creating Generic Integer Object for Integer Comparison
             UC5<Integer> integerComparison = new UC5(3,4,5);
             System.out.println("Maximum from 3 Integer Object : "+integerComparison.compareTo());

             //Creating Generic Float Object for Float Comparison
            UC5<Float> floatComparison = new UC5(6.6F,8.8F,7.7F);
            System.out.println("Maximum from 3 Float Object : "+floatComparison.compareTo());

            //Creating Generic String Object for String Comparison
            UC5<String> stringComparison = new UC5("Peach","Apple","Banana");
            System.out.println("Maximum from 3 String Object : "+stringComparison.compareTo());
            
        }
    }




