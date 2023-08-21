package uniandes.algobc.structures;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapGeneCatalog implements GeneCatalog {
	private TreeMap<String, Gene> treeGene = new TreeMap<>();

	@Override
	public void addGene(Gene gene) {
		// TODO Auto-generated method stub
		treeGene.put(gene.getId(), gene);
	}

	@Override
	public Gene getGene(String geneId) {
		// TODO Auto-generated method stub
		return treeGene.get(geneId);
	}

	@Override
	public ArrayList<Gene> getGenes(String ontologyId) {
		// TODO Auto-generated method stub
		ArrayList<Gene> listaGen = new ArrayList<Gene>();
		for(Map.Entry<String, Gene> x:treeGene.entrySet()) {
			Gene gen = x.getValue();
			if(!gen.getOntologies().get(ontologyId).equals(null)) {
				listaGen.add(gen);
			}
			
			/*for(int i=0; i<gen.getOntologies().size();i++) {
				if(gen.getOntologies().get(i).getId().equals(ontologyId)) {
					listaGen.add(gen);
					break;
				}
			}*/
		}
		return listaGen;
		
	}

}
