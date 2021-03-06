package ecologylab.bigsemantics.generated.library.video;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.video.YoutubeVideo;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class YoutubeVideoList extends CompoundDocument
{
	@simpl_collection("youtube_video")
	@mm_name("videos")
	private List<YoutubeVideo> videos;

	public YoutubeVideoList()
	{ super(); }

	public YoutubeVideoList(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<YoutubeVideo> getVideos()
	{
		return videos;
	}

  // lazy evaluation:
  public List<YoutubeVideo> videos()
  {
    if (videos == null)
      videos = new ArrayList<YoutubeVideo>();
    return videos;
  }

  // addTo:
  public void addToVideos(YoutubeVideo element)
  {
    videos().add(element);
  }

  // size:
  public int videosSize()
  {
    return videos == null ? 0 : videos.size();
  }

	public void setVideos(List<YoutubeVideo> videos)
	{
		this.videos = videos;
	}
}
