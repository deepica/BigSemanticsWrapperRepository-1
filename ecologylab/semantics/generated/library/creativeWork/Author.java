package ecologylab.semantics.generated.library.creativeWork;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Author.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * An author of an article or creative work.
 */ 
@simpl_inherit
public class Author extends Document
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString affiliation;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString city;

	public Author()
	{ }

	public Author(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	affiliation()
	{
		MetadataString	result = this.affiliation;
		if (result == null)
		{
			result = new MetadataString();
			this.affiliation = result;
		}
		return result;
	}

	public String getAffiliation()
	{
		return this.affiliation == null ? null : affiliation().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAffiliationMetadata()
	{
		return affiliation;
	}

	public void setAffiliation(String affiliation)
	{
		if (affiliation != null)
			this.affiliation().setValue(affiliation);
	}

	public void setAffiliationMetadata(ecologylab.semantics.metadata.scalar.MetadataString affiliation)
	{
		this.affiliation = affiliation;
	}

	public MetadataString	city()
	{
		MetadataString	result = this.city;
		if (result == null)
		{
			result = new MetadataString();
			this.city = result;
		}
		return result;
	}

	public String getCity()
	{
		return this.city == null ? null : city().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCityMetadata()
	{
		return city;
	}

	public void setCity(String city)
	{
		if (city != null)
			this.city().setValue(city);
	}

	public void setCityMetadata(ecologylab.semantics.metadata.scalar.MetadataString city)
	{
		this.city = city;
	}
}
