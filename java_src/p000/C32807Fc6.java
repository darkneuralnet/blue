package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
/* renamed from: Fc6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32807Fc6 {
    private C32807Fc6() {
    }

    /* renamed from: a */
    public static Typeface m106903a(Context context, Typeface typeface) {
        return m106902b(context.getResources().getConfiguration(), typeface);
    }

    /* renamed from: b */
    public static Typeface m106902b(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i3 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, C40898fN2.m41475c(weight + i3, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
