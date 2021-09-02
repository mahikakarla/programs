public class TwoDimensional {
    
    public static void main (String [] args){
        char [][] arr = {
                        {'c','d','k'},
                        {'l','m','n'}
                    };

        //Printing elements of this array
        for (int i=0 ; i<arr.length ; i++){
            System.out.println(" ");
            for (int j=0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
                
            }
    }
    }
}
