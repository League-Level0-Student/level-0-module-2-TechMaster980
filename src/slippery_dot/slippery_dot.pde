    // 4. create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    int X=100;
    int Y=100;
     int sizeX = 150;
     int sizeY = 150;
    void setup() {
      //1. set the size of your sketch
    size(600, 600);
    }
    
    void draw() {
      //2. set the background color of your sketch
      background(0,6,255);
      //3. draw an ellipse. Make sure it fits in the window.
      ellipse(100,100,150,150);
      //5. use the variables created in step 4 to in place of the numbers
      //   in your ellipse
     
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     
      //7. print the distance variable
    
      
      //8a. make an if statement to check if the distance variable
      //   is greater than negative half the size of the ellipse,
      //   and less than positive half the size of the ellipse.
      
        //8b.  set the x and y of the ellipse to a random location on the window
       
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(x2 * x2 + y2 * y2) - (int)Math.sqrt(x1 * x1 + y1 * y1);}