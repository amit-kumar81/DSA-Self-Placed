

//User function Template for Java

//Complete this function, Geeks
class Solution
{
    // You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks
         for(int i=sizeOfArray-1;i>=0;i--)
        {
            if(i!=index)
            {
                arr[i]=arr[i-1];
                
            }
            else
            {
                arr[i]=element;
                break;
            }
        }
    }


}