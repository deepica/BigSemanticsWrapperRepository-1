package ecologylab.semantics.generated.library.slashdot;

import ecologylab.semantics.generated.library.rss.Item;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;

/**
*  SlashdotItem.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * One item in a feed.
 */ 
@simpl_inherit
public class SlashdotItem extends Item
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("slash:department")	@simpl_hints(Hint.XML_LEAF)	private MetadataString department;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("slash:section")	@simpl_hints(Hint.XML_LEAF)	private MetadataString section;

	public SlashdotItem()
	{ }

	public SlashdotItem(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	department()
	{
		MetadataString	result = this.department;
		if (result == null)
		{
			result = new MetadataString();
			this.department = result;
		}
		return result;
	}

	public String getDepartment()
	{
		return this.department().getValue();
	}

	public void setDepartment(String department)
	{
		this.department().setValue(department);
	}

	public MetadataString	section()
	{
		MetadataString	result = this.section;
		if (result == null)
		{
			result = new MetadataString();
			this.section = result;
		}
		return result;
	}

	public String getSection()
	{
		return this.section().getValue();
	}

	public void setSection(String section)
	{
		this.section().setValue(section);
	}

}
