
public class FROG {
	private String color;
	private int jump;
	private boolean run= true;
	
	FROG(){}
	
	FROG(String a, int b){
		color= a;
		jump= b;
	}
	
	public boolean getRun(FIELD field) {
		return run;
	}

	public void getProses(FIELD field, int indeksFrog, int indeksField) {
		int ketinggian= Main.random.nextInt(11);
		if (jump + ketinggian > field.getTinggiBambu(indeksField)) System.out.println("Katak "+(indeksFrog+1)+" berhasil melompati bambu setinggi "+field.getTinggiBambu(indeksField)+" dengan melompat setinggi "+ketinggian); 
		else{
			System.out.println("Katak "+(indeksFrog+1)+" gagal melompati bambu");
			run= false;
		}
	}
	
	public boolean compare(FROG frog) {
		return true;
	}
	
	public int getMax(FROG frog[]) {
		return 0;
	}
	
}
