import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = new int[other.length];
    for (int i = 0; i < other.length; i ++) {
      data[i] = other[i];
    }
  }

  public ArraySequence(IntegerSequence otherseq) {
    otherseq.reset();
		data = new int[otherseq.length()];

		for (int i = 0; i < otherseq.length(); i++) {
			data[i] = otherseq.next();
		}
    otherseq.reset();
	}


  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    return currentIndex != data.length - 1;
  }

  //@throws NoSuchElementException
  public int next(){
    if (hasNext() == false) throw new NoSuchElementException();
    else {
      currentIndex ++;
      return data[currentIndex];
    }
  }

}
