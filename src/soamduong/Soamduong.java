
package soamduong;

import java.util.Scanner;
public class Soamduong {

    public static void main(String[] args) {
       int n;
Scanner scanner = new Scanner(System.in);
  System.out.print("nhap vao 1 so:");
  n = scanner.nextInt();
   if (n > 0) {
            System.out.println("Số Dương.");
        }
        else {
            System.out.println("Số Âm.");
        }
  
    }
    
}
