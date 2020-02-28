import java.util.Scanner;
class Rectangle{
    double height;
    double width;
    double getArea (){
        return height*width;

    }
    public static void main(String[] args) {
        Scanner rv = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        rec. height = rv.nextDouble();
        rec.width = rv.nextDouble();
        System.out.println("luas :" + rec.getArea());
        rv.close();
    }

}