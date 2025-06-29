package ex_09_If_Condition;

import java.util.Arrays;
import java.util.Scanner;

public class Lab00_Website_Domain_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the url of Website : ");
        String domain = sc.next();
       if(domain.contains(".com")){
           System.out.println("The website type is: Commercial website");
       } else if (domain.contains(".org")) {
           System.out.println("The website type is: Non-profit organization");
       } else if (domain.contains(".edu")) {
           System.out.println("The website type is: Educational institution");
       } else if (domain.contains(".gov")) {
           System.out.println("The website type is: Government website");
       } else if (domain.contains(".info")) {
           System.out.println("The website type is: Informational website");
       } else if (domain.contains(".net")) {
           System.out.println("The website type is: Network-related website");
       } else {
           System.out.println("The website type is: Unknown or other types of websites");
       }

    }
}
