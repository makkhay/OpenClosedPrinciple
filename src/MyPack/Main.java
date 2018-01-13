package MyPack;

/**
* Demo of Open closed principle
 *
 * Open closed principle states that the design and writing of the code should be done in a way that new functionalty
 * should be added with minimum changes in the existing code
 *
 * We should keep as much exisiting code unchanged as possible
 *
 * By doing this, we were able to add another feature, in this case mergesort without modifying the exisiting code
 *
 *
 */


public class Main {

    public static void main(String[] args) {
	// write your code here
    SorterManager sorterManager = new SorterManager();
    sorterManager.sort(new InsertionSort());
    sorterManager.sort(new MergeSort());



    }
}
