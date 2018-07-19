PImage catPic;
int x=288;
int y= 168;
int acceleration=5;
void setup() {
  size(500, 500);
  catPic=  loadImage("cat.jpg");
  catPic.resize(500, 500);
  background(catPic);
}
void keyPressed() {
  x+=2*acceleration;
  y+=2*acceleration;
}
void draw () {
  if (mousePressed){
    println("Mouse’s x-position: " + mouseX+ "\n" + 
      "Mouse’s y-position: " + mouseY + "\n");
}
noStroke();
fill(#E81333);
ellipse(x, y, 20, 20);
ellipse(x+44, y, 20, 20);
if(x>500)  {
  background(catPic);
  x=288;
  y=168;
  acceleration=5;
}
}