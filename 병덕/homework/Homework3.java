import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int namesu=0; // 나와 이름이 같은 부원의 수를 늘리기 위한 변수
        String name; // 부원들의 이름을 저장
        System.out.println("부원 5명의 이름을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        ArrayList<String > likename = new ArrayList();// likename 리스트 생성
        for(int i = 0; i<5 ; i++) // 부원의 이름을 5명을 입력 받아야함으로 5번 입력 반복
            likename.add(sc.nextLine());
        for(int i=0; i<4; i++){
            name =likename.get(i); // 배열에 저장된 이름을 name 변수에 저장함.
            if(name.startsWith("서")){ // 같은 성씨로 시작하는 사람들을 찾아냄.
                namesu++; // 나와 이름이 같은 부원의 수를 증가
                System.out.print("["+likename.get(i)+"]"); // 같은 부원의 이름을 배열로 출력
            }
        }
        System.out.println();// 개행
        System.out.println("나와 성이 같은 사람은 총"+namesu+"명입니다."); // 같은 이름의 부원 수를 출력
    }
}

