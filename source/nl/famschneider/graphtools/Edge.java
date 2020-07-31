package nl.famschneider.graphtools;

public class Edge {
    private final Vertex from;
    private final Vertex to;
    private double weight;

    public Edge(Vertex from, Vertex to) {
        this(from, to, 0);
    }

    public Edge(Vertex from, Vertex to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public Vertex getFrom() {
        return from;
    }

    public Vertex getTo() {
        return to;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
