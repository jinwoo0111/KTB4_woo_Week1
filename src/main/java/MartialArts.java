import java.util.Scanner;

public class MartialArts extends Athlete{
    String size; // 체급, 간단하게 1. 플라이, 2. 미들, 3. 헤비

    public MartialArts(String name, int age){
        Scanner sc = new Scanner(System.in);

        this.name = name;
        this.age = age;

        while(true) {
            System.out.println("[체급 선택]");
            System.out.println("[ 1. 플라이급 | 2. 미들급 | 3. 헤비급 ]");
            System.out.print("체급 선택: ");
            int tmp = sc.nextInt();

            if (tmp == 1) {
                this.size = "플라이급";
                break;
            }
            else if(tmp == 2){
                this.size = "미들급";
                break;
            }
            else if(tmp == 3){
                this.size = "헤비급";
                break;
            }
            else {
                System.out.println("1, 2, 3 중 하나를 선택하세요.");
            }
        }
    }
}