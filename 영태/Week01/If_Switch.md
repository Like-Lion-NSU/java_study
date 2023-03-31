# if && Switch
***

> ### 1. if
> ***
>>   ```java 
>>   public class Exjava{
>>   public static void cast(String args[]){
>>   if(조건식){
>>      // 조건식이 참(true)일 때 수행될 문장을 적음
>>      }
>>    }
>>  }
>>   ```
>>  - 조건문의 line = 1 이면 블럭{} 생략 가능
>>  <br> line >= 2일 땐 블럭{} 생략 불가능
>>  - if-else
>>> ```java 
>>>   public class Exjava{
>>>   public static void cast(String args[]){
>>>   if(조건식){
>>>     // 조건식이 참(true)일 때 수행될 문장
>>>      }
>>>    else{
>>>     // 조건식이 거짓(false)일 때 수행될 문장
>>>     }
>>>    }
>>>  }
>>>   ```
>> - if-else if
>>> ```java 
>>>   public class Exjava{
>>>   public static void cast(String args[]){
>>>   if(조건식1){
>>>     // 조건식1이 참(true)일 때 수행될 문장
>>>      }
>>>    else if(조건식2){
>>>     // 조건식2이 참(true)일 때 수행될 문장
>>>     }
>>>     else if(조건식3){
>>>     // 조건식3이 참(true)일 때 수횅될 문장
>>>     }
>>>     else{
>>>     // 위 어느 조건식도 만족하지 않을 때 수행될 문장
>>>     }
>>>    }
>>>  }
>>>   ```
>> - if문 블럭{} 안 또 다른 if문을 사용할 수 있다 → 중첩 if문
>  
> ### 2. Switch
> ***
>>   ```java 
>>   public class Exjava{
>>   public static void cast(String args[]){
>>   Switch(조건식){
>>      // 조건식 값이 참(true)이면 조건식 결과 값이 일치하는 case로 이동
>>      case 값1 :
>>          // 조건식 결과 값이 값1과 일치하면 수행될 문장
>>          break;
>>      case 값2 :
>>          // 조건식 결과 값이 값2과 일치하면 수행될 문장
>>          break;
>>      default :
>>          // 조건식 결과 값이 일치하는 case가 없을 때 수행될 문장
>>      }
>>    }
>>  }
>>   ```
>> - Switch 제약조건
>>   - Switch문의 조건식 결과는 정수 또는 문자열
>>   - case문의 값은 정수 상수만 가능하며 중복 불가능
>> - Switch문도 if문과 동일하게 중첩 Swtich문 존재
>
> ### 3. 개선된 Switch
> ***
>> - 화살표 case 레이블
>>  <br> : 클론 case(case :)과 달리 일치하는 case문만 실행하고,
>>  <br> 다음 case문 이동 X → 'break;'가 필요 없음
>> - Switch 연산식
>>  <br> : 기존 Switch문과 달리 값을 반환할 수 있는 연산식 사용 가능
>> - 다중 case 레이블
>>  <br> : 다수의 상수를 ','로 연결해 case문 작성 가능