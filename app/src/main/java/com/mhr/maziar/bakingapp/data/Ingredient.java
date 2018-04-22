package com.mhr.maziar.bakingapp.data;

/**
 * Created by mm090d on 4/22/2018.
 */

enum Measure {
    TSP,
    TBLSP,
    CUP,
    G,
    K,
    OZ,
    UNIT
}

public class Ingredient {
    private int quantity;
    private Measure measure;
    private String name;
}
