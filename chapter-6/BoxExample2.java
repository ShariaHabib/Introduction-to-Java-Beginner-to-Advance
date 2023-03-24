public class BoxExample2 {

    public static void main(String[] args) {
        BoxMain mybox1 = new BoxMain();
        BoxMain mybox2 = new BoxMain();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();

        mybox2.volume();
    }
}