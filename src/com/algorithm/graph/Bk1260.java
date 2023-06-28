package com.algorithm.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bk1260 {

    static int[][] arr;
    static boolean[] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        arr = new int[node + 1][node + 1];

        // 그래프에 해당 간선의 정보들을 입력
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[node + 1];
        // dfs call
        dfs(startNode);
        // 개행
        System.out.println();

        visited = new boolean[node + 1];
        // bfs call
        bfs(startNode);
    }

    // dfs(재귀)
    public static void dfs(int start){
        // 현재 경로 출력
        System.out.print(start + " ");
        // 현재 노드 방문 처리
        visited[start] = true;
        if(start == arr.length){
            return;
        }

        for (int i = 1; i < visited.length; i++) {
            // 연결은 되어 있는데 방문하지 않았다면 반복
            if(arr[start][i] == 1 && visited[i] == false){
                dfs(i);
            }
        }
    }

    // bsf(큐)
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        System.out.print(start + " ");

        while (!queue.isEmpty()){
            int next = queue.poll();
            for (int i = 1; i < arr.length; i++) {
                if(arr[next][i] == 1 && visited[i] == false) {
                    queue.offer(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
