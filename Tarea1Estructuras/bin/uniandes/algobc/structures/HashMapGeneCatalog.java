package uniandes.algobc.structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapGeneCatalog implements GeneCatalog {
	//
	private HashMap<String,Gene> hashGenes = new HashMap<>();
	private HashMap<String,HashMap<String, Gene>> hashOntologies = new HashMap<>();

	@Override
	public void addGene(Gene gene) {
		// TODO Auto-generated method stub
		hashGenes.put(gene.getId(), gene);
		for(Map.Entry<String, Ontology> entry:gene.getOntologies().entrySet()) {
			HashMap<String, Gene> hashG = hashOntologies.get(entry.getKey());
			hashG.put(gene.getId(), gene);
			hashOntologies.put(entry.getKey(), hashG);
		}
	}

	@Override
	public Gene getGene(String geneId) {
		// TODO Auto-generated method stub
		return hashGenes.get(geneId);
		
	}

	@Override
	public ArrayList<Gene> getGenes(String ontologyId) {
		// TODO Auto-generated method stub
		
		//Método implementado en el punto 7:
		ArrayList<Gene> listaGen = new ArrayList<Gene>();
		if (!hashOntologies.get(ontologyId).equals(null)) {
			listaGen = new ArrayList<>(hashOntologies.get(ontologyId).values());
		}
		
		/*
		 * Método implementado en el punto 6:
		 * 
		 * for(Map.Entry<String, Gene> x:hashGenes.entrySet()) {
			Gene gen = x.getValue();
			if(!gen.getOntologies().get(ontologyId).equals(null)) {
				listaGen.add(gen);
			}*/
			
		/*
		 * Método implementado en el punto 4:
		 * 
		for(Map.Entry<String, Gene> x:hashGenes.entrySet()) {
			Gene gen = x.getValue();
			for(int i=0; i<gen.getOntologies().size();i++) {
				if(gen.getOntologies().get(i).getId().equals(ontologyId)) {
					listaGen.add(gen);
					break;
				}
			}
		}*/
		
		return listaGen;
	}
}
