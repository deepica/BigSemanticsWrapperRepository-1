package ecologylab.bigsemantics.generated.library.tvtropes;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.tvtropes.Tvtrope;
import ecologylab.bigsemantics.generated.library.tvtropes.TvtropeFolder;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Tvtrope extends CompoundDocument
{
	@simpl_scalar
	private MetadataString quote;

	@simpl_scalar
	private MetadataString quoteSource;

	@simpl_collection("tvtrope")
	@mm_name("sub_tropes")
	private List<Tvtrope> subTropes;

	@simpl_collection("tvtrope")
	@mm_name("direct_descendants")
	private List<Tvtrope> directDescendants;

	@simpl_collection("tvtrope_folder")
	@mm_name("examples_by_category")
	private List<TvtropeFolder> examplesByCategory;

	@simpl_collection("tvtrope")
	@mm_name("all_linked_tropes")
	private List<Tvtrope> allLinkedTropes;

	public Tvtrope()
	{ super(); }

	public Tvtrope(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	quote()
	{
		MetadataString	result = this.quote;
		if (result == null)
		{
			result = new MetadataString();
			this.quote = result;
		}
		return result;
	}

	public String getQuote()
	{
		return this.quote == null ? null : quote().getValue();
	}

	public MetadataString getQuoteMetadata()
	{
		return quote;
	}

	public void setQuote(String quote)
	{
		if (quote != null)
			this.quote().setValue(quote);
	}

	public void setQuoteMetadata(MetadataString quote)
	{
		this.quote = quote;
	}

	public MetadataString	quoteSource()
	{
		MetadataString	result = this.quoteSource;
		if (result == null)
		{
			result = new MetadataString();
			this.quoteSource = result;
		}
		return result;
	}

	public String getQuoteSource()
	{
		return this.quoteSource == null ? null : quoteSource().getValue();
	}

	public MetadataString getQuoteSourceMetadata()
	{
		return quoteSource;
	}

	public void setQuoteSource(String quoteSource)
	{
		if (quoteSource != null)
			this.quoteSource().setValue(quoteSource);
	}

	public void setQuoteSourceMetadata(MetadataString quoteSource)
	{
		this.quoteSource = quoteSource;
	}

	public List<Tvtrope> getSubTropes()
	{
		return subTropes;
	}

  // lazy evaluation:
  public List<Tvtrope> subTropes()
  {
    if (subTropes == null)
      subTropes = new ArrayList<Tvtrope>();
    return subTropes;
  }

  // addTo:
  public void addToSubTropes(Tvtrope element)
  {
    subTropes().add(element);
  }

  // size:
  public int subTropesSize()
  {
    return subTropes == null ? 0 : subTropes.size();
  }

	public void setSubTropes(List<Tvtrope> subTropes)
	{
		this.subTropes = subTropes;
	}

	public List<Tvtrope> getDirectDescendants()
	{
		return directDescendants;
	}

  // lazy evaluation:
  public List<Tvtrope> directDescendants()
  {
    if (directDescendants == null)
      directDescendants = new ArrayList<Tvtrope>();
    return directDescendants;
  }

  // addTo:
  public void addToDirectDescendants(Tvtrope element)
  {
    directDescendants().add(element);
  }

  // size:
  public int directDescendantsSize()
  {
    return directDescendants == null ? 0 : directDescendants.size();
  }

	public void setDirectDescendants(List<Tvtrope> directDescendants)
	{
		this.directDescendants = directDescendants;
	}

	public List<TvtropeFolder> getExamplesByCategory()
	{
		return examplesByCategory;
	}

  // lazy evaluation:
  public List<TvtropeFolder> examplesByCategory()
  {
    if (examplesByCategory == null)
      examplesByCategory = new ArrayList<TvtropeFolder>();
    return examplesByCategory;
  }

  // addTo:
  public void addToExamplesByCategory(TvtropeFolder element)
  {
    examplesByCategory().add(element);
  }

  // size:
  public int examplesByCategorySize()
  {
    return examplesByCategory == null ? 0 : examplesByCategory.size();
  }

	public void setExamplesByCategory(List<TvtropeFolder> examplesByCategory)
	{
		this.examplesByCategory = examplesByCategory;
	}

	public List<Tvtrope> getAllLinkedTropes()
	{
		return allLinkedTropes;
	}

  // lazy evaluation:
  public List<Tvtrope> allLinkedTropes()
  {
    if (allLinkedTropes == null)
      allLinkedTropes = new ArrayList<Tvtrope>();
    return allLinkedTropes;
  }

  // addTo:
  public void addToAllLinkedTropes(Tvtrope element)
  {
    allLinkedTropes().add(element);
  }

  // size:
  public int allLinkedTropesSize()
  {
    return allLinkedTropes == null ? 0 : allLinkedTropes.size();
  }

	public void setAllLinkedTropes(List<Tvtrope> allLinkedTropes)
	{
		this.allLinkedTropes = allLinkedTropes;
	}
}
