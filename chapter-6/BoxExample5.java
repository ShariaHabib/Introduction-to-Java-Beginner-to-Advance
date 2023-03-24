public class BoxExample6 {

    public static void main(String[] args) {
        BoxMain mybox1 = new BoxMain(10, 20, 15);
        BoxMain mybox2 = new BoxMain(3, 6, 9);
        double vol;

        vol = mybox1.computeVolume();
        System.out.println("Volume is " + vol);

        vol = mybox2.computeVolume();
        System.out.println("Volume is " + vol);
    }
}