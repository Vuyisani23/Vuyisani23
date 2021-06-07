//package com.gmail.linahrose06;

//Music class Source Code

public class musicAlbum
{
//private members of the class
	private String titleOfAlbum = "Milava WakuFB";
	private int numberOfTracks = 1;
	private String nameOfArtist = "Lava$";
	private String namesOfTracks = "Busy Body";
	private double numberOfMinutes = 3.45;

//set methods
	public void setNumTracks( int trackNumber)
	{
   	this.numberOfTracks = trackNumber;
	}


	public void setTitleAlb( String AlbumName)
	{
     	this.titleOfAlbum = AlbumName;
	}


	public void setNameArtist( String artistName)
	{
      	this.nameOfArtist = artistName;
	}


	public void setNameTracks( String trackName)
	{
      	this.namesOfTracks = trackName;
	}


	public void setNumMin( double trackTime)
	{
      	this.numberOfMinutes = trackTime;
	}

//get methods
	public int getNumTracks()
	{
   	return this.numberOfTracks;
	}


	public String getTitleAlb()
	{
	return this.titleOfAlbum;
	}


	public String getNameArtist()
	{
     	return this.nameOfArtist;
	}


	public String getNameTracks()
	{
     	return this.namesOfTracks;
	}


	public double getNumMin()
	{
     	return this.numberOfMinutes;
	}

	public static void main(String[] args)
	{
		System.out.println("Hey there");

		musicAlbum alb1 = new musicAlbum();

		int quant = alb1.getNumTracks();
		String albName = alb1.getTitleAlb();
		String singer = alb1.getNameArtist();
		String song = alb1.getNameTracks();
		double minuten = alb1.getNumMin();

		System.out.println(quant);
		System.out.println(albName);
		System.out.println(singer);
		System.out.println(song);
		System.out.println(minuten);
	}


}
