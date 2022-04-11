package TravelerDenomination.model;

public class sorting {
        public void bubblesort(int array[])
        {
            int length=array.length;
            for (int i=0;i<length-1;i++) {
                for (int j = 0; j < length - i-1; j++) {
                    if (array[j] < array[j+1]) {
                        int temp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        public void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

