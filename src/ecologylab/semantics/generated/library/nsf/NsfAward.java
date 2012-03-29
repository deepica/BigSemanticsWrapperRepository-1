package ecologylab.semantics.generated.library.nsf;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.creativeWork.Author;
import ecologylab.semantics.generated.library.nsf.Investigator;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/** 
 *NSF Award details.
 */ 
@simpl_inherit
public class NsfAward extends CompoundDocument
{
	@simpl_composite
	@mm_name("nsf_org")
	private Document nsfOrg;

	@simpl_scalar
	private MetadataDate initialAmendmentDate;

	@simpl_scalar
	private MetadataDate latestAmendmentDate;

	@simpl_scalar
	private MetadataString awardNumber;

	@simpl_scalar
	private MetadataString awardInstrument;

	@simpl_composite
	@mm_name("program_manager")
	private Author programManager;

	@simpl_scalar
	private MetadataDate startDate;

	@simpl_scalar
	private MetadataDate expireDate;

	@simpl_scalar
	private MetadataInteger awardedAmountToDate;

	@simpl_collection("investigator")
	@mm_name("investigators")
	private List<Investigator> investigators;

	@simpl_scalar
	private MetadataString sponsor;

	@simpl_scalar
	private MetadataString nsfPrograms;

	@simpl_scalar
	private MetadataString fieldApplications;

	@simpl_scalar
	private MetadataString programReferenceCodes;

	@simpl_scalar
	private MetadataString programElementCodes;

	@simpl_scalar
	private MetadataString abstractField;

	@simpl_collection("relevant_location")
	@mm_name("relevant_locations")
	private List<MetadataParsedURL> relevantLocations;

	@simpl_collection("publication")
	@mm_name("publications")
	private List<MetadataString> publications;

	@simpl_collection("proceeding")
	@mm_name("proceedings")
	private List<MetadataString> proceedings;

	public NsfAward()
	{ super(); }

	public NsfAward(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Document getNsfOrg()
	{
		return nsfOrg;
	}

	public void setNsfOrg(Document nsfOrg)
	{
		this.nsfOrg = nsfOrg;
	}

	public MetadataDate	initialAmendmentDate()
	{
		MetadataDate	result = this.initialAmendmentDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.initialAmendmentDate = result;
		}
		return result;
	}

	public Date getInitialAmendmentDate()
	{
		return this.initialAmendmentDate == null ? null : initialAmendmentDate().getValue();
	}

	public MetadataDate getInitialAmendmentDateMetadata()
	{
		return initialAmendmentDate;
	}

	public void setInitialAmendmentDate(Date initialAmendmentDate)
	{
		if (initialAmendmentDate != null)
			this.initialAmendmentDate().setValue(initialAmendmentDate);
	}

	public void setInitialAmendmentDateMetadata(MetadataDate initialAmendmentDate)
	{
		this.initialAmendmentDate = initialAmendmentDate;
	}

