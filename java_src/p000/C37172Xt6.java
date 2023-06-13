package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* renamed from: Xt6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37172Xt6 {

    /* renamed from: a */
    public static final C44184ku6 f44157a;

    /* renamed from: b */
    public static final Property<View, Float> f44158b;

    /* renamed from: c */
    public static final Property<View, Rect> f44159c;

    /* renamed from: Xt6$a */
    /* loaded from: classes.dex */
    public static class C9542a extends Property<View, Float> {
        public C9542a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C37172Xt6.m76169c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C37172Xt6.m76164h(view, f.floatValue());
        }
    }

    /* renamed from: Xt6$b */
    /* loaded from: classes.dex */
    public static class C9543b extends Property<View, Rect> {
        public C9543b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return C38790bq6.m62451w(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            C38790bq6.m62547D0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f44157a = new C43591ju6();
        } else {
            f44157a = new C42998iu6();
        }
        f44158b = new C9542a(Float.class, "translationAlpha");
        f44159c = new C9543b(Rect.class, "clipBounds");
    }

    private C37172Xt6() {
    }

    /* renamed from: a */
    public static void m76171a(View view) {
        f44157a.mo28187a(view);
    }

    /* renamed from: b */
    public static InterfaceC53057zs6 m76170b(View view) {
        return new C51871xs6(view);
    }

    /* renamed from: c */
    public static float m76169c(View view) {
        return f44157a.mo28185c(view);
    }

    /* renamed from: d */
    public static InterfaceC44945mB6 m76168d(View view) {
        return new C44352lB6(view);
    }

    /* renamed from: e */
    public static void m76167e(View view) {
        f44157a.mo28184d(view);
    }

    /* renamed from: f */
    public static void m76166f(View view, Matrix matrix) {
        f44157a.mo28183e(view, matrix);
    }

    /* renamed from: g */
    public static void m76165g(View view, int i, int i2, int i3, int i4) {
        f44157a.mo28182f(view, i, i2, i3, i4);
    }

    /* renamed from: h */
    public static void m76164h(View view, float f) {
        f44157a.mo28181g(view, f);
    }

    /* renamed from: i */
    public static void m76163i(View view, int i) {
        f44157a.mo28180h(view, i);
    }

    /* renamed from: j */
    public static void m76162j(View view, Matrix matrix) {
        f44157a.mo28179i(view, matrix);
    }

    /* renamed from: k */
    public static void m76161k(View view, Matrix matrix) {
        f44157a.mo28178j(view, matrix);
    }
}
