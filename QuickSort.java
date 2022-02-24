
public class QuickSort
{
    public void swap(SimpleList[] array, int i, int j)
    {
        SimpleList temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public void quickSort(SimpleList[] array)
    {
        if(array.length<2)
        {
            return;
        }
        int max = 0;

        for(int i=1;i<array.length;i++)
        {
            if(array[i].getHeadPtr().getData().compareTo(array[max].getHeadPtr().getData())>0)
            {
                max=i;
            }
        }
        swap(array,array.length-1,max);
        quicksort(array,0,array.length-1);
    }
    public void  quicksort(SimpleList[] array, int first, int last)
    {
        int lower = first + 1;
        int upper = last;
        swap(array,first,(first+last)/2);
        String bound = array[first].getHeadPtr().getData();

        while(lower<=upper)
        {
            while(array[lower].getHeadPtr().getData().compareTo(bound)<0)
            {
                lower++;
            }
            while(array[upper].getHeadPtr().getData().compareTo(bound)>0)
            {
                upper--;
            }
            if(lower<upper)
            {
                swap(array,lower++,upper--);
            }
            else
            {
                lower++;
            }
        }
        swap(array,upper,first);
        if(first < upper-1)
        {
            quicksort(array,first,upper-1);
        }
        if((upper+1)<last)
        {
            quicksort(array,upper+1,last);
        }
    }
}   
