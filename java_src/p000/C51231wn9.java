package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
/* renamed from: wn9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51231wn9 implements Rl9 {

    /* renamed from: a */
    public final W59 f116537a;

    /* renamed from: b */
    public C38110ah9 f116538b = new C38110ah9();

    /* renamed from: c */
    public final int f116539c;

    public C51231wn9(W59 w59, int i) {
        this.f116537a = w59;
        C47685qo9.m16960a();
        this.f116539c = i;
    }

    /* renamed from: d */
    public static Rl9 m6314d(W59 w59) {
        return new C51231wn9(w59, 0);
    }

    /* renamed from: e */
    public static Rl9 m6313e(W59 w59, int i) {
        return new C51231wn9(w59, 1);
    }

    @Override // p000.Rl9
    /* renamed from: a */
    public final byte[] mo6317a(int i, boolean z) {
        boolean z2;
        int i2 = i ^ 1;
        C38110ah9 c38110ah9 = this.f116538b;
        if (1 != i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        c38110ah9.m70850f(Boolean.valueOf(z2));
        this.f116538b.m70851e(Boolean.FALSE);
        this.f116537a.m78836i(this.f116538b.m70843m());
        try {
            C47685qo9.m16960a();
            if (i == 0) {
                return new C47618qi2().m17220j(C49277tV8.f110560a).m17219k(true).m17221i().encode(this.f116537a.m78835j()).getBytes("utf-8");
            }
            C44899m69 m78835j = this.f116537a.m78835j();
            I28 i28 = new I28();
            C49277tV8.f110560a.configure(i28);
            return i28.m103039b().m80467a(m78835j);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // p000.Rl9
    /* renamed from: b */
    public final Rl9 mo6316b(O59 o59) {
        this.f116537a.m78839f(o59);
        return this;
    }

    @Override // p000.Rl9
    /* renamed from: c */
    public final Rl9 mo6315c(C38110ah9 c38110ah9) {
        this.f116538b = c38110ah9;
        return this;
    }

    @Override // p000.Rl9
    public final int zza() {
        return this.f116539c;
    }

    @Override // p000.Rl9
    public final String zzd() {
        C47615qh9 m26332f = this.f116537a.m78835j().m26332f();
        if (m26332f != null && !C32502Du7.m109703b(m26332f.m17235k())) {
            return (String) Preconditions.checkNotNull(m26332f.m17235k());
        }
        return "NA";
    }
}
