void setup(){
  size(500,500);

};
   int x = 1;
   int y = 1;
   int a = 500;
void draw(){
  
  ellipse(x, y, 30, 30);
  ellipse(a, y, 30, 30);
  x += 1;
  y += 1;
  a += -1;
};
