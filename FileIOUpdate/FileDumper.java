import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

class FileDumper {

	private String path;
	private boolean appendIt = false;
	
	public FileDumper(String file_path) {
	
		path = file_path;
	
	}
	
	public FileDumper(String file_path, boolean append) {
	
		path = file_path;
		appendIt = append;
	
	}
	
	public void dumpFile(ArrayList<String> linesToWrite) throws IOException {
	
		FileWriter outStream = new FileWriter(path, appendIt);
		PrintWriter outBuffer = new PrintWriter(outStream);
		//PrintWriter outBuffer = new PrintWriter(new FileWriter(path));
		
		for (String line : linesToWrite) {
        
			outBuffer.println(line);
			
		}
		
		outBuffer.close();
	
	}

}