package ecologylab.semantics.generated.library.search;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  BingImageSearchResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Bing image search result.
 */ 
@simpl_inherit
public class BingImageSearchResult extends ImageInSearchResult
{
	/** 
	 */ 
	@simpl_composite	@xml_tag("mms:Thumbnail") @mm_name("thumbnail")	private ImageInSearchResult thumbnail;

	public BingImageSearchResult()
	{ }

	public BingImageSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ImageInSearchResult getThumbnail()
	{
		return thumbnail;
	}

	public void setThumbnail(ImageInSearchResult thumbnail)
	{
		this.thumbnail = thumbnail;
	}
}
