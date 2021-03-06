package ecologylab.bigsemantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.Integer;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class ResultInfo extends Metadata
{
	@simpl_scalar
	private MetadataInteger offset;

	@simpl_scalar
	@simpl_tag("numReturned")
	private MetadataInteger returned;

	@simpl_scalar
	@simpl_tag("totalNumRecordsInLibrary")
	private MetadataInteger totalRecords;

	@simpl_scalar
	@simpl_tag("totalNumResults")
	private MetadataInteger totalResults;

	public ResultInfo()
	{ super(); }

	public ResultInfo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataInteger	offset()
	{
		MetadataInteger	result = this.offset;
		if (result == null)
		{
			result = new MetadataInteger();
			this.offset = result;
		}
		return result;
	}

	public Integer getOffset()
	{
		return this.offset == null ? 0 : offset().getValue();
	}

	public MetadataInteger getOffsetMetadata()
	{
		return offset;
	}

	public void setOffset(Integer offset)
	{
		if (offset != 0)
			this.offset().setValue(offset);
	}

	public void setOffsetMetadata(MetadataInteger offset)
	{
		this.offset = offset;
	}

	public MetadataInteger	returned()
	{
		MetadataInteger	result = this.returned;
		if (result == null)
		{
			result = new MetadataInteger();
			this.returned = result;
		}
		return result;
	}

	public Integer getReturned()
	{
		return this.returned == null ? 0 : returned().getValue();
	}

	public MetadataInteger getReturnedMetadata()
	{
		return returned;
	}

	public void setReturned(Integer returned)
	{
		if (returned != 0)
			this.returned().setValue(returned);
	}

	public void setReturnedMetadata(MetadataInteger returned)
	{
		this.returned = returned;
	}

	public MetadataInteger	totalRecords()
	{
		MetadataInteger	result = this.totalRecords;
		if (result == null)
		{
			result = new MetadataInteger();
			this.totalRecords = result;
		}
		return result;
	}

	public Integer getTotalRecords()
	{
		return this.totalRecords == null ? 0 : totalRecords().getValue();
	}

	public MetadataInteger getTotalRecordsMetadata()
	{
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords)
	{
		if (totalRecords != 0)
			this.totalRecords().setValue(totalRecords);
	}

	public void setTotalRecordsMetadata(MetadataInteger totalRecords)
	{
		this.totalRecords = totalRecords;
	}

	public MetadataInteger	totalResults()
	{
		MetadataInteger	result = this.totalResults;
		if (result == null)
		{
			result = new MetadataInteger();
			this.totalResults = result;
		}
		return result;
	}

	public Integer getTotalResults()
	{
		return this.totalResults == null ? 0 : totalResults().getValue();
	}

	public MetadataInteger getTotalResultsMetadata()
	{
		return totalResults;
	}

	public void setTotalResults(Integer totalResults)
	{
		if (totalResults != 0)
			this.totalResults().setValue(totalResults);
	}

	public void setTotalResultsMetadata(MetadataInteger totalResults)
	{
		this.totalResults = totalResults;
	}
}
