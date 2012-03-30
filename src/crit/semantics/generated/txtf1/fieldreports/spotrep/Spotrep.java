package crit.semantics.generated.txtf1.fieldreports.spotrep;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.gps.GisLocation;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.Date;
import java.util.List;
import java.util.Map;

/** 
 *A 9-line report from the field.
 */ 
@simpl_inherit
public class Spotrep extends Document
{
	/** 
	 *Timestamp for the report.
	 */ 
	@simpl_scalar
	private MetadataDate timeDate;

	/** 
	 *Unit making the report.
	 */ 
	@simpl_scalar
	private MetadataString reportingUnit;

	/** 
	 *Extent of damage at location.
	 */ 
	@simpl_scalar
	private MetadataString damageExtent;

	/** 
	 *Deployed unit activity observed at the location.
	 */ 
	@simpl_scalar
	private MetadataString observedActivity;

	/** 
	 *Raw place data, including Google maps URL.
	 */ 
	@simpl_scalar
	private MetadataString rawPlace;

	/** 
	 *Location of report.
	 */ 
	@simpl_composite
	@mm_name("place")
	private GisLocation place;

	/** 
	 *Units observed at location.
	 */ 
	@simpl_scalar
	private MetadataString observedUnits;

	/** 
	 *Equipment observed at location.
	 */ 
	@simpl_scalar
	private MetadataString observedEquipment;

	/** 
	 *Sender's assessment of the situation at the location, including recommended resources.
	 */ 
	@simpl_scalar
	private MetadataString assessment;

	/** 
	 *Additional comments by the observer.
	 */ 
	@simpl_scalar
	private MetadataString additionalNarrative;

	/** 
	 *Photograph of the situation.
	 */ 
	@simpl_scalar
	private MetadataString photograph;

	public Spotrep()
	{ super(); }

	public Spotrep(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataDate	timeDate()
	{
		MetadataDate	result = this.timeDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.timeDate = result;
		}
		return result;
	}

	public Date getTimeDate()
	{
		return this.timeDate == null ? null : timeDate().getValue();
	}

	public MetadataDate getTimeDateMetadata()
	{
		return timeDate;
	}

	public void setTimeDate(Date timeDate)
	{
		if (timeDate != null)
			this.timeDate().setValue(timeDate);
	}

	public void setTimeDateMetadata(MetadataDate timeDate)
	{
		this.timeDate = timeDate;
	}

	public MetadataString	reportingUnit()
	{
		MetadataString	result = this.reportingUnit;
		if (result == null)
		{
			result = new MetadataString();
			this.reportingUnit = result;
		}
		return result;
	}

	public String getReportingUnit()
	{
		return this.reportingUnit == null ? null : reportingUnit().getValue();
	}

	public MetadataString getReportingUnitMetadata()
	{
		return reportingUnit;
	}

	public void setReportingUnit(String reportingUnit)
	{
		if (reportingUnit != null)
			this.reportingUnit().setValue(reportingUnit);
	}

	public void setReportingUnitMetadata(MetadataString reportingUnit)
	{
		this.reportingUnit = reportingUnit;
	}

	public MetadataString	damageExtent()
	{
		MetadataString	result = this.damageExtent;
		if (result == null)
		{
			result = new MetadataString();
			this.damageExtent = result;
		}
		return result;
	}

	public String getDamageExtent()
	{
		return this.damageExtent == null ? null : damageExtent().getValue();
	}

	public MetadataString getDamageExtentMetadata()
	{
		return damageExtent;
	}

	public void setDamageExtent(String damageExtent)
	{
		if (damageExtent != null)
			this.damageExtent().setValue(damageExtent);
	}

	public void setDamageExtentMetadata(MetadataString damageExtent)
	{
		this.damageExtent = damageExtent;
	}

	public MetadataString	observedActivity()
	{
		MetadataString	result = this.observedActivity;
		if (result == null)
		{
			result = new MetadataString();
			this.observedActivity = result;
		}
		return result;
	}

	public String getObservedActivity()
	{
		return this.observedActivity == null ? null : observedActivity().getValue();
	}

	public MetadataString getObservedActivityMetadata()
	{
		return observedActivity;
	}

	public void setObservedActivity(String observedActivity)
	{
		if (observedActivity != null)
			this.observedActivity().setValue(observedActivity);
	}

