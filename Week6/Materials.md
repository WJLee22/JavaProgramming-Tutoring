## Week 6

+ 다양한 Swing 컴포넌트들


#### 모든 컴포넌트들의 기본 메서드들

+ setSize(x,y): 컴포넌트 크기설정
+ setOpaque(boolean): 컴포넌트의 불투명도 설정. true-> 컴포넌트가 불투명해져서 즉, 컴포넌트는 자신의 배경색을 그려서 뒤에 있는 컴포넌트를 가림.
  > setOpaque(false): 컴포넌트를 투명하게 설정. 즉, 컴포넌트는 자신의 배경색을 그리지 않아서 뒤에 있는 컴포넌트가 보임.

+ getWidth() height: 컴포넌트의 가로세로 크기 반환.   

#### JPanel

+ 컴포넌트들을 담을 수 있는 컨테이너 컴포넌트.
+ JFrame의 컨텐트팬도 JPanel 객체.
+ 이 패널에 배치관리자를 설정하여, 패널안에 컴포넌트들을 효율적으로 관리가능. 

#### JLabel  

+ 텍스트 및 이미지를 표현해주는 컴포넌트

#### JTextField & JTextArea  

+ 입력창. field 는 한행의 입력창, area 는 행렬로 구성된 큰 크기의 텍스트입력창.
+ JTextArea(cols, rows), JTextField(int size)

  <br>


