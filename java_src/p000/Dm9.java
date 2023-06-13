package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
/* renamed from: Dm9 */
/* loaded from: classes5.dex */
public final class Dm9 implements InterfaceC51794xk9 {

    /* renamed from: a */
    public final C44879m49 f6316a;

    /* renamed from: b */
    public C48790sg9 f6317b = new C48790sg9();

    /* renamed from: c */
    public final int f6318c;

    public Dm9(C44879m49 c44879m49, int i) {
        this.f6316a = c44879m49;
        En9.m108355a();
        this.f6318c = i;
    }

    /* renamed from: d */
    public static InterfaceC51794xk9 m109953d(C44879m49 c44879m49) {
        return new Dm9(c44879m49, 0);
    }

    /* renamed from: e */
    public static InterfaceC51794xk9 m109952e(C44879m49 c44879m49, int i) {
        return new Dm9(c44879m49, 1);
    }

    @Override // p000.InterfaceC51794xk9
    /* renamed from: a */
    public final byte[] mo4750a(int i, boolean z) {
        boolean z2;
        int i2 = i ^ 1;
        C48790sg9 c48790sg9 = this.f6317b;
        if (1 != i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        c48790sg9.m13842f(Boolean.valueOf(z2));
        this.f6317b.m13843e(Boolean.FALSE);
        this.f6316a.m26376i(this.f6317b.m13835m());
        try {
            En9.m108355a();
            if (i == 0) {
                return new C47618qi2().m17220j(C45702nT8.f100027a).m17219k(true).m17221i().encode(this.f6316a.m26375j()).getBytes("utf-8");
            }
            C49 m26375j = this.f6316a.m26375j();
            PZ7 pz7 = new PZ7();
            C45702nT8.f100027a.configure(pz7);
            return pz7.m90085b().m44737a(m26375j);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // p000.InterfaceC51794xk9
    /* renamed from: b */
    public final InterfaceC51794xk9 mo4749b(C48790sg9 c48790sg9) {
        this.f6317b = c48790sg9;
        return this;
    }

    @Override // p000.InterfaceC51794xk9
    /* renamed from: c */
    public final InterfaceC51794xk9 mo4748c(EnumC40135e49 enumC40135e49) {
        this.f6316a.m26379f(enumC40135e49);
        return this;
    }

    @Override // p000.InterfaceC51794xk9
    public final int zza() {
        return this.f6318c;
    }

    @Override // p000.InterfaceC51794xk9
    public final String zzd() {
        Gg9 m112905f = this.f6316a.m26375j().m112905f();
        if (m112905f != null && !C52938zg7.m565b(m112905f.m104882k())) {
            return (String) Preconditions.checkNotNull(m112905f.m104882k());
        }
        return "NA";
    }
}
