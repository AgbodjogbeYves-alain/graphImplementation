
public class Vertex
{

    private int number;
    private Vertex[] neighbours;
    private Graphe g;

    public Vertex(int i, Vertex[] avertex)
    {
        number = i;
        neighbours = avertex;
    }

    public Vertex()
    {
        number = (int)Math.random();
        neighbours = null;
    }

    int getNumVertex()
    {
        return number;
    }

    Vertex[] getNeighbours()
    {
        return neighbours;
    }

    Graphe getGraph()
    {
        return g;
    }

    void addNeighbour(Vertex vertex1)
    {
    	for (int i=0; i<this.neighbours.length; i++){
    		if (this.neighbours[i]==null){
    			this.neighbours[i]=vertex1;
    		}
    	}
    	
    	for (int j=0; j<this.neighbours.length; j++){
    		if (vertex1.neighbours[j]==null){
    			vertex1.neighbours[j]=this;
    		}
    	}
    }

    void removeNeighbour(int i)
    {
    }
}