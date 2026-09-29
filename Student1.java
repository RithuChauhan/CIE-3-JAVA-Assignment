class Student1 {
  int roll_no;
  String name;

  static String college = "abc college";
Student1(int r, String n,  String c){
    roll_no = r;
    name = n;
    college = c;
}
  void display(){
 System.out.println(roll_no + " " + name + " "+ college);
 
  }

}
class Static{
  public static void main(String[] args) {
      Student1 s1 = new Student1(101, "rithu", "ssihl");
      Student1 s2 = new Student1(102, "ritu", "sssihl");  
       s1.display();
       s2.display();
  }}

