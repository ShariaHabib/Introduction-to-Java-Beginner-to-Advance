class Test{
    int a,b;
    Test(int i,int j)
    {
        a = i;
        b = j;
    }
    boolean equalTo(Test o) {
        if(o.a==a && o.b==b)return true;
        else return false;
    }

}


public class objectParameters {
    public static void main(String[] args) {
        Test ob1 = new Test(100,200);
        Test ob2 = new Test(100,200);
        Test ob3 = new Test(10,20);
        System.out.println("ob1 == ob2 : "+ob1.equalTo(ob2));
        System.out.println("ob1 == ob3 : "+ob1.equalTo(ob3));
    }
}
