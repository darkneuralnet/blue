package p000;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;
/* renamed from: f51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40730f51 {

    /* renamed from: a */
    public final DisplayCutout f79416a;

    /* renamed from: f51$a */
    /* loaded from: classes.dex */
    public static class C20207a {
        private C20207a() {
        }

        /* renamed from: a */
        public static DisplayCutout m42113a(Rect rect, List<Rect> list) {
            Z41.m73784a();
            return Y41.m75782a(rect, list);
        }

        /* renamed from: b */
        public static List<Rect> m42112b(DisplayCutout displayCutout) {
            List<Rect> boundingRects;
            boundingRects = displayCutout.getBoundingRects();
            return boundingRects;
        }

        /* renamed from: c */
        public static int m42111c(DisplayCutout displayCutout) {
            int safeInsetBottom;
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            return safeInsetBottom;
        }

        /* renamed from: d */
        public static int m42110d(DisplayCutout displayCutout) {
            int safeInsetLeft;
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            return safeInsetLeft;
        }

        /* renamed from: e */
        public static int m42109e(DisplayCutout displayCutout) {
            int safeInsetRight;
            safeInsetRight = displayCutout.getSafeInsetRight();
            return safeInsetRight;
        }

        /* renamed from: f */
        public static int m42108f(DisplayCutout displayCutout) {
            int safeInsetTop;
            safeInsetTop = displayCutout.getSafeInsetTop();
            return safeInsetTop;
        }
    }

    /* renamed from: f51$b */
    /* loaded from: classes.dex */
    public static class C20208b {
        private C20208b() {
        }

        /* renamed from: a */
        public static DisplayCutout m42107a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            Z41.m73784a();
            return C41323g51.m40139a(insets, rect, rect2, rect3, rect4, insets2);
        }

        /* renamed from: b */
        public static Insets m42106b(DisplayCutout displayCutout) {
            Insets waterfallInsets;
            waterfallInsets = displayCutout.getWaterfallInsets();
            return waterfallInsets;
        }
    }

    public C40730f51(DisplayCutout displayCutout) {
        this.f79416a = displayCutout;
    }

    /* renamed from: f */
    public static C40730f51 m42114f(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C40730f51(displayCutout);
    }

    /* renamed from: a */
    public int m42119a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20207a.m42111c(this.f79416a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m42118b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20207a.m42110d(this.f79416a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m42117c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20207a.m42109e(this.f79416a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m42116d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20207a.m42108f(this.f79416a);
        }
        return 0;
    }

    /* renamed from: e */
    public D32 m42115e() {
        if (Build.VERSION.SDK_INT >= 30) {
            return D32.m111003d(C20208b.m42106b(this.f79416a));
        }
        return D32.f5125e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C40730f51.class == obj.getClass()) {
            return C37259Yd3.m74780a(this.f79416a, ((C40730f51) obj).f79416a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f79416a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f79416a + "}";
    }
}
