package com.example.myapplication;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Utils {
    public static Bitmap convertStringToBitmapFromAccess(Context context, String
            filename){
        AssetManager assetManager = context.getAssets();
        try {
            InputStream is = assetManager.open(filename);
            Bitmap bitmap = BitmapFactory.decodeStream(is);
            return bitmap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static  ArrayList<Product> getMockData(Context context){
        ArrayList<Product> tmp = new ArrayList<>();
        tmp.add(new Product(context.getString(R.string.product_one), context.getString(R.string.product_one_des), convertStringToBitmapFromAccess(context,"hinh_1.png")));
        tmp.add(new Product(context.getString(R.string.product_one), context.getString(R.string.product_one_des), convertStringToBitmapFromAccess(context,"hinh_1.png")));
        tmp.add(new Product(context.getString(R.string.product_one), context.getString(R.string.product_one_des), convertStringToBitmapFromAccess(context,"hinh_1.png")));
        tmp.add(new Product(context.getString(R.string.product_one), context.getString(R.string.product_one_des), convertStringToBitmapFromAccess(context,"hinh_1.png")));
        tmp.add(new Product(context.getString(R.string.product_one), context.getString(R.string.product_one_des), convertStringToBitmapFromAccess(context,"hinh_1.png")));
        return tmp;
    } 
}
