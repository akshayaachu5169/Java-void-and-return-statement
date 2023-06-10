package returnTypeTest;

public class ReturnTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = address();
		System.out.println(result);
//System.out.println(address());
	}
public static String address() {
	int doorno = 520;
	int pincode = 560016;
	String street = "4th main, Nehru Street,Udhayanagar,";
	String place = "Bangalore,";
	String fulladdress = doorno + " " + " " + street + " " + place + " " + pincode;
	return fulladdress;
			}
}
