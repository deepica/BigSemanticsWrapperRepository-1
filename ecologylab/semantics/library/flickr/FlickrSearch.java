package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.xml.ElementState.xml_tag;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.types.element.Mappable;
import ecologylab.xml.xml_inherit;
import java.util.*;


/**
	The flickr search class
**/ 

@xml_inherit

public class  FlickrSearch
extends  Document
{

	@xml_collection("flickr_image") private ArrayList<FlickrImage>	flickrResults;

/**
	Constructor
**/ 

public FlickrSearch()
{
 super();
}

/**
	Constructor
**/ 

public FlickrSearch(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for flickrResults
**/ 

public  ArrayList<FlickrImage>	flickrResults()
{
 ArrayList<FlickrImage>	result	=this.flickrResults;
if(result == null)
{
result = new  ArrayList<FlickrImage>();
this.flickrResults	=	 result;
}
return result;
}

/**
	Set the value of field flickrResults
**/ 

public void setFlickrResults(  ArrayList<FlickrImage> flickrResults )
{
this.flickrResults = flickrResults ;
}

/**
	Get the value of field flickrResults
**/ 

public  ArrayList<FlickrImage> getFlickrResults(){
return this.flickrResults;
}

}

