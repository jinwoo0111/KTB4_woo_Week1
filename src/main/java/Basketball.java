import java.util.Scanner;

public class Basketball extends Ball{
    String pos; // 포지션, 1. 가드 2. 포워드, 3. 센터
    public Basketball(String name, int age){
        super(name, age);
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("[ 포지션 선택 ]");
            System.out.println("1. 가드 | 2. 포워드 | 3. 센터");
            System.out.print("포지션 선택: ");
            int tmp = sc.nextInt();

            if(tmp == 1){
                this.pos = "가드";
                break;
            }
            else if(tmp == 2){
                this.pos = "포워드";
                break;
            }
            else if(tmp == 3){
                this.pos = "센터";
                break;
            }
            else{
                System.out.println("1, 2, 3 중 하나를 선택하세요.");
            }
        }
    }
}
