public class ClosestNeighbours {
	public static void main(String[] args) {

		int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
		int[] result = findClosest(myArray);
		// print the elements of the resulting array
		System.out.println("A menor diferença é entre o numero" + "\n" +  result[0] + "\n" +  "e o numero" + "\n" + result[1]);
	}

	private static int[] findClosest(int[] numbers) {
		// hint: remember Math.abs();
		int total = Math.abs(numbers[numbers.length-2] - numbers[numbers.length-1]);
		int[] newArr = new int[2];
		for (int i = 0; i < numbers.length - 1; i++) {
			if (Math.abs(numbers[i] - numbers[i+1]) <= total) {
				total = Math.abs(numbers[i] - numbers[i+1]); 
				newArr[0] = numbers[i];
				newArr[1] = numbers[i+1];
			}
		}
		return newArr;
	}
}
