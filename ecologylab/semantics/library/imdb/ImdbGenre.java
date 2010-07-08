package ecologylab.semantics.library.imdb;

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
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	IMDB genre
**/ 

@simpl_inherit

public class  ImdbGenre
extends  Document
{

	@simpl_collection("imdb_title") private ArrayList<ImdbTitle>	results;

/**
	Constructor
**/ 

public ImdbGenre()
{
 super();
}

/**
	Constructor
**/ 

public ImdbGenre(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for results
**/ 

public  ArrayList<ImdbTitle>	results()
{
 ArrayList<ImdbTitle>	result	=this.results;
if(result == null)
{
result = new  ArrayList<ImdbTitle>();
this.results	=	 result;
}
return result;
}

/**
	Set the value of field results
**/ 

public void setResults(  ArrayList<ImdbTitle> results )
{
this.results = results ;
}

/**
	Get the value of field results
**/ 

public  ArrayList<ImdbTitle> getResults(){
return this.results;
}

}

