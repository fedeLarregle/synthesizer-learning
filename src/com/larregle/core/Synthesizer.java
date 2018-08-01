package com.larregle.core;

import javax.sound.sampled.AudioFormat;

public class Synthesizer {

    private static final Synthesizer instance;

    static { instance = new Synthesizer(); }

    private Synthesizer() {}

    public static Synthesizer getInstance() { return instance; }

    /**
     * TODO
     * @param hertz
     * @param volume
     */
    public void makeTone(double hertz, int volume) {
        float rate = 44100F;
        byte[] buffer = new byte[1];
        AudioFormat audioFormat = new AudioFormat(rate, 8, 1, true, false);
    }
}
