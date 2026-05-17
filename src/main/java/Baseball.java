import java.util.Scanner;

public class Baseball extends Ball{
    String pos; // 포지션 1. 투수, 2. 타자

    public Baseball(String name, int age){
        super(name, age);
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("[ 포지션 선택 ]");
            System.out.println("1. 투수 | 2. 타자");
            System.out.print("포지션 선택: ");
            int tmp = sc.nextInt();

            if(tmp == 1){
                this.pos = "투수";
                break;
            }
            else if(tmp == 2){
                this.pos = "타자";
                break;
            }
            else{
                System.out.println("1, 2 중 하나를 선택하세요.");
            }
        }
    }
}
