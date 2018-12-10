package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage implements Image {

    int width;
    int height;
    List<Color> palette;
    int[][] indexesOfColors;

    public PaletteRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
        createRepresentation();
        for(int i=0 ; i<width ; i++){
            for(int j=0; j<height ; j++){
                setPixelColor(color,i,j);
            }
        }

    }

    public PaletteRasterImage(Color[][] pixels){


        this.height= Matrices.getColumnCount(pixels);
        this.width=Matrices.getRowCount(pixels);
        createRepresentation();
        for(int x=0;x<width ; x++){
            for(int y=0 ; y<height ; y++) {
                setPixelColor(pixels[x][y],x,y);
            }
        }
    }
    public void createRepresentation(){
        indexesOfColors = new int[width][height] ;
        palette = new ArrayList<>() ;

    }
    void setPixelColor(Color color, int x, int y){

        if(!palette.contains(color)) {
            palette.add(color);
        }
        indexesOfColors[x][y]=palette.indexOf(color);
    }

    @Override
    public Color getPixelColor(int x, int y){
        return palette.get(indexesOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels){
        for(int x=0; x<width ; x++){
            for(int y=0 ; y<height ; y++){
                setPixelColor(pixels[x][y],x,y);
            }
        }

    }

    private void setPixelsColor(Color color){
        for(int x=0; x<width ; x++){
            for(int y=0 ; y<height ; y++){
                setPixelColor(color,x,y);
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



