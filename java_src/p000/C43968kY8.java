package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
/* renamed from: kY8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43968kY8 {

    /* renamed from: a */
    public final UH8 f94493a;

    /* renamed from: b */
    public NQ8 f94494b = new NQ8();

    /* renamed from: c */
    public final int f94495c;

    public C43968kY8(UH8 uh8, int i) {
        this.f94493a = uh8;
        XZ8.m76851a();
        this.f94495c = i;
    }

    /* renamed from: d */
    public static C43968kY8 m28840d(UH8 uh8, int i) {
        return new C43968kY8(uh8, i);
    }

    /* renamed from: a */
    public final int m28843a() {
        return this.f94495c;
    }

    /* renamed from: b */
    public final String m28842b() {
        C42126hR8 m14454d = this.f94493a.m81668h().m14454d();
        if (m14454d != null && !ZA7.m73637b(m14454d.m36385k())) {
            return (String) Preconditions.checkNotNull(m14454d.m36385k());
        }
        return "NA";
    }

    /* renamed from: c */
    public final byte[] m28841c(int i, boolean z) {
        boolean z2;
        NQ8 nq8 = this.f94494b;
        if (1 != (i ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        nq8.m93912f(Boolean.valueOf(z2));
        this.f94494b.m93913e(Boolean.FALSE);
        this.f94493a.m81669g(this.f94494b.m93905m());
        try {
            XZ8.m76851a();
            if (i == 0) {
                return new C47618qi2().m17220j(C32053Bw8.f3071a).m17219k(true).m17221i().encode(this.f94493a.m81668h()).getBytes("utf-8");
            }
            C48567sI8 m81668h = this.f94493a.m81668h();
            RS7 rs7 = new RS7();
            C32053Bw8.f3071a.configure(rs7);
            return rs7.m86736b().m39362a(m81668h);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: e */
    public final C43968kY8 m28839e(IH8 ih8) {
        this.f94493a.m81671e(ih8);
        return this;
    }

    /* renamed from: f */
    public final C43968kY8 m28838f(NQ8 nq8) {
        this.f94494b = nq8;
        return this;
    }
}
