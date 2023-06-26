import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int computerCnt = sc.nextInt();    // 정점의 개수
        int pairCnt = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= computerCnt ; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < pairCnt; i++) {
            int start = sc.nextInt();
            int finish = sc.nextInt();

            graph.get(start).add(finish);
            graph.get(finish).add(start);
        }

        boolean[] visited = new boolean[computerCnt + 1];

        bfs(1, graph, visited);

        sc.close();

    }

    public static void bfs (int V,List<List<Integer>> graph, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;

        int cnt = 0;
        while (!queue.isEmpty()){
            int num = queue.poll();

            Collections.sort(graph.get(num));
            for (int nextNode : graph.get(num)){
                if (!visited[nextNode]) {
                    queue.add(nextNode);
                    visited[nextNode] = true;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}