package p000;

import android.content.Context;
import android.net.Uri;
/* renamed from: fX7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40993fX7 {

    /* renamed from: a */
    public final String f80297a;

    /* renamed from: b */
    public final Uri f80298b;

    /* renamed from: c */
    public final String f80299c;

    /* renamed from: d */
    public final String f80300d;

    /* renamed from: e */
    public final boolean f80301e;

    /* renamed from: f */
    public final boolean f80302f;

    /* renamed from: g */
    public final boolean f80303g;

    /* renamed from: h */
    public final boolean f80304h;

    public C40993fX7(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, OZ7<Context, Boolean> oz7) {
        this.f80297a = null;
        this.f80298b = uri;
        this.f80299c = "";
        this.f80300d = "";
        this.f80301e = z;
        this.f80302f = false;
        this.f80303g = false;
        this.f80304h = false;
    }

    /* renamed from: a */
    public final C40993fX7 m41212a() {
        if (this.f80299c.isEmpty()) {
            return new C40993fX7(null, this.f80298b, this.f80299c, this.f80300d, true, false, false, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: b */
    public final JX7<Double> m41211b(String str, double d) {
        return new EW7(this, str, Double.valueOf(0.0d), true);
    }

    /* renamed from: c */
    public final JX7<Long> m41210c(String str, long j) {
        return new C39799dW7(this, str, Long.valueOf(j), true);
    }

    /* renamed from: d */
    public final JX7<Boolean> m41209d(String str, boolean z) {
        return new C48100rW7(this, str, Boolean.valueOf(z), true);
    }

    /* renamed from: e */
    public final <T> JX7<T> m41208e(String str, T t, C35797Rw8 c35797Rw8) {
        return new RW7(this, "getTokenRefactor__blocked_packages", t, true, c35797Rw8, null);
    }

    public C40993fX7(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
