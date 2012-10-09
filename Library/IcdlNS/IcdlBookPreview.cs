//
// IcdlBookPreview.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
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

namespace Ecologylab.Semantics.Generated.Library.IcdlNS 
{
	/// <summary>
	/// ICDL About This Book Page
	/// </summary>
	[SimplInherit]
	public class IcdlBookPreview : Metadata
	{
		[SimplComposite]
		[MmName("author")]
		private Author author;

		[SimplComposite]
		[MmName("illustrator")]
		private Author illustrator;

		[SimplScalar]
		private MetadataString summary;

		[SimplScalar]
		private MetadataString year;

		[SimplScalar]
		private MetadataString languages;

		[SimplScalar]
		private MetadataString publisher;

		[SimplScalar]
		private MetadataString isbn;

		[SimplScalar]
		private MetadataString awards;

		public IcdlBookPreview()
		{ }

		public IcdlBookPreview(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Author Author
		{
			get{return author;}
			set
			{
				if (this.author != value)
				{
					this.author = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Author Illustrator
		{
			get{return illustrator;}
			set
			{
				if (this.illustrator != value)
				{
					this.illustrator = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Summary
		{
			get{return summary;}
			set
			{
				if (this.summary != value)
				{
					this.summary = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Year
		{
			get{return year;}
			set
			{
				if (this.year != value)
				{
					this.year = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Languages
		{
			get{return languages;}
			set
			{
				if (this.languages != value)
				{
					this.languages = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Publisher
		{
			get{return publisher;}
			set
			{
				if (this.publisher != value)
				{
					this.publisher = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Isbn
		{
			get{return isbn;}
			set
			{
				if (this.isbn != value)
				{
					this.isbn = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Awards
		{
			get{return awards;}
			set
			{
				if (this.awards != value)
				{
					this.awards = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
