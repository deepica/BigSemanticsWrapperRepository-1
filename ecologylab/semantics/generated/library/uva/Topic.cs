//
// Topic.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 10/20/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using ecologylab.collections;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.uva 
{
	/// <summary>
	/// For Collabartion with UVA's Cluster formation project.
	/// </summary>
	[SimplInherit]
	public class Topic : CompoundDocument
	{
		[SimplScalar]
		private MetadataStringBuilder contentKeywords;

		[SimplScalar]
		private MetadataStringBuilder anchorKeywords;

		[SimplScalar]
		private MetadataStringBuilder urlKeywords;

		[SimplScalar]
		private MetadataStringBuilder titleKeywords;

		[SimplScalar]
		private MetadataInteger id;

		public Topic()
		{ }

		public MetadataStringBuilder ContentKeywords
		{
			get{return contentKeywords;}
			set{contentKeywords = value;}
		}

		public MetadataStringBuilder AnchorKeywords
		{
			get{return anchorKeywords;}
			set{anchorKeywords = value;}
		}

		public MetadataStringBuilder UrlKeywords
		{
			get{return urlKeywords;}
			set{urlKeywords = value;}
		}

		public MetadataStringBuilder TitleKeywords
		{
			get{return titleKeywords;}
			set{titleKeywords = value;}
		}

		public MetadataInteger Id
		{
			get{return id;}
			set{id = value;}
		}
	}
}
