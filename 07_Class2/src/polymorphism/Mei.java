package polymorphism;

public class Mei implements OverWatch {

	@Override
	public void name() {

		System.out.println("이름 : 메이");

	}

	@Override
	public void leftClick() {

		System.out.println("왼쪽 클릭 : 냉각총");

	}

	@Override
	public void rightClick() {

		System.out.println("오른쪽 버튼 : 고드름");

	}

	@Override
	public void shiftButton() {

		System.out.println("shift 버튼 : 급속 빙결");

	}

	@Override
	public void eButton() {

		System.out.println("e 버튼 : 빙벽");

	}

	@Override
	public void qButton() {

		System.out.println("q 버튼 : 눈보라");

	}

}
