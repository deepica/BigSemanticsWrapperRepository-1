//
// TwitterSearchResults.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.BlogNS;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.SocialMediaNS 
{
	[SimplInherit]
	public class TwitterSearchResults : Search<Post>
	{
		public TwitterSearchResults()
		{ }

		public TwitterSearchResults(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}