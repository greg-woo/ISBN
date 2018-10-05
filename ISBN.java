public class ISBN {

 public static void main(String[] args) {

  /*
  Created by: GREG WOO
  Program: Evaluating whether or not a simplified ISBN number is correct or not
  In this program we determine the last digit of an ISBN number:

  Sample Input:
  2956
  Output:
  4 as (2*5 + 9*4 + 5*3 + 6*2 + 4*1 = multiple of 11 (characteristic of an ISBN number))
  */

  //Declaring the variable to represent the ISBN number
        int n = Integer.parseInt(args[0]);


     // We declare the digits d2, d3, d4 and d5
     int d2 = 2 * (n % 10);
     n = n /10;
     int d3 = 3 * (n % 10) ;
     n = n /10;
     int d4 = 4 * (n % 10) ;
     n = n /10;
     int d5 = 5 * (n % 10) ;

     // We declare the sum of the 4 digits
     int sum = d5 + d4 + d3 + d2;

     // We declare the digit d1
     int d1 = 11 - (sum % 11);


     // If statement for when to print "0" or "X"
     if (d1 == 11) {
       System.out.println("0");
     } else if (d1 == 10 ) {
       System.out.println("X");
     } else {
       System.out.println(d1);
     }

 }

}
