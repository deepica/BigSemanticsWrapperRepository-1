package ecologylab.semantics.generated.library.flickr;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.flickr.FlickrLink;
import ecologylab.semantics.generated.library.search.Search;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Used for flickr search results
 */ 
@simpl_inherit
public class FlickrTagsInteresting extends Search
{
	/** 
	 *Collection of all images of a user
	 */ 
	@simpl_collection("flickr_link")
	@mm_name("flickr_link_set")
	private List<FlickrLink> flickrLinkSet;

	public FlickrTagsInteresting()
	{ super(); }

	public FlickrTagsInteresting(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrLink> getFlickrLinkSet()
	{
		return flickrLinkSet;
	}

  // lazy evaluation:
  public List<FlickrLink> flickrLinkSet()
  {
    if (flickrLinkSet == null)
      flickrLinkSet = new ArrayList<FlickrLink>();
    return flickrLinkSet;
  }

  // addTo:
  public void addToFlickrLinkSet(FlickrLink element)
  {
    flickrLinkSet().add(element);
  }

  // size:
  public int flickrLinkSetSize()
  {
    return flickrLinkSet == null ? 0 : flickrLinkSet.size();
  }

	public void setFlickrLinkSet(List<FlickrLink> flickrLinkSet)
	{
		this.flickrLinkSet = flickrLinkSet;
	}
}
