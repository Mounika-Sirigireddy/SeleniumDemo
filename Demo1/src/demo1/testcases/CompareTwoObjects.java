package demo1.testcases;

public class CompareTwoObjects   
 {  

	private int regno;  
	private String name;  
	public CompareTwoObjects(int regno, String name)
	{
		this.name = name;  
		this.regno = regno;  

	}
	public int getRegno()   
	{
		return regno;  
	}
		public void setRegno(int Regno) {  
			this.regno = regno;  

	}
		public String getName() {
			return name;  

		}
		public void setName(String name)   {
			this.name = name;  

		}


public static void main(String[] args)   {
	CompareTwoObjects emp1 = new CompareTwoObjects(918, "Maria");  
	CompareTwoObjects emp2 = new CompareTwoObjects(918, "Maria");  
	int a=emp1.hashCode();  
	int b=emp2.hashCode();  
	System.out.println("hashcode of emp1 = " + a);  
	System.out.println("hashcode of emp2 = " + b);  
	System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));  

}
}