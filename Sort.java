import java.util.ArrayList;
import java.util.Arrays;
import java.awt.Color;

public class Sort{
  private int canvasWidth;
  private int canvasHeight;
  private int numBars;

  public Sort(int w, int h, int n){
    canvasWidth = w;
    canvasHeight = h;
    numBars = n;
  }

  public int getCanvasWidth(){
    return canvasWidth;
  }

  public int getCanvasHeight(){
    return canvasHeight;
  }

  public int getNumBars(){
    return numBars;
  }

  public void drawBars(ArrayList<Bar> bars){
    // StdDraw.setPenColor(Color.RED);
    double pos = 0;
    for (int i = 0; i < bars.size(); i++){
      Bar b = bars.get(i);
      Color c = b.getColor();

      if(!(c.equals(StdDraw.WHITE) || c.equals(StdDraw.RED))){
        b.setColor(StdDraw.RED);
      }
      StdDraw.setPenColor(c);
      StdDraw.filledRectangle(pos, 0, b.getWidth()/2, b.getHeight()/2);
      pos += canvasWidth/numBars;
    }
    StdDraw.show();
    StdDraw.pause(10);
  }

  public void drawBars(Bar[] bars){
    ArrayList<Bar> barsList = new ArrayList<Bar>(Arrays.asList(bars));
    drawBars(barsList);
    // StdDraw.setPenColor(Color.RED);
    // int count = -4;
    // for (Bar b : bars){
    //   StdDraw.filledRectangle(canvasWidth/numBars + count, 0, b.getWidth()/2, b.getHeight()/2);
    //   count += 8;
    // }
    //
    // StdDraw.show();
    // StdDraw.pause(Draw.PAUSE);
  }
}
