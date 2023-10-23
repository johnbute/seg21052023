package code_part2;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;
import java.util.Random;


public class CollectionTesting{
    public static void main(String[] args){
        int collectionSize = 150000000;
        Random random = new Random();


        //ArrayList initialization and construction

        long startTime = System.nanoTime();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i<collectionSize; i++){
            arrayList.add((Integer)random.nextInt(10));
        }
        long constructionTimeArrayList = (System.nanoTime() - startTime)/1000000 ;

        
    //Vector initialization and construction
        startTime = System.nanoTime();
        Vector<Integer> vector = new Vector<>();
        for(int i = 0; i<collectionSize; i++){
            vector.add((Integer)random.nextInt(10));
        }
        
        long constructionTimeVector = (System.nanoTime() - startTime)/1000000 ;
        //Array initialization and construction
        startTime = System.nanoTime();
        int[] array = new int[collectionSize];
        for(int i = 0; i<collectionSize; i++){
            array[i] = random.nextInt(10);
        }
        long constructionTimeArray = (System.nanoTime() - startTime)/1000000;
        //Sum Elements
        System.out.println("Construction Time (ms)");
        System.out.println("Time it takes to build ArrayList: "+ constructionTimeArrayList);
        System.out.println("Time it takes to build Vector: "+ constructionTimeVector);
        System.out.println("Time it takes to build Array: "+ constructionTimeArray);

        long sumTimeArrayList = sumElementsWithIterator(arrayList.iterator());
        long sumTimeVector = sumElementsWithIterator(vector.iterator());
        long sumTimeArray = sumElementsArray(array);

        System.out.println("Summing elements Time (ms)");
        System.out.println("Time it takes to sum the elements in ArrayList: "+ sumTimeArrayList);
        System.out.println("Time it takes to sum the elements in Vector: "+ sumTimeVector);
        System.out.println("Time it takes to sum the elements in Array: "+ sumTimeArray);
        

    }

    private static long sumElementsWithIterator(Iterator<Integer> collection){
        long startTime = System.nanoTime();
        Integer sum = 0;
        while(collection.hasNext()){
            sum += collection.next();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime)/1000000 ;

    }

    public static long sumElementsArray(int[] array){
        long startTime = System.nanoTime();
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }

        long endTime = System.nanoTime();
    
        return (endTime - startTime)/1000000 ;

    }


}