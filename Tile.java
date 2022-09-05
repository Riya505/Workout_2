import java.util.*;
class Tile{
	private int edge;	
	private int area;
	Tile(int edge){
		this.edge=edge;
		this.area=edge*edge;
	}
	int getArea(){
		return area;
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter the length of Tile: ");
	int tileLength = sc.nextInt();
	Tile t = new Tile(tileLength);
	t.getArea();	
	System.out.println("Enter the length and width of Floor: ");
	int fLength = sc.nextInt();
	int fWidth = sc.nextInt();
	Floor f = new Floor(fLength,fWidth);	
	System.out.println("the number of tiles needed to cover floor completely " +f.totalTiles(t));
	}
}
class Floor{
	int length,width;
	Floor(int length, int width){
		this.length = length;
		this.width = width;
	}
	float totalTiles(Tile t){
		float tileArea = t.getArea();
		float floorArea = length*width;
		return floorArea/tileArea;	
	}
}

