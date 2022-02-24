
public class Assign2
{
	public static void main(String args[])
    {
		if (args.length != 2)
        {
			System.out.println("The number of arguments inputted are wrong!");
			System.exit(1);
		}
	Outputmain myTest = new Outputmain (args[0], args[1]);
	
	
	
	
	long startTime = System.nanoTime();
	
	
	myTest.readData();



	QuickSort mySort=new QuickSort();
	
	mySort.quickSort(myTest.getArray());
	
	
	long timeElapsed= System.nanoTime()-startTime;
	
	
	myTest.writeToFile();
	
	
	System.out.println("Time Elapsed for the completion of program processing: " + timeElapsed + " nano seconds.");
	}
}


    

    
    
    