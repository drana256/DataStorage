import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write
{
    public static void wrt(String value) throws IOException
    {
        FileWriter writeInFile = new FileWriter("Output.csv",true); 
        BufferedWriter buffer = new BufferedWriter(writeInFile);
        buffer.write(value+",");
        buffer.close();
        writeInFile.close();  
    }
}
