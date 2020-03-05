public class Player{ 
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player (String name, int defense){
        this.name = name;
        this.defense = defense;
        hp = 100;
    }
    //lengkapi
    public Player (String name, int attack, int defense){
        this.name = name;
        attackPower = attack;
        this.defense = defense;
    }

    public int PDamage(Player enemy){
        int darah = 0;
        if(defense - enemy.getAttackPower() >= 0 ){
           darah = (defense - enemy.getAttackPower());
        }else if(defense - enemy.getAttackPower() < 0){
           darah = -1*(defense - enemy.getAttackPower());
        }
        return darah;
    }
    
    public void getDamage(Player enemy){
        if(defense < enemy.attackPower){
            hp = hp - PDamage(enemy);
        
        }

    }
    public void status(){
        System.out.println(name + " status");
        System.out.println("Hp = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower);
        System.out.println();
    }
    //lengkapi
    public int getAttackPower(){
        return this.attackPower;
    }
    public void setAttackPower(int attackPower){
       this.attackPower = attackPower; 
    }
}




