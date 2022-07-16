package code;
class defAccessSpecifier {
	 void display()
	 {
		 System.out.println("this is default access specifier");
	 }
}
public class accessSpecifers1 {
	public static void main(String args[])
	{
	System.out.println("Default Access Specifier");
	defAccessSpecifier obj=new defAccessSpecifier();
	obj.display();
	}

}

