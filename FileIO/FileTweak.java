public class FileTweak extends ReadnWrite
{  
    public static void main(String[] args) throws Exception  
    {  
        readFile("file.csv");       //reading the file.csv file
        writeFile("Dibesh,Rana\n");     //adding the first and last name 
        Display.display("Output.csv");      // displaying the output.csv file
    }  
}  