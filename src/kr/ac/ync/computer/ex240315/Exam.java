package kr.ac.ync.computer.ex240315;
class Member {
    private int age;
    private String name;

//    public Member(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Exam {
    public static void main(String[] args) {

        for (int i = 0; ; i++) {
            if (i > 10) {
                break;
            }

            if (i % 2 != 0) {
                continue;
            }

            System.out.print(i + " ");
        }


//        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        System.out.println(array[0] * 5);

//        Member[] members; // 메소드 영역에 선언
//        members = new Member[5]; // 그 메소드 영역에 5개의 배열을 선언
//        members[0] = new Member(); // 그 다섯개의 배열에서 Member 선언
//        members[0].age = 10;
//        members[0].name = "한상희";

//        System.out.println(members[0].age + " " +  members[0].name);

        // 접근 지정자까지
    }
}
