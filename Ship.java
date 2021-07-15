import java.util.*;
public class Ship {
    Random rnd = new Random(); 
    public int hp = 3;
    public static int sum_hp = 3;
    public int x = moveship();
    public int y = moveship();
    
    //戦艦を動かすメソッド
    public int moveship(){
        return rnd.nextInt(4);
    }

    //船が3隻生きているかどうか判定するメソッド
    public static boolean deadship(){
        if(sum_hp>0){
            return false;
        }else{
            return true;
        }
    }

    //船が生きているかどうかを判定するメソッド
    public boolean surviveship(){
        if(this.hp>0){
            return false;
        }else{
            return true;
        }
    }

    //判定メソッド
    public void shipLife(int x,int y,int i){
        if(this.x==x&&this.y==y){
            if(this.hp>1){
                System.out.print("戦艦"+i+"：");
                System.out.println("命中だがまだ沈まない。移動します");
                this.hp--;
                this.x = moveship();
                this.y = moveship();
            }else if(this.hp == 1){
                System.out.print("戦艦"+i+"：");
                System.out.println("致命的な損傷により撃沈");
                this.hp--;
            }else if(this.hp == 0){
                System.out.print("戦艦"+i+"：");
                System.out.println("撃沈");
                sum_hp--;
            }
        }else if(this.x+1==x+1||this.x-1==x-1){
            if(this.hp == 0){
                System.out.print("戦艦"+i+"：");
                System.out.println("撃沈");
            }else{
                System.out.print("戦艦"+i+"：");
                System.out.println("波高し");
            }
        }else if(this.y+1==y+1||this.y-1==y-1){
            if(this.hp == 0){
                System.out.print("戦艦"+i+"：");
                System.out.println("撃沈");
            }else{
                System.out.print("戦艦"+i+"：");
                System.out.println("波高し");
            }
        }else{
            if(this.hp == 0){
                System.out.print("戦艦"+i+"：");
                System.out.println("撃沈");
            }else{
                System.out.print("戦艦"+i+"：");
                System.out.println("はずれ");
            }
        }
    }
}

