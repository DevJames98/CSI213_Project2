package module2projectdjames;

import java.util.Random;

/**
 *Author: Devon James           Date: Oct. 16th, 2017
 * CSI 213                      Prof. George Berg
 * Discussion: Monday 11:30-12:25
 */
public class Module2ProjectDJAMES {
        static int bCount=0; static int iCount=0; static int qsCount=0;             //counter variables used to track # of comparisons
          
        static int btemp1 = 0;  static int itemp1 = 0;  static int qstemp1 = 0;     //temp variables for each algorithm used for calculating averages
        static int btemp2 = 0;  static int itemp2 = 0;  static int qstemp2 = 0;     
        static int btemp3 = 0;  static int itemp3 = 0;  static int qstemp3 = 0; 
        static double avg;                                                             //used to calculate average # of comparisons
        
public static void tenArray(){                                                      //method dealing with 10 array elements
    
    System.out.println("QUESTION 1: 10 ELEMENT ARRAY"); System.out.println("-----------------------------------------------------");
    
    for(int x =1; x<=10; x++){                                                   //recursive loop that runs the method 10 times
        
        btemp1= bCount+ btemp1; itemp1= iCount+ itemp1; qstemp1= qsCount+ qstemp1;  //adds comparisons to each other before resetting
        bCount=0; iCount=0; qsCount=0;              //resets variables after every iteration of the for loop
        int arr[] = new int [10];                   //initializes 10 element array
        
        System.out.print(x+") Starting Array: ");
        for(int i=0; i<arr.length; i++){                            //loop that generates random numbers from 0-99
            Random rand = new Random();
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        
        System.out.println(""); System.out.println("-----------------------------------------------------");

        bubbleSort(arr);                                                //runs the bubble sort method
        System.out.print("Bubble Sorted Array: ");
        for(int i=0; i<arr.length; i++){                                //loop that prints the sorted array
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("    Bubble Comparisons: " + bCount); System.out.println("");    //prints comparisons for bubble sort

        
        insertionSort(arr);                                             //runs the insertion sort method
        System.out.print("Insertion Sorted Array: ");
        for(int i=0; i<arr.length; i++){                                //loop that prints the sorted array
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("    Insertion Comparisons: " + iCount); System.out.println("");     //prints comparisons for insertion sort

        
        quickSort(arr,0,arr.length-1);                                  //runs the quicksort method
        System.out.print("Quick Sorted Array: ");
        for(int i=0; i<arr.length; i++){                                //loop that prints the sorted array
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("    Quick Comparisons: " + qsCount); System.out.println("-----------------------------------------------------");
        
        } //ends x10 iteration
        System.out.println("");System.out.println("");System.out.println("");
}    

public static void hundredArray(){                                              //method dealing with 100 array elements
    
    bCount=0; iCount=0; qsCount=0;      //so that counter variables do not carry over values from the last iteration of previous method
    System.out.println("QUESTION 2: 100 ELEMENT ARRAY"); System.out.println("-----------------------------------------------------");
    
    for(int x =1; x<=10; x++){                                                   //recursive loop that runs the method 10 times
        
        btemp2= bCount+ btemp2; itemp2= iCount+ itemp2; qstemp2= qsCount+ qstemp2;    //adds comparisons to each other before resetting
        bCount=0; iCount=0; qsCount=0;              //resets variables after every iteration of the for loop
        int arr[] = new int [100];
        
        System.out.print(x+") Starting Array: ");
        for(int i=0; i<arr.length; i++){
            Random rand = new Random();
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        
        System.out.println(""); System.out.println("-----------------------------------------------------");

        bubbleSort(arr);
        System.out.print("Bubble Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("    Bubble Comparisons: " + bCount); System.out.println("");

        
        insertionSort(arr);
        System.out.print("Insertion Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("    Insertion Comparisons: " + iCount); System.out.println("");

        
        quickSort(arr,0,arr.length-1);
        System.out.print("Quick Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("    Quick Comparisons: " + qsCount); System.out.println("-----------------------------------------------------");
        
        } //ends x10 iteration
        System.out.println("");System.out.println("");System.out.println("");
}  

public static void thousandArray(){                                             //method dealing with 1000 array elements
    
    bCount=0; iCount=0; qsCount=0;      //so that counter variables do not carry over values from the last iteration of previous method
    System.out.println("QUESTION 3: 1000 ELEMENT ARRAY"); System.out.println("-----------------------------------------------------");
    
    for(int x =1; x<=10; x++){                                                   //recursive loop that runs the method 10 times
        
        btemp3= bCount+ btemp3; itemp3= iCount+ itemp3; qstemp3= qsCount+ qstemp3;   //adds comparisons to each other before resetting
        bCount=0; iCount=0; qsCount=0;              //resets variables after every iteration of the for loop
        int arr[] = new int [1000];
        
        System.out.print(x+") Starting Array: ");
        for(int i=0; i<arr.length; i++){
            Random rand = new Random();
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        
        System.out.println(""); System.out.println("-----------------------------------------------------");

        bubbleSort(arr);
        System.out.print("Bubble Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("    Bubble Comparisons: " + bCount); System.out.println("");

        
        insertionSort(arr);
        System.out.print("Insertion Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("    Insertion Comparisons: " + iCount); System.out.println("");

        
        quickSort(arr,0,arr.length-1);
        System.out.print("Quick Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("    Quick Comparisons: " + qsCount); System.out.println("-----------------------------------------------------");
        
        } //ends x10 iteration
        System.out.println("");System.out.println("");System.out.println("");
}  

    public static void bubbleSort(int[] bArray) {                   //bubble sort method

    int last; int index; int temp; 
    for (last=bArray.length -1;last>=0;last--) {
        for (index=0;index<=last -1;index++) {
               
            if (bArray[index] > bArray[index+1]) {
                temp = bArray[index];
                bArray[index] = bArray[index+1];
                bArray[index+1] = temp;
                bCount++;                                           //used to track # of comparisons
            }  
        } 
    }
}
    
    public static void insertionSort(int iArray[]) {                    //insertion sort method
        int uVal; int scan; 
        for (int i = 1; i < iArray.length; i++) {                                       
            uVal = iArray[i];  
            scan=i;  
            while ( (scan > 0) && ( iArray [scan-1] > uVal ) ) {  
                iArray [scan] = iArray [scan-1];  
                scan--;  
            }  
            iArray[scan] = uVal;  iCount++;                               //used to track # of comparisons
        }      
}

    public static void quickSort(int qArr[], int start, int end) {              //quicksort method
	int pivot;
        
        if(start < end){
            pivot = partition(qArr,start,end);
             quickSort(qArr, start, pivot - 1);
             quickSort(qArr, pivot + 1, end);
        }
    }
        public static void swap(int qArr[], int start, int end){        //method used to swap elements
            int temp = qArr[end];
            qArr[end] = qArr[start];
            qArr[start]=temp; qsCount++;                                //used to track # of comparisons
        }
        
        public static int partition(int qArr[], int start, int end){    //partition method used in quicksort
            int pivot; int endLeft; int mid;
            
             mid = (start + end) / 2;
             swap(qArr, start, mid);
             pivot=qArr[start];
             endLeft=start;
             for (int scan = start + 1; scan <= end; scan++){
                 if(qArr[scan]<pivot){
                     endLeft++;
                     swap(qArr,endLeft,scan);
                 }
             }
             swap(qArr,start,endLeft);
             return endLeft;
        }
	
        public static void main(String[] args) {                // main Method
        // TODO code application logic here
        tenArray(); hundredArray(); thousandArray();            //runs methods for 10,100 and 1000 element arrays
        
        System.out.println("QUESTION 4: AVERAGE NUMBER OF COMPARISONS"); System.out.println("-----------------------------------------------------");
        
        System.out.println("For arrays containing 10 elements:");
        avg=btemp1/10;      System.out.println("    Average Number of Comparisons for Bubble Sort: "+avg);          //calculating averages
        avg=itemp1/10;      System.out.println("    Average Number of Comparisons for Insertion Sort: "+avg);
        avg=qstemp1/10;     System.out.println("    Average Number of Comparisons for Quicksort: "+avg);
        System.out.println("");
        
        System.out.println("For arrays containing 100 elements:");
        avg=btemp2/10;      System.out.println("    Average Number of Comparisons for Bubble Sort: "+avg);          //calculating averages
        avg=itemp2/10;      System.out.println("    Average Number of Comparisons for Insertion Sort: "+avg);
        avg=qstemp2/10;     System.out.println("    Average Number of Comparisons for Quicksort: "+avg);
        System.out.println("");
       
        System.out.println("For arrays containing 1000 elements:");
        avg=btemp3/10;      System.out.println("    Average Number of Comparisons for Bubble Sort: "+avg);          //calculating averages
        avg=itemp3/10;      System.out.println("    Average Number of Comparisons for Insertion Sort: "+avg);
        avg=qstemp3/10;     System.out.println("    Average Number of Comparisons for Quicksort: "+avg);
        System.out.println("");
    }   //ends main method
}       //ends class

