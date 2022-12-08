import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;

public class ReadnWrite
{
    public static void readFile(String fileName) 
    {
        String row = "";  
        String splitBy = ",";  
        try 
        {
           //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader(fileName));  
            while ((row = br.readLine()) != null)   //reads the whole one line  
            {  
                String[] data = row.split(splitBy);    // uses comma as separator for the line 
 
                for(int i=0; i<data.length; i++)        //loop to write data into the output.csv file 
                {
                    if (i == (data.length-1))
                    {
                        writeFile(data[i] + "\n");
                    }
                    else
                    {
                        writeFile(data[i] + ",");
                    }
                }
            }  
        }
        catch (IOException error)       // if the file is not able to open file then it will return the error message
        {
            System.out.println("Could not open file");
            error.printStackTrace();
        }    
    }    

    //This function writes data into the output file
    public static void writeFile(String value) throws IOException       
    {
        try
        {
            FileWriter writeInFile = new FileWriter("Output.csv",true);         //the "true" opens the Output.csv file in the writeing mode  
            writeInFile.write(value);
            writeInFile.flush();            //cleaning the stram 
            writeInFile.close();            //closing the file writer constructor
        }
        catch (IOException error)       // if the file is not able to open file then it will return the error message
        {
            System.out.println("Could not open file");
            error.printStackTrace();
        }    
    }
}
