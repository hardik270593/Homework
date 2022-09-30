package Homework;

public class runner_class {
    public static void main(String[] args) {
        System.out.println("-------general charge for all--------------");
        activity_center r =new activity_center();
        r.garden();
        r.parking();
        r.locker();
        r.gym();

        System.out.println("-------redfield charge for all--------------");
        redfield re =new redfield();
        re.garden();
        re.parking();
        re.locker();
        re.gym();
        re.tennis();
        System.out.println("-------kingswood charge for all--------------");
        kingswood k = new kingswood();
        k.garden();
        k.parking();
        k.locker();
        k.gym();
        k.badminton();
        System.out.println("-------glouster charge for all--------------");
        glouster g =new glouster();
        g.garden();
        g.parking();
        g.locker();
        g.gym();
        g.swimming();

    }
}
