import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player2 {
   private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private List <Item>items;

    Player2(String name,String role){
        this.name=name;
        this.role=role;
        level=0;
        damage=100;
        hp=1000;
        energy=200;
        money=100000;
        items=new ArrayList<>();
    }
    void showStatus(){
        System.out.println("nama "+name);
        System.out.println("role "+role);
        System.out.println("level " + level);
        System.out.println("damage "+ damage);
        System.out.println("darah " +hp );
        System.out.println("energi "+energy);
        System.out.println("uang "+money);
    }
    void showItems(){
        for(int i=0; i<items.size();i++){
            System.out.println(items.get(i).getName());
            System.out.println(items.get(i).getPrice());
            System.out.println(items.get(i).getInfo());
            System.out.println();
   
        }
        
    }
    /**
     * @param hp the hp to set
     */
    public void setHp(double hp) {
        this.hp = hp;
    }
    /**
     * @return the hp
     */
    public double getHp() {
        return hp;
    }
    void attack(Player2 player){
        player.setHp(player.getHp()-damage);
    }
    void healing(){
        if(getHp()+200>=1000){
            setHp(1000);
            
        }else{
            setHp(getHp()+200);
        }
    }
    void buy(){
        System.out.println("1. armor = 100 = menggurangi damage ");
        System.out.println("2. sword = 200 = menambahkan attack ");
        System.out.println("3. bloodSword = 320 = menambahkan 100 attack ");
        System.out.println("4. PinkyArmor = 200 = menggurangi damage sampai 200");
        Scanner by = new Scanner(System.in);
        int n = by.nextInt();
        switch (n){
            case 1:
            items.add(new Item("armor ",100,"menggurangi damage "));
            money= money-100;
            break;
            case 2:
            items.add(new Item("sword ",200,"menambahkan attack "));
            money= money -200;
            break;
            case 3:
            items.add(new Item("bloodSword ",320,"menambahkan 100 attack "));
            money=money-320;
            break;
            case 4:
            items.add(new Item("PinkyArmor ",200,"menggurangi damage sampai 200 "));
            money=money-200;
            break;
        }
    }

    boolean death(Player2 mati){
        if(mati.getHp()<=0){
            return true;

        }
        return false;
    }
    

}