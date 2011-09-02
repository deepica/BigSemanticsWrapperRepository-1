package ecologylab.semantics.generated.library.publication;

import java.util.List;

import ecologylab.semantics.generated.library.creativeWork.BasicPublication;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Publication.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * A publication.
 */ 
@simpl_inherit
public class Publication extends BasicPublication
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString pages;

	/** 
	 */ 
	@simpl_collection("subject")	@mm_name("subjects")
	private List<Subject> subjects;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString aboutTheAuthors;

	/** 
	 */ 
	@simpl_collection("term_type")	@mm_name("common_terms")
	private List<TermType> commonTerms;

	public Publication()
	{ }

	public Publication(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	pages()
	{
		MetadataString	result = this.pages;
		if (result == null)
		{
			result = new MetadataString();
			this.pages = result;
		}
		return result;
	}

	public String getPages()
	{
		return this.pages == null ? null : pages().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPagesMetadata()
	{
		return pages;
	}

	public void setPages(String pages)
	{
		if (pages != null)
			this.pages().setValue(pages);
	}

	public void setPagesMetadata(ecologylab.semantics.metadata.scalar.MetadataString pages)
	{
		this.pages = pages;
	}

	public List<Subject> getSubjects()
	{
		return subjects;
	}

	public void setSubjects(List<Subject> subjects)
	{
		this.subjects = subjects;
	}

	public MetadataString	aboutTheAuthors()
	{
		MetadataString	result = this.aboutTheAuthors;
		if (result == null)
		{
			result = new MetadataString();
			this.aboutTheAuthors = result;
		}
		return result;
	}

	public String getAboutTheAuthors()
	{
		return this.aboutTheAuthors == null ? null : aboutTheAuthors().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAboutTheAuthorsMetadata()
	{
		return aboutTheAuthors;
	}

	public void setAboutTheAuthors(String aboutTheAuthors)
	{
		if (aboutTheAuthors != null)
			this.aboutTheAuthors().setValue(aboutTheAuthors);
	}

	public void setAboutTheAuthorsMetadata(ecologylab.semantics.metadata.scalar.MetadataString aboutTheAuthors)
	{
		this.aboutTheAuthors = aboutTheAuthors;
	}

	public List<TermType> getCommonTerms()
	{
		return commonTerms;
	}

	public void setCommonTerms(List<TermType> commonTerms)
	{
		this.commonTerms = commonTerms;
	}
}
