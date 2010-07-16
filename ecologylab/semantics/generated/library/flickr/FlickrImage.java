package ecologylab.semantics.generated.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.uva.*;
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
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	A Flickr Image
**/ 

@simpl_inherit

public class  FlickrImage
extends  Image
{

	 @simpl_scalar private MetadataParsedURL	browsePurl;
	@simpl_collection("flickr_tag") private ArrayList<FlickrTag>	flickrTags;

/**
	Constructor
**/ 

public FlickrImage()
{
 super();
}

/**
	Constructor
**/ 

public FlickrImage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for browsePurl
**/ 

public MetadataParsedURL	browsePurl()
{
MetadataParsedURL	result	=this.browsePurl;
if(result == null)
{
result = new MetadataParsedURL();
this.browsePurl	=	 result;
}
return result;
}

/**
	Gets the value of the field browsePurl
**/ 

public ParsedURL getBrowsePurl(){
return browsePurl().getValue();
}

/**
	Sets the value of the field browsePurl
**/ 

public void setBrowsePurl( ParsedURL browsePurl )
{
this.browsePurl().setValue(browsePurl);
}

/**
	The heavy weight setter method for field browsePurl
**/ 

public void hwSetBrowsePurl( ParsedURL browsePurl )
{
this.browsePurl().setValue(browsePurl);
rebuildCompositeTermVector();
 }
/**
	 Sets the browsePurl directly
**/ 

public void setBrowsePurlMetadata(MetadataParsedURL browsePurl)
{	this.browsePurl = browsePurl;
}
/**
	Heavy Weight Direct setter method for browsePurl
**/ 

public void hwSetBrowsePurlMetadata(MetadataParsedURL browsePurl)
{	 if(this.browsePurl!=null && this.browsePurl.getValue()!=null && hasTermVector())
		 termVector().remove(this.browsePurl.termVector());
	 this.browsePurl = browsePurl;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for flickrTags
**/ 

public  ArrayList<FlickrTag>	flickrTags()
{
 ArrayList<FlickrTag>	result	=this.flickrTags;
if(result == null)
{
result = new  ArrayList<FlickrTag>();
this.flickrTags	=	 result;
}
return result;
}

/**
	Set the value of field flickrTags
**/ 

public void setFlickrTags(  ArrayList<FlickrTag> flickrTags )
{
this.flickrTags = flickrTags ;
}

/**
	Get the value of field flickrTags
**/ 

public  ArrayList<FlickrTag> getFlickrTags(){
return this.flickrTags;
}

}
