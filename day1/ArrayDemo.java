class ArrayDemo {
    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int a[] = new int[20];
        for(int i=19;i>0;i--){
            a[i]=i;
        }
        // for( int index=0;index<10;index++){
        //     System.out.print(arr[index]+"\n");
        // }


        for (int i : a) {// For Each Loop
            System.out.println(i);
        }

       

    }
}

// Array is a store mutiple 

// index start 0 