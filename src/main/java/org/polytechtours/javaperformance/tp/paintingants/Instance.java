package org.polytechtours.javaperformance.tp.paintingants;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Instance {
    private int width;
    private int height;
    private int nbAnts;
    private ArrayList<AntData> rawDataAnts;

    /**
     * Create by default a random instance
     */
    public Instance(){
        width = 400;
        height = 300;
        Random randGenerator = new Random();

        nbAnts = randGenerator.nextInt(5)+2; // generate int between 2 and 6

        rawDataAnts = new ArrayList<AntData>();
        int i;
        Color[] colorTab = new Color[nbAnts];
        int followedColorIndex; //followed color index
        int R,G,B;


        // color initialisation for each ant
        for (i = 0; i < nbAnts; i++) {
            R = randGenerator.nextInt( 256);
            G = randGenerator.nextInt( 256);
            B = randGenerator.nextInt(256);
            colorTab[i] = new Color(R, G, B);
        }

        for(i = 0; i<nbAnts; i++){

            // followed color is another ant's color
            followedColorIndex = randGenerator.nextInt(nbAnts);
            if (i == followedColorIndex) {
                followedColorIndex = (followedColorIndex + 1) % nbAnts;
            }
            rawDataAnts.add(new AntData(colorTab[i],colorTab[followedColorIndex],randGenerator));
        }
    }
}
