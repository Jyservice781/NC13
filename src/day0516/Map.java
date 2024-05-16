package day0516;

// 자바에서 특정 데이터타입의 여러 객체를
// 한 번에 다루는 클래스는 모두 Collection 이라는 인터페이스를
// 상속받는다.
// 그리고 콜렉션 인터페이스를 상속받는 3가지 종류는
// 1. 리스트: 중복이 가능한 배열 형태의 인터페이스
// 2. 셋: 중복이 불가능한 배열 형태의 인터페이스
// 3. 맵: 중복되지 않는 키를 가지고 벨류를 컨트롤 하는 인터페이스
//        인덱스가 부여되지 않는다 -> 객체 추가나 호출할 수 있는 키값을 같이 사용함.
//        키는 set 값을 가지고
//        밸류는 단일 값을 가짐
// 이렇게 이다.

// Map 의 경우, 여러가지
// HashMap<K, V> map = new HashMap<>();
// HashMap 은 덮어쓰기를 취함.

import types.Student;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();

        Student s1 = new Student();
        s1.name = "김철수";
        s1.id = 1;
        s1.korean = 80;
        s1.english = 81;
        s1.math = 81;

        Student s2 = new Student();
        s2.name = "김짱구";
        s2.id = 2;
        s2.korean = 90;
        s2.english = 91;
        s2.math = 90;

        Student s3 = new Student();
        s3.name = "김맹구";
        s3.id = 3;
        s3.korean = 78;
        s3.english = 79;
        s3.math = 80;

        Student s4 = new Student();
        s4.name = "김영희";
        s4.id = 4;

        // map 에 데이터 추가하기
        // put()을 사용해서 데이터 저장
        // key 값을 String 으로 적용을 했기 때문에 String 으로 구분할 수 있도록 함.
        map.put("김철수", s1);
        map.put("김짱구", s2);
        map.put("김맹구", s3);
        map.put("김영희", s4);

        // map 에 데이터 가져오기
        System.out.println("map.get(\"김짱구\").id: " + map.get("김짱구").id);
        System.out.println("map.get(\"bbb\"):" + map.get("bbb")); // null 포인트이기 때문에 id 없앰.
        System.out.println("map.get(\"김영희\").name: " + map.get("김영희").name);

        // 입력된 값들의 키 전체 확인하기 // map 의 특징 LIFO - Last In First Out
        System.out.println(map.keySet());

        for(String k : map.keySet()){
            System.out.println(map.get(k).id);
        }

        // 특정 키가 존재하는지 확인하기 -> value 는 안됨.
        System.out.println(map.containsKey("aaa"));
        System.out.println(map.containsKey("김짱구"));

    }
}
