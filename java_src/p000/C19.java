package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
/* renamed from: C19 */
/* loaded from: classes5.dex */
public final class C19 implements VZ8 {

    /* renamed from: a */
    public final SF8 f3315a;

    /* renamed from: b */
    public XS8 f3316b = new XS8();

    public C19(SF8 sf8, int i) {
        this.f3315a = sf8;
        Z39.m73790a();
    }

    /* renamed from: d */
    public static VZ8 m112967d(SF8 sf8) {
        return new C19(sf8, 0);
    }

    @Override // p000.VZ8
    /* renamed from: a */
    public final byte[] mo79745a(int i, boolean z) {
        boolean z2;
        int i2 = i ^ 1;
        XS8 xs8 = this.f3316b;
        if (1 != i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        xs8.m76991f(Boolean.valueOf(z2));
        this.f3316b.m76992e(Boolean.FALSE);
        this.f3315a.m85793e(this.f3316b.m76984m());
        try {
            Z39.m73790a();
            if (i == 0) {
                return new C47618qi2().m17220j(C36949Wu8.f42290a).m17219k(true).m17221i().encode(this.f3315a.m85792f()).getBytes("utf-8");
            }
            C47364qG8 m85792f = this.f3315a.m85792f();
            C32466Dq7 c32466Dq7 = new C32466Dq7();
            C36949Wu8.f42290a.configure(c32466Dq7);
            return c32466Dq7.m109853b().m9647a(m85792f);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // p000.VZ8
    /* renamed from: b */
    public final VZ8 mo79744b(XS8 xs8) {
        this.f3316b = xs8;
        return this;
    }

    @Override // p000.VZ8
    /* renamed from: c */
    public final VZ8 mo79743c(GF8 gf8) {
        this.f3315a.m85795c(gf8);
        return this;
    }

    @Override // p000.VZ8
    public final String zzc() {
        VT8 m17707c = this.f3315a.m85792f().m17707c();
        if (m17707c != null && !C39345cm8.m60881b(m17707c.m79847k())) {
            return (String) Preconditions.checkNotNull(m17707c.m79847k());
        }
        return "NA";
    }
}
