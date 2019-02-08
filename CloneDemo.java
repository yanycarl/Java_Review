package Clone;

class beClone implements Cloneable{
	public beClone clone() throws CloneNotSupportedException{
		return (beClone)super.clone();
	}
}

public class CloneDemo {
	public static void main(String[] args) {
		beClone bc = new beClone();
		try {
			beClone bc1 = bc.clone();
			System.out.println("Ref:"+ String.valueOf(bc1 == bc));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
	}
}

