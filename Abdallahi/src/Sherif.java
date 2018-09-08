import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sherif {
	
	public static List<List<Integer>> closestXdestinations(int numDestinations,Integer[][] allLocations,int numDeliveries){
		
		List<Point> points = new ArrayList<Point>();
		for(Integer[] point : allLocations){
			points.add(new Point(point[0], point[1]));
		}
		
		
		Collections.sort(points,new Comparator<Point>() {

			public int compare(Point o1, Point o2) {
				
				double d1 = Math.sqrt(Math.pow(o1.getX(), 2) + Math.pow(o1.getY(), 2)); 
			    double d2 =  Math.sqrt(Math.pow(o2.getX(), 2) + Math.pow(o2.getY(), 2));
			    return Integer.compare((int)d1, (int)d2);
			}
			});
		
		List<List<Integer>> result = new ArrayList<>();
		for(int i = 0 ; i<numDeliveries ; i++){
			Point p = points.get(i);
			List<Integer> listElement = new ArrayList<Integer>();
			listElement.add(p.getX());
			listElement.add(p.getY());
			result.add(listElement);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> result = closestXdestinations(3,new Integer[][]{{1,2},{3,4},{1,-1}},2);
		result.forEach(System.out::println);
		

	}

}

class Point{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }
}
