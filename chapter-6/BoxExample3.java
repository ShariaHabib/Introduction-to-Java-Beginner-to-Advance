public class BoxExample4 {

    public static void main(String[] args) {
        BoxMain mybox1 = new BoxMain();
        BoxMain mybox2 = new BoxMain();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        vol = mybox1.computeVolume();
        System.out.println("Volume is " + vol);

        vol = mybox2.computeVolume();
        System.out.println("Volume is " + vol);
    }
}