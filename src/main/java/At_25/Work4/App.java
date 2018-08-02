package At_25.Work4;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		Store store;
		ObjectMapper obj = new ObjectMapper();
		store = obj.readValue(new File("src/main/resources/phone.json"), Store.class);
		System.out.println(store);
	}
}