public class musicthing
{
    
    public static Audio song = new Audio();
    
    public static void main(String[] args)
    {
        
        
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(300, 300);
        StdDraw.setXscale(0,300);
        StdDraw.setYscale(0,300);
        //Font font1 = new Font("Arial", Font.BOLD, 150);
        //StdDraw.setFont(font1);
        
        int songIteration = 1;
        //int totalTime = 0;
        
        while(songIteration != 180)
        {
            
            StdDraw.clear();
            StdDraw.text(150,150, "Second: " + Integer.toString(songIteration));
            //StdDraw.text(150,200, "Total Time: " + Integer.toString(totalTime));
            StdDraw.show();
            
            song.playloop("blouberg.wav");

            //totalTime = totalTime + 1;
            
            StdDraw.pause(1000 + (songIteration-1)*1000);
            
            
            song.stopmusic();
            
            songIteration++;
            
            System.gc();
            
            
            
        }
            
        
    }

}
