package java2021later.rpgsample.rpgcreature;

import java.util.Random;

/**
 * ゴーレムクラス
 */
public class Golem extends Monster{
    
    /**
     * 魔法使いのコンストラクタ
     */
    public Golem(){
        super("ゴーレム",100);
    }

    /**
     * 攻撃メソッド
     * @param opponent：攻撃相手
     */
    @Override
    public void attack(Creature opponent) {
        
        Random r = new Random();
        int damage = 0;
        if( r.nextInt(100) < 5){
            System.out.printf("%sの会心の一撃！\n",getName());
            damage = 30;
        }else{
            System.out.printf("%sの攻撃！\n",getName());
            damage = r.nextInt(6)+5;
        }
        opponent.damaged(damage);
        
        displayMessage(opponent,damage);
        
    }
}