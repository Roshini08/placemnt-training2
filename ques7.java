import java.util.*;
import java.io.*;

public class DataTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            try {
                String input = sc.next();
                long x = Long.parseLong(input);
                
                System.out.println(x + " can be fitted in:");
                
