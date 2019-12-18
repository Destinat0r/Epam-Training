package com.companic;

public class AdapterApp {

    public static void main(String[] args) {
        //using inheritance
        VectorGraphicsInterface vectorGraphicsAdapter = new VectorAdapterFromRaster();
        vectorGraphicsAdapter.drawLine();
        vectorGraphicsAdapter.drawSquare();

        //using association
        VectorGraphicsInterface vectorGraphicsAdapter2 = new VectorAdapterFromRaster2(new RasterGraphics());
        vectorGraphicsAdapter2.drawLine();
        vectorGraphicsAdapter2.drawSquare();

    }
}

interface VectorGraphicsInterface {
    void drawLine();
    void drawSquare();
}

class RasterGraphics {
    void drawRasterLine() {
        System.out.println("Drawing line");
    }

    void drawRasterSquare() {
        System.out.println("Drawing square");
    }
}

class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {

    @Override public void drawLine() {
        drawRasterLine();
    }

    @Override public void drawSquare() {
        drawRasterSquare();
    }
}

class VectorAdapterFromRaster2 implements VectorGraphicsInterface {

    private RasterGraphics graphics;

    public VectorAdapterFromRaster2(RasterGraphics graphics) {
        this.graphics = graphics;
    }

    @Override public void drawLine() {
        graphics.drawRasterLine();
    }

    @Override public void drawSquare() {
        graphics.drawRasterSquare();
    }
}
