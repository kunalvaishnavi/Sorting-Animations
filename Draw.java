import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Draw{
  public static final int NUM_BARS_LIST = 50;
  public static final int NUM_BARS_ARRAY = 200;
  public static final int PAUSE = 1000;

  public static void main(String[] args) {
    int canvasWidth = 800;
    int canvasHeight = 400;
    StdDraw.clear(Color.BLACK);
    StdDraw.enableDoubleBuffering();
    StdDraw.setCanvasSize(canvasWidth, canvasHeight);
    StdDraw.setPenColor(StdDraw.RED);     // sets up window such that (0,0) is lower left hand corner; (canvasWidth, canvasHeight) is upper right hand corner
    StdDraw.setXscale(0, canvasWidth);
    StdDraw.setYscale(0, canvasHeight);

    ArrayList<Bar> barArrayList = new ArrayList<Bar>(NUM_BARS_LIST);
    for (int i = 0; i < NUM_BARS_LIST; i++){
      barArrayList.add(new Bar(i*16, 2, Color.RED));
    }

    Bar[] barArray = new Bar[NUM_BARS_ARRAY];
    for (int i = 0; i < barArray.length; i++){
      barArray[i] = new Bar(i*8, 2, Color.RED);
    }

    Selection testSelection = new Selection(canvasWidth, canvasHeight, NUM_BARS_LIST);
    Insertion testInsertion = new Insertion(canvasWidth, canvasHeight, NUM_BARS_LIST);
    Merge testMerge = new Merge(canvasWidth, canvasHeight, NUM_BARS_ARRAY);
    Quick testQuick = new Quick(canvasWidth, canvasHeight, NUM_BARS_ARRAY);

    Collections.shuffle(barArrayList);
    Collections.shuffle(Arrays.asList(barArray));

    testSelection.selectionSort(new ArrayList<>(barArrayList));
    testInsertion.insertionSort(new ArrayList<>(barArrayList));
    testMerge.mergeSort(barArray.clone());
    testQuick.quickSort(barArray.clone());

    // testSelection.drawBars(barArrayList);
    // testSelection.selectionSort(barArrayList);
    // testSelection.drawBars(barArrayList);
    //
    // testInsertion.drawBars(barArrayList);
    // testInsertion.insertionSort(barArrayList);
    // testInsertion.drawBars(barArrayList);
    //
    // testMerge.drawBars(barArray);
    // testMerge.mergeSort(barArray);
    // testMerge.drawBars(barArray);
    //
    // testQuick.drawBars(barArray);
    // testQuick.quickSort(barArray);
    // testQuick.drawBars(barArray);

    // System.out.println(barArrayList.toString());
    // System.out.println(Arrays.toString(barArray));
  }
}
