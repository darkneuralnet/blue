package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    public Path f55888a;

    /* renamed from: b */
    public final Path f55889b;

    /* renamed from: c */
    public final Matrix f55890c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f55889b = path;
        this.f55890c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f55888a = path;
    }

    /* renamed from: b */
    public static float m65914b(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: a */
    public Path mo65872a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float m65914b = m65914b(f5, f6);
        double atan2 = Math.atan2(f6, f5);
        this.f55890c.setScale(m65914b, m65914b);
        this.f55890c.postRotate((float) Math.toDegrees(atan2));
        this.f55890c.postTranslate(f, f2);
        Path path = new Path();
        this.f55889b.transform(this.f55890c, path);
        return path;
    }

    /* renamed from: c */
    public void m65913c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f55890c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float m65914b = 1.0f / m65914b(f5, f6);
        this.f55890c.postScale(m65914b, m65914b);
        this.f55890c.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(this.f55890c, this.f55889b);
        this.f55888a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f55889b = new Path();
        this.f55890c = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SS5.f33757k);
        try {
            String m103667i = C33266Hb6.m103667i(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m103667i != null) {
                m65913c(C49164tJ3.m12510e(m103667i));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
