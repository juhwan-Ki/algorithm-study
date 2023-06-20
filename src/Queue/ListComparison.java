package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    // ArrayList와 LinkedList의 성능 비고
    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>();
        List<Object> linkedList = new LinkedList<>();

        System.out.println("ArrayList");
        rearInsert(arrayList);
        frontInsert(arrayList);
        getElements(arrayList);

        System.out.println("LinkedList");
        rearInsert(linkedList);
        frontInsert(linkedList);
        getElements(linkedList);
    }

    // 1. 10000개의 데이터를 리스트에 순차적으로 삽입
    public static void rearInsert(List<Object> list){
        long start = System.nanoTime(); //
        // 실제로 작업하기
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long end = System.nanoTime();
        System.out.printf("순차척 추가 소요시간: %15d ns\n", end - start);
    }
    // 2. 10000개의 데이터를 리스트의 앞에 삽입
    public static void frontInsert(List<Object> list){
        long start = System.nanoTime(); //
        // 실제로 작업하기
        for (int i = 0; i < 10000; i++) {
            list.add(0,i);
        }
        long end = System.nanoTime();
        System.out.printf("앞쪽에 추가 소요시간: %15d ns\n", end - start);
    }
    // 3. 리스트의 모든 원소를 순서(인덱스)를 바탕으로 조회
    public static void getElements(List<Object> list){
        long start = System.nanoTime(); //
        // 실제로 작업하기
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        long end = System.nanoTime();
        System.out.printf("아이템 조회 소요시간: %15d ns\n", end - start);
    }
}
