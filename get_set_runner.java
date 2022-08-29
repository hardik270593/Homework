package Hardik_code;

public class get_set_runner {
    public static void main(String[] args) {
        get_set l =new get_set();
        l.id = 01;
        l.name = "hardik";
        l.number =758775505;
        l.setSalary(4500,27);
        l.getSalary();

        l.getDob();
        System.out.println(l.id);
        System.out.println(l.name);
        System.out.println(l.getDob());
        System.out.println(l.getSalary());
        System.out.println(l.number);


    }
}
