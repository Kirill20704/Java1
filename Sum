import java.util.Arrays;
public class Sum {
	public static void main(String[] args) {
		double[] list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(sum(list));
	}
	
	public static double sum(double[] list) {
		int h = list.length;
		if (h == 0) 
			return 0;
		return sum(Arrays.copyOfRange(list, 0, h-1)) + list[h-1];
	}
}
