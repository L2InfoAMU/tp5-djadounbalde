package image;
import javafx.scene.paint.Color;
import util.Matrices;

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

        this.width= Matrices.getRowCount(colors);
        this.height=Matrices.getColumnCount(colors);
        createRepresentation();
        setPixelsColor(colors);

    }

    private void setPixelsColor(Color[][] colors) {
        for(int x=0; x<width ; x++){
            for(int y=0 ; y<height ; y++){
                this.colors[x][y]=colors[x][y] ;
            }
        }
    }


    private void setPixelsColor(Color color){
        for(int x=0; x<width ; x++) {
            for(int y=0 ; y<height ; y++){
                this.colors[x][y]=color ;
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
        colors = new Color[width][height] ;
    }

    protected void setWidth(int width){
        this.width=width;


    }


    protected void setHeight(int height) {
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
