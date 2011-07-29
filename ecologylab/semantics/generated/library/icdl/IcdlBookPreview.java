package ecologylab.semantics.generated.library.icdl;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.library.publication.Author;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  IcdlBookPreview.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * ICDL About This Book Page
 */ 
@simpl_inherit
public class IcdlBookPreview extends Metadata
{
	/** 
	 */ 
	@simpl_composite @mm_name("author")	private Author author;

	/** 
	 */ 
	@simpl_composite @mm_name("illustrator")	private Author illustrator;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString summary;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString year;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString languages;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString publisher;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString isbn;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString awards;

	public IcdlBookPreview()
	{ }

	public IcdlBookPreview(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Author getAuthor()
	{
		return author;
	}

	public void setAuthor(Author author)
	{
		this.author = author;
	}

	public Author getIllustrator()
	{
		return illustrator;
	}

	public void setIllustrator(Author illustrator)
	{
		this.illustrator = illustrator;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	summary()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.summary;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.summary = result;
		}
		return result;
	}

	public java.lang.String getSummary()
	{
		return this.summary == null ? null : summary().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSummaryMetadata()
	{
		return summary;
	}

	public void setSummary(java.lang.String summary)
	{
		if (summary != null)
			this.summary().setValue(summary);
	}

	public void setSummaryMetadata(ecologylab.semantics.metadata.scalar.MetadataString summary)
	{
		this.summary = summary;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	year()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.year;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.year = result;
		}
		return result;
	}

	public java.lang.String getYear()
	{
		return this.year == null ? null : year().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getYearMetadata()
	{
		return year;
	}

	public void setYear(java.lang.String year)
	{
		if (year != null)
			this.year().setValue(year);
	}

	public void setYearMetadata(ecologylab.semantics.metadata.scalar.MetadataString year)
	{
		this.year = year;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	languages()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.languages;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.languages = result;
		}
		return result;
	}

	public java.lang.String getLanguages()
	{
		return this.languages == null ? null : languages().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getLanguagesMetadata()
	{
		return languages;
	}

	public void setLanguages(java.lang.String languages)
	{
		if (languages != null)
			this.languages().setValue(languages);
	}

	public void setLanguagesMetadata(ecologylab.semantics.metadata.scalar.MetadataString languages)
	{
		this.languages = languages;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	publisher()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.publisher;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.publisher = result;
		}
		return result;
	}

	public java.lang.String getPublisher()
	{
		return this.publisher == null ? null : publisher().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPublisherMetadata()
	{
		return publisher;
	}

	public void setPublisher(java.lang.String publisher)
	{
		if (publisher != null)
			this.publisher().setValue(publisher);
	}

	public void setPublisherMetadata(ecologylab.semantics.metadata.scalar.MetadataString publisher)
	{
		this.publisher = publisher;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	isbn()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.isbn;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.isbn = result;
		}
		return result;
	}

	public java.lang.String getIsbn()
	{
		return this.isbn == null ? null : isbn().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getIsbnMetadata()
	{
		return isbn;
	}

	public void setIsbn(java.lang.String isbn)
	{
		if (isbn != null)
			this.isbn().setValue(isbn);
	}

	public void setIsbnMetadata(ecologylab.semantics.metadata.scalar.MetadataString isbn)
	{
		this.isbn = isbn;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	awards()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.awards;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.awards = result;
		}
		return result;
	}

	public java.lang.String getAwards()
	{
		return this.awards == null ? null : awards().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAwardsMetadata()
	{
		return awards;
	}

	public void setAwards(java.lang.String awards)
	{
		if (awards != null)
			this.awards().setValue(awards);
	}

	public void setAwardsMetadata(ecologylab.semantics.metadata.scalar.MetadataString awards)
	{
		this.awards = awards;
	}
}
