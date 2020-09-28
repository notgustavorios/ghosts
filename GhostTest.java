/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Data)
 * 
 */
public class GhostTest
{
    public static void main(String[] args) {
        simpleTest();
        // bigTest();
    }
    
    public static void simpleTest() {
        Canvas pic = Canvas.getCanvas();
        
        // Pause automatic redrawing
        pic.pause(true);

        pic.setTitle("One Ghost Test");
        pic.setBackgroundColor("black");
        
        int height = 500;
        int width = 400;
        int x = 200;
        int y = 50;
        Ghost ghost = new Ghost(x, y, width, height, "red", true);
        
        pic.redraw();

        // Save the picture to a file
        saveFile("ghost.png");        
    }

    public static void bigTest() {
        // Get a reference to the canvas for this drawing and set its title.
        Canvas pic = Canvas.getCanvas();
        pic.erase();
        
        pic.setTitle("Ghosts Test");
        pic.setBackgroundColor("black");
        
        double height = 600;
        double width = 400;
        int x = 0;
        Ghost bigGhost = new Ghost(x, 0, (int)width, (int)height, "red", true);
                
        x += width;
        height /= 2;
        width /= 2;
        
        Ghost medGhost1 = new Ghost(x, 0, (int)width, 
                                  (int)height, "blue", true);

        Ghost medGhost2 = new Ghost(x, (int)height, (int)width, 
                                  (int)height, "blue", true);
                                          
        // Pause automatic redrawing
        pic.pause(true);
        
        x += width;
        height /= 2;
        width /= 2;
        for (int i = 0; i < (600 / height); i++) {
            Ghost smlGhost1 = new Ghost(x, (int)(height * i), (int)width, 
                                        (int)height, "yellow", true);
        }
        
        x += width;
        height /= 2;
        width /= 2;
        for (int i = 0; i < (600 / height); i++) {
            Ghost tnyGhost1 = new Ghost(x, (int)(height * i), (int)width,
                                        (int)height, "magenta", true);   
        }
        
        x += width;
        height /= 2;
        width /= 2;
        for (int i = 0; i < (600 / height); i++) {
            Ghost microGhost = new Ghost(x, (int)(height * i), (int)width,
                                        (int)height, "red", true);
        }
        
        x += width;
        height /= 2;
        width /= 2;
        for (int i = 0; i < (600 / height); i++) {
            Ghost nanoGhost = new Ghost(x, (int)(height * i), (int)width,
                                        (int)height, "blue", true);
        }
        
        x += width;
        height /= 2;
        width /= 2;
        for (int i = 0; i < (600 / height); i++) {
            Ghost picoGhost = new Ghost(x, (int)(height * i), (int)width,
                                        (int)height, "yellow", true);
        }
        
        x += width;
        height /= 2;
        width /= 2;
        for (int i = 0; i < (600 / height); i++) {
            Ghost femtoGhost = new Ghost(x, (int)(height * i), (int)width,
                                        (int)height, "magenta", true);
        }
        
        pic.redraw();
        
        saveFile("ghosts.png");

        /* Test mutators */
        // bigGhost.setPosition(bigGhost.getWidth() / 2, 300);
        // medGhost1.setX(25);
        // medGhost1.setY(-150);
        // medGhost2.setX(0);
        // medGhost2.setY(150);
        // pic.redraw();
        // saveFile("ghostMutator1.png");
        // bigGhost.makeInvisible();
        // saveFile("ghostMutator2.png");
    }

    public static void saveFile(String filename) {
        Canvas pic = Canvas.getCanvas();

        try {
            pic.saveToFile(new java.io.File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (java.io.IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}