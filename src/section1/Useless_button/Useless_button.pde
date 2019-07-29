void setup(){
  size(600, 600);
  background(#FFFFFF);

};

void draw(){
  if (mousePressed) {
    fill(#902020);
  }
  else {
    fill(#D37777);
  }
  ellipse(100, 100, 100, 100);
  
};
