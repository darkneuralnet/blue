package p000;

import android.widget.ImageView;
/* renamed from: qi6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47622qi6 {

    /* renamed from: qi6$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C27656a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f105656a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f105656a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m17207a(float f, float f2, float f3) {
        if (f < f2) {
            if (f2 < f3) {
                return;
            }
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
        throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
    }

    /* renamed from: b */
    public static int m17206b(int i) {
        return (i & 65280) >> 8;
    }

    /* renamed from: c */
    public static boolean m17205c(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    /* renamed from: d */
    public static boolean m17204d(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (C27656a.f105656a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
