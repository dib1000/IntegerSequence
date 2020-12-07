import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = other;
    currentIndex = 0;
  }
  //Postcondition: The otherseq will be reset.
  //This constructor will copy ALL values of the `otherseq` into the data array.
  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    currentIndex = 0;
    int i = 0;
    while(otherseq.hasNext()) {
      data[i] = otherseq.next();
      i++;
    }
    otherseq.reset();
  }

  public boolean hasNext() {
    return currentIndex<data.length;
  }

  public int next() {
    if(!(hasNext())) {
      throw new NoSuchElementException(currentIndex + " is not a valid value for the sequence");
    }
    int cur = data[currentIndex];
    currentIndex+=1;
    return cur;
  }

  public int length() {
    return data.length;
  }

  public void reset() {
    currentIndex = 0;
  }
}
