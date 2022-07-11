public class Daughter2 extends Mother implements Printable{
    String hobbies = "Play tennis";
    int height = 165;


    @Override
    public void print() {
        System.out.println("hobbies" + hobbies + "height" + height);
    }
}
