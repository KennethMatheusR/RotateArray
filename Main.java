// rotate the array of n elements to the left by k steps 
// [1,2,3,4,5,6,7]
// k steps = 3
// n size= 7;
//output = [4,5,6,7,1,2,3]

class Main {
  public static void main(String[] args) {
    int array[] = {1,2,3,4,5,6,7};
    RotateArray rotateArray = new RotateArray();
    rotateArray.rotateArray(array, 3, 7);
    rotateArray.printArray(array,7);
  }

}

class RotateArray {

       void rotateArray(int array[], int k, int n){
      
        for(int index = 0;index < k; index++){
          leffrotateByOne(array,n);
        }
      }

       void leffrotateByOne(int array[], int n){
        int index;
        int tempArray = array[0];
        for(index = 0; index < n - 1;index++){
          array[index] = array[index + 1];
        }
        array[index] = tempArray;

      }

       void printArray(int array[],int n){

        for(int index = 0; index < n; index++){
          System.out.println(array[index]);
        }
      }
  }