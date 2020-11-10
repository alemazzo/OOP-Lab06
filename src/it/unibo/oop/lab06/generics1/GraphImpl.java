package it.unibo.oop.lab06.generics1;

import java.util.*;



public class GraphImpl<N> implements Graph<N> {

	private Set<N> nodes;
	private Map<N, List<N>> edges;
	
	public GraphImpl() {
		nodes = new HashSet<>();
		edges = new HashMap<>();
	}
	
	@Override
	public void addNode(N node) {
		this.nodes.add(node);
		
	}

	@Override
	public void addEdge(N source, N target) {
		if(this.nodes.contains(source) && this.nodes.contains(target)) {
			if(this.edges.get(source) == null) {
				this.edges.put(source, new ArrayList<N>());
			}
			if(this.edges.get(target) == null) {
				this.edges.put(target, new ArrayList<N>());
			}
			this.edges.get(source).add(target);
		}
	}

	@Override
	public Set<N> nodeSet() {
		return Set.copyOf(this.nodes);
	}

	@Override
	public Set<N> linkedNodes(N node) {
		return Set.copyOf(this.edges.get(node));
	}

	@Override
	public List<N> getPath(N source, N target) {
		// TODO Auto-generated method stub
		return null;
	}

}
