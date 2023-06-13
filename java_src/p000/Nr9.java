package p000;

import com.google.android.gms.internal.recaptcha.zzrr;
import java.io.IOException;
/* renamed from: Nr9 */
/* loaded from: classes6.dex */
public abstract class Nr9<T, B> {
    /* renamed from: a */
    public abstract int mo86268a(T t);

    /* renamed from: b */
    public abstract int mo86267b(T t);

    /* renamed from: c */
    public abstract B mo86266c(Object obj);

    /* renamed from: d */
    public abstract T mo86265d(Object obj);

    /* renamed from: e */
    public abstract T mo86264e(T t, T t2);

    /* renamed from: f */
    public abstract B mo86263f();

    /* renamed from: g */
    public abstract T mo86262g(B b);

    /* renamed from: h */
    public abstract void mo86261h(B b, int i, int i2);

    /* renamed from: i */
    public abstract void mo86260i(B b, int i, long j);

    /* renamed from: j */
    public abstract void mo86259j(B b, int i, T t);

    /* renamed from: k */
    public abstract void mo86258k(B b, int i, AbstractC45836nh9 abstractC45836nh9);

    /* renamed from: l */
    public abstract void mo86257l(B b, int i, long j);

    /* renamed from: m */
    public abstract void mo86256m(Object obj);

    /* renamed from: n */
    public abstract void mo86255n(Object obj, B b);

    /* renamed from: o */
    public abstract void mo86254o(Object obj, T t);

    /* renamed from: p */
    public abstract void mo86253p(T t, Vs9 vs9) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final boolean m93274q(B b, InterfaceC51261wq9 interfaceC51261wq9) throws IOException {
        int zzd = interfaceC51261wq9.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                mo86261h(b, i, interfaceC51261wq9.mo6240x());
                                return true;
                            }
                            throw zzrr.m51030a();
                        }
                        return false;
                    }
                    Object mo86263f = mo86263f();
                    int i3 = 4 | (i << 3);
                    while (interfaceC51261wq9.zzc() != Integer.MAX_VALUE && m93274q(mo86263f, interfaceC51261wq9)) {
                    }
                    if (i3 == interfaceC51261wq9.zzd()) {
                        mo86262g(mo86263f);
                        mo86259j(b, i, mo86263f);
                        return true;
                    }
                    throw zzrr.m51029b();
                }
                mo86258k(b, i, interfaceC51261wq9.mo6260d());
                return true;
            }
            mo86260i(b, i, interfaceC51261wq9.mo6263a());
            return true;
        }
        mo86257l(b, i, interfaceC51261wq9.mo6254j());
        return true;
    }

    /* renamed from: r */
    public abstract boolean mo86252r(InterfaceC51261wq9 interfaceC51261wq9);
}
