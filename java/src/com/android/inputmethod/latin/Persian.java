/*
 * Copyright (C) 2010 Farsitel.
 * // TODO
 * 
 */

package com.android.inputmethod.latin;

import android.util.SparseIntArray;

public class Persian  {

    public static SparseIntArray sShiftTable = new SparseIntArray();
    public static SparseIntArray sShiftViewTable = new SparseIntArray();

    static {
    	sShiftTable.append('\u0636', '\u0652');
    	sShiftTable.append('\u0635', '\u064c');
    	sShiftTable.append('\u062b', '\u064d');
    	sShiftTable.append('\u0642', '\u064b');
    	sShiftTable.append('\u0641', '\u064f');
    	sShiftTable.append('\u063a', '\u0650');
    	sShiftTable.append('\u0639', '\u064e');
    	sShiftTable.append('\u0647', '\u0651');
    	sShiftTable.append('\u062e', ']');
    	sShiftTable.append('\u062d', '[');
    	sShiftTable.append('\u062c', ')');
    	sShiftTable.append('\u0686', '(');
    	sShiftTable.append('\u0634', '\u0624');
    	sShiftTable.append('\u0633', '\u0626');
    	sShiftTable.append('\u06cc', '\u064a');
    	sShiftTable.append('\u0628', '\u0625');
    	sShiftTable.append('\u0644', '\u0623');
    	sShiftTable.append('\u0627', '\u0622');
    	sShiftTable.append('\u062a', '\u0629');
    	sShiftTable.append('\u0646', '\u00bb');
    	sShiftTable.append('\u0645', '\u00ab');
    	sShiftTable.append('\u06a9', ':');
    	sShiftTable.append('\u06af', '\u061b');
    	sShiftTable.append('\u0638', '\u0643');
    	sShiftTable.append('\u0637', '\u0653');
    	sShiftTable.append('\u0631', '\u0670');
    	sShiftTable.append('\u062f', '\u0654');
    	sShiftTable.append('\u067e', '\u0621');
    	sShiftTable.append('\u0632', '<');
    	sShiftTable.append('\u0698', '>');
    	sShiftTable.append('\u0648', '\u061f');
    	sShiftTable.append('\u0630', '\u0640');
    	
    	for (int i=0; i<sShiftTable.size(); i++)
        	sShiftViewTable.append(sShiftTable.keyAt(i), sShiftTable.valueAt(i));
    	sShiftViewTable.put('\u062e', '[');
    	sShiftViewTable.put('\u062d', ']');
    	sShiftViewTable.put('\u062c', '(');
    	sShiftViewTable.put('\u0686', ')');
    	sShiftViewTable.put('\u0632', '>');
    	sShiftViewTable.put('\u0698', '<');        
    }
}
