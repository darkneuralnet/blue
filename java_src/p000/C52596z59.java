package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
/* renamed from: z59  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52596z59 {

    /* renamed from: a */
    public final C51585xO8 f120766a;

    /* renamed from: b */
    public C50480vX8 f120767b = new C50480vX8();

    /* renamed from: c */
    public final int f120768c;

    public C52596z59(C51585xO8 c51585xO8, int i) {
        this.f120766a = c51585xO8;
        S69.m86000a();
        this.f120768c = i;
    }

    /* renamed from: d */
    public static C52596z59 m1827d(C51585xO8 c51585xO8) {
        return new C52596z59(c51585xO8, 0);
    }

    /* renamed from: e */
    public static C52596z59 m1826e(C51585xO8 c51585xO8, int i) {
        return new C52596z59(c51585xO8, 1);
    }

    /* renamed from: a */
    public final int m1830a() {
        return this.f120768c;
    }

    /* renamed from: b */
    public final String m1829b() {
        PX8 m85512f = this.f120766a.m5299j().m85512f();
        if (m85512f != null && !C49391th7.m11912b(m85512f.m90135k())) {
            return (String) Preconditions.checkNotNull(m85512f.m90135k());
        }
        return "NA";
    }

    /* renamed from: c */
    public final byte[] m1828c(int i, boolean z) {
        boolean z2;
        C50480vX8 c50480vX8 = this.f120767b;
        if (1 != (i ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        c50480vX8.m8518f(Boolean.valueOf(z2));
        this.f120767b.m8519e(Boolean.FALSE);
        this.f120766a.m5300i(this.f120767b.m8511m());
        try {
            S69.m86000a();
            if (i == 0) {
                return new C47618qi2().m17220j(C38416bC8.f57084a).m17219k(true).m17221i().encode(this.f120766a.m5299j()).getBytes("utf-8");
            }
            SO8 m5299j = this.f120766a.m5299j();
            C47516qX7 c47516qX7 = new C47516qX7();
            C38416bC8.f57084a.configure(c47516qX7);
            return c47516qX7.m17468b().m107019a(m5299j);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: f */
    public final C52596z59 m1825f(EnumC44471lO8 enumC44471lO8) {
        this.f120766a.m5303f(enumC44471lO8);
        return this;
    }

    /* renamed from: g */
    public final C52596z59 m1824g(C50480vX8 c50480vX8) {
        this.f120767b = c50480vX8;
        return this;
    }
}
