
public class Main {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG    ";
		System.out.printf("Original: -%s-%n%n", original);

		// Exemplo toLowerCase
		String exToLowerCase = original.toLowerCase();
		System.out.printf("toLowerCase: -%s-%n%n", exToLowerCase);

		// Exemplo toUpperCase
		String exToUpperCase = original.toUpperCase();
		System.out.printf("toUpperCase: -%s-%n%n", exToUpperCase);

		// Exemplo trim
		String exTrim = original.trim();
		System.out.printf("trim: -%s-%n%n", exTrim);

		// Exemplo substring(2)
		String exSubstring = original.substring(2);
		System.out.printf("substring(2): -%s-%n%n", exSubstring);

		// Exemplo substring(2, 13)
		String exSusbtring2 = original.substring(2, 13);
		System.out.printf("substring(2, 13): -%s-%n%n", exSusbtring2);

		// Exemplo replace("F", "x")
		String exReplace = original.replace("F", "x");
		System.out.printf("replace('F', 'x'): -%s-%n%n", exReplace);

		// Exemplo replace("abc", "xy")
		String exReplace2 = original.replace("abc", "xy");
		System.out.printf("replace('abc', 'xy'): -%s-%n%n", exReplace2);
		
		// Exemplo indexOf("bc")
		int exIndexOf = original.indexOf("bc");
		System.out.printf("indexOf('bc'): index = %s%n%n", exIndexOf);

		// Exemplo lastIndexOf("bc")
		int exLastIndexOf = original.lastIndexOf("bc");
		System.out.printf("lastIndexOf('bc'): index = %s%n%n", exLastIndexOf);

		// Exemplo split()
		String[] exSplit = original.split(" ");
		System.out.printf("split: Item 1 = %s%n%n", exSplit[0]);
		System.out.printf("split: Item 2 = %s%n%n", exSplit[1]);
		System.out.printf("split: Item 3 = %s%n%n", exSplit[2]);
		System.out.printf("split: Item 4 = %s%n%n", exSplit[3]);
		System.out.printf("split: Item 5 = %s%n%n", exSplit[4]);
		
	}

}
