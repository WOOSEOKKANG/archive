package chapter7;

import java.io.IOException;
import java.util.Arrays;

public class Bubble {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int data[] = {2, 9, 10, 3, 7, 15, 5};
		int dLen = data.length;

		/*for(int i = 0; i < data.length; i++) {
			System.out.print("data["+i+"]=" + data[i] + ", ");
		}*/
	

				
		for(int i = dLen - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				
				if(data[j] > data[j+1]) {
					int k = data[j];
					data[j] = data[j+1]; //오른쪽에 값을 왼쪽 자리에 저장
					data[j+1] = k;
				}
			}
		}
		System.out.print(Arrays.toString(data));
		
		/*Arrays.sort(data);
		for(int i: data) {
			System.out.print(i);
		}*/
	}

}
