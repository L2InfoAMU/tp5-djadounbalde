package image;
import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {

    int width ;
    int height ;
    Color [][] colors;


    public BruteRasterImage(Color color, int width, int height) {
        this.width=width;
        this.height=height;
        this.colors= new Color[width][height] ;
        for(int i=0 ; i<width ; i++){
            for(int j=0; j<height ; j++){
                this.colors[i][j]=color ;
            }
        }
    }

    public BruteRasterImage(Color[][] colors){
        setPixelsColor(colors);
    }

    private void setPixelsColor(Color[][] colors) {
        for(int x=0; x<width ; x++){
            for(int y=0 ; y<height ; y++){
                this.colors[x][y]=colors[x][y] ;
            }
        }
    }


    public void setPixelColor(Color color, int x, int y){
        this.colors[x][y]=color ;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[x][y] ;
    }


    public void createRepresentation(){
        colors = new Color[height][width] ;
    }

    protected void setWidth(int width){
        this.width=width;


    }


    protected void setHeight(int height){
        this.height=height ;
    }



    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
