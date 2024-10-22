public class Song {
    private String title;
    private String artist;
    private String genre;
    private int year;
    private int timesPlayed;
    public Song (String title, String artist,String genre ,int year, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.genre = genre;
        this.timesPlayed = timesPlayed;
    }

    public String getArtist() {
        return artist;
    }
    public String getTitle() {
        return title;
    }
    public Integer getYear() {
        return year;
    }
    public String getGenre() {
        return genre;
    }
    public int getTimesPlayed() {
        return timesPlayed;
    }

    @Override
    //重写了toSring方法以便于将流中的元素转为字符串写入txt中（C语言语法幻视）
    public String toString() {
        return String.format("Title: %s, Artist: %s, Genre: %s, Year: %d, Timesplayed: %d\n",
                title,artist,genre,year,timesPlayed);
    }
}
