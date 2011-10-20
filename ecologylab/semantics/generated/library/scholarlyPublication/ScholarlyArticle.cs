//
// ScholarlyArticle.cs
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
using ecologylab.semantics.generated.library;
using ecologylab.semantics.generated.library.creativeWork;
using ecologylab.semantics.generated.library.scholarlyPublication;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.scholarlyPublication 
{
	[SimplInherit]
	public class ScholarlyArticle : CreativeWork
	{
		/// <summary>
		/// Metadata related to where this article was published.
		/// </summary>
		[SimplComposite]
		[MmName("source")]
		private Periodical source;

		/// <summary>
		/// citation.cfm
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL metadataPage;

		/// <summary>
		/// Papers cited by this paper.
		/// </summary>
		[SimplCollection("reference")]
		[MmName("references")]
		private List<ScholarlyArticle> references;

		/// <summary>
		/// Papers that cite this paper.
		/// </summary>
		[SimplCollection("citation")]
		[MmName("citations")]
		private List<ScholarlyArticle> citations;

		/// <summary>
		/// The Classifications of this paper.
		/// </summary>
		[SimplCollection("tag")]
		[MmName("classifications")]
		private List<Tag> classifications;

		/// <summary>
		/// Key Terms of the paper.
		/// </summary>
		[SimplCollection("tag")]
		[MmName("keywords")]
		private List<Tag> keywords;

		[SimplScalar]
		private MetadataString pages;

		public ScholarlyArticle()
		{ }

		public Periodical Source
		{
			get{return source;}
			set{source = value;}
		}

		public MetadataParsedURL MetadataPage
		{
			get{return metadataPage;}
			set{metadataPage = value;}
		}

		public List<ScholarlyArticle> References
		{
			get{return references;}
			set{references = value;}
		}

		public List<ScholarlyArticle> Citations
		{
			get{return citations;}
			set{citations = value;}
		}

		public List<Tag> Classifications
		{
			get{return classifications;}
			set{classifications = value;}
		}

		public List<Tag> Keywords
		{
			get{return keywords;}
			set{keywords = value;}
		}

		public MetadataString Pages
		{
			get{return pages;}
			set{pages = value;}
		}
	}
}
