package ecologylab.semantics.generated.library.opml;

import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Opml.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Opml extends CompoundDocument
{
	/** 
	 */ 
	@simpl_composite @mm_name("head")	private MmdInlineHeadInOpml head;

	/** 
	 */ 
	@simpl_composite @mm_name("body")	private MmdInlineBodyInOpml body;

	public Opml()
	{ }

	public Opml(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MmdInlineHeadInOpml getHead()
	{
		return head;
	}

	public void setHead(MmdInlineHeadInOpml head)
	{
		this.head = head;
	}

	public MmdInlineBodyInOpml getBody()
	{
		return body;
	}

	public void setBody(MmdInlineBodyInOpml body)
	{
		this.body = body;
	}
}
