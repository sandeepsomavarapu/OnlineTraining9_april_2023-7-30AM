
public class Variables_Ex {
	static int countryCode = 91;// static and global
	int empId = 111; // instance and global

	public static void main(String[] args) {
		// main-->ctrl+space-->enter

		int result = 230;// local variables

		System.out.println("welcome to java eclipse");

		System.out.println(result);

		System.out.println(Variables_Ex.countryCode);
		// classname objname=new classname();
		Variables_Ex wel = new Variables_Ex();// object

		System.out.println(wel.empId);
	}
}// ctrl+shift+f
