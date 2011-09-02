package ecologylab.semantics.generated.library.urbanspoon;

import java.util.List;

import ecologylab.semantics.generated.library.search.Search;
import ecologylab.semantics.generated.library.search.SearchResult;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  UrbanSpoonGenre.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * UrbanSpoon Search Class
 */ 
@simpl_inherit
public class UrbanSpoonGenre extends Search
{
	/** 
	 */ 
	@simpl_collection("search_result")	@mm_name("top_results")
	private List<SearchResult> topResults;

	public UrbanSpoonGenre()
	{ }

	public UrbanSpoonGenre(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<SearchResult> getTopResults()
	{
		return topResults;
	}

	public void setTopResults(List<SearchResult> topResults)
	{
		this.topResults = topResults;
	}
}
