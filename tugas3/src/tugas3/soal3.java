package tugas3;
import java.util.Scanner;
public class soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		String str = obj.nextLine();
		String[] Part = str.split(" ");
		
		
		int value1 = Integer.parseInt(Part[0]);
		int value2 = Integer.parseInt(Part[2]);
		int result = 0;
		
		if((value1 >= 1 && value1 <= 100) && (value2 >= 1 && value2 <= 1000))
		{
			if(Part[1].equals("+")) {
				result = value1 + value2;
			}
			else if(Part[1].equals("-")) {
				result = value1 - value2;
			}
			else if(Part[1].equals("*")) {
				result = value1 * value2;
			}
			else if(Part[1].equals("/")) {
				result = value1 / value2;
				if(value1 % value2 != 0) {
					System.out.println("Pembagian Tidak Habis");
				}
			}
			else if(Part[1].equals("%")) {
				result = value1 % value2;
			}else {
				System.out.print("Operator Tidak Tersedia");
			}
		}
		
		System.out.print("Hasilnya : "+ result);
}

	}


