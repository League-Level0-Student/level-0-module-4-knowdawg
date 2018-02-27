
PImage face; 

void setup(){
  
  size(800, 600);
  face =  loadImage("badPixelArtGlasses.png");
  face.resize(800, 600);
  background(face);
  
  
}


void draw(){
  
  
    background(face);
  fill(0,0,0);
  ellipse(mouseX, mouseY, 10, 10);
  ellipse(mouseX + 390, mouseY, 10, 10);
  
  if(mouseX < 100){
  mouseX = 100;
}

if(mouseX > 300){
  mouseX = 300;
}

if(mouseY < 350){
  mouseY = 350;
}
  
  
}