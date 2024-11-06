## 5주차 Swing GUI

### 배치관리자(레이아웃 관리자)

#### 프레임의 컴포넌트들 어떻게 배치하면 좋을지 => 배치관리자 자동으로 컴포넌트들을 배치해줌.  

+ **FlowLayout** : 부착하는 순서대로 배치(단, 컴포넌트의 크기는 고정적)
+ **BorderLayout**: 동서남북 중앙 배치, JFrame의 디폴트 레이아웃=border(그중에서 center에 부착, 컴포넌트의 크기는 프레임의 크기랑 동기화)
+ **GridLayout**: (컴포넌트의 크기는 프레임의 크기랑 동기화, GridbagLayout)
+ CardLayout: (컴포넌트 위에 컴포넌트 카드 겹치듯이)


### 이벤트처리

  1. 마우스 클릭(같은 하드웨어 입력)
  2. 운영체제의 하드웨어 드라이버가 그 IO입력 이해(하드웨어와 sw간에 처리)
  3. JVM(하드웨어 입력을 받고 이것을 이벤트 큐에 넣어줌)
  4. 이벤트 분배 스레드가 그 큐안에 있는 이벤트정보를 하나하나 꺼내서 이벤트 객체로 만들어 이벤트 객체들을 하나하나 처리
     > 이벤트 객체는 이벤트의 종류, 발생 위치, 시간 등의 정보를 담고 있음  
  5. 이 **이벤트 소스**(이벤트가 발생한 컴포넌트: 버튼)에게 이 이벤트 객체를 전달해줌
  6. 이벤트 소스(버튼)의 **이벤트 리스너**(우리가 써줄 알고리즘)에게 이 이벤트 객체가 전달
  7. 이벤트 리스너의 이벤트 헨들러에게 그 이벤트 객체가 전달되고 처리함
     
