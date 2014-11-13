/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//my first try
package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author w
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MergeSort ms=new MergeSort();
        int[] element={45,56,33,60};
       ms.mergeSort(element);
        for(int x:element)
        {
            System.out.print(" "+x);
        }
    
}
}
class  Magpie{
    public void LetsTalk(){
    
        Scanner in=new Scanner(System.in);
       System.out.println("please input your name");
       String name=in.nextLine();
       name.trim();
       
       
       name=name.toUpperCase();     
      
       if(name.indexOf("WANGGUANGFA")!=-1)
       {
           System.out.println("Big Person, Welcom!");
       }
       else
       {
           System.out.println("Hmmm, good name");
       }
       System.out.println("Say something?");
       String words=in.nextLine();
       while(!words.contains("Bye"))
       {
           words=words.toLowerCase();
           if(words.contains("dog"))
           {
               System.out.println("Say more on your dog");
           }
           else if(words.contains("no"))
           {
               System.out.println("Why so negative");
           }
           else
           {
               System.out.println("hmmm");
           
           }
           words=in.nextLine();
           
       }
    }
}

class MergeSort{
   
    public void mergeSort(int [] elements){
        int n=elements.length;
        int[] temp=new int[n];
        mergeSortHelper(elements,0,n-1,temp);
       
    }
    private void mergeSortHelper(int[] elements,int from,int to,int[] temp)
    {
        if(from<to)
        {
            int middle=(from+to)/2;
            mergeSortHelper(elements,from,middle,temp);
            mergeSortHelper(elements,middle+1,to, temp);
            merge(elements,from,middle,to ,temp);
        }
    }
    private void merge(int [] elements, int from,int mid, int to, int[] temp)
    {
        int i=from;
        int j=mid+1;
        int k=from;
        while (i<=mid && j<=to)
        {
            if(elements[i]<elements[j])
            {
                temp[k]=elements[i];
                i++;
            }
            else
            {
                temp[k]=elements[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
        {
            temp[k]=elements[i];
            i++;
            k++;
        }
        while(j<=to)
        {
            temp[k]=elements[j];
            j++;
            k++;
        }
        for(k=from;k<=to;k++)
        {
            elements[k]=temp[k];
        }
    
    }
    
    

}