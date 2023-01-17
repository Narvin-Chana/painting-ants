package org.polytechtours.javaperformance.tp.paintingants;

public class SimulationThread implements Runnable {

    private Object mMutexCompteur;
    private CPainting mPainting;
    private Thread mThreadColony;

    private boolean mPause = false;
    private long mCompteur = 0;

    public SimulationThread(Object mMutexCompteur, CPainting mPainting, Thread mThreadColony) {
        this.mMutexCompteur = mMutexCompteur;
        this.mPainting = mPainting;
        this.mThreadColony = mThreadColony;
    }

    @Override
    public void run() {
        // System.out.println(this.getName()+ ":run()");

        int i;
        String lMessage;

        mPainting.init();

        /*
         * for ( i=0 ; i<mColonie.size() ; i++ ) {
         * ((CFourmi)mColonie.elementAt(i)).start(); }
         */

        mThreadColony.start();
    }
}
