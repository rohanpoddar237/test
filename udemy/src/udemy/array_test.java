package udemy;

public class array_test {

	public static void main(String[] args) {
		int[][] arr= {{2,3,4},{1,2,5},{4,5,6}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
			
			

	}

}

/*
                            
                            
 data_type[1st dimension][2nd dimension][]..[Nth dimension] array_name = new data_type[size1][size2]….[sizeN];                    
                            
             Two dimensional array:
int[][] twoD_arr = new int[10][20];



Three dimensional array:
int[][] intArray = new int[3][3];
o/p->
1 1 1
2 2 2
3 3 3

int[][][] threeD_arr = new int[10][20][30];               
                            
                            Duplicate elements

 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  

*/