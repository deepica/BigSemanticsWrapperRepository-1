package ecologylab.semantics.generated.library;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.googleBooks.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.publication.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.ImageClipping;
import ecologylab.semantics.metadata.builtins.MediaClipping;
import ecologylab.semantics.metadata.builtins.TextClipping;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.tools.MetaMetadataCompilerUtils;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	An article on wikipedia (used in cF)

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class WikipediaPage
extends WikipediaPageType
{

@simpl_scalar
private MetadataParsedURL	mainImageSrc;



/**
	Constructor
*/
public WikipediaPage()
{
 super();
}

/**
	Constructor
*/
public WikipediaPage(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for mainImageSrc
*/
public MetadataParsedURL	mainImageSrc()
{
	MetadataParsedURL	result = this.mainImageSrc;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.mainImageSrc = result;
	}
	return result;
}

/**
	Gets the value of the field mainImageSrc
*/
public ParsedURL getMainImageSrc()
{
	return this.mainImageSrc().getValue();
}

/**
	Sets the value of the field mainImageSrc
*/
public void setMainImageSrc(ParsedURL mainImageSrc)
{
	this.mainImageSrc().setValue(mainImageSrc);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: mainImageSrc
*/
public boolean isNullMainImageSrc()
{
	return mainImageSrc == null || mainImageSrc.getValue() == null;
}

/**
	The heavy weight setter method for field mainImageSrc
*/
public void hwSetMainImageSrc(ParsedURL mainImageSrc)
{
	this.mainImageSrc().setValue(mainImageSrc);
	rebuildCompositeTermVector();
}

/**
	 Sets the mainImageSrc directly.
*/
public void setMainImageSrcMetadata(MetadataParsedURL mainImageSrc)
{
	this.mainImageSrc = mainImageSrc;
}

/**
	Heavy Weight Direct setter method for mainImageSrc
*/
public void hwSetMainImageSrcMetadata(MetadataParsedURL mainImageSrc)
{
	if (this.mainImageSrc != null && this.mainImageSrc.getValue() != null && hasTermVector())
		termVector().remove(this.mainImageSrc.termVector());
	this.mainImageSrc = mainImageSrc;
	rebuildCompositeTermVector();
}


}

