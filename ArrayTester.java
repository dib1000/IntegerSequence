import java.util.NoSuchElementException;
public class ArrayTester {
  public static void main(String[] args) {
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println(as.length());
    System.out.println();
    System.out.println(as.next());
    System.out.println(as.next());
    System.out.println(as.next());
    as.reset();
    System.out.println(as.next());
    as.reset();
    System.out.println();

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();
    int[] one = {10};
    IntegerSequence y = new ArraySequence(one);
    try {
      System.out.println(y.next());
      System.out.println(y.next());
    }
    catch(NoSuchElementException e) {
      e.printStackTrace();
    }
  }
}
