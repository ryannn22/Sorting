import java.util.*;
public class selectionsort {
    public static void selection(int [] arr, int size) {
		for(int i = 0;i<size;i++) {
			int tempindex = i;
            for(int j = i;j<size;j++) {
                if(arr[tempindex]<arr[j]){
                        tempindex = j;
                }
			}
            int temp = arr[tempindex];
            arr[tempindex] = arr[i];
            arr[i] = temp; 
		}
        System.out.println("after sorting");
        for(int i = 0;i<size;i++){
            System.out.println(arr[i]);
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i =0;i<size;i++) {
			int element = sc.nextInt();
			arr[i] = element;
		}
		selection(arr,size);
	}
}
