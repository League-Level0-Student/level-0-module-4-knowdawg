
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
  
  
  if(mouseX < 100){
  mouseX = 100;
} if(mouseX > 300){
  mouseX = 300;
} if(mouseY < 250){
  mouseY = 250;
}  if(mouseY > 350){
  mouseY = 350;
}

  ellipse(mouseX, mouseY, 30, 30);
  ellipse(mouseX + 390, mouseY, 30, 30);

  
  
}