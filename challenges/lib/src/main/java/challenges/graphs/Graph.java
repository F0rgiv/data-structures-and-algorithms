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

//        vertexes.sort(Comparator.comparing());
    }

    public List<V> getVertexes() {
        return vertexes;
    }

    public Set<V> GetNeighbors(V vertex) {
        int index = vertexes.indexOf(vertex);
        Set<V> result = new HashSet<>();
        for (int i = 0; i < vertexes.size(); i++) {
            if (matrix.get(index).get(i) != null) result.add(vertexes.get(i));
            if (matrix.get(i).get(index) != null) result.add(vertexes.get(i));
        }
        return result;
    }

    public Map<List<V>, E> GetNeighborsDetails(V vertex) {
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

    public E GetEdge(V vertexFrom, V vertexTo) {
        int indexFrom = vertexes.indexOf(vertexFrom);
        int indexTo = vertexes.indexOf(vertexTo);
        return matrix.get(indexFrom).get(indexTo);
    }

    public List<V> breadthFirst(V vertex) {
        List<V> result = new LinkedList<>();
        Queue<V> toVisit = new LinkedList<>();
        result.add(vertex);
        toVisit.add(vertex);
        while (!toVisit.isEmpty()) {
            V current = toVisit.remove();
            int index = vertexes.indexOf(current);
            for (int i = 0; i < vertexes.size(); i++) {
                if (matrix.get(index).get(i) != null
                        && !(result.contains(vertexes.get(i)))) {
                    result.add(vertexes.get(i));
                    toVisit.add(vertexes.get(i));
                }
                if (matrix.get(i).get(index) != null
                        && !(result.contains(vertexes.get(i)))) {
                    result.add(vertexes.get(i));
                    toVisit.add(vertexes.get(i));
                }
            }
        }
        return result;
    }

    public Map.Entry<Boolean, Integer> getEdge(List<V> path){
        //check that Edge can be cast as type int else throw exception
        int total = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            E edge = GetEdge(path.get(i), path.get(i+1));
            if (edge == null) return Map.entry(false, 0);
            total = total + (int) edge;
        }
        return Map.entry(true, total);
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
