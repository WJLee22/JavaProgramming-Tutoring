 + ## 초 단위의 정수값을 입력받고, 몇 시 몇 분 몇 초인지 출력하는 프로그램을 작성하라. 
  > (ex. 입력 값: 3710, 출력 값: 3710초는 1시간 1분 50초입니다.)

  >※별도의 시간계산 클래스를 두어, 해당 클래스의 메서드를 통해 출력되도록 구현하여보면 좋을 것 같다.

## 전체 코드 
``` java

import java.util.Scanner;

class TimeCalculator{
	
	Scanner scanner= new Scanner(System.in);
	
	public void timecalc() {
		System.out.print("초를 입력하세요=> ");
		int sec=scanner.nextInt();
		
		int second=sec%60;
		int minute=sec/60%60;
		int hour=sec/60/60;
		
		System.out.println(sec+"초는 "+hour+"시간 "+minute+"분 "+second+"초"+"입니다.");
	}
}


public class Main{
	
	public static void main(String[] args) {
		
		TimeCalculator c= new TimeCalculator();
		c.timecalc();
	}
}

```

<br><br>


 + ## 입력받을 정수의 갯수를 입력받고, 해당 갯수만큼의 정수를 입력받아 가장 큰 정수가 무엇인지를 출력하는 프로그램을 작성하라. 
  > ex. 숫자 갯수 입력=> 3  
  > 숫자 3개를 입력하세요=> -10 -8 11  
가장 큰 수는 11입니다.


  >※입력받은 정수의 갯수만큼의 공간을갖는 배열을 생성하고, 해당 갯수만큼의 정수를 입력받아 배열에 저장하여 프로그램을 작성해보자.

## 전체 코드 
``` java
import java.util.Scanner;

public class Main{
	 
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		int n; //배열의 크기
		int max=Integer.MIN_VALUE; //입력한 숫자중에서 가장 큰 수, Integer.MIN_VALUE는 정수형 중에서 가장 작은 정수값.
		
		System.out.print("입력받을 정수의 갯수 입력=> ");
		n=scanner.nextInt();
		
		int []array=new int[n];
		
		System.out.print("숫자 "+n+"개를 입력하세요=> ");
		for(int i=0; i<array.length; i++){
			
			array[i]=scanner.nextInt();
			
			if(array[i]>max) 
				max=array[i];
			}	
		System.out.println("가장 큰 수는 "+max+"입니다.");
		}
		
	}
```
