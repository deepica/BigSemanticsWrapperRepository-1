package ecologylab.semantics.generated.library.dlese;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.generated.library.dlese.DleseRecord1;
import ecologylab.semantics.generated.library.dlese.ResultInfo;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  SearchSection.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/10/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class SearchSection extends Metadata
{
	/** 
	 */ 
	@simpl_composite	@xml_tag("resultInfo") @mm_name("result_info")	private ResultInfo resultInfo;

	/** 
	 */ 
	@simpl_collection("record")	@xml_tag("results") @mm_name("search_results")	private List<DleseRecord1> searchResults;

	public SearchSection()
	{ }

	public SearchSection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ResultInfo getResultInfo()
	{
		return resultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo)
	{
		this.resultInfo = resultInfo;
	}

	public List<DleseRecord1> getSearchResults()
	{
		return searchResults;
	}

	public void setSearchResults(List<DleseRecord1> searchResults)
	{
		this.searchResults = searchResults;
	}
}