//
// Forever21.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ProductAndServiceNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.FashionNS 
{
	[SimplInherit]
	[SimplTag("forever_21")]
	public class Forever21 : Product
	{
		[SimplCollection("document")]
		[MmName("available_colors")]
		private List<Document> availableColors;

		[SimplCollection("document")]
		[MmName("details")]
		private List<Document> details;

		public Forever21()
		{ }

		public Forever21(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Document> AvailableColors
		{
			get{return availableColors;}
			set
			{
				if (this.availableColors != value)
				{
					this.availableColors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Document> Details
		{
			get{return details;}
			set
			{
				if (this.details != value)
				{
					this.details = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
