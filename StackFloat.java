import java.util.ArrayList;
public class StackFloat {

	ArrayList<Float> BeratBadan = new ArrayList<Float>();
	int top = - 1;
	
	public void push(Float value){
		BeratBadan.add(value);
		top = top + 1;
	}
	public Float pop(){
		float values = BeratBadan.get(top);
		BeratBadan.remove(top);
		top = top -1;
		return values;
		}
	public void cetak(){
		System.out.println(BeratBadan.toString());
	}


}
