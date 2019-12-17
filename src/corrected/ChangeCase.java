package corrected;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

import converters.*;

public class ChangeCase {

	public enum Case {
		Lower, Upper, Pascal, Camel, Kebab
	};

	private static Map<Case, Function<String[], String>> convertMap = new EnumMap<>(Case.class);
	private static Map<Case, Converter> converterMap = new EnumMap<>(Case.class);

	static {
		convertMap.put(Case.Lower, words -> lower(words, false));
		convertMap.put(Case.Upper, words -> upper(words));
		convertMap.put(Case.Pascal, words -> pascal(words));
		convertMap.put(Case.Camel, words -> camel(words));
		convertMap.put(Case.Kebab, words -> lower(words, true));
		
		converterMap.put(Case.Lower, new LowerConverter());
		converterMap.put(Case.Upper, new UpperConverter());
		converterMap.put(Case.Pascal, new PascalConverter());
		converterMap.put(Case.Camel, new CamelConverter());
	}

	public static String convert(Case cas, String[] words) {
//		return convertMap.get(cas).apply(words);
		return converterMap.get(cas).convert(words);
	}

	private static String lower(String[] words, boolean isKebabCase) {
		String outstring = "";
		for (int i = 0; i < words.length; i++) {
			if (i != words.length - 1) {
				outstring += words[i].toLowerCase() + (isKebabCase ? "-" : "");
			} else {
				outstring += words[i].toLowerCase();
			}
		}
		return outstring;
	}

	private static String upper(String[] words) {
		String outstring = "";
		for (int i = 0; i < words.length; i++) {
			outstring += words[i].toUpperCase();
		}
		return outstring;
	}

	private static String camel(String[] words) {
		String outstring = "";
		outstring += words[0].toLowerCase();
		for (int i = 1; i < words.length; i++) {
			outstring += words[i].substring(0, 1).toUpperCase();
			outstring += words[i].substring(1).toLowerCase();
		}
		return outstring;
	}

	private static String pascal(String[] words) {
		String outstring = "";
		for (int i = 0; i < words.length; i++) {
			outstring += words[i].substring(0, 1).toUpperCase();
			outstring += words[i].substring(1).toLowerCase();
		}
		return outstring;
	}
}
