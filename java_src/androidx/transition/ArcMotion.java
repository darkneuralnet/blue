package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class ArcMotion extends PathMotion {

    /* renamed from: g */
    public static final float f55799g = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a */
    public float f55800a;

    /* renamed from: b */
    public float f55801b;

    /* renamed from: c */
    public float f55802c;

    /* renamed from: d */
    public float f55803d;

    /* renamed from: e */
    public float f55804e;

    /* renamed from: f */
    public float f55805f;

    public ArcMotion() {
        this.f55800a = 0.0f;
        this.f55801b = 0.0f;
        this.f55802c = 70.0f;
        this.f55803d = 0.0f;
        this.f55804e = 0.0f;
        this.f55805f = f55799g;
    }

    /* renamed from: e */
    public static float m65968e(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f / 2.0f));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: a */
    public Path mo65872a(float f, float f2, float f3, float f4) {
        boolean z;
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        if (f2 > f4) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = abs + f4;
                f5 = f3;
            } else {
                f6 = abs + f2;
                f5 = f;
            }
            f7 = this.f55804e;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.f55803d;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.f55805f;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            if (f18 > f20) {
                f15 = f20;
            } else {
                f15 = 0.0f;
            }
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt(f15 / f18);
            f5 = ((f5 - f11) * sqrt) + f11;
            f6 = f12 + (sqrt * (f6 - f12));
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }

    /* renamed from: b */
    public void m65971b(float f) {
        this.f55802c = f;
        this.f55805f = m65968e(f);
    }

    /* renamed from: c */
    public void m65970c(float f) {
        this.f55800a = f;
        this.f55803d = m65968e(f);
    }

    /* renamed from: d */
    public void m65969d(float f) {
        this.f55801b = f;
        this.f55804e = m65968e(f);
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55800a = 0.0f;
        this.f55801b = 0.0f;
        this.f55802c = 70.0f;
        this.f55803d = 0.0f;
        this.f55804e = 0.0f;
        this.f55805f = f55799g;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SS5.f33756j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        m65969d(C33266Hb6.m103670f(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        m65970c(C33266Hb6.m103670f(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        m65971b(C33266Hb6.m103670f(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
}
