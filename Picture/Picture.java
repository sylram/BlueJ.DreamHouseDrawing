

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square door;
    private Square grass;
    private Square tree;
    private Triangle treeHead;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        wall = new Square();
        wall.moveVertical(110);
        wall.changeSize(130);
        wall.makeVisible();
      
        wall = new Square();
        wall.moveHorizontal(70);
        wall.moveVertical(110);
        wall.changeSize(130);
        wall.makeVisible();
       
       for(int x=0;x<5;x++){
        for(int i=0;i<19;i++){
            grass = new Square();
            grass.moveHorizontal(22*i-60);
            grass.changeSize(20);
            grass.changeColor("green");
            grass.moveVertical(22*x+240);
            grass.makeVisible();
        }
        };
        
        for(int t=1;t<4;t++){
            
            tree = new Square();
            tree.changeColor("black");
            tree.moveHorizontal(260);
            tree.moveVertical(160+t*20);
            tree.changeSize(20);
            tree.makeVisible();
    };
       treeHead = new Triangle();
       treeHead.moveHorizontal(280);
       treeHead.changeColor("green");
       treeHead.moveVertical(190);
       treeHead.changeSize(25,45);
       treeHead.makeVisible();
       
        
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(35);
        door.moveVertical(160);
        door.changeSize(40);
        door.makeVisible();
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(35);
        door.moveVertical(200);
        door.changeSize(40);
        door.makeVisible();
        
        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(130);
        window.moveVertical(130);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(70, 300);
        roof.moveHorizontal(110);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(280);
        sun.moveVertical(-30);
        sun.changeSize(80);
        sun.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("green");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
