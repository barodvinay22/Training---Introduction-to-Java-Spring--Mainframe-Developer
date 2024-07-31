class MultiThreadingWithLamda{
    public static void main(String[] args){
        for(int i=1;i<20;i++){
            Thread t=new Thread(()-> System.out.println(Thread.currentThread().getId()));
            t.start();
        }
        
    }
}