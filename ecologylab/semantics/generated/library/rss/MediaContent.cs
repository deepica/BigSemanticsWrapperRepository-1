//
// MediaContent.cs
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
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.rss 
{
	[SimplInherit]
	public class MediaContent : Metadata
	{
		[SimplScalar]
		private MetadataInteger height;

		[SimplScalar]
		[SimplTag("url")]
		private MetadataParsedURL mediaUrl;

		[SimplScalar]
		private MetadataInteger width;

		public MediaContent()
		{ }

		public MetadataInteger Height
		{
			get{return height;}
			set{height = value;}
		}

		public MetadataParsedURL MediaUrl
		{
			get{return mediaUrl;}
			set{mediaUrl = value;}
		}

		public MetadataInteger Width
		{
			get{return width;}
			set{width = value;}
		}
	}
}
