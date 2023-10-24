
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class suffelArray
{
  public static void main(String[] args)
    {
       List<Integer> originalArray = new ArrayList<>();
        originalArray.add(1);
        originalArray.add(2);
        originalArray.add(3);
        originalArray.add(4);
        originalArray.add(5);
        originalArray.add(6);
        originalArray.add(7);

        System.out.println("Original Array: " + originalArray);
        Collections.shuffle(originalArray);
        System.out.println("Shuffled Array: " + originalArray);

    }
}