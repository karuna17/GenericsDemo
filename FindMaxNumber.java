
public class FindMaxNumber {

	public static  <T extends  Comparable <T>> void maxFind(T[] element) {
		T max=element[0];

		for(T i:element) {
			if(i.compareTo(max)> 0) {
				max=i;
			}
		}
		System.out.println("Maximum Number: "+ max);
	}

	public static  <T extends  Comparable <T>> void maxFind(Integer[] a, Float[] b, String[] c) {
		System.out.println("Sorting Of Integer Array");
		int temp = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		printArr(a);

		System.out.println("Sorting Of Float Array");
		float temp1 = 0.0f;
		for(float i = 0.0f; i < b.length; i++) {
			for(float j = i + 1.0f; j < b.length; j++) {
				if(b[(int) i] > b[(int) j]) {
					temp1 = b[(int) i];
					b[(int) i] = b[(int) j];
					b[(int) j] = temp1;
				}
			}
		}
		printArr(b);

		System.out.println("Sorting Of String Array");
		for(int i = 0; i<c.length; i++) {  
			for (int j = i+1; j<c.length; j++) {  
				if(c[i].compareTo(c[j])>0) {  
					String temp2 = c[i];  
					c[i] = c[j];  
					c[j] = temp2;  
				}  
			}  
		}
		printArr(c);
	}

	public static <T extends Comparable<T>> void findmaxString(T[] elements) {
		T max = elements[0];
		for (T i : elements) {
			if (Integer.valueOf(i.toString().length()).compareTo(Integer.valueOf(max.toString().length())) > 0) {
				max = i;
			}
		}
		System.out.println("the maximum String is " + max);
	}

	public static<E>void printArr(E[] element) {	 
		for(E i : element ) {
			System.out.print(i+"  ");
		}
		System.out.println();      
	}

	public static void main(String[] args) {
		Integer[] integerArray= {110,20,35,100,10};

		Float[] floatArr= {400.0f,600.0f,100.0f,500.0f};

		String[] stringArr= {"strawberry","pineapple","guvava","apple","orange"};

		printArr(integerArray);
		maxFind(integerArray);

		printArr(floatArr);
		maxFind(floatArr);

		printArr(stringArr);
		maxFind(stringArr);

		maxFind(integerArray, floatArr, stringArr);

	}
}
