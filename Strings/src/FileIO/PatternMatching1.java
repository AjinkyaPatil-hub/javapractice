/*
 *  i/p "ajinkya"
 *  i/p "aj" 
 *  o/p->matches
 */

package FileIO;

public class PatternMatching1 {
	public static void main(String[] args) {
		String str = "ajinkya";
		String patern = "nkya";
		boolean result = false;
		int count = 0;
		// result=st.contains(str);
		// 1> remove the string length
		int slen = str.length();
		int plen = patern.length();

		// 2> we will fetch the each char
		char c, p;
		// i<slen-plen go only till plen
		for (int i = 0; i < slen; i++) {
			c = str.charAt(i);
			p = patern.charAt(0);
			// we are comparing a char
			if (c == p) {
				// if first char matches
				for (int j = i, k = 0; j < i + plen; j++, k++) {

					// this is for second char
					c = str.charAt(j);
					p = patern.charAt(k);

					if (c == p) {
						count++;

					}
				}

			}

		}

		if (count == plen) {
			System.out.println("String found");
		} else {
			System.out.println("not found");
		}
	}

}
