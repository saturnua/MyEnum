import java.util.Arrays;

public class MyEnum {
		
	enum Comp {DESKTOP, NOOTEBOOK, NETTOP, NETBOOK;
		
	public int test = 0;	
		
	public void print(){
		System.out.println("This is method in MyEnum ... ");
		}
	}

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(Comp.values()));
	}
	
}
