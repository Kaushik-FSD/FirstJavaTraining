import com.abc.geometry.ShapeStatistics;
import com.globalpayex.geometry.entities.Circle;
import com.globalpayex.geometry.entities.Rectangle;
import com.globalpayex.geometry.entities.Square;

public class runGeometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square(7.0f);
//		System.out.println(sq.findArea());
//		System.out.println(sq.findPerimeter());
		
		ShapeStatistics.print(sq);
		
		//RECTANGLE
		Rectangle rec = new Rectangle(10f, 10f);
		ShapeStatistics.print(rec);
		
		ShapeStatistics.print(new Circle(9));
	}

}
