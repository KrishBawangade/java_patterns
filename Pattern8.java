public class Pattern8{
    public static void main(String[] args){
        int n=4;
        
        /*

                1
               212 
              32123
             4321234
              321234
               212
                1
         
        */

        // for 1 to n
        for(int i=1;i<=n;i++){
            int spaceCount = n-i;
            // for printing spaces
            for(int j=0; j<spaceCount; j++){
                System.out.print(" ");
            }

            // printing numbers till 1 in left side
            for(int j=i;j>=1;j--){
                System.out.printf("%d", j);
            }

            // printing numbers till i starting from 2 in right side
            for(int j=2;j<=i;j++){
                System.out.printf("%d", j);
            }

            System.out.println();
        }

        // for remaining rows
        for(int i=n-1;i>=1;i--){
            int spaceCount = n-i;
            // for printing spaces
            for(int j=0; j<spaceCount; j++){
                System.out.print(" ");
            }

            // printing numbers till 1 in left side
            for(int j=i;j>=1;j--){
                System.out.printf("%d", j);
            }

            // printing numbers till i starting from 2 in right side
            for(int j=2;j<=i;j++){
                System.out.printf("%d", j);
            }

            System.out.println();
        }
        
    }
}