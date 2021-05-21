
public class Test {

    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1);

        try {
            Person p2 = p1.clone();
            System.out.println(p2);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
