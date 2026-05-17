import java.util.Scanner;

public class Jiujitsu extends MartialArts{
    String style; // 1. 브라질리언, 2. 유러피안
    public Jiujitsu(String name, int age){
        super(name, age);
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("[ 스타일 선택 ]");
            System.out.println("1. 브라질리언 | 2. 유러피안");
            System.out.print("스타일 선택: ");
            int tmp = sc.nextInt();

            if(tmp == 1){
                this.style = "브라질리언";
                break;
            }
            else if(tmp == 2){
                this.style = "유러피안";
                break;
            }
            else{
                System.out.println("1, 2 중 하나를 선택하세요.");
            }
        }
    }
}
