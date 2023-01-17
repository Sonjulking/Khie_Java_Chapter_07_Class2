package polymorphism;

/*
 * 다형성(Polymorphism)?
 * - 객체지향 프로그램의 4대 특징 중 하나. - 상속과 연관성이 많음.
 * - 다형성의 사전적 의미 
 *   ==> 같은 종의 생물이지만 모습이나 특징이 고유의 성질을 가지고
 *       있는 것을 말함.
 * - 여러가지 모습으로 해석될 수 있는 형태를 말함.
 * - 여러가지 형태를 가질 수 있는 능력을 말함.
 * - 하나의 메서드나 클래스가 있을 때 이것들이 다양한 방법으로
 *   동작하는 것.
 * - 하나의 사물(객체)을 다양한 타입으로 선언하고 이를 이용할 수 
 *   있는 성질.
 * - 하나의 참조변수로 여러 타입의 객체를 참조할 수 있는 것.
 *   ==> 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것이
 *       다형성의 특징. 단, 조상클래스에서 상속을 받는 멤버들만
 *       접근할 수 있고, 자손클래스에서 만들어진 멤버들에는 접근을
 *       할 수 없음.
 *       예) 조상타입의 참조변수로 자식의 멤버를 호출.
 * - 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있지만,
 *   반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수는
 *   없음.
 * - 다형성을 사용하는 이유
 *   1. 다른 동물을 추가하는 경우.
 *   2. 상속과 메서드 재정의를 활용하여 확장성 있는 프로그램을 
 *      만들 수 있음.
 *   3. 그렇지 않는 경우 많은 if-else if문이 구현되고 코드의 
 *      유지보수가 어려워짐.
 *   4. 상위 클래스에서는 공통적인 부분을 제공하고 하위 클래스에서는 
 *      각 클래스에 맞는 기능 구현.
 *   5. 여러 클래스를 하나의 타입(상위 클래스)으로 핸들링 할 수 
 *      있음.
 */

public interface Animal {

	void sound();

}
