package ecologylab.semantics.generated.library.flickr;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  AuthorPhotos.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class AuthorPhotos extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL authorPhotostreamLink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString authorPhotostream;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL photosThatDayLink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL photosThatMonthLink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL photosThatYearLink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString photosThatDay;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString photosThatMonth;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString photosThatYear;

	public AuthorPhotos()
	{ }

	public AuthorPhotos(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	authorPhotostreamLink()
	{
		MetadataParsedURL	result = this.authorPhotostreamLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.authorPhotostreamLink = result;
		}
		return result;
	}

	public ParsedURL getAuthorPhotostreamLink()
	{
		return this.authorPhotostreamLink == null ? null : authorPhotostreamLink().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getAuthorPhotostreamLinkMetadata()
	{
		return authorPhotostreamLink;
	}

	public void setAuthorPhotostreamLink(ParsedURL authorPhotostreamLink)
	{
		if (authorPhotostreamLink != null)
			this.authorPhotostreamLink().setValue(authorPhotostreamLink);
	}

	public void setAuthorPhotostreamLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL authorPhotostreamLink)
	{
		this.authorPhotostreamLink = authorPhotostreamLink;
	}

	public MetadataString	authorPhotostream()
	{
		MetadataString	result = this.authorPhotostream;
		if (result == null)
		{
			result = new MetadataString();
			this.authorPhotostream = result;
		}
		return result;
	}

	public String getAuthorPhotostream()
	{
		return this.authorPhotostream == null ? null : authorPhotostream().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAuthorPhotostreamMetadata()
	{
		return authorPhotostream;
	}

	public void setAuthorPhotostream(String authorPhotostream)
	{
		if (authorPhotostream != null)
			this.authorPhotostream().setValue(authorPhotostream);
	}

	public void setAuthorPhotostreamMetadata(ecologylab.semantics.metadata.scalar.MetadataString authorPhotostream)
	{
		this.authorPhotostream = authorPhotostream;
	}

	public MetadataParsedURL	photosThatDayLink()
	{
		MetadataParsedURL	result = this.photosThatDayLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.photosThatDayLink = result;
		}
		return result;
	}

	public ParsedURL getPhotosThatDayLink()
	{
		return this.photosThatDayLink == null ? null : photosThatDayLink().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPhotosThatDayLinkMetadata()
	{
		return photosThatDayLink;
	}

	public void setPhotosThatDayLink(ParsedURL photosThatDayLink)
	{
		if (photosThatDayLink != null)
			this.photosThatDayLink().setValue(photosThatDayLink);
	}

	public void setPhotosThatDayLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL photosThatDayLink)
	{
		this.photosThatDayLink = photosThatDayLink;
	}

	public MetadataParsedURL	photosThatMonthLink()
	{
		MetadataParsedURL	result = this.photosThatMonthLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.photosThatMonthLink = result;
		}
		return result;
	}

	public ParsedURL getPhotosThatMonthLink()
	{
		return this.photosThatMonthLink == null ? null : photosThatMonthLink().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPhotosThatMonthLinkMetadata()
	{
		return photosThatMonthLink;
	}

	public void setPhotosThatMonthLink(ParsedURL photosThatMonthLink)
	{
		if (photosThatMonthLink != null)
			this.photosThatMonthLink().setValue(photosThatMonthLink);
	}

	public void setPhotosThatMonthLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL photosThatMonthLink)
	{
		this.photosThatMonthLink = photosThatMonthLink;
	}

	public MetadataParsedURL	photosThatYearLink()
	{
		MetadataParsedURL	result = this.photosThatYearLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.photosThatYearLink = result;
		}
		return result;
	}

	public ParsedURL getPhotosThatYearLink()
	{
		return this.photosThatYearLink == null ? null : photosThatYearLink().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPhotosThatYearLinkMetadata()
	{
		return photosThatYearLink;
	}

	public void setPhotosThatYearLink(ParsedURL photosThatYearLink)
	{
		if (photosThatYearLink != null)
			this.photosThatYearLink().setValue(photosThatYearLink);
	}

	public void setPhotosThatYearLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL photosThatYearLink)
	{
		this.photosThatYearLink = photosThatYearLink;
	}

	public MetadataString	photosThatDay()
	{
		MetadataString	result = this.photosThatDay;
		if (result == null)
		{
			result = new MetadataString();
			this.photosThatDay = result;
		}
		return result;
	}

	public String getPhotosThatDay()
	{
		return this.photosThatDay == null ? null : photosThatDay().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPhotosThatDayMetadata()
	{
		return photosThatDay;
	}

	public void setPhotosThatDay(String photosThatDay)
	{
		if (photosThatDay != null)
			this.photosThatDay().setValue(photosThatDay);
	}

	public void setPhotosThatDayMetadata(ecologylab.semantics.metadata.scalar.MetadataString photosThatDay)
	{
		this.photosThatDay = photosThatDay;
	}

	public MetadataString	photosThatMonth()
	{
		MetadataString	result = this.photosThatMonth;
		if (result == null)
		{
			result = new MetadataString();
			this.photosThatMonth = result;
		}
		return result;
	}

	public String getPhotosThatMonth()
	{
		return this.photosThatMonth == null ? null : photosThatMonth().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPhotosThatMonthMetadata()
	{
		return photosThatMonth;
	}

	public void setPhotosThatMonth(String photosThatMonth)
	{
		if (photosThatMonth != null)
			this.photosThatMonth().setValue(photosThatMonth);
	}

	public void setPhotosThatMonthMetadata(ecologylab.semantics.metadata.scalar.MetadataString photosThatMonth)
	{
		this.photosThatMonth = photosThatMonth;
	}

	public MetadataString	photosThatYear()
	{
		MetadataString	result = this.photosThatYear;
		if (result == null)
		{
			result = new MetadataString();
			this.photosThatYear = result;
		}
		return result;
	}

	public String getPhotosThatYear()
	{
		return this.photosThatYear == null ? null : photosThatYear().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPhotosThatYearMetadata()
	{
		return photosThatYear;
	}

	public void setPhotosThatYear(String photosThatYear)
	{
		if (photosThatYear != null)
			this.photosThatYear().setValue(photosThatYear);
	}

	public void setPhotosThatYearMetadata(ecologylab.semantics.metadata.scalar.MetadataString photosThatYear)
	{
		this.photosThatYear = photosThatYear;
	}
}
