package p000;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Gs6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33185Gs6 {
    private C33185Gs6() {
    }

    /* renamed from: a */
    public static Map<AbstractC11253p, Rect> m104648a(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map<AbstractC11253p, BR5> map) {
        boolean z2;
        if (rect.width() > 0 && rect.height() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        HZ3.m103736b(z2, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<AbstractC11253p, BR5> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().mo31669c().getWidth(), entry.getValue().mo31669c().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF m104642g = m104642g(rectF2, ImageUtil.m69224f(i, rational), i2, z, i3, i);
        HashMap hashMap2 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, m104642g);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            hashMap2.put((AbstractC11253p) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static RectF m104647b(boolean z, int i, RectF rectF, RectF rectF2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = true;
        if (i == 0 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == 90 && z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 && !z3) {
            if (i == 0 && z) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i == 270 && !z) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z4 && !z5) {
                if (i == 90 && !z) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i == 180 && z) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z6 && !z7) {
                    if (i == 180 && !z) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (i != 270 || !z) {
                        z9 = false;
                    }
                    if (!z8 && !z9) {
                        throw new IllegalArgumentException("Invalid argument: mirrored " + z + " rotation " + i);
                    }
                    return m104646c(m104645d(rectF2, rectF.centerY()), rectF.centerX());
                }
                return m104645d(rectF2, rectF.centerY());
            }
            return m104646c(rectF2, rectF.centerX());
        }
        return rectF2;
    }

    /* renamed from: c */
    public static RectF m104646c(RectF rectF, float f) {
        return new RectF(m104644e(rectF.right, f), rectF.top, m104644e(rectF.left, f), rectF.bottom);
    }

    /* renamed from: d */
    public static RectF m104645d(RectF rectF, float f) {
        return new RectF(rectF.left, m104643f(rectF.bottom, f), rectF.right, m104643f(rectF.top, f));
    }

    /* renamed from: e */
    public static float m104644e(float f, float f2) {
        return (f2 + f2) - f;
    }

    /* renamed from: f */
    public static float m104643f(float f, float f2) {
        return (f2 + f2) - f;
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: g */
    public static RectF m104642g(RectF rectF, Rational rational, int i, boolean z, int i2, int i3) {
        if (i == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
                } else {
                    throw new IllegalStateException("Unexpected scale type: " + i);
                }
            } else {
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
            }
        } else {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return m104647b(m104641h(z, i2), i3, rectF, rectF3);
    }

    /* renamed from: h */
    public static boolean m104641h(boolean z, int i) {
        return z ^ (i == 1);
    }
}
