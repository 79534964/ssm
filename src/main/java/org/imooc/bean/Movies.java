package org.imooc.bean;

public class Movies {
	private Integer id;
	private String movieName;
	private String movieImg;
	private String movieHref;
	private String movieType;
	private Float movieScore;
	private String movieText;
	private Integer movieFrom;
	private MoviesPeople moviesPeople;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieImg() {
		return movieImg;
	}

	public void setMovieImg(String movieImg) {
		this.movieImg = movieImg;
	}

	public String getMovieHref() {
		return movieHref;
	}

	public void setMovieHref(String movieHref) {
		this.movieHref = movieHref;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public Float getMovieScore() {
		return movieScore;
	}

	public void setMovieScore(Float movieScore) {
		this.movieScore = movieScore;
	}

	public String getMovieText() {
		return movieText;
	}

	public void setMovieText(String movieText) {
		this.movieText = movieText;
	}

	public Integer getMovieFrom() {
		return movieFrom;
	}

	public void setMovieFrom(Integer movieFrom) {
		this.movieFrom = movieFrom;
	}

	public MoviesPeople getMoviesPeople() {
		return moviesPeople;
	}

	public void setMoviesPeople(MoviesPeople moviesPeople) {
		this.moviesPeople = moviesPeople;
	}
}
