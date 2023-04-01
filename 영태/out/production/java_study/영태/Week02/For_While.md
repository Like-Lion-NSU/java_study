# For && While
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
>
> ### 2. 중첩 for
> ***
>>   ```java 
>>   public class Exjava{
>>   public static void cast(String args[]){
>>   for(int i=1; i<=5; i++){
>>       for(int j=0; j<i; j++{
>>          System.out.println("*");
>>        }
>>      }
>>    }
>>  }