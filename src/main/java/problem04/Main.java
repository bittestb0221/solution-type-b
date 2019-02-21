package problem04;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Game g = new Game();
		g.startgame();
	}
}

class Game extends Thread{
	public void startgame() {
		String[] elements = new String[]{"#", "O"}; 
	    final String[] array = generateRandomArrayFromElements(elements); 
	    System.out.println(Arrays.toString(array)); 
	}
	private static String[] generateRandomArrayFromElements(String[] elements) { 
	     final List<String> list = Arrays.asList(elements); 
	     Collections.shuffle(list); 
	     return list.toArray(new String[20]); 
	}
}

