//
// FastflipSearch.cs
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
using ecologylab.collections;
using ecologylab.semantics.generated.library.fastflip;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.fastflip 
{
	/// <summary>
	/// Fast Flip Search
	/// </summary>
	[SimplInherit]
	public class FastflipSearch : CompoundDocument
	{
		[SimplCollection("thumbnail")]
		[MmName("thumbnails")]
		private List<Thumbnail> thumbnails;

		public FastflipSearch()
		{ }

		public List<Thumbnail> Thumbnails
		{
			get{return thumbnails;}
			set{thumbnails = value;}
		}
	}
}
