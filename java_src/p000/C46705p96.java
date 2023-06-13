package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;
/* renamed from: p96  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46705p96 {

    /* renamed from: a */
    public static final RectF f103218a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private C46705p96() {
    }

    /* renamed from: a */
    public static Matrix m19874a(Rect rect) {
        return m19873b(new RectF(rect));
    }

    /* renamed from: b */
    public static Matrix m19873b(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f103218a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* renamed from: c */
    public static Matrix m19872c(RectF rectF, RectF rectF2, int i) {
        return m19871d(rectF, rectF2, i, false);
    }

    /* renamed from: d */
    public static Matrix m19871d(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f103218a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(m19873b(rectF2));
        return matrix;
    }

    /* renamed from: e */
    public static Size m19870e(Rect rect, int i) {
        return m19862m(m19865j(rect), i);
    }

    /* renamed from: f */
    public static boolean m19869f(Rect rect, Size size) {
        if (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m19868g(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i);
    }

    /* renamed from: h */
    public static boolean m19867h(Size size, Size size2) {
        return m19866i(size, false, size2, false);
    }

    /* renamed from: i */
    public static boolean m19866i(Size size, boolean z, Size size2, boolean z2) {
        float width;
        float width2;
        float width3;
        float f;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z2) {
            width3 = size2.getWidth() / size2.getHeight();
            f = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f = width4;
        }
        if (width >= width3 && f >= width2) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static Size m19865j(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    /* renamed from: k */
    public static String m19864k(Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    /* renamed from: l */
    public static Size m19863l(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: m */
    public static Size m19862m(Size size, int i) {
        boolean z;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Invalid rotation degrees: " + i);
        if (m19868g(m19856s(i))) {
            return m19863l(size);
        }
        return size;
    }

    /* renamed from: n */
    public static Rect m19861n(Size size) {
        return m19860o(size, 0, 0);
    }

    /* renamed from: o */
    public static Rect m19860o(Size size, int i, int i2) {
        return new Rect(i, i2, size.getWidth() + i, size.getHeight() + i2);
    }

    /* renamed from: p */
    public static RectF m19859p(Size size) {
        return m19858q(size, 0, 0);
    }

    /* renamed from: q */
    public static RectF m19858q(Size size, int i, int i2) {
        return new RectF(i, i2, i + size.getWidth(), i2 + size.getHeight());
    }

    /* renamed from: r */
    public static Matrix m19857r(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    /* renamed from: s */
    public static int m19856s(int i) {
        return ((i % 360) + 360) % 360;
    }
}
