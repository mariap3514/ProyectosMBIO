package uniandes.algobc.structures;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListGeneCatalog implements GeneCatalog {
	private ArrayList<Gene> genes = new ArrayList<>();
	/**
	 * Adds a gene to the catalog
	 * @param gene Data of the new gene
	 */
	@Override
	public void addGene(Gene gene) {
		//TODO: Implement method
		genes.add(gene);
		
		
	}

	/**
	 * Finds a gene given the id
	 * @param geneId Id of the gene to search
	 * @return Gene object with the gene information or null if it is not found
	 */
	@Override
	public Gene getGene(String geneId) {
		//TODO: Implement method
		Gene gen = null;
		for(int i=0; i<genes.size();i++) {
			if(genes.get(i).getId().equals(geneId)) {
				gen = genes.get(i);
				break;
			}
		}
		return gen;
	}

	/**
	 * Finds the genes associated with the given ontology term
	 * @param ontologyId Id of the ontology to search
	 * @return ArrayList<Gene> Listo of genes associated with the given ontology 
	 */
	@Override
	public ArrayList<Gene> getGenes(String ontologyId) {
		//TODO: Implement method
		ArrayList<Gene> listaGen = new ArrayList<Gene>();
		//ArrayList<Ontology> listaOntology = null; ArrayList correspondiente a la lista de ontologías, usado en el punto 2.
		HashMap<String,Ontology> listaOntology = null;
		
		//Método implementado en el punto 6:
		
		//Recorre ArrayList de genes
		for(int i=0; i<genes.size();i++) {
			listaOntology = genes.get(i).getOntologies();
			if(!listaOntology.get(ontologyId).equals(null)) {
				listaGen.add(genes.get(i));
			}
		}
		
		/*
		 * Método implementado en el punto 2:
		 * 
		for(int i=0; i<genes.size();i++) {
			listaOntology = genes.get(i).getOntologies();
			//Recorre ArrayList de ontologías del gen actual
			for (int j=0; j<listaOntology.size();j++) {
				if(listaOntology.get(j).getId().equals(ontologyId)) {
					listaGen.add(genes.get(i));
				}
			}
		}*/
		return listaGen;
	}

}
