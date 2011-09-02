package ecologylab.semantics.generated.library.slashdot;

import java.util.List;

import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.simpl_inherit;

/**
*  SlashdotRss.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
@xml_tag("rdf:RDF")
public class SlashdotRss extends CompoundDocument
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("item")	@mm_name("items")
	private List<SlashdotItem> items;

	public SlashdotRss()
	{ }

	public SlashdotRss(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<SlashdotItem> getItems()
	{
		return items;
	}

	public void setItems(List<SlashdotItem> items)
	{
		this.items = items;
	}
}
