import ObjectOriented.Plant;

import java.awt.*;

void main() {

    Plant plantOne = new Plant();

    plantOne.name = "Rose";
    plantOne.type = "Flower";
    plantOne.waterLevel = 60;
    plantOne.height = 15.5;

    Plant plantTwo = new Plant();
    plantTwo.name = "Mango";
    plantTwo.type = "Tree";
    plantTwo.waterLevel = 40;
    plantTwo.height = 120;


    Plant plantThree = new Plant();
    plantThree.name = "Cactus";
    plantThree.type = "Desert Plant";
    plantThree.waterLevel = 90;
    plantThree.height = 35;

    Plant.header();
    plantOne.displayInfo();
    plantTwo.displayInfo();
    plantThree.displayInfo();


    plantOne.waterPlant(20);
    plantTwo.waterPlant(30);
    plantThree.waterPlant(50);

    plantOne.growPlant(20.4);
    plantTwo.growPlant(30.5);
    plantThree.growPlant(60.5);

    Plant.header();
    plantOne.displayInfo();
    plantTwo.displayInfo();
    plantThree.displayInfo();

}
