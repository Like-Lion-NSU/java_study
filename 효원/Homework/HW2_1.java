package Homework;
//멋사 백엔드 부원 5명의 이름을 입력 받아 ArrayList에 저장한 후
//본인과 같은 성을 가진 사람들만 출력하는 프로그램 작성
//*본인 = 첫번째 이름

import java.util.*;

public class HW2_1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList();// 입력받을 이름 ArrayList 선언
        Scanner sc = new Scanner(System.in);
        int count = 0;//같은 성씨를 가진 사람 수
        System.out.println("부원 5명의 이름을 입력해주세요.>>");
        for(int i = 0; i < 5; i++) {
        //5명의 이름을 입력하고 인덱스번호는 0부터 시작하기에 5보다 작을 때까지 실행
            String fullname = sc.nextLine();
            //이름 입력 받음
            name.add(fullname);
            //ArrayList에 추가
        }
        String first = name.get(0).substring(0,1);
        //0번째 인덱스 값을 잘라서 a에 저장
        //first에는 '양'이 저장
        for(int i = 1; i < name.size(); i++){
       //0번째 값과 비교할 것이기 때문에 1번째부터
            if((name.get(i)).contains(first)){
            //i번째 이름에 양이 포함되었을때
            count++;//명수 추가
            System.out.print("["+name.get(i)+"] ");}//[]안의 이름 출력
        }
        System.out.printf("\n나와 성이 같은 사람은 총 %d명입니다.", count);
    }
}
//substring: 문자열 자르기 함수
//사용법
//substring(인덱스)
//인덱스부터 출력
//substring(시작인덱스, 끝인덱스)
//시작인덱스부터 끝인덱스 전까지(끝인덱스-1까지)
