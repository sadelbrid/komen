package com.example.seth.komen;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Seth on 10/15/16.
 */
public class FontHelper {

    public static final String ROOT = "fonts/",
            FONTAWESOME = ROOT + "fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }

}
