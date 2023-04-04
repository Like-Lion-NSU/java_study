package 영태.Week02;

public class GuGuDan {
    public static void main(String[] args) {
        for(int i = 1; i<4; i++){       // 1~3
            for(int j=2; j<5; j++){     // 2~4
                System.out.print(j+"*"+i+"="+j*i +"\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1; i<4; i++){       // 1~3
            for(int j=5; j<8; j++){     // 5~7
                System.out.print(j+"*"+i+"="+j*i +"\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1; i<4; i++){       // 1~3
            for(int j=8; j<10; j++){    // 8~9
                System.out.print(j+"*"+i+"="+j*i +"\t");
            }
            System.out.println();
        }
    }
}
