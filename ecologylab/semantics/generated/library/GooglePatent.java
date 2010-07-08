package ecologylab.semantics.generated.library;

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
	Google Patents Class
**/ 

@simpl_inherit

public class  GooglePatent
extends  Document
{


/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	inventor;

/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	abstractField;

/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	claims;

/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataParsedURL	picLink;
	@simpl_collection("search_result") private ArrayList<SearchResult>	referencedBys;
	@simpl_collection("search_result") private ArrayList<SearchResult>	citations;
	@simpl_collection("search_result") private ArrayList<SearchResult>	picLinks;

/**
	Constructor
**/ 

public GooglePatent()
{
 super();
}

/**
	Constructor
**/ 

public GooglePatent(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for inventor
**/ 

public MetadataString	inventor()
{
MetadataString	result	=this.inventor;
if(result == null)
{
result = new MetadataString();
this.inventor	=	 result;
}
return result;
}

/**
	Gets the value of the field inventor
**/ 

public String getInventor(){
return inventor().getValue();
}

/**
	Sets the value of the field inventor
**/ 

public void setInventor( String inventor )
{
this.inventor().setValue(inventor);
}

/**
	The heavy weight setter method for field inventor
**/ 

public void hwSetInventor( String inventor )
{
this.inventor().setValue(inventor);
rebuildCompositeTermVector();
 }
/**
	 Sets the inventor directly
**/ 

public void setInventorMetadata(MetadataString inventor)
{	this.inventor = inventor;
}
/**
	Heavy Weight Direct setter method for inventor
**/ 

public void hwSetInventorMetadata(MetadataString inventor)
{	 if(this.inventor!=null && this.inventor.getValue()!=null && hasTermVector())
		 termVector().remove(this.inventor.termVector());
	 this.inventor = inventor;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for abstractField
**/ 

public MetadataString	abstractField()
{
MetadataString	result	=this.abstractField;
if(result == null)
{
result = new MetadataString();
this.abstractField	=	 result;
}
return result;
}

/**
	Gets the value of the field abstractField
**/ 

public String getAbstractField(){
return abstractField().getValue();
}

/**
	Sets the value of the field abstractField
**/ 

public void setAbstractField( String abstractField )
{
this.abstractField().setValue(abstractField);
}

/**
	The heavy weight setter method for field abstractField
**/ 

public void hwSetAbstractField( String abstractField )
{
this.abstractField().setValue(abstractField);
rebuildCompositeTermVector();
 }
/**
	 Sets the abstractField directly
**/ 

public void setAbstractFieldMetadata(MetadataString abstractField)
{	this.abstractField = abstractField;
}
/**
	Heavy Weight Direct setter method for abstractField
**/ 

public void hwSetAbstractFieldMetadata(MetadataString abstractField)
{	 if(this.abstractField!=null && this.abstractField.getValue()!=null && hasTermVector())
		 termVector().remove(this.abstractField.termVector());
	 this.abstractField = abstractField;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for claims
**/ 

public MetadataString	claims()
{
MetadataString	result	=this.claims;
if(result == null)
{
result = new MetadataString();
this.claims	=	 result;
}
return result;
}

/**
	Gets the value of the field claims
**/ 

public String getClaims(){
return claims().getValue();
}

/**
	Sets the value of the field claims
**/ 

public void setClaims( String claims )
{
this.claims().setValue(claims);
}

/**
	The heavy weight setter method for field claims
**/ 

public void hwSetClaims( String claims )
{
this.claims().setValue(claims);
rebuildCompositeTermVector();
 }
/**
	 Sets the claims directly
**/ 

public void setClaimsMetadata(MetadataString claims)
{	this.claims = claims;
}
/**
	Heavy Weight Direct setter method for claims
**/ 

public void hwSetClaimsMetadata(MetadataString claims)
{	 if(this.claims!=null && this.claims.getValue()!=null && hasTermVector())
		 termVector().remove(this.claims.termVector());
	 this.claims = claims;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for picLink
**/ 

public MetadataParsedURL	picLink()
{
MetadataParsedURL	result	=this.picLink;
if(result == null)
{
result = new MetadataParsedURL();
this.picLink	=	 result;
}
return result;
}

/**
	Gets the value of the field picLink
**/ 

public ParsedURL getPicLink(){
return picLink().getValue();
}

/**
	Sets the value of the field picLink
**/ 

public void setPicLink( ParsedURL picLink )
{
this.picLink().setValue(picLink);
}

/**
	The heavy weight setter method for field picLink
**/ 

public void hwSetPicLink( ParsedURL picLink )
{
this.picLink().setValue(picLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the picLink directly
**/ 

public void setPicLinkMetadata(MetadataParsedURL picLink)
{	this.picLink = picLink;
}
/**
	Heavy Weight Direct setter method for picLink
**/ 

public void hwSetPicLinkMetadata(MetadataParsedURL picLink)
{	 if(this.picLink!=null && this.picLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.picLink.termVector());
	 this.picLink = picLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for referencedBys
**/ 

public  ArrayList<SearchResult>	referencedBys()
{
 ArrayList<SearchResult>	result	=this.referencedBys;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.referencedBys	=	 result;
}
return result;
}

/**
	Set the value of field referencedBys
**/ 

public void setReferencedBys(  ArrayList<SearchResult> referencedBys )
{
this.referencedBys = referencedBys ;
}

/**
	Get the value of field referencedBys
**/ 

public  ArrayList<SearchResult> getReferencedBys(){
return this.referencedBys;
}

/**
	Lazy Evaluation for citations
**/ 

public  ArrayList<SearchResult>	citations()
{
 ArrayList<SearchResult>	result	=this.citations;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.citations	=	 result;
}
return result;
}

/**
	Set the value of field citations
**/ 

public void setCitations(  ArrayList<SearchResult> citations )
{
this.citations = citations ;
}

/**
	Get the value of field citations
**/ 

public  ArrayList<SearchResult> getCitations(){
return this.citations;
}

/**
	Lazy Evaluation for picLinks
**/ 

public  ArrayList<SearchResult>	picLinks()
{
 ArrayList<SearchResult>	result	=this.picLinks;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.picLinks	=	 result;
}
return result;
}

/**
	Set the value of field picLinks
**/ 

public void setPicLinks(  ArrayList<SearchResult> picLinks )
{
this.picLinks = picLinks ;
}

/**
	Get the value of field picLinks
**/ 

public  ArrayList<SearchResult> getPicLinks(){
return this.picLinks;
}

}
