 + ## 다음 코드를 객체 지향 프로그래밍 관점에서 바람직한 코드로 수정하라. 

  >※생성자 및 메서드를 이용해보자.

<br>

## 수정이 필요한 코드 
``` java
class Power{
	public int kick;
	public int punch;
}

public class Example {

	public static void main(String[] args) {
		Power robot = new Power();
		robot.kick=10;
		robot.punch=20;

	}
}
```

<br>

## 수정 코드
``` java
class Power{
	public int kick;
	public int punch;
	
	public Power(int kick, int punch) {
		this.kick=kick;
		this.punch=punch;
	}
}

public class Example {

	public static void main(String[] args) {
		Power robot = new Power(10,20);
	}
}
```
<br><br>
<hr>

 + ## 다음의 출력결과가 나오게끔 미완성된 ArrayUtil 클래스를 완성시켜라.
    ###   (ArrayUtil 클래스 내부의 메서드는 모두 static메서드 이다)

  >※ 출력결과=> `[ 1 5 7 9 3 6 -1 100 77 ]`

<br>

## 미완성된 코드

<br>

```java
class ArrayUtil{
	
	public static int [] concat(int []a, int[]b) {
		/*배열 a와 b를 연결한 새로운 배열 리턴 */
	}
	
	public static void print(int [] array) {
		/*매개변수로 받은 배열 array를 출력 */
	}
}

public class StaticEx {
	
	public static void main(String[] args) {
		int [] array1= {1,5,7,9};
		int [] array2= {3,6,-1,100, 77};
		int [] array3= ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}
}
```

<br><br>

## 완성 코드
```java
class ArrayUtil{
	public static int [] concat(int []a, int[]b) {
		int [] tmp=new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++)
			tmp[i]=a[i];
		
		for(int i=0; i<b.length; i++)
			tmp[i+a.length]=b[i];
		
		return tmp;
		
	}
	public static void print(int [] array) {
		System.out.print("[");
		for (int i : array) {
				System.out.print(i+" ");
		}
		System.out.print("]");
	}
}

public class StaticEx {
	
	public static void main(String[] args) {
		int [] array1= {1,5,7,9};
		int [] array2= {3,6,-1,100, 77};
		int [] array3= ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
```
<br>

#### <div align="center">✔✔✔</div>
#### <div align="center">ArrayUtil클래스의 concat메서드에서, 2개의 for문을통해 배열 2개를 연결하는 과정을  </div>
### <div align="center">=> `System클래스의 arraycopy메서드` 로 효율적으로 변경가능</div>

<br>

```java
	public static int [] concat(int []a, int[]b) {
		int [] tmp=new int[a.length+b.length];

        	System.arraycopy(a, 0, tmp, 0, a.length);
        	System.arraycopy(b, 0, tmp, a.length, b.length);
		return tmp;
	}
```

<br><br>
