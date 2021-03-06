//
// TopicCluster.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.UvaNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.UvaNS 
{
	[SimplInherit]
	public class TopicCluster : Metadata
	{
		[SimplScalar]
		private MetadataInteger id;

		[SimplCollection("document")]
		[MmName("document_set")]
		private List<Document> documentSet;

		[SimplCollection("keyword_set")]
		[MmName("keyword_sets")]
		private List<KeywordSet> keywordSets;

		[SimplScalar]
		private MetadataInteger x;

		[SimplScalar]
		private MetadataInteger y;

		[SimplScalar]
		private MetadataInteger width;

		[SimplScalar]
		private MetadataInteger height;

		public TopicCluster()
		{ }

		public TopicCluster(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataInteger Id
		{
			get{return id;}
			set
			{
				if (this.id != value)
				{
					this.id = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Document> DocumentSet
		{
			get{return documentSet;}
			set
			{
				if (this.documentSet != value)
				{
					this.documentSet = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<KeywordSet> KeywordSets
		{
			get{return keywordSets;}
			set
			{
				if (this.keywordSets != value)
				{
					this.keywordSets = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger X
		{
			get{return x;}
			set
			{
				if (this.x != value)
				{
					this.x = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger Y
		{
			get{return y;}
			set
			{
				if (this.y != value)
				{
					this.y = value;
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
	}
}
