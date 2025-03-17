public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(goodString("bacdsfa"));
	}

	public static int goodString(String S) {

		int first;
		int last;
		int goodString = -1;
		int total;
		int lowest = 10;
		
		for (int i=0;i<26;i++) {
			first = S.indexOf((char)(i+'a'));
			last = S.length() - 1 - S.lastIndexOf((char) (i+'a'));
			if (S.indexOf((char)(i+'a')) == S.lastIndexOf((char) (i+'a'))) {
				first = 100;
				last = 100;
			}
			total = first + last;

			if (total < lowest) {
				lowest = total;
			}
		}

		if (lowest != 10) {
			goodString = lowest;
		}

		return goodString;

	}		

}
