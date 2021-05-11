package challenges.graphs;

import java.util.*;

public class NodeBasedGraph<T> {
    List<Edge> edges = new ArrayList<>();
    List<Vertex<T>> vertexes;

    public Vertex<T> addVertex(T value) {
        Vertex<T> vertex = new Vertex<T>(value);
        vertexes.add(vertex);
        return vertex;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2) {
        Edge edge = new Edge(vertex1, vertex2);
        vertex1.addEdge(edge);
        vertex2.addEdge(edge);
        edges.add(edge);
    }

    public void traverse(Vertex<T> starting) {
        Set<Vertex<T>> visited = new HashSet<>();
        Stack<Vertex<T>> toVisit = new Stack<>();
        visited.add(starting);
        toVisit.add(starting);
        while (!visited.isEmpty()) {
            Vertex<T> vertex = toVisit.pop();
            System.out.printf("visited: %s\n", vertex.value);
            for (Edge edge : edges) {

            }
        }
    }
}


