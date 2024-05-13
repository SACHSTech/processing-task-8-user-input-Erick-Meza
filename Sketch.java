import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Sketch extends PApplet {

  // Initializes variables
  PImage imgInitialBackground;
  PImage imgCoral;
  PImage imgFish;
  PImage imgDrawing;
  PFont myFont;

  /**
   * Called once at the beginning of execution to set height and width of screen
   */
  public void settings() {
    // put your size call here
    size(1000, 600);
  }

  /**
   * Called once at the beginning of execution for setup
   */
  public void setup() {

    // Sets the initial background
    background(0, 0, 0);
    imgInitialBackground = loadImage("InitialBackground.png");
    imgInitialBackground.resize(width, height);
    image(imgInitialBackground, 0, 0);

    // Creates text at the top right of the screen for instructions
    myFont = createFont("Poor Richard", 40);
    textFont(myFont);
    textSize(80);
    text("Into the Deep", width - 425, 65);
    textSize(40);
    text("Press ENTER to begin", width - 340, 110);
    text("Press TAB for controls", width - 340, 150);
  }

  /**
   * A method that will set the canvas when ENTER is pressed
   */
  public void keyPressed() {

    // Creates a Conditional Selective Algorithm to check if ENTER has been pressed
    if (keyCode == ENTER) {

      // Changes the background
      background(2, 217, 245);
    }

  }

  /**
   * A method that is called repeatedly to keep the background
   */
  public void draw() {

    // Creates a conditional selective algorithm to check if the user has pressed TAB
    if (keyCode == TAB){

      // Sets the background to cyan
      background(2, 217, 245);

      // Formats the text
      textAlign(CENTER);
      textSize(80);

      // Prints out controls
      text("Controls", width / 2, height / 6);
      textSize(40);
      text("ENTER : Canvas", 250, height / 2 - 125);
      text("Mouse Click (Bottom) : Coral", 250, height / 2 - 50);
      text("B : Blue Tang", width - 250, height / 2 + 25);
      text("C : Clownfish", width - 250, height / 2 + 100);
      text("L : load canvas", width - 250, height / 2 - 50);
      text("P : Pufferfish", width - 250, height / 2 + 175);
      text("S : Save canvas", width - 250, height / 2 - 125);
      text("T : Turtle", width - 250, height / 2 + 250);

    }

    // Creates a conditional selective algorithm to check if the user has pressed S or L
    if (key == 's' || key == 'S'){

      // Saves the canvas as an image
      save("Drawing.png");

      // Assigns the saved image to a variable
      imgDrawing = loadImage("Drawing.png");

    } else if (key == 'l' || key == 'L'){

      // Prints out the saved image
      image(imgDrawing, 0, 0);

    }

  }

  /**
   * A method that will run if the mouse of the user has been clicked
   */
  public void mouseClicked() {

    // Initializes variables
    int intCoralType = (int) (Math.random() * 4) + 1;

    // Creates a conditional selective algorithm to check the positioning of the
    // mouse
    if (mouseY > height / 2 + height / 4) {

      // Creates a conditional selective algorithm to check the value of intCoralType
      if (intCoralType == 1) {

        // Prints out a red version of the coral
        imgCoral = loadImage("CoralVariants/Coral.png");
        image(imgCoral, mouseX - imgCoral.width / 2, mouseY - imgCoral.height / 2);

      } else if (intCoralType == 2) {

        // Prints out a green version of the coral
        imgCoral = loadImage("CoralVariants/Coral2.png");
        image(imgCoral, mouseX - imgCoral.width / 2, mouseY - imgCoral.height / 2);

      } else if (intCoralType == 3) {

        // Prints out a yellow version of the coral
        imgCoral = loadImage("CoralVariants/Coral3.png");
        image(imgCoral, mouseX - imgCoral.width / 2, mouseY - imgCoral.height / 2);

      } else if (intCoralType == 4) {

        // Prints out seagrass
        imgCoral = loadImage("CoralVariants/Seagrass.png");
        image(imgCoral, mouseX - imgCoral.width / 2, mouseY - imgCoral.height / 2);

      }

    } else if (mouseY < height / 2 + height / 4) {

      // Creates a conditional selective algorithm to check which key has been pressed
      if (key == 'c' || key == 'C') {

        // Sets the image to the clownfish
        imgFish = loadImage("FishVariants/Clownfish.png");

        // Creates a conditional selective algorithm to check the time
        if (second() % 2 == 0) {

          // Prints out the clownfish
          image(imgFish, mouseX - imgFish.width / 2, mouseY - imgFish.height / 2);

        } else if (second() % 2 != 0) {

          // Reflects the clownfish image on the y-axis
          scale(-1, 1);

          // Prints out the clownfish
          image(imgFish, -1 * mouseX - imgFish.width / 2, mouseY - imgFish.height / 2);

        }

      } else if (key == 'p' || key == 'P') {

        // Sets the image to the pufferfish
        imgFish = loadImage("FishVariants/Pufferfish.png");

        // Creates a conditional selective algorithm to check the time
        if (second() % 2 == 0) {

          // Prints out the pufferfish
          image(imgFish, mouseX - imgFish.width / 2, mouseY - imgFish.height / 2);

        } else if (second() % 2 != 0) {

          // Reflects the pufferfish image on the y-axis
          scale(-1, 1);

          // Prints out the pufferfish
          image(imgFish, -1 * mouseX - imgFish.width / 2, mouseY - imgFish.height / 2);

        }

      } else if (key == 'b' || key == 'B') {

        // Sets the image to the blue tang
        imgFish = loadImage("FishVariants/BlueTang.png");

        // Creates a conditional selective algorithm to check the time
        if (second() % 2 == 0) {

          // Prints out the blue tang
          image(imgFish, mouseX - imgFish.width / 2, mouseY - imgFish.height / 2);

        } else if (second() % 2 != 0) {

          // Reflects the blue tang on the y-axis
          scale(-1, 1);

          // Prints out the blue tang
          image(imgFish, -1 * mouseX - imgFish.width / 2, mouseY - imgFish.height / 2);

        }

      } else if (key == 't' || key == 'T') {

        // Sets the image to the turtle
        imgFish = loadImage("FishVariants/Turtle.png");

        // Creates a conditional selective algorithm to check the current time
        if (second() % 2 == 0) {

          // Prints out the turtle
          image(imgFish, mouseX - imgFish.width / 2, mouseY - imgFish.height / 2);

        } else if (second() % 2 != 0) {

          // Reflects the turtle image on the y-axis
          scale(-1, 1);

          // Prints out the turtle
          image(imgFish, -1 * mouseX - imgFish.width / 2, mouseY - imgFish.height / 2);
        }

      }

    }

  }

}