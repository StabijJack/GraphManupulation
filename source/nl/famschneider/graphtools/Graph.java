package nl.famschneider.graphtools;

import java.util.HashSet;

public class Graph<V extends Vertex, E extends Edge> {
    private final HashSet<V> vertices;
    private final HashSet<E> edges;

    public Graph() {
        this.vertices = new HashSet<>();
        this.edges = new HashSet<>();
    }

    public HashSet<V> getVertices() {
        return vertices;
    }

    public HashSet<E> getEdges() {
        return edges;
    }

    public void addVertices(HashSet<V> vertices) throws Exception {
        for (V vertex : vertices) {
            addVertex(vertex);
        }
    }

    public void addVertex(V vertex) throws Exception {
        if (vertices.contains(vertex)) throw new Exception("Vertex " + vertex + " already on Graph");
        vertices.add(vertex);
    }

    public void addEdges(HashSet<E> edges) throws Exception {
        for (E edge : edges) {
            addEdge(edge);
        }
    }

    @SuppressWarnings("SuspiciousMethodCalls")
    public void addEdge(E edge) throws Exception {
        Vertex from = edge.getFrom();
        if (!vertices.contains(from)) throw new Exception("From Vertex" + from + "not in Graph");
        Vertex to = edge.getTo();
        if (!vertices.contains(to)) throw new Exception("To Vertex" + to + "not in Graph");
        edges.add(edge);
    }


}

