package ecologylab.semantics.generated.library.bibManaging;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.search.SearchResult;

/**
*  CiteseerxSearchResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class CiteseerxSearchResult extends SearchResult
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString citationInfo;

	public CiteseerxSearchResult()
	{ }

	public CiteseerxSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	citationInfo()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.citationInfo;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.citationInfo = result;
		}
		return result;
	}

	public java.lang.String getCitationInfo()
	{
		return this.citationInfo == null ? null : citationInfo().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCitationInfoMetadata()
	{
		return citationInfo;
	}

	public void setCitationInfo(java.lang.String citationInfo)
	{
		if (citationInfo != null)
			this.citationInfo().setValue(citationInfo);
	}

	public void setCitationInfoMetadata(ecologylab.semantics.metadata.scalar.MetadataString citationInfo)
	{
		this.citationInfo = citationInfo;
	}
}
