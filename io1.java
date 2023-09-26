/*
 *Jehlani Burton
 *9/23/18
 *CIS 231
 * 9/18/19
 * This program creates the io1.txt file for the I/O 100 integers
 * it also spaces out the integers 
  .
*/

import java.io.*;
import java.util.Scanner;

public class io1 {

public static void main(String[] args) {
try (
PrintWriter pw = new PrintWriter(new FileOutputStream(new File("io2.txt"), true));
) {
for (int i = 0; i < 100; i++) {
pw.print((int)(Math.random() * 100) + " ");
}
} 
catch (FileNotFoundException fnfe) {
System.out.println("Error! file cannot be created.");
fnfe.printStackTrace();
}
}
}



