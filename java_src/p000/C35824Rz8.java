package p000;

import android.net.Uri;
/* renamed from: Rz8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35824Rz8 {

    /* renamed from: a */
    public final Uri f32988a;

    /* renamed from: b */
    public final String f32989b;

    /* renamed from: c */
    public final String f32990c;

    /* renamed from: d */
    public final boolean f32991d;

    /* renamed from: e */
    public final boolean f32992e;

    public C35824Rz8(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC49106tC8 interfaceC49106tC8) {
        this.f32988a = uri;
        this.f32989b = "";
        this.f32990c = "";
        this.f32991d = z;
        this.f32992e = z3;
    }

    /* renamed from: a */
    public final C35824Rz8 m86143a() {
        return new C35824Rz8(null, this.f32988a, this.f32989b, this.f32990c, this.f32991d, false, true, false, null);
    }

    /* renamed from: b */
    public final C35824Rz8 m86142b() {
        if (this.f32989b.isEmpty()) {
            return new C35824Rz8(null, this.f32988a, this.f32989b, this.f32990c, true, false, this.f32992e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final AbstractC44354lB8 m86141c(String str, double d) {
        return new C49572tz8(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final AbstractC44354lB8 m86140d(String str, long j) {
        return new C36751Vy8(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final AbstractC44354lB8 m86139e(String str, String str2) {
        return new C33016Fz8(this, str, str2, true);
    }

    /* renamed from: f */
    public final AbstractC44354lB8 m86138f(String str, boolean z) {
        return new C42457hz8(this, str, Boolean.valueOf(z), true);
    }

    public C35824Rz8(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
