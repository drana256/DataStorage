import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Display
{
    public static void display(String fileName)
    {
        try 
        {
            //parsing a CSV file into Scanner class constructor  
            Scanner sc = new Scanner(new File(fileName));  
        
            sc.useDelimiter(",");   //sets the delimiter pattern  
            while (sc.hasNext())  //returns a boolean value  
            {  
                System.out.print(sc.next()+" "); 
            }
            sc.close();  //closes the scanner
        }
        catch (IOException error)
        {
            System.out.println("Could not open file");
            error.printStackTrace();
        }    
    }
}