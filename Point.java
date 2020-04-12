class Point {
	String id
	double x,y;

	//TODO add new variable
	String boja;

	//TODO constructor
	public Point(double x, double y, String boja){
		this.x = x;
		this.y = y;
		this.boja = boja;
	}

	//TODO setters and getters
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
		System.out.printl(x, y);
	}



}