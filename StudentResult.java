/* Program to receive details of students and print their result */
class StudentResult {
	public static void main(String[] args){
		
			// Receive details of students from console.

			StudentDetail sd1 = new StudentDetail();	// Declare object and use constructor initializing heap memory.
			System.out.print("Enter Student 1 name: ");	
			sd1.name = System.console().readLine();
			System.out.print("Enter Student 1 subject: ");	
			sd1.sub = System.console().readLine();
			System.out.print("Enter Student 1 marks: ");	
			sd1.marks = Integer.parseInt(System.console().readLine());

			StudentDetail sd2 = new StudentDetail();
			System.out.print("Enter Student 2 name: ");
			sd2.name = System.console().readLine();	
			System.out.print("Enter Student 2 subject: ");	
			sd2.sub = System.console().readLine();
			System.out.print("Enter Student 2 marks: ");	
			sd2.marks = Integer.parseInt(System.console().readLine());

			StudentDetail sd3 = new StudentDetail();
			System.out.print("Enter Student 3 name: ");	
			sd3.name = System.console().readLine();
			System.out.print("Enter Student 3 subject: ");	
			sd3.sub = System.console().readLine();
			System.out.print("Enter Student 3 marks: ");	
			sd3.marks = Integer.parseInt(System.console().readLine());
		
			System.out.println("Name/Subject/Marks/Result");	// print title
			sd1.printResult(sd1.name,sd1.sub,sd1.marks,sd1.calcResult(sd1.marks));	// Call printResult method to print name, marks and result.
			sd2.printResult(sd2.name,sd2.sub,sd2.marks,sd2.calcResult(sd2.marks));	// Call printResult method to print name, marks and result.
			sd3.printResult(sd3.name,sd3.sub,sd3.marks,sd3.calcResult(sd3.marks));	// Call printResult method to print name, marks and result.
	}

}

class StudentDetail {

	String name;	// Declare string variable
	String sub;
	int marks;	// Declare integer variable
	char result;	// Declare char variable

	public char calcResult (int marks){	// calcResult method to check status (P)ass or (F)ail.
		if (marks >= 40)
		{
			return 'P';	// denotes Pass
		}
		return 'F';	// denotes Fail
	}

	public void printResult (String name, String sub, int marks, char result)	// printResult method to print details.
	{
		System.out.println(name + "/" + sub + "/" + marks +  "/" + result);		
	}
}

/* End of program. Thanks Acadgild! */