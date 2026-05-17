import java.util.Scanner;

public class Boxing extends MartialArts{
    String stance; // 1. 사우스포 or 2. 오소독스
    public Boxing(String name, int age){
        super(name, age);
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("[ 스탠스 선택 ]");
            System.out.println("1. 사우스포 | 2. 오소독스");
            System.out.print("스탠스 선택: ");
            int tmp = sc.nextInt();

            if(tmp == 1){
                this.stance = "사우스포";
                break;
            }
            else if(tmp == 2){
                this.stance = "오소독스";
                break;
            }
            else{
                System.out.println("1, 2 중 하나를 선택하세요.");
            }
        }
    }
}
