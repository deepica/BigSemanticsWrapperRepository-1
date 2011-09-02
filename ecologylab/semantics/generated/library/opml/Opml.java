package ecologylab.semantics.generated.library.opml;

import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  Opml.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Opml extends CompoundDocument
{
	/** 
	 */ 
	@simpl_composite	@mm_name("head")
	private Head head;

	/** 
	 */ 
	@simpl_composite	@mm_name("body")
	private Body body;

	public Opml()
	{ }

	public Opml(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Head getHead()
	{
		return head;
	}

	public void setHead(Head head)
	{
		this.head = head;
	}

	public Body getBody()
	{
		return body;
	}

	public void setBody(Body body)
	{
		this.body = body;
	}
}
