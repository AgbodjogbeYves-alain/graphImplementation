
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
        for (int i=0;i<this.neighbours.length;i++)
		{
			this.neighbours[i] = null;
		}
        
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
    	int i=0;
    	boolean insere = false;
		while( i<this.neighbours.length && !insere){
    		if (this.neighbours[i]==null){
    			this.neighbours[i]=vertex1;
    			insere = true;
    		}
    		i++;
    	}
		
		int j=0;
		insere = false;
    	while (j<this.neighbours.length && !insere){
    		if (vertex1.neighbours[j]==null){
    			vertex1.neighbours[j]=this;
    			insere=true;
    		}
    		j++;
    	}
    }

    void removeNeighbour(int i)
    {
    }
}