package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2017J1 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if (x > 0 && y > 0) {
			System.out.print(1);
		}
		else if (x > 0) {
			System.out.print(4);
		}
		else if (y > 0) {
			System.out.print(2);
		}
		else {
			System.out.print(3);
		}
	}

}
