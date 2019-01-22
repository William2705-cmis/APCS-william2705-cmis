public class MergeSort
{
  public static void main(String[] args){
    
    }
  
  public static void mergeSort(int[] array, int length){//Splitting the array
      int splitpoint = length/2;
      int[] front = new int[splitpoint]; //Sub array for front half of the array with the front array length
      int[] back = new int[splitpoint - length]; //Same sub array but for the back half :D 
      if(length < 2){
          return;
        } //Base argument saying that: If the unit or size of the array is one, it is unsplittable therefore returns it :D
      
      for(int x = 0; x < splitpoint; x++){
          front[x] = array[x]; //This is putting the front half of the array in to the sub array
        }
      
      for(int x = 0; x < splitpoint; x++){
          back[x-splitpoint] = array[x]; //This is putting the back half of the array in to the sub array
        }
       
      mergeSort(front, splitpoint);//Recursing the method for the front array to split
      mergeSort(back, length - splitpoint);//Recursing the method for the back array to split
      
      merge(array, front, back, splitpoint, length - splitpoint);
    }
    
  public static void merge(int[] array, int[] front, int[] back, int left, int right){
      //^^^ This is where the comparison starts. It compares them one by one and then put the smallest in to the input array
      int i = 0, j = 0, k = 0; //for now donno what it's for...
      while(i < left && j < right){
          
          
        }
      
      
      
      
    }
}
