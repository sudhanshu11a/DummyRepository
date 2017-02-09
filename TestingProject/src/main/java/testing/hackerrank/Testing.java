/**
 * 
 */
package testing.hackerrank;

import java.util.*;

/**
 * @author sudhanshusharma
 *
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);) {
			int n = 1;//scanner.nextInt();
			List<String> names = new ArrayList<String>(n);
			for (int i = 0; i < n; i++) {
				String line = "riya riya@gmail.com"; //scanner.next();
				String[] token = line.split(" ");
				if (token.length == 2) {
					String name = token[0];
					String emailId = token[1];
					if (emailId != null && emailId.length() <= 50 && emailId.endsWith("@gmail.com")) {
						names.add(name);
					}
				}
			}
			Collections.sort(names);
			for(String name: names)
				System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
