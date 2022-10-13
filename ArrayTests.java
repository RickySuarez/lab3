import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {};
    int[] input3 = {3 , 2, 1};
    int[] input4 = {4, 3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] {}, input2);
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[] {1, 2, 3}, input3);
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[] {1,2,3,4}, input4);
	}


  
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {3};
    int[] input3 = {3 , 2, 1};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[] {3}, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[] {1, 2, 3}, ArrayExamples.reversed(input3));
  }
}
