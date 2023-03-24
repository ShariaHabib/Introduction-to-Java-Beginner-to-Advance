public class BoxConstructor {
    // Fields
    private double height;
    private double width;
    private double depth;

    // Constructor
    public BoxConstructor(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // Methods
    public double getVolume() {
        return height * width * depth;
    }

    public static void main(String[] args) {

        BoxConstructor myBox = new BoxConstructor(2.5, 3.0, 4.0);
        double volume = myBox.getVolume();
        System.out.println(volume);
    }

}
