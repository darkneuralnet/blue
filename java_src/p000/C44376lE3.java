package p000;

import android.graphics.Paint;
import android.graphics.Rect;
/* renamed from: lE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44376lE3 {

    /* renamed from: a */
    public static final ThreadLocal<C48526sE3<Rect, Rect>> f95754a = new ThreadLocal<>();

    /* renamed from: lE3$a */
    /* loaded from: classes.dex */
    public static class C25662a {
        private C25662a() {
        }

        /* renamed from: a */
        public static boolean m27643a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    private C44376lE3() {
    }

    /* renamed from: a */
    public static boolean m27644a(Paint paint, String str) {
        return C25662a.m27643a(paint, str);
    }
}
