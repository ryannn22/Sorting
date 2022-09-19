import java.util.Scanner;
public class  bubble{
    public static void bubblesort(int [] arr, int size) {
		for(int i = 0;i<size;i++) {
			for(int j = 0;j<size-i-1;j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
			}
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
		bubblesort(arr,size);
	}
}