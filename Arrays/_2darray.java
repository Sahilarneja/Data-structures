public class _2darray {
    public static void main(String[] args) {
//        int [][]arr=new int[2][3];
        int arr[][]={{10,20,30},{50,60,40}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
