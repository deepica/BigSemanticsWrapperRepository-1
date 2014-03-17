package ecologylab.bigsemantics.generated.library.movie;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.movie.Movie;
import ecologylab.bigsemantics.generated.library.person.Person;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class MoviePerson extends Person
{
	/** 
	 *Movies directed by this person.
	 */ 
	@simpl_collection("movie")
	@mm_name("movies_directed")
	private List<Movie> moviesDirected;

	/** 
	 *Movies written by this person.
	 */ 
	@simpl_collection("movie")
	@mm_name("movies_written")
	private List<Movie> moviesWritten;

	/** 
	 *Movies this person acted in.
	 */ 
	@simpl_collection("movie")
	@mm_name("movies_acted_in")
	private List<Movie> moviesActedIn;

	/** 
	 *Movies related to this person.
	 */ 
	@simpl_collection("movie")
	@mm_name("movies")
	private List<Movie> movies;

	/** 
	 *The awards this person has won.
	 */ 
	@simpl_collection("award")
	@mm_name("awards")
	private List<MetadataString> awards;

	@simpl_scalar
	private MetadataString role;

	@simpl_scalar
	private MetadataString rating;

	public MoviePerson()
	{ super(); }

	public MoviePerson(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Movie> getMoviesDirected()
	{
		return moviesDirected;
	}

  // lazy evaluation:
  public List<Movie> moviesDirected()
  {
    if (moviesDirected == null)
      moviesDirected = new ArrayList<Movie>();
    return moviesDirected;
  }

  // addTo:
  public void addToMoviesDirected(Movie element)
  {
    moviesDirected().add(element);
  }

  // size:
  public int moviesDirectedSize()
  {
    return moviesDirected == null ? 0 : moviesDirected.size();
  }

	public void setMoviesDirected(List<Movie> moviesDirected)
	{
		this.moviesDirected = moviesDirected;
	}

	public List<Movie> getMoviesWritten()
	{
		return moviesWritten;
	}

  // lazy evaluation:
  public List<Movie> moviesWritten()
  {
    if (moviesWritten == null)
      moviesWritten = new ArrayList<Movie>();
    return moviesWritten;
  }

  // addTo:
  public void addToMoviesWritten(Movie element)
  {
    moviesWritten().add(element);
  }

  // size:
  public int moviesWrittenSize()
  {
    return moviesWritten == null ? 0 : moviesWritten.size();
  }

	public void setMoviesWritten(List<Movie> moviesWritten)
	{
		this.moviesWritten = moviesWritten;
	}

	public List<Movie> getMoviesActedIn()
	{
		return moviesActedIn;
	}

  // lazy evaluation:
  public List<Movie> moviesActedIn()
  {
    if (moviesActedIn == null)
      moviesActedIn = new ArrayList<Movie>();
    return moviesActedIn;
  }

  // addTo:
  public void addToMoviesActedIn(Movie element)
  {
    moviesActedIn().add(element);
  }

  // size:
  public int moviesActedInSize()
  {
    return moviesActedIn == null ? 0 : moviesActedIn.size();
  }

	public void setMoviesActedIn(List<Movie> moviesActedIn)
	{
		this.moviesActedIn = moviesActedIn;
	}

	public List<Movie> getMovies()
	{
		return movies;
	}

  // lazy evaluation:
  public List<Movie> movies()
  {
    if (movies == null)
      movies = new ArrayList<Movie>();
    return movies;
  }

  // addTo:
  public void addToMovies(Movie element)
  {
    movies().add(element);
  }

  // size:
  public int moviesSize()
  {
    return movies == null ? 0 : movies.size();
  }

	public void setMovies(List<Movie> movies)
	{
		this.movies = movies;
	}

	public List<MetadataString> getAwards()
	{
		return awards;
	}

  // lazy evaluation:
  public List<MetadataString> awards()
  {
    if (awards == null)
      awards = new ArrayList<MetadataString>();
    return awards;
  }

  // addTo:
  public void addToAwards(MetadataString element)
  {
    awards().add(element);
  }

  // size:
  public int awardsSize()
  {
    return awards == null ? 0 : awards.size();
  }

	public void setAwards(List<MetadataString> awards)
	{
		this.awards = awards;
	}

	public MetadataString	role()
	{
		MetadataString	result = this.role;
		if (result == null)
		{
			result = new MetadataString();
			this.role = result;
		}
		return result;
	}

	public String getRole()
	{
		return this.role == null ? null : role().getValue();
	}

	public MetadataString getRoleMetadata()
	{
		return role;
	}

	public void setRole(String role)
	{
		if (role != null)
			this.role().setValue(role);
	}

	public void setRoleMetadata(MetadataString role)
	{
		this.role = role;
	}

	public MetadataString	rating()
	{
		MetadataString	result = this.rating;
		if (result == null)
		{
			result = new MetadataString();
			this.rating = result;
		}
		return result;
	}

	public String getRating()
	{
		return this.rating == null ? null : rating().getValue();
	}

	public MetadataString getRatingMetadata()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		if (rating != null)
			this.rating().setValue(rating);
	}

	public void setRatingMetadata(MetadataString rating)
	{
		this.rating = rating;
	}
}
