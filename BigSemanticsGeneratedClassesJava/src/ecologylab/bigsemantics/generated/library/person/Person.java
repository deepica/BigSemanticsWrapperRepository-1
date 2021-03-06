package ecologylab.bigsemantics.generated.library.person;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.gis.ContactPoint;
import ecologylab.bigsemantics.generated.library.person.BirthDetail;
import ecologylab.bigsemantics.generated.library.person.Person;
import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Abstract type for a person.
 */ 
@simpl_inherit
public class Person extends Document
{
	/** 
	 *A representative photo for the person.
	 */ 
	@simpl_composite
	@mm_name("photo")
	private Image photo;

	@simpl_composite
	@mm_name("birth_detail")
	private BirthDetail birthDetail;

	@simpl_scalar
	private MetadataString gender;

	@simpl_scalar
	private MetadataString nationality;

	@simpl_composite
	@mm_name("spouse")
	private Person spouse;

	@simpl_collection("person")
	@mm_name("parents")
	private List<Person> parents;

	@simpl_collection("person")
	@mm_name("children")
	private List<Person> children;

	@simpl_collection("person")
	@mm_name("related_to")
	private List<Person> relatedTo;

	@simpl_composite
	@mm_name("contact")
	private ContactPoint contact;

	public Person()
	{ super(); }

	public Person(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Image getPhoto()
	{
		return photo;
	}

	public void setPhoto(Image photo)
	{
		this.photo = photo;
	}

	public BirthDetail getBirthDetail()
	{
		return birthDetail;
	}

	public void setBirthDetail(BirthDetail birthDetail)
	{
		this.birthDetail = birthDetail;
	}

	public MetadataString	gender()
	{
		MetadataString	result = this.gender;
		if (result == null)
		{
			result = new MetadataString();
			this.gender = result;
		}
		return result;
	}

	public String getGender()
	{
		return this.gender == null ? null : gender().getValue();
	}

	public MetadataString getGenderMetadata()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		if (gender != null)
			this.gender().setValue(gender);
	}

	public void setGenderMetadata(MetadataString gender)
	{
		this.gender = gender;
	}

	public MetadataString	nationality()
	{
		MetadataString	result = this.nationality;
		if (result == null)
		{
			result = new MetadataString();
			this.nationality = result;
		}
		return result;
	}

	public String getNationality()
	{
		return this.nationality == null ? null : nationality().getValue();
	}

	public MetadataString getNationalityMetadata()
	{
		return nationality;
	}

	public void setNationality(String nationality)
	{
		if (nationality != null)
			this.nationality().setValue(nationality);
	}

	public void setNationalityMetadata(MetadataString nationality)
	{
		this.nationality = nationality;
	}

	public Person getSpouse()
	{
		return spouse;
	}

	public void setSpouse(Person spouse)
	{
		this.spouse = spouse;
	}

	public List<Person> getParents()
	{
		return parents;
	}

  // lazy evaluation:
  public List<Person> parents()
  {
    if (parents == null)
      parents = new ArrayList<Person>();
    return parents;
  }

  // addTo:
  public void addToParents(Person element)
  {
    parents().add(element);
  }

  // size:
  public int parentsSize()
  {
    return parents == null ? 0 : parents.size();
  }

	public void setParents(List<Person> parents)
	{
		this.parents = parents;
	}

	public List<Person> getChildren()
	{
		return children;
	}

  // lazy evaluation:
  public List<Person> children()
  {
    if (children == null)
      children = new ArrayList<Person>();
    return children;
  }

  // addTo:
  public void addToChildren(Person element)
  {
    children().add(element);
  }

  // size:
  public int childrenSize()
  {
    return children == null ? 0 : children.size();
  }

	public void setChildren(List<Person> children)
	{
		this.children = children;
	}

	public List<Person> getRelatedTo()
	{
		return relatedTo;
	}

  // lazy evaluation:
  public List<Person> relatedTo()
  {
    if (relatedTo == null)
      relatedTo = new ArrayList<Person>();
    return relatedTo;
  }

  // addTo:
  public void addToRelatedTo(Person element)
  {
    relatedTo().add(element);
  }

  // size:
  public int relatedToSize()
  {
    return relatedTo == null ? 0 : relatedTo.size();
  }

	public void setRelatedTo(List<Person> relatedTo)
	{
		this.relatedTo = relatedTo;
	}

	public ContactPoint getContact()
	{
		return contact;
	}

	public void setContact(ContactPoint contact)
	{
		this.contact = contact;
	}
}
