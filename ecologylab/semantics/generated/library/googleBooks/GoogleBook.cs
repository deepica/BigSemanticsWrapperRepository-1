//
// GoogleBook.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 10/20/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.googleBooks;
using ecologylab.semantics.generated.library.publication;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.googleBooks 
{
	[SimplInherit]
	public class GoogleBook : Book
	{
		[SimplScalar]
		private MetadataString category;

		[SimplCollection("google_book")]
		[MmName("references_from_books")]
		private List<GoogleBook> referencesFromBooks;

		[SimplScalar]
		private MetadataParsedURL placesMentionedKml;

		[SimplCollection("page")]
		[MmName("selected_pages")]
		private List<Page> selectedPages;

		public GoogleBook()
		{ }

		public MetadataString Category
		{
			get{return category;}
			set{category = value;}
		}

		public List<GoogleBook> ReferencesFromBooks
		{
			get{return referencesFromBooks;}
			set{referencesFromBooks = value;}
		}

		public MetadataParsedURL PlacesMentionedKml
		{
			get{return placesMentionedKml;}
			set{placesMentionedKml = value;}
		}

		public List<Page> SelectedPages
		{
			get{return selectedPages;}
			set{selectedPages = value;}
		}
	}
}
