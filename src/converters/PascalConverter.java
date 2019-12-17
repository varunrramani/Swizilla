/**
 * Name: PascalConverter.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package converters;

/**
 * @author Varun Ramani
 *
 */
public class PascalConverter implements Converter {

	@Override
	public String convert(String[] words) {
		String converted = "";
		for (int i = 0; i < words.length; i++) {
			converted += words[i].substring(0, 1).toUpperCase();
			converted += words[i].substring(1).toLowerCase();
		}
		return converted;
	}

}
