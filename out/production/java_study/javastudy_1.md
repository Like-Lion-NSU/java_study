# 1. 변수
<hr/>

### ✒️변수
데이터를 저장하는  공간이다.

#### ✔ 선언과 초기화
변수를 선언하면 타입 크기의 메모리가 할당되며, 프로그램은 실행 중에 값을 읽는 공간으로 사용한다.
<pre><code>{ int radius = 10; // 변수 선언과 초깃값을 동시에 지정할 수 있음.}</code></pre>

#### ✔ 명명규칙
변수 이름은 첫 단어는  소문자, 이후 각 단어의 첫 번째 문자만 대문자로 표기한다.( 메소드도 마찬가지)
<pre><code>{ int myAge; }</code></pre>

### ✒️기본 타입
* 논리 타입
    * boolean (1 byte)
* 문자 타입
    * char (2 byte)
* 정수 타입
    * byte (1 byte)
    * short (2 byte)
    * int (4 byte)
    * long (8 byte)
* 실수 타입
    * float (4 byte)
    * double (8 byte)

### ✒️리터럴
리터럴이란 프로그램에 직접 표현한 값을 말한다.
* 정수형 리터럴
    * 정수형 리터럴은 int타입으로 자동 컴파일 된다.
      <pre><code>{ int n = 10; }</code></pre>
    * long 타입으로 지정하려면 숫자 뒤에 L 또는 ㅣ을 붙이면 된다.
      <pre><code>{long m = 20L; }</code></pre>
* 실수 리터럴
    * 실수형 리터럴은 double 타입으로 자동 처리가 된다.
      <pre><code>{double d = 0.123;}</code></pre>
    * float은 F나 f, double은 d나 D를 붙이면 강제 변환 가능하다.
      <pre><code>{double d = 0.123D;
       float f = 0.123f; }</code></pre>
* 문자 리터럴
    * ''로 표현하거나 \u 다음에 문자의 유니코드 값을 적어 사용한다.
      <pre><code>{ char = 'A';
        char = \u0041; // 문자 'A'의 유니코드 값}</code></pre>
* 논리 리터럴
    * true와 false뿐. boolean 타입의 변수에 직접 치환하거나 조건문을 사용한다.
      <pre><code>{ boolean a = true; // 직접 치환
        boolean b = 1>0; // 조건문 사용. b 값 true}</code></pre>
### ✒️상수
뱐수와 달리 실행 중에 값이 바꿀 수 없다. final로 상수 선언
<pre><code>{ final double PI = 3.14; // 상수 선언, 데이터 타입, 상수 이름 = 초기화; }</code></pre>
### ✒️타입 변환
변수, 상수, 리터럴의 타입을 다른 타입으로 바꾸는 것
* 자동 타입 변환
    * 수식 내에서 타입이 일치하지 않을 때, 오류가 아닌 작은 타입이 큰 타입으로 자동 변환된다.
    * byte - short / char - int - long - float - double
      <pre><code>{long m = 25; // 리터럴 25는 int 타입이지만 큰 타입인 long으로 자동 변환
       double d = 3.14 * 10; // 연산을 하기 위해 10은 int지만 10.0 (double)으로 바뀜}</code></pre>
* 강제 타입 변환
    * ()안에 타입을 적어 강제로 바꾼다. 큰 타입에서 작은 타입으로 변환할 때, 데이터 손실이 일어날 수 있다.
      <pre><code>{int n = 300;   
       byte a = n; // 오류. int 타입은 byte타입으로 자동 변환 X   
       byte a = (byte) n; // a를 byte타입으로 강제 변환 (a : 300-256=44) 데이터 손실 일어남}</code></pre>
### ✒️ 키 입력
#### ✔ System.in
키보드 장치를 직업 제어하고 키 입력을 받는 표준 입력 스트림 객체. 바이트 데이터를 'a', '?'같은 문자로 변환해야함.
#### ✔ Scanner
응용프로그램이 키 입력을 입력을 쉽게 받을 수 있도록 자바 패키지에서 제공하는 클래스. 공백 문자를 기준으로 분리하여 토큰 단위로 읽음.
<pre><code>{ Scanner scanner = new Scanner(System.in);}

 scanner 객체는 System 객체릉 이용해 정보를 입력받고, 자바 응용프로그램이 원하는 타입으로 변환하여 리턴한다</code></pre>
➰nextLine() : 공백이 낀 문자열을 입력 받음. 빈 문자열 리턴 가능(입력을 기다리는 용도로 사용 가능)<br>
➰next() : 공백이 있는 문자열 읽을 수 없음. 빈 문자열 리턴 불가능
* Scanner 클래스의 주요 메소드
    * String next() : 다음 토큰을 문자열로 리턴
    * byte nextByte() : 다음 토큰을 byte 타입으로 리턴
    * short nextShort() : 다음 토큰을 short 타입으로 리턴
    * int nextInt() : 다음 토큰을 int 타입으로 리턴
    * long nextLong() : 다음 토큰을 long 타입으로 리턴
    * float nextFloat() : 다음 토큰을 float 타입으로 리턴
    * double nextDouble() : 다음 토큰을 double 타입으로 리턴
    * boolean nextBoolean() : 다음 토큰을 boolean 타입으로 리턴
    * String nextLine() : '\n'을 포함하는 라인을 읽고 '\n'을 버린 나머지 문자열 리턴
    * void close() : Scanner의 사용 종료
    * boolean hasNext() : 현재 입력된 토큰이 있으면 true, 아니면 입력 때까지 무한정 대기, 새로운 입력이 들어올 때 true리턴, ctrl-z 키가 입력되면 입력 끝이므로 false 리턴
      ㅇ<pre><code> kim / seoul / 23 / 1.2 / true 를 입력했을 때
      { Scanner scanner = new Scanner(System.in);
      String name = scanner.next(); // "kim"
      String city = scanner.next(); // "seoul"
      int age = scanner.nextInt(); // "23"
      double weight = scanner.nextDouble(); // 1.2
      boolean isSingle = scanner.nextBoolean(); // true}</code></pre>

➰ Scanner 객제 닫기
scanner 객체가 닫히면, System.in도 같이 닫힘
<pre><code>{ scanner.close(); // Scanner 객제 닫기
 scanner = new Scanner(System.in); // ❗ scanner를 닫은 후 다시 scanner로 키를 받을 수 없음}</code></pre>

#### ✔ import 문
<pre><code>{ import java.util.Scanner; }</code></pre>
Scanner 클라스는 자바에서 제공하는 java.util 패키지에 잇으므로, import 문을 통해 경로를 말해준다.

# 2. 연산
<hr/>

### ✒️연산
주어진 식을 계산하여 결과를 얻어내는 과정을 연산이라고 한다.<br>
> a == n // 피연산자 연산자 피연산자

### ✒️연산자 우선순위
* 우선순위가 높은 연산자를 먼저 처리.
* 순위가 동일하면 왼쪽에서 오른쪽으로 처리.<br>
* 대입연산자, --, ++, -, +, ! 타입 변환 연산자 등은 오른쪽에서 왼쪽으로 처리.<br>
* 괄호는 항상 우선순위. (괄호가 겹칠 경우 안쪽부터)

1.  ++ , __
2. 양의 부호 +, 음의 부호 -, ++, -- ~ !
3. 형 변환
4.  / * %
5. 덧셈 +, 뺄셈 -
6. << >> >>>
7. <> <= >= instanceof
8. == !=
9. & (비트 AND)
10. ^ (비트 XOR)
11. | (비트 OR)
12. && (논리 AND)
13. || (논리 OR)
14. ? : (조건)
15. =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=

### ✒️연산자 분류
#### ✔  산술 연산자

| 연산자 |  의미  |    예     |  결과   |
|:---:|:----:|:--------:|:-----:|
|  +  | 더하기  | 1.2+3.4  |  4.6  |
|  -  |  빼기  |   1-2    |  -1   |
| *   | 곱하기  | 2.5*4.0  | 10.0  |
|  /  | 나누기  |   5/2    |   2   |
|  %  | 나머지  |   5%2    |   1   |

#### ✔  증감 연산자

| 연산자  |          내용           |
|:----:|:---------------------:|
| a++  | a를 1 증가하고 증가 전의 값 반환  |
| a--  | a를 1 감소하고 감소 전의 값 반환  |
| ++a  |  a를 1 증가하고 증가된 값 반환   |
| --a  |  a를 1 증가하고 증가된 값 반환   |
<pre><code> a = 1; <br> b = ++a  //  a=2, b=2 <hr>
a = 1; <br> b = a++;  //  a=2, b=1</code></pre>

#### ✔  대입 연산자

| 연산자  | 내용          | 연산자   | 내용     |
|------|-------------|-------|--------|
| a=b  | b의 값을 a에 대입 | a&=b  | a=a&b  |
| a+=b | a=a+b       | a^=b  | a=a^b  |
| a-=b | a=a-b       | a&#124;=b | a=a &#124; b |
| a*=b | a=a*b       | a<<=b | a=a<<b |
| a/=b | a=a/b       | a>>=b | a=a>>b |
| a%=b | a=a%b       | a>>>=b | a=a>>>b |
#### ✔  비교 연산자

| 연산자 |  내용|
|:---:|:---:|
|  a<b  | a가 b보다 작으면 true |
|  a>b  | a가 b보다 크면 true |
|  a<=b  | a가 b보다 작거나 같으면 true |
|  a>=b  | a가 b보다 크고나 같으면 true |
|  a==b  | a와 b가 같으면 true |
|  a!=b  | a와 b가 같지 않으면 true |

#### ✔  논리 연산자

|      연산자       |                 내용                 |
|:--------------:|:----------------------------------:|
|       !a       |   a가 true이면 false, false이면 true    |
| a&#124;&#124;b | a와 b의 OR연산자, a와 b 모두 false → false |
|     a && b     | a와 b의 AND연산자, a와 b 모두 true → true  |
|     a ^ b      |  a와 b의 XOR 연산, a와 b가 서로 다를 때 true  |
<pre><code>(age >= 20> && (age < 30)  // 나이(int age)가 20대인 경우
(c >= 'A') && (c <= 'Z')  // 문자 (char c)가 대문자인 경우
(x>=0) && (y>=0) && (x<=50) && (y<=50)  // (x,y)가 (0,0)과 (50,50)의 사각형 내에 있음<<br>
❗20<= age < 30  // 오류</code></pre>
#### ✔ 비트 논리 연산자
➰ 비트(bit) : 2진수의 한자리.<br>
➰ 바이트(byte) : 8개의 비트<br>
true : 1, false : 0 이라고 생각하면 편함<br>
AND(&), OR(&#124;), XOR(^), NOT(~)의 논리 연산자를 사용
<pre><code>   01101010             01101010 <br>&  11001101          &#124;  11001101 <br>---------------     ---------------<br>   01001000             11101111<br>(모두 1 → 1, 
둘중 하나라도 0 → 0)    (모두 0 → 0, 둘중 하나라도 1 → 1)</code></pre>
<pre><code>   01101010              <br>^  11001101          ~  01101010 <br>-------------        ----------------- <br> 10100111             10010101<br>(같으면 0, 다르면 1)    ( 0 → 1, 1 → 0)</code></pre>

#### ✔ 비트 시프트 연산자
➰ 시프트 : 옆으로 한 자리씩 이동하는 것 <br>
새로운 비트를 오른쪽이나 왼쪽 끝에 삽입하면서 비트의 자리를 이동시키는 연산.<br>
저장공간의 크기가 정해져 있으므로 방향에 따라 끝에 있는 비트는 사라짐<br>
➰ **시프트의 연산의 피연산자는 byte, short, int, long, char 타입만 가능**

|   연산자    |                                                     내용                                                      |
|:--------:|:-----------------------------------------------------------------------------------------------------------:|
|  a >> b  |              a의 각 비트를 오른쪽으로 b번 시프트. 최상위 비트의 빈자리는 시프트 전의 최상위 비트로 다시 채운다. 논리적 오른쪽 시프트. 나누기 2 효과               |
| a >>> b  |                         a의 각 비트를 오른쪽으로 b번 시프트. 최상위 비트의 빈자리는 항상 0으로채운다. 논리적 오른쪽 시프트                          |
|  a << b  |              a의 각 비트를 왼쪽으로 b번 시프트. 최하위 비트의 빈자리는 항상 0으로 채운다. 산술적 왼쪽 시트. 곱하기 2 효과. ❗오버플로우 발생 주의               |
<pre><code>byte a = 5; // a 00000101
byte b = (byte) (a << 2) // b 00010100 = 20 (항상 0으로 채움)
<hr/>
a = 20; // a 00010100
byte b = (byte) (a >>> 2) // b 00000101 = 5 (항상 0으로 채움)
<hr/>
a = 20; // a 00010100
byte b = (byte) (a >> 2) // b 00000101 (최상위 비트로 채움)
* ex) 00000101 (최상위 비트 : 0, 최하위 비트 : 1)
</code></pre>
# 3. 조건문과 반복문
<hr/>

### ✒️if 문
조건식은 비교 연산이나 논리 연산이 혼합된 식으로 구성되며, 조건식의 결과는 boolean 값이다.<br>
조건식이 참이면 if 내부의 실행문장이 실행되고 거짓이면 벗어남.

```java
import java.util.Scanner;
public class SuccessOrFail {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수 입력 : "); 
        int score = scanner.nextInt(); // 값 입력 받기
        if (score >= 80) { // 조건문
            System.out.println("합격"); // 실행문
        }

        scanner.close();
    }
    }
```

### ✒️if-else 문
조건문이 참인 경우 각각 실행할 문장을 지시할 수 있다.
```java
import java.util.Scanner;

public class MultipleOfThree{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("수를 입력하세요: "); 
        int number =scanner.nextInt();  // 값 입력 받기
        if (number%3==0)  // 조건문 3으로 나눈 나머지가 0이면 "3의 배수입니다" 출력
            System.out.println("3의 배수입니다.");
        else  // 그 밖이라면 "3의 배수 아닙니다" 출력
            System.out.print("3의 배수 아님니다.");
        
        scanner.close();
    }
}
```
### ✒️다중 if-else 문
if-else가 연속되는 것.<br>
위에서부터 조건식이 참인 경우 실행문장을 실행한 후 벗어남
```java
import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        char grade;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수 입력 : ");
        int score = scanner.nextInt();  // 80점 입력 했다고 가정
        if(score>=90)  // 조건식이 거짓 → if문을 못벗어남
            grade='A';
        else if(score>=80)  // 조건식이 참 → if문 벗어남
            grade='B';  
        else if(score>=70)
            grade='C';
        else 
            grade='F';
        System.out.print("학점 :" + grade); // grade의 값은 B
    }
}
        
        
        
```
### ✒️중첩 if-else 문
if 문이나 if-else문, else 문의 실행문장에 if문이나 if-else문을 내포할 수 있다.
```java
import java.util.Scanner;

public class GradeTest{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요(0~100): "); 
        int score = scanner.nextInt();  // 점수 입력 받기
        System.out.print("학년를 입력하세요(1~4): ");
        int year = scanner.nextInt();  // 점수 입력 받기
       
        if (score>=60){  // 60점 이상
            if(year != 4)  // 60점이상이고 4학년이 아니면 합격
                System.out.println("합격");
            else if(score>=70) // 70점 이상이면 합격 
                System.out.println("합격");
            else  // 60점 이상이지만 4학년이면 불합격
                System.out.println("불합격");
        }
        else  // 60점 미만은 학년 상관없이 불합격
            System.out.print("불합격");
        
        scanner.close();
    }  // 4학년이 합격을 하려면 70점 이상이어야한다.
}
```
```
i = a>b?a-b:b-a; //조건 연산자
위와 아래는 같은 결과를 가져온다
if (a>b)
   i = a - b;
else
   i = b - a; // if-else 문
```
### ✒️switch 문
값에 따라 여러 방향으로 나뉘는 경우 if 문보다 switch 문이 좋음<br>
1. 먼저 식을 계산하고 그 결과 값과 일치하는 case 문으로 나뉜다.<br>
2. case문의 실행문장을 실행한 후 break를 만나면 switch문을 벗어난다.
3. case 문으로도 나누지 못하는 겨우 default 문으로 나눠 실행문장을 실행한다.
4. defalt는 생략 가능하다.
   ➰ case 문의 값 은 정수 리터럴, 문자 리터럴, 문자열 리터럴만 허용
```java
import java.util.Scanner;

public class GradingSwitch{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        char grade;
        System.out.print("점수 입력(0~100) : ");  
        int score = scanner.nextInt();  // 값을 입력 받음
        switch (score/10){
            case 10: //score가 100일 때 만족
            case 9: // score가 90~99일 때 만족
                grade = 'A'; 
                break;
            case 8: // score가 80~89일 때 만족
                grade = 'B';
                break;
            case 7: // score가 70~79일 때 만족
                grade = 'C';
                break;
            default: // scoredl 69 이하일 때 만족
                grade = 'F';
        }
        System.out.println("학점은" + grade + "입니다");
        
        scanner.close();
    }
}
```