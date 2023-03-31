class BoxMain {
    double width;
    double height;
    double depth;

    BoxMain() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    BoxMain(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    double computeVolume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}