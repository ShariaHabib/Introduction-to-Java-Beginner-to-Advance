public class overLoadDemo {
    void print(int a){
        System.out.println("printing from 1 parameter function");
    }
    void print(int a,int b){
        System.out.println("printing from 2 parameter function");
    }
    double print(){
        System.out.println("printing from return type changed function");
        return 1.00;
    }
    public static void main(String[] args) {
        overLoadDemo obj = new overLoadDemo();
//        overLoadDemo obj1 = new overLoadDemo();
//        overLoadDemo obj2 = new overLoadDemo();

        obj.print(100);
        obj.print();
        obj.print(100,200);


    }
}
