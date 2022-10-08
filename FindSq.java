public class FindSq {
	public static void main(String[] args) {
		int[] list = {9, 8, 7, 6, 5, 4, 3, 2};
		int h = list.length;
		for (short i = 0; i < h-1; i++) 
			if(list[i] > Math.pow(list[h-1], 2)) 
				System.out.println(list[i]);
	}
}
