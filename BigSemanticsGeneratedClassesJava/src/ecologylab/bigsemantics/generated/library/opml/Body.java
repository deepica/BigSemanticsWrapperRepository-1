package ecologylab.bigsemantics.generated.library.opml;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.opml.Outline;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Body extends Metadata
{
	@simpl_collection("outline")
	@simpl_nowrap
	@mm_name("outline")
	private List<Outline> outline;

	public Body()
	{ super(); }

	public Body(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Outline> getOutline()
	{
		return outline;
	}

  // lazy evaluation:
  public List<Outline> outline()
  {
    if (outline == null)
      outline = new ArrayList<Outline>();
    return outline;
  }

  // addTo:
  public void addToOutline(Outline element)
  {
    outline().add(element);
  }

  // size:
  public int outlineSize()
  {
    return outline == null ? 0 : outline.size();
  }

	public void setOutline(List<Outline> outline)
	{
		this.outline = outline;
	}
}
