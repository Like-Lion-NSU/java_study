package Fri_StudyExercise;
//[7-11]문제 7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
//기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
//[Hint]이전 채널의 값을 저장할 멤버변수를 정의하라
//메서드:gotoPrevChannel
//기능:현재 채널을 이전 채널로 변경한다
//반환타입:없음
//매개변수:없음

   class Exer3_3 {
        public static void main(String[] args) {
            MyTv2 t = new MyTv2();//인스턴스 t를 생성

            t.setChannel(10);
            System.out.println("CH:" + t.getChannel());
            t.setChannel(20);
            System.out.println("CH:" + t.getChannel());
            t.gotoPrevChannel();//현재 채널값->이전 채널값 메서드
            System.out.println("CH:" + t.getChannel());//현재 채널값(channel) 20이 저장되고 이전 채널값 10이 저장됨
            t.gotoPrevChannel();
            System.out.println("CH:" + t.getChannel());

        }
    }


