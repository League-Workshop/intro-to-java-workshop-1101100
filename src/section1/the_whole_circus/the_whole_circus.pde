PImage circus;
  PImage friend;

void setup(){
  friend = loadImage ("friend.jpg");
  size (800, 600);
  friend.resize(width,height);
  circus = loadImage("circus2.png");
  circus.resize(300,300);
};


void draw(){

  background (friend);
  image (circus, mouseX, mouseY);
  
  
};
