void setup() {
  size(500,500);
  PImage baby = loadImage ("FistpumpBaby");
  baby.resize (500,500);
background(baby);
textSize(50);
text ("Tested My program",25, 50);
}

void draw() {
  if(mousePressed){
    textSize(40);
    text("It worked the first time",25, 450);
  }
}
