
import java.util.Scanner;


public class lettersoccur {
    public static void main(String[] args) {
        int i, length, counter[] = new int[256];
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Sentence:");
        String text01= scanner.nextLine();
       
        String text02=text01.toLowerCase();

        String text03;
        text03 = text02.replaceAll(" ", "");
        length = text03.length();
       
        
        for (i = 0; i < length; i++) {
            counter[(int) text03.charAt(i)]++;
        }
        
        System.out.println(" OCCURANCE OF LETTERS ");
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " - " + counter[i]);
            }
        }
    } 
}
