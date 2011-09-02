package ecologylab.semantics.generated.library.flickr;

import java.util.List;

import ecologylab.semantics.generated.library.search.Search;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  FlickrGroups.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Searching from a photo for nearby photos
 */ 
@simpl_inherit
public class FlickrGroups extends Search
{
	/** 
	 */ 
	@simpl_collection("flickr_tag")	@mm_name("flickr_tags")
	private List<FlickrTag> flickrTags;

	public FlickrGroups()
	{ }

	public FlickrGroups(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrTag> getFlickrTags()
	{
		return flickrTags;
	}

	public void setFlickrTags(List<FlickrTag> flickrTags)
	{
		this.flickrTags = flickrTags;
	}
}
