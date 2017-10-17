package java_study;

//定义Car和Engine类：
public class CreateObject {
	private int color;
	private int speed;
	private Engine engine;

	// 构造器
	public CreateObject(int color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	// 构造器
	public CreateObject(int color, int speed, Engine engine) {
		this.color = color;
		this.speed = speed;
		this.engine = engine;
	}

	// 方法
	public void startup() {
		System.out.println("启动！！");
	}

	// 方法
	public void run() {
		// 调用startup方法
		this.startup();
		System.out.println("前进，速度为：" + this.speed);
	}

	public static void main(String[] args) {
		CreateObject CO = new CreateObject(0xf, 18);
		// CO.startup();
		CO.run();
		Engine engine = new Engine(180);
	}
}
