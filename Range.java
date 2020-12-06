import java.util.NoSuchElementException;

public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int start,  int end){
    start = this.start;
    end = this.end;
    current = this.start;
  }

  public void reset(){
    current = start;
  }

  public int length(){
    return start - end + 1;
  }

  public boolean hasNext(){
    if (current < end) return true;
    else return false;
  }

  //@throws NoSuchElementException
  public int next(){
    if (hasNext() == false) throw new NoSuchElementException();
    else {
      current ++;
      return current;
    }
  }

}
