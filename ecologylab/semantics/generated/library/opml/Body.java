package ecologylab.semantics.generated.library.opml;

import java.util.List;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Body.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Body extends Metadata
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("outline")	@mm_name("outline")
	private List<Outline> outline;

	public Body()
	{ }

	public Body(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Outline> getOutline()
	{
		return outline;
	}

	public void setOutline(List<Outline> outline)
	{
		this.outline = outline;
	}
}
