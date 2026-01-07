public class Pattern5{
    public static void main(String[] args){
        int n=5;
        
        /*

            *
            * *
            * * * 
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            * 
        
        */

        /* 
        
        Two Loops -
         
            for(int i=1;i<=n;i++){
                for(int j=0; j<i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(int i=1;i<n;i++){
                for(int j=0; j<n-i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        */

        for(int i=1;i<=(2*n-1);i++){
            int col;

            if(i>n){
                col = 2*n - i;
            }else{
                col = i;
            }
            for(int j=0; j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}