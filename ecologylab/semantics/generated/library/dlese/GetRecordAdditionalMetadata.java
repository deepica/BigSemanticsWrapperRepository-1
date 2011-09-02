package ecologylab.semantics.generated.library.dlese;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;

/**
*  GetRecordAdditionalMetadata.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/01/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class GetRecordAdditionalMetadata extends AdditionalMetadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString realm;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("partOfDrc")	
	private MetadataString partOfDrc;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("accessionStatus")	
	private MetadataString accessionStatus;

	public GetRecordAdditionalMetadata()
	{ }

	public GetRecordAdditionalMetadata(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	realm()
	{
		MetadataString	result = this.realm;
		if (result == null)
		{
			result = new MetadataString();
			this.realm = result;
		}
		return result;
	}

	public String getRealm()
	{
		return this.realm == null ? null : realm().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getRealmMetadata()
	{
		return realm;
	}

	public void setRealm(String realm)
	{
		if (realm != null)
			this.realm().setValue(realm);
	}

	public void setRealmMetadata(ecologylab.semantics.metadata.scalar.MetadataString realm)
	{
		this.realm = realm;
	}

	public MetadataString	partOfDrc()
	{
		MetadataString	result = this.partOfDrc;
		if (result == null)
		{
			result = new MetadataString();
			this.partOfDrc = result;
		}
		return result;
	}

	public String getPartOfDrc()
	{
		return this.partOfDrc == null ? null : partOfDrc().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPartOfDrcMetadata()
	{
		return partOfDrc;
	}

	public void setPartOfDrc(String partOfDrc)
	{
		if (partOfDrc != null)
			this.partOfDrc().setValue(partOfDrc);
	}

	public void setPartOfDrcMetadata(ecologylab.semantics.metadata.scalar.MetadataString partOfDrc)
	{
		this.partOfDrc = partOfDrc;
	}

	public MetadataString	accessionStatus()
	{
		MetadataString	result = this.accessionStatus;
		if (result == null)
		{
			result = new MetadataString();
			this.accessionStatus = result;
		}
		return result;
	}

	public String getAccessionStatus()
	{
		return this.accessionStatus == null ? null : accessionStatus().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAccessionStatusMetadata()
	{
		return accessionStatus;
	}

	public void setAccessionStatus(String accessionStatus)
	{
		if (accessionStatus != null)
			this.accessionStatus().setValue(accessionStatus);
	}

	public void setAccessionStatusMetadata(ecologylab.semantics.metadata.scalar.MetadataString accessionStatus)
	{
		this.accessionStatus = accessionStatus;
	}
}
