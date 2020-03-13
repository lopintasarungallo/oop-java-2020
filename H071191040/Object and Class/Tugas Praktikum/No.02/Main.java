class Main
{
	public static void main(String[] args) 
	{
		Rectangle rec = new Rectangle();
		rec.height = 5.5;
		rec.width = 1;

		System.out.printf("Luas = %.2f\n", rec.getArea());	
	}
}