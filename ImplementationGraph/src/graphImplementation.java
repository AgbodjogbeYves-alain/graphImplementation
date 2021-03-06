

public class graphImplementation implements Graphe {

	public Vertex[] tabvertex = new Vertex[100];
	public Edge[] tabEdge = new Edge[100];
	
	/**
	 * Constructor for the graph
	 */
	public graphImplementation(){
		int i=0;
		for (i=0;i<this.tabvertex.length;i++)
		{
			this.tabvertex[i] = null;
		}
		
		for (i=0;i<this.tabEdge.length;i++)
		{
			this.tabEdge[i] = null;
		}
	}
	
	/**
	 * Function for add an Edge in the graph: an undirected edge
	 */
	@Override
	public void addEdge(Vertex arg0, Vertex arg1) { //J'estime qu'il s'agit d'un ajout de UndirectedEdge
		UndirectedEdge e = new UndirectedEdge(-1, arg0, arg1);
		int i = 0;
		boolean insere = false;
		while(i<tabEdge.length && insere==false){
				if (this.tabEdge[i] == null){
					this.tabEdge[i]= e;
					e.setName(i);
					insere = true;
				
			}
			i++;
		}
		if (insere  == true){
			arg0.addNeighbour(arg1);
			arg1.addNeighbour(arg0);
		}
		else {
			System.out.println("Max Edge atteint impossible de rajoutr de liaison Edge");
		}
		
		
		
	}
	
	/**
	 * Function for add a vertex in the graph
	 */
	@Override
	public void addVertex(Vertex arg0) {
		int i = 0;
		boolean insere = false;
		while(i<tabvertex.length && insere==false){	
			if (this.tabvertex[i] == null){
				this.tabvertex[i]= arg0;
				insere = true;
			}	
			i++;
		}
		if (insere  == false){
			System.out.println("Tableau de vertex plein" );
		}
	}

	@Override
	/**
	 * Function for control if the graph is empty or not
	 */
	public boolean isEmpty() {
		if(this.tabvertex == null && this.tabEdge == null){
			return true;
		}
		else {return false;}
		
	}

	@Override
	/**
	 * Function for remove an undirected edge
	 */
	public void removeEdge(int arg0) {
		int x;
		for (x=0;x<10;x++){
			if (tabEdge[x].getName()== arg0)
			{
					tabEdge[x].getVertex().getFirst().removeNeighbour(tabEdge[x].getVertex().getSecond().getNumVertex());;
					tabEdge[x].getVertex().getSecond().removeNeighbour(tabEdge[x].getVertex().getFirst().getNumVertex());
					tabEdge[x] = null;
				}
			
			
		}
		
	}

	/**
	 * Function for test if an vertex is in the graph
	 * @param arg0 num Vertex
	 * @return boolean
	 */
	public boolean isIn(int arg0){
		boolean res = false;
		int i=0;
		while ( !res && i< this.tabvertex.length ){
			if (this.tabvertex[i].getNumVertex() == arg0){
				res = true;
			}
			
		}
		return res;
		
	}
	@Override
	/**
	 * Function for remove a vertex from the graph
	 */
	public void removeVertex(int arg0) {
		Vertex v1 = null;
		if (isIn(arg0)==true){
			boolean trouve = false;
			int i=0;
			while ( !trouve && i< this.tabvertex.length ){
				if (this.tabvertex[i].getNumVertex() == arg0){
					trouve = true;
					v1=this.tabvertex[i];
				}
			}
			Vertex v2;
			
			for (int j=0; j<v1.getNeighbours().length; j++){
				v2=v1.getNeighbours()[j];
				for (int k=0; k<v2.getNeighbours().length; k++){
					if (v2.getNeighbours()[k]==v1){
						v2.getNeighbours()[k]=null;
					}
				}
			}
			int y=0;
			CoupleVertex v3 = new CoupleVertex(null, null);
			for (y=0; y<tabEdge.length; y++){
				v3= tabEdge[y].getVertex();
				if (v3.first==v1 || v3.second==v1){
					removeEdge(tabEdge[y].getName());
				}
			}
		this.tabvertex[i]=null;
		}
		else {
				System.out.println("Le sommet n'existe pas il n'y a pas de raison de le supprimer");
			}
			
			
	}
	
	/**
	 * Function for fiind the tab of vertex of the graph
	 * @return
	 */
	public Vertex[] gettabvertex(){
		return this.tabvertex;
	}
	
	/**
	 * Function for get the edge in the graph
	 * @return Tab of edge
	 */
	public Edge[] gettabEdge(){
		return this.tabEdge;
	}

}
