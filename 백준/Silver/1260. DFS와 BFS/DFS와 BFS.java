import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();    // 정점의 개수
        int M = sc.nextInt();   // 간선의 개수
        int V = sc.nextInt();   // 시작할 정점의 번호

        List<List<Integer>> graph = new ArrayList<>();

        // [[],[],[],[],[]]  정점 +1 개의 빈 리스트 생성
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int finish = sc.nextInt();
            // 간선 양방향
            graph.get(start).add(finish);
            graph.get(finish).add(start);
        }

        boolean[] visitedDFS = new boolean[N + 1];
        boolean[] visitedBFS = new boolean[N + 1];

        dfs(V, graph, visitedDFS);
        System.out.println();
        bfs(V, graph, visitedBFS);

        sc.close();
    }

    // DFS는 재귀함수랑 방문 배열
    public static void dfs(int value, List<List<Integer>> graph, boolean[] visitedDFS){
        visitedDFS[value] = true;
        System.out.print(value + " ");
        Collections.sort(graph.get(value));
        for (int nextNode : graph.get(value)){
            if (!visitedDFS[nextNode]) {
                dfs(nextNode, graph, visitedDFS);
            }
        }
    }

    // BFS는 큐랑 방문 배열
    public static void bfs(int V, List<List<Integer>> graph, boolean[] visitedBFS){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visitedBFS[V] = true;

        while (!queue.isEmpty()){
            int num = queue.poll();
            System.out.print(num + " ");
            Collections.sort(graph.get(num));
            for (int nextNode : graph.get(num)){
                if (!visitedBFS[nextNode]) {
                    queue.add(nextNode);
                    visitedBFS[nextNode] = true;
                }
            }
        }
    }


}
