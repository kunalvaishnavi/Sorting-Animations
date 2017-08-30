import java.util.ArrayList;
import java.awt.Color;

public class Selection extends Sort {

  public Selection(int w, int h, int n) {
    super(w, h, n);
  }

  public void drawBars(ArrayList<Bar> bars) {
    StdDraw.clear(StdDraw.BLACK);
    StdDraw.setPenColor(StdDraw.WHITE);
    StdDraw.textLeft(0, super.getCanvasHeight()-10, "Selection Sort");
    super.drawBars(bars);
  }

  public void selectionSort(ArrayList<Bar> bars) {
    for (int i = 0; i < bars.size(); i++) {
      int first = i;

      // find min (Blue = current, Green = current min)
      for (int j = i + 1; j < bars.size(); j++) {
        Bar b = bars.get(j);
        b.setColor(StdDraw.BLUE);
        if (bars.get(j).compareTo(bars.get(first)) < 0) {
          first = j;
        }
        bars.get(i).setColor(StdDraw.GREEN);
        bars.get(first).setColor(StdDraw.GREEN);
        drawBars(bars);
      }

      // swap!
      Bar temp = bars.get(first);
      bars.set(first, bars.get(i));
      temp.setColor(StdDraw.WHITE);
      bars.set(i, temp);
      drawBars(bars);
    }
  }
}
