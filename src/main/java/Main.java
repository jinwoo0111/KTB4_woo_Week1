import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("|    아바타 생성하기    |");
        System.out.println("---------------------");

        System.out.print("이름 입력: ");
        String name = sc.next();
        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        int event = 0; // 운동 종목
        while(true) {
            System.out.println("_________________________");
            System.out.println("[ 1. 격투기 | 2. 구기 ]");
            System.out.print("종목 선택: ");
            event = sc.nextInt();

            if(event == 1 || event == 2){
                break;
            }
            else{
                System.out.println("1, 2중 하나를 선택하세요.");
            }
        }

        int cate = 0; // 세부 종목
        if(event == 1){
            System.out.println("< 격투기 선택 >");

            while(true){
                System.out.println("_________________________");
                System.out.println("[1. 복싱 | 2. 주짓수 ]");
                System.out.print("세부 종목 선택: ");
                cate = sc.nextInt();
                if(cate == 1 || cate == 2){
                    break;
                }
                else{
                    System.out.println("1, 2 중 하나를 선택하세요.");
                }
            }
            if( cate == 1){
                Boxing Avatar = new Boxing(name, age);
                System.out.println("=========================");
                System.out.println("복싱 아바타 생성 완료 ");
                System.out.println("이름: " + Avatar.name);
                System.out.println("나이: " + Avatar.age);
                System.out.println("체급: " + Avatar.size);
                System.out.println("스탠스: " + Avatar.stance);
                System.out.println("=========================");
            }
            else{
                Jiujitsu Avatar = new Jiujitsu(name, age);
                System.out.println("=========================");
                System.out.println("주짓수 아바타 생성 완료 ");
                System.out.println("이름: " + Avatar.name);
                System.out.println("나이: " + Avatar.age);
                System.out.println("체급: " + Avatar.size);
                System.out.println("스타일: " + Avatar.style);
                System.out.println("=========================");
            }
        }
        else {
            System.out.println("< 구기 선택 >");
            while(true){
                System.out.println("_________________________");
                System.out.println("[1. 야구 | 2. 농구 ]");
                System.out.print("세부 종목 선택: ");
                cate = sc.nextInt();
                if(cate == 1 || cate == 2){
                    break;
                }
                else{
                    System.out.println("1, 2 중 하나를 선택하세요.");
                }
            }
            if(cate == 1){
                Baseball Avatar = new Baseball(name, age);
                System.out.println("=========================");
                System.out.println("야구 아바타 생성 완료 ");
                System.out.println("이름: " + Avatar.name);
                System.out.println("나이: " + Avatar.age);
                System.out.println("주손: " + Avatar.handed);
                System.out.println("포지션: " + Avatar.pos);
                System.out.println("=========================");
            }
            else{
                Basketball Avatar = new Basketball(name, age);
                System.out.println("=========================");
                System.out.println("농구 아바타 생성 완료 ");
                System.out.println("이름: " + Avatar.name);
                System.out.println("나이: " + Avatar.age);
                System.out.println("주손: " + Avatar.handed);
                System.out.println("포지션: " + Avatar.pos);
                System.out.println("=========================");
            }
        }
    }
}