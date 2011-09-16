package ecologylab.semantics.generated.library.search;

import java.util.List;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;

/**
*  GoogleScholarSearch.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * The google Search class
 */ 
@simpl_inherit
public class GoogleScholarSearch extends Document
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("google_scholar_search_result")	@mm_name("search_results")
	private List<GoogleScholarSearchResult> searchResults;

	public GoogleScholarSearch()
	{ }

	public GoogleScholarSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<GoogleScholarSearchResult> getSearchResults()
	{
		return searchResults;
	}

	public void setSearchResults(List<GoogleScholarSearchResult> searchResults)
	{
		this.searchResults = searchResults;
	}
}
