PImage rainbow;
PImage unicorn;
void setup()
{
  rainbow =
  loadImage("rainbow.jpg");
  size(650,487);
  rainbow.resize(650,487);
   background(rainbow);
   unicorn =
   loadImage("unicorn.png");
}
void draw ()
{
  if(mousePressed){
    background(rainbow);
  }
unicorn.resize(100,150);
  image(unicorn,mouseX,mouseY);
  }