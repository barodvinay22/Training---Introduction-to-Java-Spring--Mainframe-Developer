class OverloadingDemo{
    int sum(int n1,int n2)
    {   System.out.print("Two argument method");
        return n1+n2;
    }
     int sum(int n1,int n2,int n3){
        System.out.print("Three argument method");
        return n1+n2+n3;
    }
    static public void main(String...a){
        System.out.println(new OverloadingDemo().sum(1,2));
    }
}