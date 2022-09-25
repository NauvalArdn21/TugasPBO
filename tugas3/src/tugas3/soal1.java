import java.util.Scanner;
public class soal1 {

	
	
	public static void main(String[] args) {
		   String B ="";
	        do{
	            Scanner input=new Scanner(System.in);
	            System.out.print("Masukan kata = ");
	            B = input.nextLine();
	            if (B.length() < 1)
	             System.out.println("MASUKAN SESUATU");
	        }while(B.length() < 1);
	        
	        String[] words = B.split(" |\\!|\\,|\\?|\\.|\\_|\\'|\\@");
	        int C = words.length;
	        
	        System.out.println(C);
	        for(String w : words){
	            System.out.println(w);
	        
	        }
	        }
}
