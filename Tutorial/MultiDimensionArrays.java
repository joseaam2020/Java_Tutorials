package Tutorial;

import java.util.Arrays;

public class MultiDimensionArrays{
	public void array(){
		int[][] grid = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		for(int[] cell: grid){
			System.out.println(Arrays.toString(cell));
		}
		for(int[] cell: grid){
			for(int value: cell){
				System.out.println(value);
			}
		}
	}
}
