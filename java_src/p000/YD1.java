package p000;

import android.graphics.Rect;
import android.view.Gravity;
/* renamed from: YD1 */
/* loaded from: classes.dex */
public final class YD1 {

    /* renamed from: YD1$a */
    /* loaded from: classes.dex */
    public static class C9706a {
        private C9706a() {
        }

        /* renamed from: a */
        public static void m75414a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        /* renamed from: b */
        public static void m75413b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        /* renamed from: c */
        public static void m75412c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    private YD1() {
    }

    /* renamed from: a */
    public static void m75416a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        C9706a.m75413b(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: b */
    public static int m75415b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
