
public class MainStackFloat {

	public static void main(String[] args) {
	StackFloat Berat = new StackFloat();
	Berat.cetak();
	
	Berat.push((float)45.68);Berat.cetak();
	Berat.push((float)42.54);Berat.cetak();
	Berat.push((float)47.00);Berat.cetak();
	Berat.push((float)56.24);Berat.cetak();
	Berat.push((float)43.45);Berat.cetak();

	Float br = Berat.pop();Berat.cetak();
	System.out.println(br);
	}

}
