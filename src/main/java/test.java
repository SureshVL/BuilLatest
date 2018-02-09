
public class test {
public static void main(String[] args) {
	String str ="4.11111111111111E15";
	System.out.println(str.substring(0,str.length()-3).replaceAll("[^0-9]", ""));
	//String str= "123.00000554550";	
	//System.out.println(new Float(str).intValue()+"");
	
}
}
	