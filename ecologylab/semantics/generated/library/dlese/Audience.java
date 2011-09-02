package ecologylab.semantics.generated.library.dlese;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Audience.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Audience extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("gradeRange")	
	private MetadataString gradeRange;

	public Audience()
	{ }

	public Audience(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	gradeRange()
	{
		MetadataString	result = this.gradeRange;
		if (result == null)
		{
			result = new MetadataString();
			this.gradeRange = result;
		}
		return result;
	}

	public String getGradeRange()
	{
		return this.gradeRange == null ? null : gradeRange().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getGradeRangeMetadata()
	{
		return gradeRange;
	}

	public void setGradeRange(String gradeRange)
	{
		if (gradeRange != null)
			this.gradeRange().setValue(gradeRange);
	}

	public void setGradeRangeMetadata(ecologylab.semantics.metadata.scalar.MetadataString gradeRange)
	{
		this.gradeRange = gradeRange;
	}
}
