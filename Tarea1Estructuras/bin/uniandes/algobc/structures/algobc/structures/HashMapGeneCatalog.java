package uniandes.algobc.structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
		ArrayList<Gene> listaGen = new ArrayList<Gene>();
		for(Map.Entry<String, Gene> x:hashGenes.entrySet()) {
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
