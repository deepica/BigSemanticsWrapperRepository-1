package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class FlickrNearbySearchResult extends Document
{
	@simpl_scalar
	private MetadataParsedURL linkOther;

	public FlickrNearbySearchResult()
	{ super(); }

	public FlickrNearbySearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	linkOther()
	{
		MetadataParsedURL	result = this.linkOther;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.linkOther = result;
		}
		return result;
	}

	public ParsedURL getLinkOther()
	{
		return this.linkOther == null ? null : linkOther().getValue();
	}

	public MetadataParsedURL getLinkOtherMetadata()
	{
		return linkOther;
	}

	public void setLinkOther(ParsedURL linkOther)
	{
		if (linkOther != null)
			this.linkOther().setValue(linkOther);
	}

	public void setLinkOtherMetadata(MetadataParsedURL linkOther)
	{
		this.linkOther = linkOther;
	}
}
