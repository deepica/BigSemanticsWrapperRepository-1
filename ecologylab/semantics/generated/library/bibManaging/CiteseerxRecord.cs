//
// CiteseerxRecord.cs
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
using ecologylab.semantics.generated.library.bibManaging;
using ecologylab.semantics.generated.library.scholarlyPublication;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.bibManaging 
{
	/// <summary>
	/// CiteSeerX record for an article.
	/// </summary>
	[SimplInherit]
	public class CiteseerxRecord : ScholarlyArticle
	{
		[SimplComposite]
		[MmName("citation_info")]
		private CitationInfo citationInfo;

		public CiteseerxRecord()
		{ }

		public CitationInfo CitationInfo
		{
			get{return citationInfo;}
			set{citationInfo = value;}
		}
	}
}
