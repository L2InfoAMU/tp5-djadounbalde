package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image {

    int width;
    int height;
    List<Color> palette;
    int[][] indexesOfColors;

    public PaletteRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
        //createRepresentation();
        for(int i=0 ; i<width ; i++){
            for(int j=0; j<height ; j++){
                setPixelColor(color,i,j);
            }
        }

    }

    public PaletteRasterImage(Color[][] pixels){
        //createRepresentation();
        for(int x=0;x<pixels.length ; x++){
            for(int y=0 ; y<pixels.length ; y++){
                 setPixelColor(pixels[x][y], x,y);
            }
        }
    }
    public void createRepresentation(){
        indexesOfColors = new int[width][height] ;
        List Color = new ArrayList() ;

    }
    void setPixelColor(Color color, int x, int y){
        if(!palette.contains(color) )
            palette.add(color);
    }

    @Override
    public Color getPixelColor(int x, int y){
        return palette.get(indexesOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels){
        for(int x=0; x<width ; x++){
            for(int y=0 ; y<height ; y++){
                pixels[x][y]=palette.get(indexesOfColors[x][y]) ;
            }
        }

    }





    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }



    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }



}



