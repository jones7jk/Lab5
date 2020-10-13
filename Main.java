import java.util.ArrayList;
class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Arnold Spielberg");
		student1.setGPA(4.0);
		student1.setMajor("Electrical Engineering");
   student1.print();

   Student student2= new Student();
   student2.setName( "Jaelee Jones");
   student2.setGPA(4.3);
   student2.setMajor("Information Systems and Accounting ");
   student2.print();
   ArrayList<Double> gpas = new ArrayList<Double>();
   gpas.add(0,student1.gpa);
   gpas.add(student2.gpa);
   double sum=0;
   

   for(int i=0; i < gpas.size(); i++) { 
     
     sum= sum+ gpas.get(i);}
    System.out.println("The average GPA is a " + sum/gpas.size()); 

   



	}
}