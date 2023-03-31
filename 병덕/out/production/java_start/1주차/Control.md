# Chapter 03. 제어문과 메서드
## 01) 제어문
* 실행문의 수행 순서를 변경하는 것
* 조문건, 반복문, 분기문이 있음
* 조건문과 반복문은 실행 흐름을 제어하는 제어식과 수행할 실행문으로 구송
* 수행할 실행문이 여러개라면 {}, {}로 묶인 실행문의 조합을 복합문이라 함.

+ 조건문 : 조건식의 결과에 따라 실행 경로 중 하나 선택 ( if, switch문 ,, 등등)
+ 반복문 : 조건에 따라 같은 처리를 반복 (for ,while, do~ while 문이 있음)
+ 분기문 : 실행 흐름을 무조건 변경함 (break,coutinue문 )

## 02) 조건문

* 조건에 따라 실행문을 선택할 때 사용

### 1. 단순 if 문

* 단순 if 문은 조건식이 ture일 때만 실행문을 수행
* 조건식에는 ture, false를 산출할 수 있는 연삭식, 논릿값, 변수가 옴

```agsl
if (조건식){
    실행문;
}
```
![Alt text](https://images.velog.io/images/sdc337dc/post/9f03b54e-a4e5-4bf6-bab5-0a00ca20732d/image.png)


### 2.if~else 문
* if~else 문은 조건식의 true나 false에 따라 다른 실행문을 수행

```agsl
if (조건식) {
    실행문;
} else {
    실행문;
}
```
![Alt text](https://t1.daumcdn.net/cfile/tistory/251C7C455820A76130)

### 3. 다중 if 문

* 조건이 다양할 때 사용
* if 문 다음에 else if문을 연속 추가해 각 조건대로 점검한 후 수행

```agsl
if (조건식 1) {
    실행문;
} else if (조건식 2){
    실행문;
} else if (조건식 3){
    실행문;
] else {
    실행문;
}
```  

![Alt text](https://t1.daumcdn.net/cfile/tistory/252B68455820A7631C)

- Demo

### 4. 중첩 if문

* if문 안에 다른 if 문이 포함 되는 것

```agsl
import java.util.Scanner;
public class MultiIfDemo {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String grade;
        System.out.print("점수를 입력하세요. :");
        int score = in.nextInt();

        if (score >= 90)
            grade = "A";
        else{
        if(score>=80)
            grade = "B";
        } 
        else {
        if (score>=70)
            grade = "C";
            }
        else {
        if
         (score >= 60)
            grade = "D";
        }
        else
            grade = "F";
        System.out.println("당신의 학점은 " + grade);
    }
}

* 중괄호 사용으로 명확하게 표시 !
```

## 03) 반복문

* 조건에 따라 같은 처리를 반복
* while 문, do~ while 문, for문이 있다
* for문은 반복할 횟수를 알 때 사용

### 1. while 문
* 반복할 횟수는 미리 알 수 없지만 조건은 알 수 있을 때 사용
* 조건식이 ture 일때 본체 실행문 반복적 수행
* false이면 ,while문 다음 실행문 수행

```agsl
while (조건식){
    반복 실행문;
}
```


### 2. do ~ while 문

* 조건식 평가와 본체 실행 순서가 while 문과 다름
* 반복문 본체를 먼저 실행한 후 조건식 평가
![Alt text](https://t1.daumcdn.net/cfile/tistory/2265233A58217FC90D)

``"DoWhileDemo"``

### 3. for문

* 반복할 횟수를 미리 알 수 있을 때 사용
* 조건식이 ture이면 본체 실행문을 반복적 수행(false이면 종료)
* 초기식은 for문을 시작할 때 한번만 실행
* 
```agsl
for (초기식; 조건식; 증감식){
    반복 실행문;
}
```
![Alt text](https://www.memoengine.com/Posts/files/for-statement-flowchart_637762290827072976.png)

## 04) 분기문
* 반복문을 종료하거나 현재 반복문을 마칠 때 사용
* 분기문을 사용하면 프로그램 흐름이 복잡해지기 때문에 꼭 ! 필요할 때 사용

### 1.break 문
* switch 문의 본체를 벗어나려고 주로 사용
* 레이블이 없다면 break 문을 포함하는 맨 안쪽 반복문 종료
* 레이블이 있다면 레이블로 표시된 반복문을 종료

### 2.continue 문

* 반복문에서만 사용
* 현재 반복은 건너뛴채 나머지 반복만 계속 실행할 때 사용

```agsl
while (조건식){
    continue;
}
 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
do{
    continue;
} while (조건식);
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
for (초기식; 조건식; 증감식){
    continue;
}
```

## 5)switch 문

* 여러 경로 중 하나를 선택할 때 사용

### 1. 기존 switch문

* 0개 이상의 case 레이블을 포함

-  사용법
```agsl
switch(변수) { // 연산식도 가능함
    case 상수1 : 0개 이상의 실행문 // case 레이블( break 문과 같은 실행문이
    // 없으면 계속해서 다음 case 레이블 실행
    ...
    default : 0개 이상의 실행문 // 선택사항
}
```
- 예제

```agsl
public class SwitchDemo{
    public static void main(String[]args){
    int number = 2;
    
    switch (number){ // 넘버는 2 이므로 2번 케이스부터 진행
    case 3:
    System.out.print("*");
    case 2:  // break 문이 없으므로 계속해서 1 case까지 진행
    System.out.print("*");
    case 1:
    System.out.print("*");
    }
    }
}
```
### 2. 개선된 switch 문

* 화살표 case 레이블(case 상수 ->) : 콜론 case 레이블과 달리 일치하는 case 레이블의 실행문만 수행하고 다음 case로 이동하지 않음
- case 레이블의 실행문은 실행문 블록도 가능함

* switch 연산식 : 기존 switch 문과 달리 값을 반환ㅘㄹ 수 있는 연산식으로 사용가능
* 다중 case 레이블 : 콤마로 연결된 다수의 상수를 case 레이블로 사용할 수 있다.



* yield 예약어 : yield는 값을 반환하면서 switch 연산식을 종료하므로 yield 문 뒤에 break문이 필요 없다.
- case 혹은 default 레이블의 실행문이 블록일 경우에만 사용할 수 있다.

```agsl
public class Switch2Demo {
    public static void main(String []args){
        whoIsIt("호랑이");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("곰팡이");
    }


static void whoIsIt(String bio){
   String  kind = switch (bio){
       case "호랑이" , "사자" -> "포유류"; // bio 값이 호랑이거나 사자이면 포유류를 반환
       case "독소리", "참새" -> "조류";
       case "고등어","연어"->"어류";
       default -> {
           System.out.print("어이쿠! "); // 어이쿠를 화면에 출력만 한다면 반환값이 문자열이 아니므로 yield를 사용해 문자열 반환
           yield "...";
       }
   }; // 하나의 실행문이므로 마지막에 ;
    System.out.printf("%s는 %s이다.\n",bio, kind);
}
}
```