package p000;

import android.graphics.drawable.Drawable;
/* renamed from: Yb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37243Yb5 extends Drawable {

    /* renamed from: a */
    public static final double f46056a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m74828a(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - f46056a) * f2)) : f;
    }

    /* renamed from: b */
    public static float m74827b(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - f46056a) * f2)) : f * 1.5f;
    }
}
