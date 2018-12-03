package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image {

    int width;
    int height;
    Color [][] pixels ;
    public PaletteRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
        this.pixels= new Color[width][height] ;
        for(int i=0 ; i<width ; i++){
            for(int j=0; j<height ; j++){
                this.pixels[i][j]=color ;
            }
        }

    }

    public PaletteRasterImage(Color[][] pixels){
        for(int x=0;x<pixels.length ; x++){
            for(int y=0 ; y<pixels.length ; y++){
                this.pixels[x] [y]=pixels[x][y] ;
            }
        }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
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
