/**
 * Name: LowerConverter.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package converters;

/**
 * @author Varun Ramani
 *
 */
public class LowerConverter implements Converter {

	@Override
	public String convert(String[] words) {
		String converted = "";
		for (int i = 0; i < words.length; i++) {
			converted += words[i].toLowerCase();
		}
		return converted;
	}

}
