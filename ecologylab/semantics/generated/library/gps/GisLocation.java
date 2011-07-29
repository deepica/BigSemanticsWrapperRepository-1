package ecologylab.semantics.generated.library.gps;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.metadata.scalar.MetadataDouble;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  GisLocation.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class GisLocation extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataDouble latitude;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataDouble longitude;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataDouble altitude;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString satellites;

	public GisLocation()
	{ }

	public GisLocation(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataDouble	latitude()
	{
		ecologylab.semantics.metadata.scalar.MetadataDouble	result = this.latitude;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataDouble();
			this.latitude = result;
		}
		return result;
	}

	public java.lang.Double getLatitude()
	{
		return this.latitude == null ? 0.0 : latitude().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataDouble getLatitudeMetadata()
	{
		return latitude;
	}

	public void setLatitude(java.lang.Double latitude)
	{
		if (latitude != 0.0)
			this.latitude().setValue(latitude);
	}

	public void setLatitudeMetadata(ecologylab.semantics.metadata.scalar.MetadataDouble latitude)
	{
		this.latitude = latitude;
	}

	public ecologylab.semantics.metadata.scalar.MetadataDouble	longitude()
	{
		ecologylab.semantics.metadata.scalar.MetadataDouble	result = this.longitude;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataDouble();
			this.longitude = result;
		}
		return result;
	}

	public java.lang.Double getLongitude()
	{
		return this.longitude == null ? 0.0 : longitude().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataDouble getLongitudeMetadata()
	{
		return longitude;
	}

	public void setLongitude(java.lang.Double longitude)
	{
		if (longitude != 0.0)
			this.longitude().setValue(longitude);
	}

	public void setLongitudeMetadata(ecologylab.semantics.metadata.scalar.MetadataDouble longitude)
	{
		this.longitude = longitude;
	}

	public ecologylab.semantics.metadata.scalar.MetadataDouble	altitude()
	{
		ecologylab.semantics.metadata.scalar.MetadataDouble	result = this.altitude;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataDouble();
			this.altitude = result;
		}
		return result;
	}

	public java.lang.Double getAltitude()
	{
		return this.altitude == null ? 0.0 : altitude().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataDouble getAltitudeMetadata()
	{
		return altitude;
	}

	public void setAltitude(java.lang.Double altitude)
	{
		if (altitude != 0.0)
			this.altitude().setValue(altitude);
	}

	public void setAltitudeMetadata(ecologylab.semantics.metadata.scalar.MetadataDouble altitude)
	{
		this.altitude = altitude;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	satellites()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.satellites;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.satellites = result;
		}
		return result;
	}

	public java.lang.String getSatellites()
	{
		return this.satellites == null ? null : satellites().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSatellitesMetadata()
	{
		return satellites;
	}

	public void setSatellites(java.lang.String satellites)
	{
		if (satellites != null)
			this.satellites().setValue(satellites);
	}

	public void setSatellitesMetadata(ecologylab.semantics.metadata.scalar.MetadataString satellites)
	{
		this.satellites = satellites;
	}
}
