public class _3darray {
    public static void main(String[] args) {
        int[][][] arr ={{{1,2,3},{3,4,5},{5,6}}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+" ");        /*arr[i][j].length is used in 3d array*/
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
