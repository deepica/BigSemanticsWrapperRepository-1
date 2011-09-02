package ecologylab.semantics.generated.library.search;

import java.util.List;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Search.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * 
 */ 
@simpl_inherit
public class Search extends Document
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("search_result")	@mm_name("search_results")
	private List<SearchResult> searchResults;

	public Search()
	{ }

	public Search(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<SearchResult> getSearchResults()
	{
		return searchResults;
	}

	public void setSearchResults(List<SearchResult> searchResults)
	{
		this.searchResults = searchResults;
	}
}
