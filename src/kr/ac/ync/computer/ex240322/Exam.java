package kr.ac.ync.computer.ex240322;


class A extends B {
    static int s; // 객체 마다 생기는 것이 아니라 클래스당 하나만 생성됨, 클래스 멤버라고도 부름
    int a;

    public A() {
//        super(); 생략 가능 컴파이러가 알아서 넣어줌
        super(10);
        System.out.println("생성자 A");
    }
}

class B {
    public B(int b) {
        System.out.println("생성자 B");
    }
}


public class Exam {
    public static void main(String[] args) {
//        A.s = 10;
//        System.out.println(A.s);
//
//        A a1 = new A();
//        A a2 = new A();
        A a = new A();
    }
}
// 패키지 : 관련이 있는 파일들이 모임
// 자바의 접근 지정자 : private, protected, public, default
// 접근 지정자의 목정
// 일부 멤버를 공개하여 다른 클래스에서 접근하도록 허용
// 객체 지향 언어의 캡슐화 정책은 멤버를 보호하는 것

// private : 외부로부터 완변 차단
// default : 동일 패키지에 허용
// protected : 동일 패키지와 자식 클래스에 허용
// public : 모든 접근 허용

// static 에는 method 영역에 올린다.

// static 에서는 this 사용불가
// final class 는 상속 불가, final method 오버라이딩 불가
// String 도 final
// 상수 필드는 선언 시에 초기 값을 지정하여야 한다.
// 상수 필드는 실행 중에 값을 변경할 수 없다.

// 상속의 장점
// 멤버의 중복 작성 불필요

// 부모 클래스 super class
// 자식 클래스 sub class

// 상속을 받은면 부모의 자원까지 쓸 수 있다.

// 업캐스팅(upcasting)
// 서브 클래스는 멤머를 모두 가지고 있음
// 슈퍼 클래스의 객체로 취급할 수 있음

// 업캐스팅이란?
// 서브 클래스 객체를 슈퍼 클래스 타입으로 타입 반환
// 부모 클래스 참조변수에다가 서브 클래스를 넣을 수 있다.
// 단, 부모 클래스의 자원만 쓸 수 있다. 서브 클래스는 잘렸다.

// 다운캐스팅
// 슈퍼 클래스 객체를 서브 클래스 타입으로 변환
// 업캐스팅을 했다가 다운을 하는 것이다.

// instanceof 연산자와 객체의 타입 판단
// 업캐스팅된 래퍼런스로 객체의 타입 판단 어려움
// 사용법: 객체레퍼런스 instanceof 클래스타입

// 메소드 오버라이딩
// 동적 바인딩 발생
// 서브 클래스에 오버라이딩된 메소드가 무조건 실행되는 동적 바인딩