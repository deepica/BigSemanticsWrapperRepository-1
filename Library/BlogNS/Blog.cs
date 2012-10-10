//
// Blog.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.BlogNS;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.BlogNS 
{
	[SimplInherit]
	public class Blog : CreativeWork
	{
		[SimplCollection("post")]
		[MmName("posts")]
		private List<Post> posts;

		public Blog()
		{ }

		public Blog(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Post> Posts
		{
			get{return posts;}
			set
			{
				if (this.posts != value)
				{
					this.posts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
