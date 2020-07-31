package nl.famschneider.graphtools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VertexTest {
    Vertex vertex1;
    Vertex vertex2;
    @BeforeEach
    void setUp() {
        vertex1 = new Vertex();
        vertex2 = new Vertex(1,5);
    }

    @Test
    void getMaxEdges() {
        assertEquals(0,vertex1.getMaxEdges());
        assertEquals(1,vertex2.getMaxEdges());
    }

    @Test
    void setMaxEdges() {
        vertex1.setMaxEdges(77);
        assertEquals(77,vertex1.getMaxEdges());
    }

    @Test
    void getMinEdges() {
        assertEquals(0,vertex1.getMinEdges());
        assertEquals(5,vertex2.getMinEdges());
    }

    @Test
    void setMinEdges() {
        vertex1.setMinEdges(77);
        assertEquals(77,vertex1.getMinEdges());
    }
}