///*
// * Create a Student class describing attributes of a student like prn, name, DoB, marks etc.
// * Create an array of objects of Student class and perform operations like:
// * Add students, Display, Search (by prn, by name, by position), Update/Edit and Delete
// */
//
//package PIJL_Assignments;
//
//import java.util.*;
//// This class requires Student.java file to exist in the same package.
//
//public class PIJL_3 {
//
//	public static void main(String[] args) {
//		// Create ArrayList of Student objects
//		ArrayList<Student> s = createStudentArrayList();
//
//		// Display all Student objects
//		for(Student temp: s) {
//			temp.display();
//		}
//	}
//
//	// Create and return ArrayList of Student objects
//	 private static ArrayList<Student> createStudentArrayList() {
//		 ArrayList<Student> arr = new ArrayList<Student>();
//		 Scanner sc = new Scanner(System.in);
//		 int choice = 1;
//
//		 while(choice == 1) {
//			 arr.add(inputStudent(sc));
//			 System.out.print("Enter 1 to continue, 0 to stop.");
//			 choice = sc.nextInt();
//		 }
//		 sc.close();
//		 return arr;
//	 }
//
//	 // Create, input and return a new Student object
//	 private static Student inputStudent(Scanner sc) {
//
//		 System.out.print("Enter prn, name, DoB, marks: ");
//		 long prn = Long.parseLong(sc.next());
//		 String name = sc.next();
//		 String DoB = sc.next();
//		 int marks = Integer.parseInt(sc.next());
//
//		 Student s = new Student(prn, name, DoB, marks);
//
//		 return s;
//	 }
//
//	 private static ArrayList<Student> addStudent(ArrayList<Student> arr, Scanner sc) {
//		 Student toAdd = inputStudent(sc);
//		 arr.add(toAdd);
//		 return arr;
//	 }
//
//	 // Search element by PRN
//	 private static void searchPRN(long prn, ArrayList<Student> arr) {
//	 	for(Student s:arr) {
//			if(s.getPrn() == prn)
//				System.out.println("Element found.");
//		 }
//		System.out.println("Element not found.");
//	 }
//
//	 // Search element by Name
//	 private static void searchName(String name, ArrayList<Student> arr) {
//	 	for(Student s:arr) {
//			if(s.getName().equals(name))
//				System.out.println("Element found.");
//		 }
//		System.out.println("Element not found.");
//	 }
//
//	 // Search element by position
//	 private static void searchPosition(int pos, ArrayList<Student> arr) {
//		 System.out.print("Element at position " + pos + " is: ");
//		 arr.get(pos).display();
//	 }
//
//	 // Delete element by PRN
//	 private static void deletePRN(long prn, ArrayList<Student> arr) {
//	 	for(int i = 0; i < arr.size(); i++) {
//	 		if(arr.get(i).getPrn() == prn) {
//	 			arr.remove(i);
//	 			break;
//	 		}
//	 	}
//	 }
//}