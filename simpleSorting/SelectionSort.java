package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (array.length == 0 || rightIndex < leftIndex) {
			return ;
		}
		for (int i = leftIndex; i < rightIndex; i++) {

			int i_menor = i;
			for (int j = i + 1; j <= rightIndex; j++)
				if (array[j].compareTo(array[i_menor]) < 0)
					i_menor = j;

			T aux = array[i];
			array[i] = array[i_menor];
			array[i_menor] = aux;

		}
	}
}
