import java.util.*;
public class MainShip {
    public static void main(String args[]){
        //宣言・初期化
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        Ship ship3 = new Ship();
        Scanner sc = new Scanner(System.in);
        int turn = 1;
        int i = 1;

        //タイトルの表示
        System.out.println("********************");
        System.out.println("      戦艦ゲーム     ");
        System.out.println("********************");

        //ゲーム本体
        while(Ship.deadship()!=true){
            System.out.println("-------[ターン"+turn+"]-------");
            if(ship1.surviveship() == false){
                System.out.println("戦艦1：生きてる");
            }else{
                System.out.println("戦艦1：撃沈");
            }

            if(ship2.surviveship() == false){
                System.out.println("戦艦2：生きてる");
            }else{
                System.out.println("戦艦2：撃沈");
            }

            if(ship3.surviveship() == false){
                System.out.println("戦艦3：生きてる");
            }else{
                System.out.println("戦艦3：撃沈");
            }

            if(ship1.surviveship() == true&&ship2.surviveship() == true&&ship3.surviveship() == true){
                System.out.println("全ての戦艦を撃破しました。ゲームを終了します。");
                break;
            }

            System.out.println("爆撃地点のX座標を入力してください(1-5)");
            int x = sc.nextInt()-1;
            System.out.println("爆撃地点のY座標を入力してください(1-5)");
            int y = sc.nextInt()-1;

            ship1.shipLife(x,y,i++);
            ship2.shipLife(x,y,i++);
            ship3.shipLife(x,y,i++);

            i = 1;
            turn = turn +1;
        }
    sc.close();
    }
}
