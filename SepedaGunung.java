public class SepedaGunung extends sepeda{
	private int sadel;

	void setSadel(int jumlah){
		sadel = getGir() - jumlah;
	}

	int	getSadel(){
		return sadel;
	}
}