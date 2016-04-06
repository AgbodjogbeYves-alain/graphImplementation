import java.util.Scanner;

public class TestImpl {
	public static void main(String[] args) {
		/*graphImplementation g = new graphImplementation();
		int j = 0;
		System.out.println("Combien de vertex voulez vous ajouter au graphe?");
		Scanner sc7 = new Scanner(System.in);
		int s = sc7.nextInt();
		Vertex[] tabvertex1 = new Vertex[s];
		Vertex[] v1 = null;
		while (j< s){
			System.out.println("Entrez un identifiant(int) pour le vertex "+ j);
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			tabvertex1[j] = new Vertex(x,null);
			j++;
		}
		int k = 0;
		while (k<s){
			g.addVertex(tabvertex1[k]);
			k++;
		}
		
		//Lier 2 vertex
		System.out.println("Voulez vous liez 2 vertex? entrez 1");
		Scanner sc6 = new Scanner(System.in);
		int a = sc6.nextInt();
		while(a == 1){
			System.out.println("Donnez l'identifiant du premier vertex a relier");
			Scanner sc5 = new Scanner(System.in);
			int p = sc5.nextInt();
			System.out.println("Donnez l'identifiant du second vertex a relier");
			sc5 = new Scanner(System.in);
			int o = sc5.nextInt();
			int m=0;
			boolean trouve = false;
			while(m<tabvertex1.length && !trouve){
				if (tabvertex1[m].getNumVertex() == p) {
					trouve=true;
				}
				m++;
			}
			int n=0;
			boolean trouve2 = false;
			while(n<tabvertex1.length && !trouve2){
				if (tabvertex1[n].getNumVertex() == o) {
					trouve2=true;
				}
				n++;
			}
			g.addEdge(tabvertex1[m-1],tabvertex1[n-1]);
			System.out.println("Voulez vous liez 2 autres vertex? entrez 1");
			sc6 = new Scanner(System.in);
			a = sc6.nextInt();
		}
		
		//Trouver les voisins d'un vertex
		System.out.println("Voulez vous connaitre les voisins d'un sommet? tapez 1");
		Scanner sc4 = new Scanner(System.in);
		int rep = sc4.nextInt();
		while(rep==1){
			System.out.println("Entrez le numero de vertex deja present dans le graphe pour avoir ses voisins");
			Scanner sc3 = new Scanner(System.in);
			int z = sc3.nextInt();
			int c = 0;
			while(c<g.gettabvertex().length){
				if (g.gettabvertex()[c].getNumVertex()==z){
					v1 = g.gettabvertex()[c].getNeighbours(); 	
				}
				c++;
			}
			System.out.println("Les vertex auquel v1 est lié ont les identifiants suivants/n " );
			int i=0;
			while(i<v1.length){
				System.out.println(v1[i].getNumVertex());
				i++;
			}
		System.out.println("Voulez vous connaitre les voisins d'un sommet? tapez yes");
		sc4 = new Scanner(System.in);
		rep = sc4.nextInt();
		}*/
		graphImplementation g = new graphImplementation();
		Vertex v1 = new Vertex(1,null);
		Vertex v2 = new Vertex(2,null);
		Vertex v3 = new Vertex(3,null);
		Vertex v4 = new Vertex(4,null);
		g.addVertex(v1);
		g.addVertex(v2);
		g.addVertex(v3);
		g.addVertex(v4);
		g.addEdge(v1, v2);
		g.addEdge(v3, v4);
		
		for(int i=0;i<g.gettabvertex().length;i++){
			System.out.println("Les voisin du vertex v"+i+" sont" );
			for (int j=0;j<g.gettabvertex()[i].getNeighbours().length;j++){
				int x = g.gettabvertex()[i].getNeighbours()[j].getNumVertex();
				System.out.println(" v"+x);
			}
			
		}
	}
	
}


