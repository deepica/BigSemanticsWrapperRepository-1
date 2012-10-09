//
// PatentAuthor.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.Generated.Library.PatentNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.PatentNS 
{
	/// <summary>
	/// Authors of Patents; really this should be a mix-in to author
	/// </summary>
	[SimplInherit]
	public class PatentAuthor<CW> : Author where CW : Patent
	{
		public PatentAuthor()
		{ }

		public PatentAuthor(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
