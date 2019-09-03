import java.awt.*;

public class graph extends Frame{
	 public graph(String title) {
		  super(title);
		  add(new XCanvas());
		  setSize(400, 400); // 윈도우의 크기를 400,400으로 지정
		  setVisible(true);
		 

		 }

		 public static void main(String[] args) {
		  new graph("그래프");
		 }

		 class XCanvas extends Canvas {
		  int y;

		  public void paint(Graphics g) {

		   g.drawLine(0, 300, 500, 300); // x축 출력(0,300부터 500,300까지 그린다.)
		   g.setColor(Color.blue);  //선의 색깔을 blue로 변경
		   for (int x = 0; x <= 360; x++) {  //y = x-5그래프를 그림
		    y = x - 5;
		    g.drawLine(x, y, x, y); //출력
		   }

		  }
		 }
}
