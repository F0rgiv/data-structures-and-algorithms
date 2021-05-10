package challenges.graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    T value;
    List<Edge> edges =  new ArrayList<>();

    public Vertex(T input) {
        this.value = input;
    }

    public void addEdge(Edge edge){
        edges.add(edge);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", neighbors=" + edges.size() +
                '}';
    }

    public T getValue() {
        return value;
    }
}
