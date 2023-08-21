package uniandes.algobc.structures;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapGeneCatalog implements GeneCatalog {
	//
	private HashMap<String,Gene> hashGenes = new HashMap<>();

	@Override
	public void addGene(Gene gene) {
		// TODO Auto-generated method stub
		hashGenes.put(gene.getId(), gene);
	}

	@Override
	public Gene getGene(String geneId) {
		// TODO Auto-generated method stub
		return hashGenes.get(geneId);
	}

	@Override
	public ArrayList<Gene> getGenes(String ontologyId) {
		// TODO Auto-generated method stub
		return new ArrayList <> (hashGenes.values());	
	}
}
