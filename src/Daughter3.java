public class Daughter3 extends Mother implements Printable {

    int weight = 50;
    String language = "Russian";

    @Override
    public void print() {
        System.out.println("weight" + weight + "lang" + language);
    }
}
