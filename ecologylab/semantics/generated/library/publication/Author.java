package ecologylab.semantics.generated.library.publication;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Author.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * An author of an article or creative work.
 */ 
@simpl_inherit
public class Author extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private ecologylab.semantics.metadata.scalar.MetadataString name;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString affiliation;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString city;

	public Author()
	{ }

	public Author(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	name()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.name;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.name = result;
		}
		return result;
	}

	public java.lang.String getName()
	{
		return this.name == null ? null : name().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getNameMetadata()
	{
		return name;
	}

	public void setName(java.lang.String name)
	{
		if (name != null)
			this.name().setValue(name);
	}

	public void setNameMetadata(ecologylab.semantics.metadata.scalar.MetadataString name)
	{
		this.name = name;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	affiliation()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.affiliation;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.affiliation = result;
		}
		return result;
	}

	public java.lang.String getAffiliation()
	{
		return this.affiliation == null ? null : affiliation().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAffiliationMetadata()
	{
		return affiliation;
	}

	public void setAffiliation(java.lang.String affiliation)
	{
		if (affiliation != null)
			this.affiliation().setValue(affiliation);
	}

	public void setAffiliationMetadata(ecologylab.semantics.metadata.scalar.MetadataString affiliation)
	{
		this.affiliation = affiliation;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	city()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.city;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.city = result;
		}
		return result;
	}

	public java.lang.String getCity()
	{
		return this.city == null ? null : city().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCityMetadata()
	{
		return city;
	}

	public void setCity(java.lang.String city)
	{
		if (city != null)
			this.city().setValue(city);
	}

	public void setCityMetadata(ecologylab.semantics.metadata.scalar.MetadataString city)
	{
		this.city = city;
	}
}
