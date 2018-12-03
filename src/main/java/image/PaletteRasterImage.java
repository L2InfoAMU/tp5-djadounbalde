package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image {

    int width;
    int height;
    Color [][] colors ;
    public PaletteRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
        this.colors= new Color[width][height] ;
        for(int i=0 ; i<width ; i++){
            for(int j=0; j<height ; j++){
                this.colors[i][j]=color ;
            }
        }

    }


    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

}
