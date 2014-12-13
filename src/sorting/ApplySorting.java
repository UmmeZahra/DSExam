package sorting;

public class ApplySorting {

	public static void main(String[] args) {
		/*
		 * Use the available sorting methods in SortingALgo() class to sort the below array of numbers.
		 */
			int [] array = new int[]{34,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7};

			SortingAlgo sort = new SortingAlgo();
			
			System.out.println("SelectionSort:");
			display(sort.selectionSort(array));
			
			array = new int[]{34,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7};
			System.out.println("InsertionSort:");
			display(sort.insertionSort(array));
			
			array = new int[]{34,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7};
			System.out.println("BubbleSort:");
			display(sort.bubbleSort(array));
			
			array = new int[]{34,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7};
			System.out.println("MergSort:");
			display(sort.mergeSort(array));
		}

		public static void display(int [] array) {
			for ( int k = 0; k < array.length; k++ ) {
				System.out.format("%3d ", array[k]);
				if ( ( k + 1 ) % 10 == 0 )
					System.out.println();
			}
			System.out.println();
		}
	}
