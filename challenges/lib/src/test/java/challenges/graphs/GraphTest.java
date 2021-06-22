package challenges.graphs;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GraphTest {
    static Graph<String, Integer> graph = new Graph<>();

    @Before
    public void prep(){
        try {
            graph.addVertex("James");
            graph.addVertex("Matthew");
            graph.addVertex("Amelia");
            graph.addVertex("Ed");
        } catch (Exception e) {
            e.printStackTrace();
        }
        graph.addEdge(5, "James", "Matthew", false);
        graph.addEdge(5, "James", "Amelia", false);
        graph.addEdge(5, "James", "Ed", false);
    }

    @Test
    public void graphTest() throws Exception {
        assertEquals(
                "Graph{vertexes=[James, Matthew, Amelia, Ed], matrix=[[null, 5, 5, 5], [5, null, null, null], [5, null, null, null], [5, null, null, null]]}",
                graph.toString()
        );
        assertEquals(
                "[James, Matthew, Amelia, Ed]",
                graph.getVertexes().toString()
        );
        assertEquals(
                4,
                graph.Size()
        );
        assertEquals(
                "[James]",
                graph.GetNeighbors("Ed").toString()
        );
        assertEquals(
                "[Amelia, Matthew, Ed]",
                graph.GetNeighbors("James").toString()
        );
        assertEquals(
                "{[Matthew, James]=5, [James, Amelia]=5, [Ed, James]=5, [James, Matthew]=5, [James, Ed]=5, [Amelia, James]=5}",
                graph.GetNeighborsDetails("James").toString()
        );
        assertEquals(
                "[James, Matthew, Amelia, Ed]",
                graph.breadthFirst("James").toString()
        );

        assertEquals(
                "[Ed, James, Matthew, Amelia]",
                graph.breadthFirst("Ed").toString()
        );
        List<String> result = new ArrayList<>();
        result.add("Ed");
        result.add("James");
        result.add("Matthew");
        assertEquals(
                Map.entry(true, 10),
                graph.getEdge(result)
        );
        result.add("Ed");
        assertEquals(
                Map.entry(false, 0),
                graph.getEdge(result)
        );

        assertEquals(
                "[Ed, James, Amelia, Matthew]",
                graph.depthFirst("Ed").toString()
        );
        graph.addVertex("Lindsey");
        graph.addEdge(50,"Lindsey", "Amelia", false);
        graph.addEdge(50,"Ed", "Lindsey", false);
        assertEquals(
                "[Ed, Lindsey, Amelia, James, Matthew]",
                graph.depthFirst("Ed").toString()
        );
    }
}