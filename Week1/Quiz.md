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


public class aa{
	
	public static void main(String[] args) {
		
		TimeCalculator c= new TimeCalculator();
		c.timecalc();
	}
}

```
