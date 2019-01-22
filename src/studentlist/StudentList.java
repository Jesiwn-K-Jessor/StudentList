
package studentlist;


public class StudentList {


    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setName("Jeswin");
        s1.setID(101);
        
        System.out.println("s1 ==> Name " + s1.getName() + "\ns1 ==> ID is: " + s1.getID());
        
        Student s2 = new Student();
        System.out.println("s2 ==> Name " + s2.getName() + "\ns2 ==> ID is: " + s2.getID());
        
        Student s3 = new Student("anmol", 102);
        System.out.println("s3 ==> Name " + s3.getName() + "\ns3 ==> ID is: " + s3.getID());
        
        Student [] studentList = new Student[5];
        
        studentList[0]= s1;
        studentList[1]= s2;
        studentList[2]= s3; // change id of s1
        studentList[3]= new Student ("Abc", 1111);
        studentList[4]= new Student ("Xyz", 2222);
        s1.setID(4444);
        s1 = new Student("smith",6666);
        
        for(int i = 0; i<5; i++)
        {
            System.out.println(i + " ==> Name: " + studentList[i].getName() + " id " + studentList[i].getID());
        }
    }
    
}
