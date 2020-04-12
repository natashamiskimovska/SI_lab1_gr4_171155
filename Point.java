class Point {
	String id
	double x,y;

	//TODO add new variable
	String boja;

	//TODO constructor
	public Point(double x, double y, String boja, String id){
		this.x = x;
		this.y = y;
		this.boja = boja;
		this.id = id;
	}

	//TODO setters and getters
    public void setId(String id){
	    this.id = id;
    }
    public String getId(){
	    return id;
    }
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public void setBoja(String boja){
		this.boja = boja;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public String getBoja(){
		return boja;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection == 'L'){
			x--;
		}
		else if(xDirection == 'R'){
			x++;
		}
		else if(yDirection == 'U'){
			y++;
		}
		else if(yDirection == 'D'){
			y--;
		}
	}

	public void draw () {
		//TODO
		System.out.println(x, y);
	}



}
class Canvas{
    List<Points> points = new ArrayList<>();

    public void contains(double x, double y){
        boolean containsElement = points.contains(x,y);
        System.out.println(containsElement);
    }
    public void deleteAll(){
        points.clear();
    }
}