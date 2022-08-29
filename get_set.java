package Hardik_code;

public class get_set {
    // creating variable in class not in main method
    public String name;
    public int id;
    public long number;
    private int salary;
    private int dob;

    //create method for get and set to print value in main method
  //  public get_set(String name, int id , long number, int salary, int dob){
    //    this.name = name;
      //  this.id = id;
        //this.number=number;
       // this .salary =salary;
        //this.dob =dob;
    //}


   // public static void main(String[] args) {

     //   get_set c_p = new get_set("hardik",01,758775505,12000,270593);
       // System.out.println(c_p.id);
       // System.out.println(c_p.name);
        //System.out.println(c_p.number);
       // System.out.println(c_p.salary);
        //System.out.println(c_p.dob);

    //}
    public void setSalary(int salary, int dob){
     this.salary=salary;
     this.dob = dob;
    }
    public int getSalary(){
        return salary;


    }
    public void setDob(int dob){
        this.dob= dob;
    }
    public int getDob(){
        return dob;

    }


}
