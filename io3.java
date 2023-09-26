/*
 *Jehlani Burton
 *9/23/18
 *CIS 231
 * 9/18/19
 * This program creates the io3.txt file for the I/O 100 integers
 * it also spaces out the integers 
  .
*/
import java.io.*;
public class io3 {
public static void main(String[] args) {
int sum = 0;
try(
DataInputStream dis = new DataInputStream(new FileInputStream("Exercise17_02.txt"));
) {
while (true) {
sum += dis.readInt();
}
}
catch (EOFException eof) {
System.out.println("File reading complete.");
}
catch (IOException ioe) {
ioe.printStackTrace();
}
System.out.println("The sum of the values in the file is: " + sum);
}
}


