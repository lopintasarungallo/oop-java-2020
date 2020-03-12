import java.util.Scanner;
 class MainPlayer2{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Player2 one = new Player2("Udin","petarung");
         Player2 two = new Player2("jok0","assasin");
         boolean re = false;
         while(true){
             if(!re){
                 System.out.println("1. attack");
                 System.out.println("2. buy ");
                 System.out.println("3. healing ");
                 System.out.println("4. Show Status ");
                 System.out.println("5. Show Items ");
                 int n = sc.nextInt();
                 switch(n){
                     case 1:
                     one.attack(two);
                     if(one.death(two)){
                         System.out.println("Player 1 mati ");
                         return;
                     }
                     re=true;
                     break;
                     case 2:
                     one.buy();
                     re=true;
                     break;
                     case 3:
                     one.healing();
                     re=true;
                     break;
                     case 4:
                     one.showStatus();
                     break;
                     case 5 :
                     one.showItems();
                     break;
                     default:
                     return;
                    
                 }
                 if(two.getHp()<=0){
                     break;
                 }
             }else{
                System.out.println("1. attack");
                System.out.println("2. buy ");
                System.out.println("3. healing ");
                System.out.println("4. Show Status ");
                System.out.println("5. Show Items ");
                int n = sc.nextInt();
                switch(n){
                    case 1:
                    two.attack(one);
                    if(two.death(one)){
                        System.out.println("Player 2 mati ");
                        return;
                    }
                    re=false;
                    break;
                    case 2:
                    two.buy();
                    re=false;
                    break;
                    case 3:
                    two.healing();
                    re=false;
                    break;
                    case 4:
                    two.showStatus();
                    break;
                    case 5 :
                    two.showItems();
                    break;
                    default:
                    return;   
             }
             if(one.getHp()<=0){
                 break;
             } 


         } 
     }
 }
}
