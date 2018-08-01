package com.larregle.helper;

import static java.lang.Math.PI;
import static java.lang.Math.asin;
import static java.lang.Math.sin;

public class Oscillation {

    public static double sine(double hertz, long time) { return sin((hertz * 2 * PI) * time); }
    public static double square(double hertz, long time) { return sin((hertz * 2 * PI) * time) > 0 ? 1D : -1D; }
    public static double triangle(double hertz, long time) { return asin(sin((hertz * 2 * PI) * time)) * (2D / PI); }
    public static double saw(double hertz, long time) { return (2D / PI) * (hertz * PI * Math.floorMod(time, Double.valueOf((1.0 / hertz)).longValue()) - (PI / 2.0)); }

}
