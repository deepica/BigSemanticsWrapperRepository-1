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
	A Flickr Image result page
**/ 

@xml_inherit

public class  FlickrImageDetail
extends  Document
{


private  @xml_nested FlickrImage	flickr_image;
/**
	Constructor
**/ 

public FlickrImageDetail()
{
 super();
}

/**
	Constructor
**/ 

public FlickrImageDetail(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for flickr_image
**/ 

public FlickrImage	flickr_image()
{
FlickrImage	result	=this.flickr_image;
if(result == null)
{
result = new FlickrImage();
this.flickr_image	=	 result;
}
return result;
}

/**
	Set the value of field flickr_image
**/ 

public void setFlickrImage( FlickrImage flickr_image )
{
this.flickr_image = flickr_image ;
}

/**
	Get the value of field flickr_image
**/ 

public FlickrImage getFlickrImage(){
return this.flickr_image;
}

}

