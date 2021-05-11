package challenges.graphs;

import java.util.*;

public class NodeBasedGraph<T> {
    List<Edge> edges = new ArrayList<>();
    List<Vertex<T>> vertexes;

    public Vertex<T> addVertex(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertexes.add(vertex);
        return vertex;
    }

    public void addEdge(Vertex<T> vertex1, Vertex<T> vertex2) {
        Edge edge = new Edge(vertex1, vertex2);
        vertex1.addEdge(edge);
        vertex2.addEdge(edge);
        edges.add(edge);
    }

    public void breadthFirst(Vertex<T> starting) {
        List<Vertex<T>> visited = new LinkedList<>();
        Queue<Vertex<T>> toVisit = new LinkedList<>();
        toVisit.add(starting);
        while (!toVisit.isEmpty()) {
            Vertex<T> vertex = toVisit.remove();
            visited.add(vertex);
            for (Edge edge : vertex.edges) {
                if (!visited.contains(edge.vertex1)) toVisit.add(edge.vertex1);
                if (!visited.contains(edge.vertex2)) toVisit.add(edge.vertex2);
            }
        }
    }
}


