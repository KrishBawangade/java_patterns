public class Pattern9{
    public static void main(String[] args){
        int n=4;
        
        /*

            4 4 4 4 4 4 4
            4 3 3 3 3 3 4
            4 3 2 2 2 3 4
            4 3 2 1 2 3 4
            4 3 2 2 2 3 4 
            4 3 3 3 3 3 4
            4 4 4 4 4 4 4 
         
        */
        int repeatNum = 4;

        // for 1 to n
        for(int i=0; i<n; i++){
            int k= n;
            int repeatCount = (n*2-1) - (i*2);
            
            for(int j=0; j<n*2-1; j++){
                System.out.printf("%d ", k);

                if(repeatNum == k && repeatCount>1){
                    repeatCount--;
                }else{
                    if(j+1>=n){
                        k++;
                    }else{
                        k--;
                    }
                }
            }
            repeatNum--;
            System.out.println();
        }

        repeatNum = 2;

        // for remaning rows - till 0
        for(int i=n-2; i>=0; i--){
            int k= n;
            int repeatCount = (n*2-1) - (i*2);
            
            for(int j=0; j<n*2-1; j++){
                System.out.printf("%d ", k);

                if(repeatNum == k && repeatCount>1){
                    repeatCount--;
                }else{
                    if(j+1>=n){
                        k++;
                    }else{
                        k--;
                    }
                }
            }
            repeatNum++;
            System.out.println();
        }
    }
}