# for && while
***

> ### 1. for
> ***
>>   ```java 
>>   public class Exjava{
>>   public static void cast(String args[]){
>>   for(초기화;조건식;증감식){
>>      // 반복되는 동안 수행될 문장
>>      }
>>    }
>>  }
>>   ```
>>  - 초기화 : 반복문에 사용될 변수를 초기화
>>  <br> 둘 이상의 변수도 가능하며 ','로 연결한다.
>>  <br> 단 두 변수의 타입은 같아야 한다!
>>  - 조건식 :값이 참(true)면 반복, 거짓(false)면 반복을 중단
>>  - 증감식 : 반복문을 제어하는 변수의 값을 증가 또는 감소
>>  <br> 초기화처럼 ','를 이용해 연결해 사용 가능
>>  - 위 3가지 요소는 생략가능하며, 심지어 모두 생략 가능
>>  - 실행될 문장이 1개면 {}생략 가능. 2개 이상은 생략 불가능
>
> ### 2. 중첩 for
> ***
> >> - for문 안 for문 집어넣기 가능
> >> - 삼각형 모양 별 출력 예제
>>   ```java 
>>   public class Exjava{
>>   public static void cast(String args[]){
>>   for(int i=1; i<=5; i++){
>>       for(int j=0; j<i; j++){
>>          System.out.print("*");
>>        }
>>       System.out.println();
>>      }
>>    }
>>  }
>> ```
>
> ### 3. while
> ***
>>   ```java 
>>   public class Exjava{
>>   public static void cast(String args[]){
>>   while(조건식){
>>      // 조건식의 연산결과가 참(true)인 동안 반복될 문장
>>      }
>>    }
>>  }
>>   ```
>> - for문과 달리 조건식 생략 불가능!
>
> ### 4. do-while
> ***
>>   ```java 
>>   public class Exjava{
>>   public static void cast(String args[]){
>>   do{
>>      // 조건식의 연산결과가 참(true)인 동안 반복될 문장
>>      } while(조건식);   // ;주의
>>    }
>>  }
>>   ```
>> - for, while문과 다르게 조건이 ture/false 뭐든 1번은 무조건 수행
>
> ### 5. break
> ***
>> - switch문과 동일하게 break문을 통해 반복문 종료 가능
>> - 주로 무한 반복문에서 사용
>
> ### 6. continue
> ***
>> - continue문을 만나면 반복문 끝으로 이동하여 다음 반복 실행
>> - for문 - 증감식으로 이동 / while문, do-while문 - 조건식으로 이동
>
> ### 7. 이름 붙은 반복문
> ***
>> - break문은 근접한 단 하나의 반복문만 벗어날 수 있기 떄문에,
>> <br> 중첩 반복문일 땐 중첩 반복문 앞 이름을 붙여
>> <br> break문과 continue문에 이름을 지정해주어 설정 가능
