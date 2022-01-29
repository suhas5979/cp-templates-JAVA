package templates;

public class DSU {
	int parent[];
	int rank[];

	void union(int u, int v, int rank[], int parent[]) {
		u = findParent(u, parent);
		v = findParent(v, parent);
		if (rank[u] > rank[v]) {
			parent[v] = u;
		} else if (rank[u] < rank[v]) {
			parent[u] = v;
		} else {
			parent[v] = u;
			rank[u]++;
		}
	}

	int findParent(int v, int parent[]) {
		if (v == parent[v])
			return v;
		return parent[v] = findParent(parent[v], parent);
	}
}
