public class Pattern7{
    public static void main(String[] args){
        int n=5;
        
        /*

                1
              2 1 2 
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5
         
        */

        int k = 1;
        for(int i=1;i<=(2*n-1);i+=2){
            
            int spaceCount = ((2*n-1) - i)/2;

            for(int j=0; j<spaceCount+i;j++){

                if(j+1<=spaceCount){
                    System.out.print(" ");
                }else{
                    System.out.printf("%d",k);
                    if(j+1>=n){
                        k++;
                    }else{
                        k--;
                    }
                }
                
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}