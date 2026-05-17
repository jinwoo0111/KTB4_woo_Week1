import java.util.Scanner;

public class Ball extends Athlete{
    String handed; // 주손 , 1.왼손 2. 오른손

    public Ball(String name, int age){
        Scanner sc = new Scanner(System.in);

        this.name = name;
        this.age = age;
        while(true){
            System.out.println("[주손 선택]");
            System.out.println("[ 1. 왼손잡이 | 2. 오른손잡이 ]");
            System.out.print("주손 선택: ");
            int tmp = sc.nextInt();

            if(tmp == 1){
                this.handed = "왼손잡이";
                break;
            }
            else if(tmp == 2){
                this.handed = "오른손잡이";
                break;
            }
            else{
                System.out.println("1, 2 중 하나를 선택하세요.");
            }
        }
    }
}