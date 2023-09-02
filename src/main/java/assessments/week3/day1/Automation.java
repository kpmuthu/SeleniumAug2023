package assessments.week3.day1;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation ab = new Automation();
		ab.python();
		ab.selenium();
		ab.ruby();
		ab.java();

	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");

	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");

	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");

	}

}
