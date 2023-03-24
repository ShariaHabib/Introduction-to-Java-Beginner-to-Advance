public class Box {
    public double height;
    public double width;
    public double depth;

    public static void main(String[] args) {

        Box myBox = new Box();
        myBox.depth = 5.00;
        myBox.height = 10.00;
        myBox.width = 5.00;

        System.out.println("The area of the box is " + myBox.depth * myBox.height * myBox.width);
    }

}
