package ecologylab.semantics.generated.library.products;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  MmdInlineProductReviewInReviewsInProduct.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineProductReviewInReviewsInProduct extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString content;

	/** 
	 */ 
	@simpl_scalar	private MetadataString rating;

	public MmdInlineProductReviewInReviewsInProduct()
	{ }

	public MmdInlineProductReviewInReviewsInProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	content()
	{
		MetadataString	result = this.content;
		if (result == null)
		{
			result = new MetadataString();
			this.content = result;
		}
		return result;
	}

	public String getContent()
	{
		return this.content().getValue();
	}

	public void setContent(String content)
	{
		this.content().setValue(content);
	}

	public MetadataString	rating()
	{
		MetadataString	result = this.rating;
		if (result == null)
		{
			result = new MetadataString();
			this.rating = result;
		}
		return result;
	}

	public String getRating()
	{
		return this.rating().getValue();
	}

	public void setRating(String rating)
	{
		this.rating().setValue(rating);
	}

}
