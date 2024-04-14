import java.util.Arrays;
import java.util.Comparator;

public class sorting{
	
	public static <Integer> void selectioSorting(Integer arr[] ,Comparator<Integer> c ) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
//				int value = Comparator.compare(arr[i],arr[j]);
				if(c.compare(arr[i] , arr[j])>0) {
					Integer temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
			
			
	}


	public static void main(String [] args) {
		Integer arr[] = {33,22,11,55,66};
		
		class Comparatorclass implements Comparator<Integer>{
			@Override
			public int compare(Integer o1, Integer o2) {
				int value = Integer.compare(o1,o2);
				return value;		
		}
	}
		
		System.out.println("Before");
		for(Integer element:arr)
			System.out.println(element);
		
		Comparator<Integer> comp = new Comparatorclass();
		Arrays.sort(arr,comp);
		
		System.out.println("After");
		for(Integer element:arr)
			System.out.println(element);

}}
	


	

