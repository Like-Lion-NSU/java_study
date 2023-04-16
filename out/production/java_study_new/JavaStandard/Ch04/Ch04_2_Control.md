## 2. 반복문 - for, while, do-while
+ 조건을 만족하는 동안 주어진 문장들을 반복적으로 수행

### 2.1 for문
+ 반복 횟수를 알고 있을 때
<pre>
for(int i=1;i<=5;i++) {
 //(1부터;5까지;1씩증가)
    System.out.println(" hello !");
}
</pre>
#### 구조와 수행순서
<pre>
for (초기화;조건식;증감식) {
        // 조건식이 참일 때 수행될 문장
}</pre>
+ 초기화 : 처음 한번만 수행, 둘 이상 변수 필요시 ','를 구분
+ 증감식: 다양한 연산자들로 작성 가능, 쉼표 이용하여 두 문장을 하나로
<pre>for(int i=1;i<=10;i*=3){...}
for(int i=1;i<=10;i+=3){...}
for(int i=1, j=10;i<=10;i++, j++){...}
</pre>
+ 세 가지 요소 모두 생략 가능
+ 조건식이 생략된 경우, 참으로 간주되어 무한 반복문이 됨
+ -> 블럭{}안에 if문을 넣어서 특정조건 만족 시 for문을 빠져나오게 해야 함
+ 예 Ch4_FlowEx12(1부터 10까지의 합)
+ 예 JavaStandard.Ch04.JavaStandard.Ch04.Ch4_FlowEx13(i(1~10),j(10~1))
+ 예 JavaStandard.Ch04.JavaStandard.Ch04.Ch4_FlowEx14(다양한 연산자를 이용한 짝수/홀수/역순/순환/반복)

#### 중첩 for문
+ 중첩의 횟수는 거의 제한이 없음
+ 예 Ch4_FlowEx16(5행 10열의 별 찍기)
+ 예 Ch4_FlowEx17(사용자로부터 라인의 수를 입력받아 삼각형 모양의 별 출력)
+ 예 Ch4_FlowEx18(중첩 for문을 이용한 구구단 출력)
+ 예 Ch4_FlowEx19(3개의 반복문이 중첩되어 있는 경우 어떤 순서로 수행되는지)
+ 예 Ch4_FlowEx20(2중 반복문을 이용한 i와 j의 값을 쌍으로 출력)
+ 예 Ch4_FlowEx21(2중 for문에 if문을 넣고 출력)

#### 향상된 for문
![JavaStandard.JavaStandard.img.png](../img/img.png)
+ 매 반복마다 하나씩 순서대로 읽혀서 변수에 저장됨
+ 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용
+ 예 JavaStandard.Ch04.Ch4_FlowEx22(일반적인 for문과 향상된 for문)

### 2.2 while문
+ 조건식이 참인 동안, 즉 조건식이 거짓이 될 때까지 블럭{} 내의 문장 반복
<pre>while (조건식) {
// 조건식의 연산결과가 참인 동안, 반복될 문장</pre>

#### for문과 while문의 비교
+ 항상 서로 변환이 가능
+ 초기화나 증감식이 필요하지 않은 경우에 적합
#### while문의 조건식은 생략불가
+ 조건식이 참이 되도록 하려면 반드시 true를 넣어야 함
<pre>for(;;) {//조건식이 항상 참
...
}</pre>
<pre>while(true) {//조건식이 항상 참
...
}</pre>
+ 블럭 내의 문장을 무한 반복
+ 예 Ch4_FlowEx23.java(변수 i의 값만큼 블럭을 반복)
+ 예 Ch4_FlowEx24.java(for문을 이용해 시간 지연)
+ 예 Ch4_FlowEx25.java(사용자로부터 숫자를 입력받고, 이 숫자의 각 자리의 합을 구하는 예제)