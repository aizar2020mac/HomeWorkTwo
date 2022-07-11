public class Daughter1 extends Mother implements Printable {

    String name = "Aisuluu";
    int age = 16;

    @Override
    public void print() {
        System.out.println("name" + name + "age" + age);
    }
}
