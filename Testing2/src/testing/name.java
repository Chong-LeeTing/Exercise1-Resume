package testing;
import java.util.*;
public class name {

	public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in);
		
		printName();
		printAge();
		printBirthday();
		printGender();
		printMarital();
		printCitizenship();
		printAddress();
		printHp();
		printCGPA();
		printGrade();
		printWork();
		printLanguage();
		printProfessional();
		printAwards();
		
		in.close();
		
	}		
		
	
	public static void printName() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your name");
		String name=in.next();
		System.out.println("Name : "+name);
				
	}
	
	public static void printAge() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your age");
		int age=in.nextInt();
		System.out.println("Age : "+age+" years old");
		
	}
	
	public static void printBirthday() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your birthday");
		String birthday=in.next();
		System.out.println("Birthday : "+birthday);
			
	}
	
	public static void printGender() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your gender");
		String str=in.next();
		char gender=str.charAt(0);
		System.out.println("Gender : "+gender);
			
	}
	
	public static void printMarital() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your marital status");
		String marital=in.next();
		System.out.println("Marital Status : "+marital);
		
	}
	
	public static void printCitizenship() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your citizenship");
		String citizenship=in.next();
		System.out.println("Citizenship : "+citizenship);
		
	}
	
	public static void printAddress() {
	    Scanner in = new Scanner (System.in);
	    
	    System.out.print("Enter your address");
	    String address=in.next();
	    System.out.println("Home Address : "+address);
	    
	
	}   
	    
	public static void printHp() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your hp");
		String hp =in.next();
		System.out.println("Hp : "+hp);
		
	}
	
	public static void printCGPA() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your CGPA");
		double cgpa=in.nextDouble();
		System.out.println("CGPA : "+cgpa);
		
	}
		
	public static void printGrade() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter Grade STIA1113");
		String str=in.next();
		char grade=str.charAt(0);
		System.out.println("Grade : "+grade);
		
	}
		
	public static void printWork() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your work1");
		String work1=in.next();
		System.out.print("Enter your work2" );
		String work2=in.next();
		System.out.println("Work Experiences :1."+work1+"\n\t\t  2."+work2);
		
		}
		
	public static void printLanguage() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your language1");
		String language1=in.next();
		System.out.print("Enter your language2");
		String language2=in.next();
		System.out.print("Enter your language3");
		String language3=in.next();
		System.out.println("Language :1."+language1+"\n\t  2."+language2+"\n\t  3."+language3);
		
	}
	
	public static void printProfessional() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your professional");
		String professional=in.next();
		System.out.println("Professional Skills : "+professional);
		
	}
	
	public static void printAwards() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter your awards");
		String awards=in.next();
		System.out.println("Awards & Certificates : 1."+awards);
		
		
	}
		
		
    
	}




