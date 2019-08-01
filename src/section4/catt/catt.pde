PImage catPic;
   int x = 194;
   int y = 116;
   int acceleration = 5;
void setup(){
  size(700 ,500);
  catPic = loadImage("cat.jpg");
    catPic.resize(width ,height);
    background(catPic);
}

void draw(){
  if(mousePressed){
     println("Mouse's x-position: " + mouseX + "\n" + "Mouse's y-position: " + mouseY + "\n"); 
    }

  fill(100, 0, 0);
  noStroke();
  ellipse(x, y, 30, 30);
  
  fill(100, 0, 0);
  noStroke();
  ellipse(x+72, y-11, 30, 30);
  
  if (x == width){
    x = 194;
    y = 116;
    background(catPic);
  }
  
  
  }

void keyPressed(){
  x++;
  y--;
  y+=2*acceleration;
  x+=2*acceleration;
}
