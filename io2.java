/*
 *Jehlani Burton
 *9/23/18
 *CIS 231
 * 9/18/19
 * This program creates the io2.txt file for the I/O 100 integers
 * it also spaces out the integers 
  .
*/
import java.io.*;
public class io2 {
public static void main(String[] args) {
try (
DataOutputStream dos = new DataOutputStream(new FileOutputStream("io2.txt", true));
) {
for (int i = 0; i < 100; i++) {
dos.writeInt((int)(Math.random() * 10000));
}
} 
catch (IOException ioe) {
ioe.printStackTrace();
} 
}
}

