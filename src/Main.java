public class Main {
    public static void main(String[] args) {
        createObject("1").print();
        createObject("2").print();
        createObject("3").print();
    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "1":
                printable = new Daughter1();
                break;
            case "2":
                printable = new Daughter2();
                break;
            case "3":
                printable = new Daughter3();
                break;
        }
        return printable;
    }
}