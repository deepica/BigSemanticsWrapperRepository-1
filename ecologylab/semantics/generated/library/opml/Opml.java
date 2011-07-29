package ecologylab.semantics.generated.library.opml;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.opml.MmdInlineHeadInOpml;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.opml.MmdInlineBodyInOpml;

/**
*  Opml.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/29/11.
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
