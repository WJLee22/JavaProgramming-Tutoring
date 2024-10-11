 + ## 다음 3개의 필드와 메소드를 공통적으로 가진 4개의 클래스 Add, Sub, Mul, Div를 작성하려고 한다

 + int 타입의 a, b 필드: 2개의 피연산자
 + void setValue(int a, int b): 피연산자 값을 객체 내에 저장
 + int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴


+ ## 이러한 클래스구조에서, 다음과 같은 입력에대한 출력이 나올 수 있도록 프로그램을 작성해보자.(단, 입력은 무한히 받으며, "그만"을 입력받으면 프로그램이 종료되도록 구현하라.)
+ > 입력: 두 정수와 연산자를 입력하시오>> **5 7 +**
  > 
  > 출력: **12**

  >`※우리가 배운 추상클래스를 이용하여 클래스구조를 계층화하여 문제를 해결해보자.`  
  >`※힌트: 문자열을 정수형으로 형변환해주는 메서드: Integer.parseInt(str)`  
  >`※힌트: 문자열을 문자형으로 형변환해주는 메서드: str.charAt(0) `


<br>

## 정답 코드 
``` java

package prac;

import java.util.Scanner;

abstract class Calc {
    protected int a;
    protected int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int calculate();
}

class Add extends Calc {
    int calculate() {
        return a + b;
    }
}

class Sub extends Calc {
    int calculate() {
        return a - b;
    }
}

class Mul extends Calc {
    int calculate() {
        return a * b;
    }
}

class Div extends Calc {
    int calculate() {
        return a / b;
    }
}

public class Main {

    public static void main(String[] args) {
        Calc calc = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("두 정수와 연산자를 입력하시오 (종료하려면 '그만' 입력)>> ");
            String input = scanner.next();

            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


                int a = Integer.parseInt(input);
                int b = scanner.nextInt();
                char op = scanner.next().charAt(0);

                switch (op) {
                    case '+':
                        calc = new Add();
                        break;
                    case '-':
                        calc = new Sub();
                        break;
                    case '*':
                        calc = new Mul();
                        break;
                    case '/':
                        calc = new Div();
                        break;
                    default:
                        System.out.println("연산자를 제대로 입력해주세요\n");
                        continue;
                }
                
                calc.setValue(a, b);
                System.out.println("연산결과=> " + calc.calculate() + "\n");
            } 
        
        scanner.close();
    }
}
```

<br>