	public MetadataDate	latestAmendmentDate()
	{
		MetadataDate	result = this.latestAmendmentDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.latestAmendmentDate = result;
		}
		return result;
	}

	public Date getLatestAmendmentDate()
	{
		return this.latestAmendmentDate == null ? null : latestAmendmentDate().getValue();
	}

	public MetadataDate getLatestAmendmentDateMetadata()
	{
		return latestAmendmentDate;
	}

	public void setLatestAmendmentDate(Date latestAmendmentDate)
	{
		if (latestAmendmentDate != null)
			this.latestAmendmentDate().setValue(latestAmendmentDate);
	}

	public void setLatestAmendmentDateMetadata(MetadataDate latestAmendmentDate)
	{
		this.latestAmendmentDate = latestAmendmentDate;
	}

	public MetadataString	awardNumber()
	{
		MetadataString	result = this.awardNumber;
		if (result == null)
		{
			result = new MetadataString();
			this.awardNumber = result;
		}
		return result;
	}

	public String getAwardNumber()
	{
		return this.awardNumber == null ? null : awardNumber().getValue();
	}

	public MetadataString getAwardNumberMetadata()
	{
		return awardNumber;
	}

	public void setAwardNumber(String awardNumber)
	{
		if (awardNumber != null)
			this.awardNumber().setValue(awardNumber);
	}

	public void setAwardNumberMetadata(MetadataString awardNumber)
	{
		this.awardNumber = awardNumber;
	}

	public MetadataString	awardInstrument()
	{
		MetadataString	result = this.awardInstrument;
		if (result == null)
		{
			result = new MetadataString();
			this.awardInstrument = result;
		}
		return result;
	}

	public String getAwardInstrument()
	{
		return this.awardInstrument == null ? null : awardInstrument().getValue();
	}

	public MetadataString getAwardInstrumentMetadata()
	{
		return awardInstrument;
	}

	public void setAwardInstrument(String awardInstrument)
	{
		if (awardInstrument != null)
			this.awardInstrument().setValue(awardInstrument);
	}

	public void setAwardInstrumentMetadata(MetadataString awardInstrument)
	{
		this.awardInstrument = awardInstrument;
	}

	public Author getProgramManager()
	{
		return programManager;
	}

	public void setProgramManager(Author programManager)
	{
		this.programManager = programManager;
	}

	public MetadataDate	startDate()
	{
		MetadataDate	result = this.startDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.startDate = result;
		}
		return result;
	}

	public Date getStartDate()
	{
		return this.startDate == null ? null : startDate().getValue();
	}

	public MetadataDate getStartDateMetadata()
	{
		return startDate;
	}

	public void setStartDate(Date startDate)
	{
		if (startDate != null)
			this.startDate().setValue(startDate);
	}

	public void setStartDateMetadata(MetadataDate startDate)
	{
		this.startDate = startDate;
	}

	public MetadataDate	expireDate()
	{
		MetadataDate	result = this.expireDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.expireDate = result;
		}
		return result;
	}

	public Date getExpireDate()
	{
		return this.expireDate == null ? null : expireDate().getValue();
	}

	public MetadataDate getExpireDateMetadata()
	{
		return expireDate;
	}

	public void setExpireDate(Date expireDate)
	{
		if (expireDate != null)
			this.expireDate().setValue(expireDate);
	}

	public void setExpireDateMetadata(MetadataDate expireDate)
	{
		this.expireDate = expireDate;
	}

	public MetadataInteger	awardedAmountToDate()
	{
		MetadataInteger	result = this.awardedAmountToDate;
		if (result == null)
		{
			result = new MetadataInteger();
			this.awardedAmountToDate = result;
		}
		return result;
	}

	public Integer getAwardedAmountToDate()
	{
		return this.awardedAmountToDate == null ? 0 : awardedAmountToDate().getValue();
	}

	public MetadataInteger getAwardedAmountToDateMetadata()
	{
		return awardedAmountToDate;
	}

	public void setAwardedAmountToDate(Integer awardedAmountToDate)
	{
		if (awardedAmountToDate != 0)
			this.awardedAmountToDate().setValue(awardedAmountToDate);
	}

	public void setAwardedAmountToDateMetadata(MetadataInteger awardedAmountToDate)
	{
		this.awardedAmountToDate = awardedAmountToDate;
	}

	public List<Investigator> getInvestigators()
	{
		return investigators;
	}

  // lazy evaluation:
  public List<Investigator> investigators()
  {
    if (investigators == null)
      investigators = new ArrayList<Investigator>();
    return investigators;
  }

  // addTo:
  public void addToInvestigators(Investigator element)
  {
    investigators().add(element);
  }

  // size:
  public int investigatorsSize()
  {
    return investigators == null ? 0 : investigators.size();
  }

	public void setInvestigators(List<Investigator> investigators)
	{
		this.investigators = investigators;
	}

	public MetadataString	sponsor()
	{
		MetadataString	result = this.sponsor;
		if (result == null)
		{
			result = new MetadataString();
			this.sponsor = result;
		}
		return result;
	}

	public String getSponsor()
	{
		return this.sponsor == null ? null : sponsor().getValue();
	}

	public MetadataString getSponsorMetadata()
	{
		return sponsor;
	}

	public void setSponsor(String sponsor)
	{
		if (sponsor != null)
			this.sponsor().setValue(sponsor);
	}

	public void setSponsorMetadata(MetadataString sponsor)
	{
		this.sponsor = sponsor;
	}

	public MetadataString	nsfPrograms()
	{
		MetadataString	result = this.nsfPrograms;
		if (result == null)
		{
			result = new MetadataString();
			this.nsfPrograms = result;
		}
		return result;
	}

	public String getNsfPrograms()
	{
		return this.nsfPrograms == null ? null : nsfPrograms().getValue();
	}

	public MetadataString getNsfProgramsMetadata()
	{
		return nsfPrograms;
	}

	public void setNsfPrograms(String nsfPrograms)
	{
		if (nsfPrograms != null)
			this.nsfPrograms().setValue(nsfPrograms);
	}

	public void setNsfProgramsMetadata(MetadataString nsfPrograms)
	{
		this.nsfPrograms = nsfPrograms;
	}

	public MetadataString	fieldApplications()
	{
		MetadataString	result = this.fieldApplications;
		if (result == null)
		{
			result = new MetadataString();
			this.fieldApplications = result;
		}
		return result;
	}

	public String getFieldApplications()
	{
		return this.fieldApplications == null ? null : fieldApplications().getValue();
	}

	public MetadataString getFieldApplicationsMetadata()
	{
		return fieldApplications;
	}

	public void setFieldApplications(String fieldApplications)
	{
		if (fieldApplications != null)
			this.fieldApplications().setValue(fieldApplications);
	}

	public void setFieldApplicationsMetadata(MetadataString fieldApplications)
	{
		this.fieldApplications = fieldApplications;
	}

	public MetadataString	programReferenceCodes()
	{
		MetadataString	result = this.programReferenceCodes;
		if (result == null)
		{
			result = new MetadataString();
			this.programReferenceCodes = result;
		}
		return result;
	}

	public String getProgramReferenceCodes()
	{
		return this.programReferenceCodes == null ? null : programReferenceCodes().getValue();
	}

	public MetadataString getProgramReferenceCodesMetadata()
	{
		return programReferenceCodes;
	}

	public void setProgramReferenceCodes(String programReferenceCodes)
	{
		if (programReferenceCodes != null)
			this.programReferenceCodes().setValue(programReferenceCodes);
	}

	public void setProgramReferenceCodesMetadata(MetadataString programReferenceCodes)
	{
		this.programReferenceCodes = programReferenceCodes;
	}

	public MetadataString	programElementCodes()
	{
		MetadataString	result = this.programElementCodes;
		if (result == null)
		{
			result = new MetadataString();
			this.programElementCodes = result;
		}
		return result;
	}

	public String getProgramElementCodes()
	{
		return this.programElementCodes == null ? null : programElementCodes().getValue();
	}

	public MetadataString getProgramElementCodesMetadata()
	{
		return programElementCodes;
	}

	public void setProgramElementCodes(String programElementCodes)
	{
		if (programElementCodes != null)
			this.programElementCodes().setValue(programElementCodes);
	}

	public void setProgramElementCodesMetadata(MetadataString programElementCodes)
	{
		this.programElementCodes = programElementCodes;
	}

	public MetadataString	abstractField()
	{
		MetadataString	result = this.abstractField;
		if (result == null)
		{
			result = new MetadataString();
			this.abstractField = result;
		}
		return result;
	}

	public String getAbstractField()
	{
		return this.abstractField == null ? null : abstractField().getValue();
	}

	public MetadataString getAbstractFieldMetadata()
	{
		return abstractField;
	}

	public void setAbstractField(String abstractField)
	{
		if (abstractField != null)
			this.abstractField().setValue(abstractField);
	}

	public void setAbstractFieldMetadata(MetadataString abstractField)
	{
		this.abstractField = abstractField;
	}

	public List<MetadataParsedURL> getRelevantLocations()
	{
		return relevantLocations;
	}

  // lazy evaluation:
  public List<MetadataParsedURL> relevantLocations()
  {
    if (relevantLocations == null)
      relevantLocations = new ArrayList<MetadataParsedURL>();
    return relevantLocations;
  }

  // addTo:
  public void addToRelevantLocations(MetadataParsedURL element)
  {
    relevantLocations().add(element);
  }

  // size:
  public int relevantLocationsSize()
  {
    return relevantLocations == null ? 0 : relevantLocations.size();
  }

	public void setRelevantLocations(List<MetadataParsedURL> relevantLocations)
	{
		this.relevantLocations = relevantLocations;
	}

	public List<MetadataString> getPublications()
	{
		return publications;
	}

  // lazy evaluation:
  public List<MetadataString> publications()
  {
    if (publications == null)
      publications = new ArrayList<MetadataString>();
    return publications;
  }

  // addTo:
  public void addToPublications(MetadataString element)
  {
    publications().add(element);
  }

  // size:
  public int publicationsSize()
  {
    return publications == null ? 0 : publications.size();
  }

	public void setPublications(List<MetadataString> publications)
	{
		this.publications = publications;
	}

	public List<MetadataString> getProceedings()
	{
		return proceedings;
	}

  // lazy evaluation:
  public List<MetadataString> proceedings()
  {
    if (proceedings == null)
      proceedings = new ArrayList<MetadataString>();
    return proceedings;
  }

  // addTo:
  public void addToProceedings(MetadataString element)
  {
    proceedings().add(element);
  }

  // size:
  public int proceedingsSize()
  {
    return proceedings == null ? 0 : proceedings.size();
  }

	public void setProceedings(List<MetadataString> proceedings)
	{
		this.proceedings = proceedings;
	}
}
