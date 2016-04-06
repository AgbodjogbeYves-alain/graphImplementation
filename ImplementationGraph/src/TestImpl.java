import java.util.Scanner;

public class TestImpl {
	public static void main(String[] args) {
		Vertex[] tab1 = new Vertex[100];
		Vertex[] tab2 = new Vertex[100];
		Vertex[] tab3 = new Vertex[100];
		Vertex[] tab4 = new Vertex[100];
		graphImplementation g = new graphImplementation();
		Vertex v1 = new Vertex(1,tab1);
		Vertex v2 = new Vertex(2,tab2);
		Vertex v3 = new Vertex(3,tab3);
		Vertex v4 = new Vertex(4,tab4);
		g.addVertex(v1);
		System.out.println("Le vertex v1 a ete ajouter" );
		g.addVertex(v2);
		System.out.println("Le vertex v2 a ete ajouter" );
		g.addVertex(v3);
		System.out.println("Le vertex v3 a ete ajouter" );
		g.addVertex(v4);
		System.out.println("Le vertex v4 a ete ajouter" );
		g.addEdge(v1, v2);
		System.out.println("v1 et v2 sont lies" );
		g.addEdge(v3, v4);
		System.out.println("v2 et v4 sont lies" );

		int i=0;
		while(g.gettabvertex()[i]!=null){
			int y = i+1;
			System.out.println("");
			System.out.println("Les voisin du vertex v"+y+" sont" );
			int j=0;
			Vertex[] t = g.gettabvertex();
			
				while(t[i].getNeighbours()[j]!=null){
					int x = t[i].getNeighbours()[j].getNumVertex();
						System.out.print("v"+x);
					}
					j++;
				}
			i++;
		}
}
	
	



