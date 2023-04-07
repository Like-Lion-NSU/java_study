public class Fibonachi {
        public static void main(String[] args) {
            // Fibonnaci 수열의 시작의 첫 두 숫자를 1,1로 한다.
            int num1 = 1;
            int num2 = 1;
            int num3 = 0; // 세번째 값;
            System.out.print(num1+","+num2);

            for (int i = 0; i < 8; i ++){
                /* 10까지 반복이지만 첫 두 숫자를 num1,2로 시작하기 때문에 7번
                 * 반복이 필요함, 따라서 i를 0으로 초기화하고 i가 8보다 커질때까지 반복 */
                // 피보나치 수열은 앞 두 수를 더해서 다음 수를 더하는 방식이다.
                num3=num1+num2;
                // 앞 두 수를 더해야 3번째 값을 구할 수 있기 때문에 num1과 num2를  num3에 더해줌
                num1=num2;
                // 더하는 수를 증가시키기 위해 num2의 값을 num1에 넣어주는 식
                num2=num3;
                // 더하는 수를 증가시키기 위해 num1,2를 더한 값을 num3에 더해줘서 위에 식으로 덧셈을 하기 위해 num3 값을 num2에 넣어줌

                System.out.print(","+num3); //출력문

            }
        }// end of main
    }// end of class

