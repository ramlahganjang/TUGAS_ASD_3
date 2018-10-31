

public class MainStackDouble {

	public static void main(String[] args) {
				StackDouble Tinggi = new StackDouble();
				Tinggi.cetak();
				
				Tinggi.push(146.46);Tinggi.cetak();
				Tinggi.push(154.4);Tinggi.cetak();
				Tinggi.push(160.24);Tinggi.cetak();
				
				Double tg = Tinggi.pop();Tinggi.cetak();
				System.out.println(tg);

	}

}
