//
// MediaContent.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.RssNS 
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

		public MediaContent(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataInteger Height
		{
			get{return height;}
			set
			{
				if (this.height != value)
				{
					this.height = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL MediaUrl
		{
			get{return mediaUrl;}
			set
			{
				if (this.mediaUrl != value)
				{
					this.mediaUrl = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger Width
		{
			get{return width;}
			set
			{
				if (this.width != value)
				{
					this.width = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
