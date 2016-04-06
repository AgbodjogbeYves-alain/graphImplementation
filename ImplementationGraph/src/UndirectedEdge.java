public class UndirectedEdge implements Edge
{

    private int name;
    private CoupleVertex vertex;
    private Graphe g;

    UndirectedEdge(int n, Vertex v1, Vertex v2)
    {
        name = n;
        vertex.setFirst(v1);
        vertex.setSecond(v2);
    }

    public int getName()
    {
        return name;
    }

    public void setName(int s)
    {
        name = s;
    }

    public Graphe getGraph()
    {
        return g;
    }

    public CoupleVertex getVertex()
    {
        return vertex;
    }
}
