import java.util.HashMap;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//map은 kep와 value의 값에 순서 상관 없이 출력
        map.put("cat", "고양");
        map.put("dog", "강아");
        map.put("house", "말");
        map.put("run", "달림");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        while (true) {
            System.out.println("입력하세요 : ");
            if (map.containsKey(a))
                System.out.println(map.get(a));
            else
                System.out.println("없음");
        }
    }
    }