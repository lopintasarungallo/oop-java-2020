class Main{
    public static void main(String[] args) {
        int attack = 30;
        int defense = 15;
        Player player1 = new Player("Mino", attack, defense);
        Player player2 = new Player("Hilda", defense);
        
        player2.setAttackPower(35);

        
        player1.getDamage(player2);
        player2.getDamage(player1);

        player1.status();
        System.out.println();
        player2.status();
        System.out.println();
    }
}