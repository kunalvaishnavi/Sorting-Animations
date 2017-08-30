import java.awt.Color;

public class Bar implements Comparable<Bar>{
  private int height, width;
  private Color color;

  public Bar(int h, int w, Color c){
    height = h;
    width = w;
    color = c;
  }

  public int getWidth(){
    return width;
  }

  public int getHeight(){
    return height;
  }

  public Color getColor(){
    return color;
  }

  public void setColor(Color c){
    color = c;
  }

  public int compareTo(Bar other){
    return this.height - other.height;
  }

  public String toString(){
    return "(" + height +  ", " + width + ", " + color + ")";
  }
}
