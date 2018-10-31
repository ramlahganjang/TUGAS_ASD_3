import java.util.ArrayList;

public class ArrayListObject { 

	public static void main(String[] args){ 

	ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>(); 
	Data.add(new Mahasiswa("Ramlah", "D0217016", "B", "Enrekang"));
	Data.add(new Mahasiswa("NADRA", "D0217512", "B", "Sepabatu")); 
	Data.add(new Mahasiswa("Rosalina Konde", "D0217012", "B", "Mamasa")); 
	Data.add(new Mahasiswa("Nilasari", "D0217", "B", "Sendana")); 
	
	Data.forEach(data ->{ 


	System.out.println("Nama : " + data.getNama() + ", NIM : " + data.getNim() + ", Kelas : " + data.getKelas() + ", Alamat : " + data.getAlamat()); 


	}); 


 


} 


}  

