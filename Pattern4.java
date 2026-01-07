public class Pattern4{
    public static void main(String[] args){
        int n=5;
        
        /*

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
        
        */
        for(int i=1;i<=n;i++){
            for(int j=0; j<i;j++){
                System.out.printf("%d ", j+1);
            }
            System.out.println();
        }
    }
}