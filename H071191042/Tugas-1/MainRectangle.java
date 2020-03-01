import java.util.* ; 
class MainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        rec.height = sc.nextDouble();
        rec.width = sc.nextDouble();
        // rec.height = 15;
        // rec.width = 10;
        System.out.println("Luas = " + rec.getArea());
    }
}