	public void setObservedActivityMetadata(MetadataString observedActivity)
	{
		this.observedActivity = observedActivity;
	}

	public MetadataString	rawPlace()
	{
		MetadataString	result = this.rawPlace;
		if (result == null)
		{
			result = new MetadataString();
			this.rawPlace = result;
		}
		return result;
	}

	public String getRawPlace()
	{
		return this.rawPlace == null ? null : rawPlace().getValue();
	}

	public MetadataString getRawPlaceMetadata()
	{
		return rawPlace;
	}

	public void setRawPlace(String rawPlace)
	{
		if (rawPlace != null)
			this.rawPlace().setValue(rawPlace);
	}

	public void setRawPlaceMetadata(MetadataString rawPlace)
	{
		this.rawPlace = rawPlace;
	}

	public GisLocation getPlace()
	{
		return place;
	}

	public void setPlace(GisLocation place)
	{
		this.place = place;
	}

	public MetadataString	observedUnits()
	{
		MetadataString	result = this.observedUnits;
		if (result == null)
		{
			result = new MetadataString();
			this.observedUnits = result;
		}
		return result;
	}

	public String getObservedUnits()
	{
		return this.observedUnits == null ? null : observedUnits().getValue();
	}

	public MetadataString getObservedUnitsMetadata()
	{
		return observedUnits;
	}

	public void setObservedUnits(String observedUnits)
	{
		if (observedUnits != null)
			this.observedUnits().setValue(observedUnits);
	}

	public void setObservedUnitsMetadata(MetadataString observedUnits)
	{
		this.observedUnits = observedUnits;
	}

	public MetadataString	observedEquipment()
	{
		MetadataString	result = this.observedEquipment;
		if (result == null)
		{
			result = new MetadataString();
			this.observedEquipment = result;
		}
		return result;
	}

	public String getObservedEquipment()
	{
		return this.observedEquipment == null ? null : observedEquipment().getValue();
	}

	public MetadataString getObservedEquipmentMetadata()
	{
		return observedEquipment;
	}

	public void setObservedEquipment(String observedEquipment)
	{
		if (observedEquipment != null)
			this.observedEquipment().setValue(observedEquipment);
	}

	public void setObservedEquipmentMetadata(MetadataString observedEquipment)
	{
		this.observedEquipment = observedEquipment;
	}

	public MetadataString	assessment()
	{
		MetadataString	result = this.assessment;
		if (result == null)
		{
			result = new MetadataString();
			this.assessment = result;
		}
		return result;
	}

	public String getAssessment()
	{
		return this.assessment == null ? null : assessment().getValue();
	}

	public MetadataString getAssessmentMetadata()
	{
		return assessment;
	}

	public void setAssessment(String assessment)
	{
		if (assessment != null)
			this.assessment().setValue(assessment);
	}

	public void setAssessmentMetadata(MetadataString assessment)
	{
		this.assessment = assessment;
	}

	public MetadataString	additionalNarrative()
	{
		MetadataString	result = this.additionalNarrative;
		if (result == null)
		{
			result = new MetadataString();
			this.additionalNarrative = result;
		}
		return result;
	}

	public String getAdditionalNarrative()
	{
		return this.additionalNarrative == null ? null : additionalNarrative().getValue();
	}

	public MetadataString getAdditionalNarrativeMetadata()
	{
		return additionalNarrative;
	}

	public void setAdditionalNarrative(String additionalNarrative)
	{
		if (additionalNarrative != null)
			this.additionalNarrative().setValue(additionalNarrative);
	}

	public void setAdditionalNarrativeMetadata(MetadataString additionalNarrative)
	{
		this.additionalNarrative = additionalNarrative;
	}

	public MetadataString	photograph()
	{
		MetadataString	result = this.photograph;
		if (result == null)
		{
			result = new MetadataString();
			this.photograph = result;
		}
		return result;
	}

	public String getPhotograph()
	{
		return this.photograph == null ? null : photograph().getValue();
	}

	public MetadataString getPhotographMetadata()
	{
		return photograph;
	}

	public void setPhotograph(String photograph)
	{
		if (photograph != null)
			this.photograph().setValue(photograph);
	}

	public void setPhotographMetadata(MetadataString photograph)
	{
		this.photograph = photograph;
	}
}
