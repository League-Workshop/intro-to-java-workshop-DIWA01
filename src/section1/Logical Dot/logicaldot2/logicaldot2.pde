void setup(){
  size(800,800);
}
void draw()
  {
    fill(#232AA5);
    ellipse(mouseX,mouseY,200,200);
    if(mousePressed){
    fill(#86E5D3);
    ellipse(mouseX,mouseY,200,200);
    }
    
  }