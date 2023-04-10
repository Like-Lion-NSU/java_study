import java.util.HashMap;
import java.util.Map;
public class Ex1 {
    public static void main(String[] args){
        Map<String, String > map =  new HashMap<>();//map은 kep와 value의 값에 순서 상관 없이 출력
        map.put("김씨", "어부");
        map.put("이씨", "광부");
        map.put("박씨", "농부");
        map.put("김씨", "어부");

        for(String key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
}
//TreeMap : 오름차순
//linked... : 입력 순서대로
// put 넣기 , get 가져오기, size 크기확인, replace 내용변경 , remove 삭제, coatinsKey 값이 있는지 확인