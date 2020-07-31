package nl.famschneider.graphtools;

public class Vertex {
    private int maxEdges;
    private int minEdges;

    public Vertex() {
        this(0,0);
    }

    public Vertex(int maxEdges, int minEdges) {
        this.maxEdges = maxEdges;
        this.minEdges = minEdges;
    }

    public int getMaxEdges() {
        return maxEdges;
    }

    public void setMaxEdges(int maxEdges) {
        this.maxEdges = maxEdges;
    }

    public int getMinEdges() {
        return minEdges;
    }

    public void setMinEdges(int minEdges) {
        this.minEdges = minEdges;
    }
}
