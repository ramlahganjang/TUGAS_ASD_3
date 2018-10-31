
public class MainStackString {

	public static void main(String[] args) {
		StackString Nama = new StackString();
		Nama.cetak();
		
		Nama.push("Ramlah");Nama.cetak();
		Nama.push("Ramlah");Nama.cetak();
		Nama.push("Ramlah");Nama.cetak();
		Nama.push("Ramlah");Nama.cetak();
		
		String nm = Nama.pop();Nama.cetak();
		System.out.println(nm);
	}

}
