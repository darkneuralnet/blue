package p000;

import com.google.android.gms.internal.vision.zzjk;
import java.io.IOException;
/* renamed from: fY8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC41003fY8<T, B> {
    /* renamed from: a */
    public abstract B mo41197a();

    /* renamed from: b */
    public abstract T mo41196b(B b);

    /* renamed from: c */
    public abstract void mo41195c(B b, int i, int i2);

    /* renamed from: d */
    public abstract void mo41194d(B b, int i, long j);

    /* renamed from: e */
    public abstract void mo41193e(B b, int i, T t);

    /* renamed from: f */
    public abstract void mo41192f(B b, int i, AbstractC53119zy8 abstractC53119zy8);

    /* renamed from: g */
    public abstract void mo41191g(Object obj, T t);

    /* renamed from: h */
    public abstract void mo41190h(T t, InterfaceC37736a39 interfaceC37736a39) throws IOException;

    /* renamed from: i */
    public final boolean m41189i(B b, IU8 iu8) throws IOException {
        int zzb = iu8.zzb();
        int i = zzb >>> 3;
        int i2 = zzb & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                mo41195c(b, i, iu8.mo13332c());
                                return true;
                            }
                            throw zzjk.m50759f();
                        }
                        return false;
                    }
                    B mo41197a = mo41197a();
                    int i3 = 4 | (i << 3);
                    while (iu8.zza() != Integer.MAX_VALUE && m41189i(mo41197a, iu8)) {
                    }
                    if (i3 == iu8.zzb()) {
                        mo41193e(b, i, mo41196b(mo41197a));
                        return true;
                    }
                    throw zzjk.m50760e();
                }
                mo41192f(b, i, iu8.mo13330e());
                return true;
            }
            mo41186l(b, i, iu8.zzi());
            return true;
        }
        mo41194d(b, i, iu8.zzg());
        return true;
    }

    /* renamed from: j */
    public abstract boolean mo41188j(IU8 iu8);

    /* renamed from: k */
    public abstract T mo41187k(Object obj);

    /* renamed from: l */
    public abstract void mo41186l(B b, int i, long j);

    /* renamed from: m */
    public abstract void mo41185m(Object obj, B b);

    /* renamed from: n */
    public abstract void mo41184n(T t, InterfaceC37736a39 interfaceC37736a39) throws IOException;

    /* renamed from: o */
    public abstract B mo41183o(Object obj);

    /* renamed from: p */
    public abstract T mo41182p(T t, T t2);

    /* renamed from: q */
    public abstract void mo41181q(Object obj);

    /* renamed from: r */
    public abstract int mo41180r(T t);

    /* renamed from: s */
    public abstract int mo41179s(T t);
}
