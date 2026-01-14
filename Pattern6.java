public class Pattern6{
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

        for(int i=1;i<=(2*n-1);i++){
            int spaceCount;

            if(i>n){
                spaceCount = i-n;
            }else{
                spaceCount = n-i;
            }

            // Approach 1 -

            // for(int j=0; j<spaceCount;j++){
            //     System.out.print(" "); // print space(" ")
            // }
            // for(int j=0; j<n-spaceCount;j++){
            //     System.out.print("* ");
            // }

            // Approach 2 -

            for(int j=0; j<n;j++){
                if(j+1<=spaceCount){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
    }
}