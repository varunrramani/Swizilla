package corrected;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Varun Ramani
 *
 */
public class KeyCode {
	private static Map<Integer, String> KEY_CODE;
	static {
		KEY_CODE = new HashMap<>();
		try (InputStream in = new FileInputStream(new File("resources/keycodes.properties"))) {
			Properties keyCodeProperties = new Properties();
			keyCodeProperties.load(in);
			keyCodeProperties.entrySet().stream().forEach(propertyEntry -> KEY_CODE
					.put(Integer.valueOf(propertyEntry.getKey().toString()), (String) propertyEntry.getValue()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String GetKeyMap(int code) {
		return KEY_CODE.get(code);
	}
}
