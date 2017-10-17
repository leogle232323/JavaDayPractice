package java_study;

//调用代码
public class JageMent {
	public static void main(String[] args) {
		// 根据数据确定点对象，因此使用构造器赋值
		Point point = new Point(3, 4);
		Circle circle = new Circle(5);
		String ret = circle.jageMent(point);
		System.out.println(ret);
	}

}
