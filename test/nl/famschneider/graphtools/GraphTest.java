package nl.famschneider.graphtools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    Graph<Vertex,Edge> graph;
    HashSet<Vertex> vertices;
    HashSet<Edge> edges;
    Crossing vertex1 ;
    Crossing vertex2;
    Crossing vertex3;
    Connection edge1;
    Connection edge2;
    Connection edge3;

    @BeforeEach
    void setUp() {
        graph = new Graph<>();
        vertices = new HashSet<>();
        edges = new HashSet<>();
        vertex1 = new Crossing();
        vertex2 = new Crossing();
        vertex3 = new Crossing();
        vertices.add(vertex1);
        vertices.add(vertex2);
        edge1 = new Connection(vertex1,vertex2);
        edge2 = new Connection(vertex2,vertex1);
        edge3 = new Connection(vertex1,vertex3);
        edges.add(edge1);
        edges.add(edge2);
    }

    @Test
    void addVertices() {
        try {
            graph.addVertices(vertices);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        assertEquals(2,graph.getVertices().size());
        assertThrows(Exception.class,()->graph.addVertices(vertices));

    }

    @Test
    void addVertex() {
        try {
            graph.addVertices(vertices);
            graph.addVertex(vertex3);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        assertEquals(3,graph.getVertices().size());
        assertThrows(Exception.class,()->graph.addVertex(vertex3));

    }

    @Test
    void addEdges() {
        try {
            graph.addVertices(vertices);
            graph.addEdges(edges);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        assertEquals(2,graph.getEdges().size());
        edges.add(edge3);
        assertThrows(Exception.class,()->graph.addEdges(edges));
    }

    @Test
    void addEdge() {
        try {
            graph.addVertices(vertices);
            graph.addEdge(edge1);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        edges.add(edge3);
        assertThrows(Exception.class,()->graph.addEdges(edges));
    }
}
class Crossing extends Vertex{

}
class Connection extends Edge{

    public Connection(Crossing from, Crossing to) {
        super(from, to);
    }

    public Connection(Crossing from, Crossing to, double weight) {
        super(from, to, weight);
    }
}