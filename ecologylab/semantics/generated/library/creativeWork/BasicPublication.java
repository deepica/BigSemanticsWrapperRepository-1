package ecologylab.semantics.generated.library.creativeWork;

import ecologylab.semantics.generated.library.publication.Publisher;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  BasicPublication.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * A publication.
 */ 
@simpl_inherit
public class BasicPublication extends CreativeWork
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString isbn;

	/** 
	 */ 
	@simpl_composite	@mm_name("publisher")
	private Publisher publisher;

	public BasicPublication()
	{ }

	public BasicPublication(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	isbn()
	{
		MetadataString	result = this.isbn;
		if (result == null)
		{
			result = new MetadataString();
			this.isbn = result;
		}
		return result;
	}

	public String getIsbn()
	{
		return this.isbn == null ? null : isbn().getValue();
	}

	public MetadataString getIsbnMetadata()
	{
		return isbn;
	}

	public void setIsbn(String isbn)
	{
		if (isbn != null)
			this.isbn().setValue(isbn);
	}

	public void setIsbnMetadata(MetadataString isbn)
	{
		this.isbn = isbn;
	}

	public Publisher getPublisher()
	{
		return publisher;
	}

	public void setPublisher(Publisher publisher)
	{
		this.publisher = publisher;
	}
}
