package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;


/**
	Image from The Interantional Children's digital library.
**/ 

@xml_inherit

public class  IcdlImage
extends  Image
{


/**
	The language of the library
**/ 

	 @xml_leaf private MetadataString	languages;

/**
	Constructor
**/ 

public IcdlImage()
{
 super();
}

/**
	Constructor
**/ 

public IcdlImage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for languages
**/ 

public MetadataString	languages()
{
MetadataString	result	=this.languages;
if(result == null)
{
result = new MetadataString();
this.languages	=	 result;
}
return result;
}

/**
	Gets the value of the field languages
**/ 

public String getLanguages(){
return languages().getValue();
}

/**
	Sets the value of the field languages
**/ 

public void setLanguages( String languages )
{
this.languages().setValue(languages);
}

/**
	The heavy weight setter method for field languages
**/ 

public void hwSetLanguages( String languages )
{
this.languages().setValue(languages);
rebuildCompositeTermVector();
 }
/**
	 Sets the languages directly
**/ 

public void setLanguagesMetadata(MetadataString languages)
{	this.languages = languages;
}
/**
	Heavy Weight Direct setter method for languages
**/ 

public void hwSetLanguagesMetadata(MetadataString languages)
{	 if(this.languages!=null && this.languages.getValue()!=null && hasTermVector())
		 termVector().remove(this.languages.termVector());
	 this.languages = languages;
	rebuildCompositeTermVector();
}
}

