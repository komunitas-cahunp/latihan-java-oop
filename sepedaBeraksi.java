public class sepedaBeraksi{
	public static void main(String[] args) {
		sepeda sepedaku = new sepeda();	

		sepedaku.setGir(1);

		sepedaku.gir = 3;
		System.out.println("Gir saat ini: "+ sepedaku.getGir());
	}
}