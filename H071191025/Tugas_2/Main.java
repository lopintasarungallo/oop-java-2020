public class Main{
public static void main(String[] args) {
    int defense = 15;
    int attack = 0;
    Player player1 = new Player("Mino", attack, defense);
    Player player2 = new Player("Hilda", defense);

    //lengkapi
    player2.setAttackPower(35);

    player1.getDamage(player2);
    player2.getDamage(player1);
    player1.status();
    player2.status();

}
}
