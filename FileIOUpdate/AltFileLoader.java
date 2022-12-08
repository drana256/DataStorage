import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

class AltFileLoader {

	private String path;
	
	public AltFileLoader(String file_path) {
	
		path = file_path;
	
	}
	
	public ArrayList<String> loadFile() throws FileNotFoundException {
	
		Scanner inFile = new Scanner(new File(path));
		ArrayList<String> allTheLines = new ArrayList<String>();
		
		while (inFile.hasNext()) {
		
			allTheLines.add(inFile.next());
		
		}
		
		inFile.close();
		return allTheLines;
	
	}

}