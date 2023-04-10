package JavaStandard.Ch04;

//일반적인 for문과 향상된 for문
public class Ch4_FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        //모든 요소를 출력하는 for문
        for(int i=0;i<arr.length;i++)
            System.out.printf("%d ", arr[i]);
        System.out.println();

        for(int tmp : arr) {//매 반복마다 하나씩 변수에 저장
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum="+sum);
    }//main의 끝
}
//향상된 for문이 더 간결함