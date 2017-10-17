package java_study;

public class Circle {
	private int r;

	public Circle(int r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}

	// 判断点和圆的关系；需要引入点的相关信息，所以函数需要参数
	public String jageMent(Point point) {
		// 距离的平方
		int d = point.getX() * point.getX() + point.getY() * point.getY();
		// 半径的平方
		int R = this.r * this.r;
		if (d > R) {
			return "点在圆外";
		} else if (d < R) {
			return "点在圆内";
		} else {
			return "点在圆上";
		}
	}
}
