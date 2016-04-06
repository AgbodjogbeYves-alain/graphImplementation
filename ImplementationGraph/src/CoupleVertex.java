public class CoupleVertex
{

    Vertex first;
    Vertex second;

    public CoupleVertex(Vertex v1, Vertex v2)
    {
        first = v1;
        second = v2;
    }

    public Vertex getFirst()
    {
        return first;
    }

    public Vertex getSecond()
    {
        return second;
    }

    public void setFirst(Vertex v)
    {
        first = v;
    }

    public void setSecond(Vertex v)
    {
        second = v;
    }
}

