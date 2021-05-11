package challenges.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vertex<T> {
    T value;
    Set<Edge> edges =  new HashSet<>();

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
