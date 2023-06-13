package p000;

import android.graphics.Insets;
import android.graphics.Rect;
import ch.qos.logback.core.CoreConstants;
/* renamed from: D32 */
/* loaded from: classes.dex */
public final class D32 {

    /* renamed from: e */
    public static final D32 f5125e = new D32(0, 0, 0, 0);

    /* renamed from: a */
    public final int f5126a;

    /* renamed from: b */
    public final int f5127b;

    /* renamed from: c */
    public final int f5128c;

    /* renamed from: d */
    public final int f5129d;

    /* renamed from: D32$a */
    /* loaded from: classes.dex */
    public static class C1338a {
        private C1338a() {
        }

        /* renamed from: a */
        public static Insets m111001a(int i, int i2, int i3, int i4) {
            Insets of;
            of = Insets.of(i, i2, i3, i4);
            return of;
        }
    }

    public D32(int i, int i2, int i3, int i4) {
        this.f5126a = i;
        this.f5127b = i2;
        this.f5128c = i3;
        this.f5129d = i4;
    }

    /* renamed from: a */
    public static D32 m111006a(D32 d32, D32 d322) {
        return m111005b(Math.max(d32.f5126a, d322.f5126a), Math.max(d32.f5127b, d322.f5127b), Math.max(d32.f5128c, d322.f5128c), Math.max(d32.f5129d, d322.f5129d));
    }

    /* renamed from: b */
    public static D32 m111005b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f5125e;
        }
        return new D32(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static D32 m111004c(Rect rect) {
        return m111005b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static D32 m111003d(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return m111005b(i, i2, i3, i4);
    }

    /* renamed from: e */
    public Insets m111002e() {
        return C1338a.m111001a(this.f5126a, this.f5127b, this.f5128c, this.f5129d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D32.class != obj.getClass()) {
            return false;
        }
        D32 d32 = (D32) obj;
        if (this.f5129d == d32.f5129d && this.f5126a == d32.f5126a && this.f5128c == d32.f5128c && this.f5127b == d32.f5127b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f5126a * 31) + this.f5127b) * 31) + this.f5128c) * 31) + this.f5129d;
    }

    public String toString() {
        return "Insets{left=" + this.f5126a + ", top=" + this.f5127b + ", right=" + this.f5128c + ", bottom=" + this.f5129d + CoreConstants.CURLY_RIGHT;
    }
}
