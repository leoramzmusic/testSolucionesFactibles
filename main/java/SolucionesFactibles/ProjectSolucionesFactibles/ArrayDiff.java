package SolucionesFactibles.ProjectSolucionesFactibles;

public class ArrayDiff {
	public static void main(String[] args) {
		getPairsOfIntegersByDifference();
	}

	public static void getPairsOfIntegersByDifference() {
		int difference = 2;
		int[] integersArray = new int[] { 1, 7, 5, 9, 2, 12, 3 };

		String pairs = "";

		for (int i = 0; i < integersArray.length; i++) {
			for (int j = 0; j < integersArray.length; j++) {
				if (integersArray[i] - integersArray[j] == difference
						|| integersArray[j] - integersArray[i] == difference) {
					pairs += " (" + integersArray[i] + "," + integersArray[j] + ") ";
				}
			}
		}

		System.out.println(pairs);
	}
}
