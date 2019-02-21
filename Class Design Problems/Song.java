public class Song
{
    private String SongName;
    private double SongLength;
    private boolean SongRelease;
    
    public String toString(){
        String output = SongName + SongLength + SongRelease;
        return output;
    }
}
