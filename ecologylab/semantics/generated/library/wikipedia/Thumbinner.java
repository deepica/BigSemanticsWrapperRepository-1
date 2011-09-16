package ecologylab.semantics.generated.library.wikipedia;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Thumbinner.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Thumbinner extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString thumbImgCaption;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL thumbImgSrc;

	public Thumbinner()
	{ }

	public Thumbinner(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	thumbImgCaption()
	{
		MetadataString	result = this.thumbImgCaption;
		if (result == null)
		{
			result = new MetadataString();
			this.thumbImgCaption = result;
		}
		return result;
	}

	public String getThumbImgCaption()
	{
		return this.thumbImgCaption == null ? null : thumbImgCaption().getValue();
	}

	public MetadataString getThumbImgCaptionMetadata()
	{
		return thumbImgCaption;
	}

	public void setThumbImgCaption(String thumbImgCaption)
	{
		if (thumbImgCaption != null)
			this.thumbImgCaption().setValue(thumbImgCaption);
	}

	public void setThumbImgCaptionMetadata(MetadataString thumbImgCaption)
	{
		this.thumbImgCaption = thumbImgCaption;
	}

	public MetadataParsedURL	thumbImgSrc()
	{
		MetadataParsedURL	result = this.thumbImgSrc;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.thumbImgSrc = result;
		}
		return result;
	}

	public ParsedURL getThumbImgSrc()
	{
		return this.thumbImgSrc == null ? null : thumbImgSrc().getValue();
	}

	public MetadataParsedURL getThumbImgSrcMetadata()
	{
		return thumbImgSrc;
	}

	public void setThumbImgSrc(ParsedURL thumbImgSrc)
	{
		if (thumbImgSrc != null)
			this.thumbImgSrc().setValue(thumbImgSrc);
	}

	public void setThumbImgSrcMetadata(MetadataParsedURL thumbImgSrc)
	{
		this.thumbImgSrc = thumbImgSrc;
	}
}
