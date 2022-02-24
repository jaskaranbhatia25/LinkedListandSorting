
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Outputmain
{
	private String inputFile = new String();
	private String outputFile= new String();
	private SimpleList[] simpleListArray= new SimpleList[1];
	public Outputmain (String inputFile, String outputFile)
    {
		this.inputFile = inputFile;
		this.outputFile = outputFile;
	}
	public void readData()
    {
	      try
          {
	        String line;
	        int match = 0;
	        File file = new File(this.inputFile + ".txt");
	        Scanner scanner = new Scanner (file).useDelimiter(",\\s*");
	        simpleListArray[0]= new SimpleList();
	        simpleListArray[0].sortedInsert(scanner.nextLine());
	        while(scanner.hasNext())
            {
		        match = 0;
		        line = scanner.nextLine();
		        for (int i = 0; i<simpleListArray.length; i++)
		        {		
		            if(isAnagram(simpleListArray[i].getHeadPtr().getData(),line)==0)
                    {
		                simpleListArray[i].sortedInsert(line);
		                match= 1;
		                break;
		            }
	            }
	            if(match == 0)
                {      
	                arrayPushBack(line);
	            }
            }
	            scanner.close();
            }catch(IOException e)
            {
	            e.printStackTrace();
            }
        }

    public int isAnagram (String str1, String str2)
    {
	    if (str1.length() != str2.length())
        {
	        return 1;
	    }
	    char[] charArray1 = str1.toCharArray();
	    char[] charArray2= str2.toCharArray();
	    sortCharArray(charArray1);
	    sortCharArray(charArray2);
	for (int i = 0;i< charArray1.length; i++)
    {
	    if(charArray1[i] != charArray2[i])
        {
		return 1;
	    }
	}
	return 0;
    }
    public void arrayPushBack(String data)
    {
	    SimpleList[] newArray = new SimpleList[simpleListArray.length + 1];
	    System.arraycopy (simpleListArray, 0, newArray, 0, simpleListArray.length);
	    newArray[newArray.length-1] = new SimpleList();
	    newArray[newArray.length-1].sortedInsert(data);
	    simpleListArray= newArray;
	}
    public void writeToFile()
    {
	    try
        {
	        FileWriter writer = new FileWriter (outputFile + ".txt");
	        for (int i = 0; i< simpleListArray.length;i++)
		    {
		        writer.write(simpleListArray[i].toString() + "\r\n");
		    }
		writer.close();
	    }catch (IOException OutputFileError)
        {
		    OutputFileError.printStackTrace();
	    }
    }

    public void sortCharArray (char[] array)
    {
	    for (int i = 0;i<array.length-1; i++)
        {
	        int min = i;
	        for (int j=i + 1; j< array. length; j++)
            {
		        if(array[j] < array[min])
                {
		            min = j;
		        }
	        }
	        char temp=array[i];
	        array[i]=array[min];
	        array[min]= temp;
	    }
    }
    public SimpleList[] getArray()
    {
	    return this.simpleListArray;
	}
}