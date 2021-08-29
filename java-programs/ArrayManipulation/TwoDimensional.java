public class TwoDimensional {
    
    public static void main (String [] args){
        char [][] arr = {{'c','d','e'},{'l','m','n'}};

        //Printing elements of this array
        for (int i=0 ; i<arr.length ; i++){
            System.out.println("\n Array elements are: ");
            for (int j=0 ; j<arr[1].length ; j++){
                System.out.println(arr[i][j]);
            }
    }
    }
}
