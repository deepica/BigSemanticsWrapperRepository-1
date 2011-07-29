package ecologylab.semantics.generated.library.nsdl;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineHeaderInNsdlDocument.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineHeaderInNsdlDocument extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("resourceIdentifier")	private ecologylab.semantics.metadata.scalar.MetadataParsedURL resourceIdentifier;

	public MmdInlineHeaderInNsdlDocument()
	{ }

	public MmdInlineHeaderInNsdlDocument(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	resourceIdentifier()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.resourceIdentifier;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.resourceIdentifier = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getResourceIdentifier()
	{
		return this.resourceIdentifier == null ? null : resourceIdentifier().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getResourceIdentifierMetadata()
	{
		return resourceIdentifier;
	}

	public void setResourceIdentifier(ecologylab.net.ParsedURL resourceIdentifier)
	{
		if (resourceIdentifier != null)
			this.resourceIdentifier().setValue(resourceIdentifier);
	}

	public void setResourceIdentifierMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL resourceIdentifier)
	{
		this.resourceIdentifier = resourceIdentifier;
	}
}
