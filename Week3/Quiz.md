 + ## 다음 3개의 필드와 메소드를 공통적으로 가진 4개의 클래스 Add, Sub, Mul, Div를 작성하려고 한다

 + int 타입의 a, b 필드: 2개의 피연산자
 + void setValue(int a, int b): 피연산자 값을 객체 내에 저장
 + int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴


+ ## 이러한 클래스구조에서, 다음과 같은 입력에대한 출력이 나올 수 있도록 프로그램을 작성해보자.
+ > 입력: 두 정수와 연산자를 입력하시오>> **5 7 +**
  > 
  > 출력: **12**

  >`※우리가 배운 추상클래스를 이용하여 클래스구조를 계층화하여 문제를 해결해보자.`

<br>

## 정답 코드 
``` java

import java.util.Scanner;

abstract class Calc{
    protected int a;
    protected int b;
    void setValue(int a, int b) {this.a = a; this.b = b;}
    abstract int calculate();
}

class Add extends Calc{
    int calculate() {return a + b;}
}

class Sub extends Calc{
    int calculate() {return a - b;}
}

class Mul extends Calc{
    int calculate() {return a * b;}
}

class Div extends Calc{
    int calculate() {return a / b;}
}

public class Main {
	
	
	
    public static void main(String[] args) {
    	Calc calc;
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char op = scanner.next().charAt(0);

switch(op) {
		case '+':
			calc = new Add();
			calc.setValue(a, b);
			System.out.print(calc.calculate());
			break;
		case '-':
			calc = new Sub();
			calc.setValue(a, b);
			System.out.print(calc.calculate());
			break;
		case '*':
			calc = new Mul();
			calc.setValue(a, b);
			System.out.print(calc.calculate());
			break;
		case '/':
			calc = new Div();
			calc.setValue(a, b);
			System.out.print(calc.calculate());
			break;
		}
    }
}

```

<br>

