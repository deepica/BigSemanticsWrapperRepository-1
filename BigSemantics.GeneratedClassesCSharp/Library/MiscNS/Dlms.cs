//
// Dlms.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.MiscNS 
{
	/// <summary>
	/// The DLMS Class
	/// </summary>
	[SimplInherit]
	public class Dlms : CompoundDocument
	{
		[SimplScalar]
		private MetadataString subject;

		public Dlms()
		{ }

		public Dlms(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Subject
		{
			get{return subject;}
			set
			{
				if (this.subject != value)
				{
					this.subject = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}