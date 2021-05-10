package challenges.graphs;

import java.util.*;

public class Graph<V, E> {
    List<V> vertexes = new ArrayList<>();
    List<List<E>> matrix = new ArrayList<>();

    public V addVertex(V value) throws Exception {
        if (vertexes.contains(value)) throw new Exception(String.format("%s already exists!", value));
        List<E> toAdd = new ArrayList<>();
        toAdd.add(null);
        for (List<E> list : matrix) {
            list.add(null);
            toAdd.add(null);
        }
        matrix.add(toAdd);
        vertexes.add(value);
        return value;
    }

    public void addEdge(E edge, V vertex1, V vertex2, boolean directional) {
        int index1 = vertexes.indexOf(vertex1);
        int index2 = vertexes.indexOf(vertex2);
        matrix.get(index1).set(index2, edge);
        if (!directional) matrix.get(index2).set(index1, edge);
    }

    public List<V> getVertexes() {
        return vertexes;
    }

    public Map<List<V>, E> GetNeighbors(V vertex) {
        int index = vertexes.indexOf(vertex);
        Map<List<V>, E> result = new HashMap<>();
        for (int i = 0; i < vertexes.size(); i++) {
            if (matrix.get(index).get(i) == null) continue;
            List<V> fromTo = new ArrayList<>();
            fromTo.add(vertex);
            fromTo.add(vertexes.get(i));
            result.put(fromTo, matrix.get(index).get(i));
        }
        for (int i = 1; i < vertexes.size(); i++) {
            if (matrix.get(index).get(i) == null) continue;
            List<V> fromTo = new ArrayList<>();
            fromTo.add(vertexes.get(i));
            fromTo.add(vertex);
            result.put(fromTo, matrix.get(index).get(i));
        }
        return result;
    }

    public int Size() {
        return vertexes.size();
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertexes=" + vertexes +
                ", matrix=" + matrix +
                '}';
    }
}
