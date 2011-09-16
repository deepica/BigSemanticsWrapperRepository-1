package ecologylab.semantics.generated.library.slashdot;

import java.util.List;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  SlashdotArticle.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class SlashdotArticle extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString poster;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL posterUrl;

	/** 
	 */ 
	@simpl_collection("anchor")	@mm_name("anchors")
	private List<Anchor> anchors;

	public SlashdotArticle()
	{ }

	public SlashdotArticle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	poster()
	{
		MetadataString	result = this.poster;
		if (result == null)
		{
			result = new MetadataString();
			this.poster = result;
		}
		return result;
	}

	public String getPoster()
	{
		return this.poster == null ? null : poster().getValue();
	}

	public MetadataString getPosterMetadata()
	{
		return poster;
	}

	public void setPoster(String poster)
	{
		if (poster != null)
			this.poster().setValue(poster);
	}

	public void setPosterMetadata(MetadataString poster)
	{
		this.poster = poster;
	}

	public MetadataParsedURL	posterUrl()
	{
		MetadataParsedURL	result = this.posterUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.posterUrl = result;
		}
		return result;
	}

	public ParsedURL getPosterUrl()
	{
		return this.posterUrl == null ? null : posterUrl().getValue();
	}

	public MetadataParsedURL getPosterUrlMetadata()
	{
		return posterUrl;
	}

	public void setPosterUrl(ParsedURL posterUrl)
	{
		if (posterUrl != null)
			this.posterUrl().setValue(posterUrl);
	}

	public void setPosterUrlMetadata(MetadataParsedURL posterUrl)
	{
		this.posterUrl = posterUrl;
	}

	public List<Anchor> getAnchors()
	{
		return anchors;
	}

	public void setAnchors(List<Anchor> anchors)
	{
		this.anchors = anchors;
	}
}
