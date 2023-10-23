
public class Plot {
	private int x, y, width, depth;
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.depth = depth;
		this.width = width;
	}
	
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

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean overlaps(Plot pl) {
		
		boolean isXBetween = (this.x > pl.x) && ( this.x < (pl.x + pl.width) );
		boolean isXWidthBetween = (this.x + this.width > pl.x) && this.x +this.width < (pl.x + pl.width);
		boolean isYCross = this.y < (pl.y + pl.depth) && (this.y + this.depth) > pl.y;
		
		boolean isYBetween = (this.y > pl.y) && this.y < (pl.y + pl.depth);
		boolean isYDepthBetween = (this.y + this.depth > pl.y) && (this.y + this.depth) < (pl.y + pl.depth);
		boolean isXCross = (this.x < (pl.x + pl.width) && (this.x + this.width) > pl.x);
		
		boolean isPlXBetween = (pl.x > this.x) && ( pl.x < (this.x + this.width) );
		boolean isPlXWidthBetween = (pl.x + pl.width > this.x) && pl.x + pl.width < (this.x + this.width);
		boolean isPlYCross = pl.y < (this.y + this.depth) && (pl.y + pl.depth) > this.y;
		
		boolean isPlYBetween = (pl.y > this.y) && pl.y < (this.y + this.depth);
		boolean isPlYDepthBetween = (pl.y + pl.depth > this.y) && (pl.y + pl.depth) < (this.y + this.depth);
		boolean isPlXCross = (pl.x < (this.x + this.width) && (pl.x + pl.width) > this.x);
		
		
		if ( (isXBetween || isXWidthBetween) && isYCross) {
			return true;
		} else if ( (isYBetween || isYDepthBetween) && isXCross) {
			return true;
		} else if ( (isPlXBetween || isPlXWidthBetween) && isPlYCross){
			return true;
		} else if ( (isPlYBetween || isPlYDepthBetween) && isPlXCross) {
			return true;
		} else if (this.x == pl.x && (this.x + this.width) == (pl.x + pl.width) && this.y == pl.y && (this.y + this.depth) == (pl.y + pl.depth)){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean encompasses(Plot pl){ 

		if (this.x <= pl.x && (this.x + this.width) >= (pl.x + pl.width) && this.y <= pl.y && (this.y + this.depth) >= (pl.y + pl.depth)){ 
			return true; 
		} else { 
			return false; 
		}
	}
	
	public String toString() { 
		return (x + "," + y + "," + width + "," + depth); 
	}
}
