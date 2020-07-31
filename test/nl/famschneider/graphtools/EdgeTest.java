package nl.famschneider.graphtools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class EdgeTest {
    Edge edge1;
    Edge edge2;
    Vertex from;
    Vertex to;
    @BeforeEach
    void setUp() {
        from = new Vertex();
        to = new Vertex();
        edge1 = new Edge(from,to);
        edge2 = new Edge(from,to,10.99);
    }

    @Test
    void getFrom() {
        assertEquals(from,edge1.getFrom());
        assertEquals(from,edge2.getFrom());
    }

    @Test
    void getTo() {
        assertEquals(to,edge1.getTo());
        assertEquals(to,edge2.getTo());
    }

    @Test
    void getWeight() {
        assertEquals(0,edge1.getWeight());
        assertEquals(10.99,edge2.getWeight());
    }

    @Test
    void setWeight() {
        edge1.setWeight(44.44);
        assertEquals(44.44,edge1.getWeight());
    }
}