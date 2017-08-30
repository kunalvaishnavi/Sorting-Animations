import java.awt.Color;

public class Quick extends Sort {

  public Quick(int w, int h, int n) {
    super(w, h, n);
  }

  public void drawBars(Bar[] bars) {
    StdDraw.clear(StdDraw.BLACK);
    StdDraw.setPenColor(StdDraw.WHITE);
    StdDraw.text(0, super.getCanvasHeight()-10, "Quick Sort");
    super.drawBars(bars);
  }

  public void quickSort(Bar[] bars) {
    quickSortHelper(bars, 0, bars.length-1);
    for(Bar b : bars){
      b.setColor(StdDraw.WHITE);
      drawBars(bars);
    }
  }

  public void quickSortHelper(Bar[] bars, int from, int to) {
    if (from >= to) {
      return;
    }
    int p = (from + to) / 2;  // choose pivot
    bars[p].setColor(StdDraw.BLUE);
    int i = from;
    int j = to;
    while (i <= j) {
      if (bars[i].compareTo(bars[p]) <= 0) {
        i++;
      }
      else if (bars[j].compareTo(bars[p]) >= 0) {
        j--;
      }
      else {
        swap(bars, i, j);
        i++;
        j--;
      }
    }
    //finish partitioning
    if (p < j) {
      swap(bars, j, p);
      p = j;
    }
    else if (p > i) {
      swap(bars, i, p);
      p = i;
    }

    quickSortHelper(bars, from, p-1);
    quickSortHelper(bars, p + 1, to);
    drawBars(bars);
  }

  public void swap(Bar[] bars, int i, int j) {
    Bar temp = bars[i];
    bars[i] = bars[j];
    bars[j] = temp;

    bars[i].setColor(StdDraw.GREEN);
    bars[j].setColor(StdDraw.GREEN);
    drawBars(bars);
  }
}
