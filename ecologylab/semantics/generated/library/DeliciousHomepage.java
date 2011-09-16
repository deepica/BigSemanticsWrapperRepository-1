package ecologylab.semantics.generated.library;

import java.util.List;

import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;

/**
*  DeliciousHomepage.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Delicious home page class
 */ 
@simpl_inherit
public class DeliciousHomepage extends CompoundDocument
{
	/** 
	 */ 
	@simpl_collection("bookmark")	@mm_name("bookmarks")
	private List<Bookmark> bookmarks;

	public DeliciousHomepage()
	{ }

	public DeliciousHomepage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Bookmark> getBookmarks()
	{
		return bookmarks;
	}

	public void setBookmarks(List<Bookmark> bookmarks)
	{
		this.bookmarks = bookmarks;
	}
}
