package ecologylab.semantics.generated.library.slashdot;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Anchor.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Anchor extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString anchorText;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL link;

	public Anchor()
	{ }

	public Anchor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	anchorText()
	{
		MetadataString	result = this.anchorText;
		if (result == null)
		{
			result = new MetadataString();
			this.anchorText = result;
		}
		return result;
	}

	public String getAnchorText()
	{
		return this.anchorText == null ? null : anchorText().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAnchorTextMetadata()
	{
		return anchorText;
	}

	public void setAnchorText(String anchorText)
	{
		if (anchorText != null)
			this.anchorText().setValue(anchorText);
	}

	public void setAnchorTextMetadata(ecologylab.semantics.metadata.scalar.MetadataString anchorText)
	{
		this.anchorText = anchorText;
	}

	public MetadataParsedURL	link()
	{
		MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ParsedURL getLink()
	{
		return this.link == null ? null : link().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL link)
	{
		this.link = link;
	}
}
