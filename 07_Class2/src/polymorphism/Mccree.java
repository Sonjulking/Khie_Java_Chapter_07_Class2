package polymorphism;

public class Mccree implements OverWatch {

	@Override
	public void name() {

		System.out.println("이름 : 맥크리");

	}

	@Override
	public void leftClick() {

		System.out.println("왼쪽 클릭 : 피스키퍼");

	}

	@Override
	public void rightClick() {

		System.out.println("오른쪽 버튼 : 모든총알발사");

	}

	@Override
	public void shiftButton() {

		System.out.println("shift 버튼 : 구르기");

	}

	@Override
	public void eButton() {

		System.out.println("e 버튼 : 섬광탄");

	}

	@Override
	public void qButton() {

		System.out.println("q 버튼 : 황야의 무법자 ");

	}

}
