//
// LeagueRelationshipList.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.LeagueoflegendsNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.LeagueoflegendsNS 
{
	[SimplInherit]
	public class LeagueRelationshipList : CompoundDocument
	{
		[SimplCollection("league_champion")]
		[MmName("champions")]
		private List<LeagueChampion> champions;

		public LeagueRelationshipList()
		{ }

		public LeagueRelationshipList(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<LeagueChampion> Champions
		{
			get{return champions;}
			set
			{
				if (this.champions != value)
				{
					this.champions = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
