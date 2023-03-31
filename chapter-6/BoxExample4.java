public class BoxExample5 {

    public static void main(String[] args) {
        BoxMain mybox1 = new BoxMain();
        BoxMain mybox2 = new BoxMain();
        double vol;

        vol = mybox1.computeVolume();
        System.out.println("Volume is " + vol);

        vol = mybox2.computeVolume();
        System.out.println("Volume is " + vol);
    }
}