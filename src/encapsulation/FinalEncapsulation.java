package encapsulation;

 class EncapsulationDemo {
    private int empsal;
	private String empname;
	
	public int emp_sal() {
		return empsal;
	}
	public String emp_name() {
		return empname;
	}
	public int getemp_sal(int sal) {
		return empsal=sal;
	}
	public String getemp_name(String  name) {
		return empname=name;
	}
	

}

public class FinalEncapsulation {
	

	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.getemp_sal(50000);
		obj.getemp_name("RAM");
		int a = obj.emp_sal();
		String b = obj.emp_name();
		System.out.println(a);
		System.out.println(b);
		

	}

}
