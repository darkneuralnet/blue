package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.io.IOException;
/* renamed from: sw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC48948sw7 {
    /* renamed from: a */
    public abstract int mo9472a(Object obj);

    /* renamed from: b */
    public abstract int mo9471b(Object obj);

    /* renamed from: c */
    public abstract Object mo9470c(Object obj);

    /* renamed from: d */
    public abstract Object mo9469d(Object obj);

    /* renamed from: e */
    public abstract Object mo9468e(Object obj, Object obj2);

    /* renamed from: f */
    public abstract Object mo9467f();

    /* renamed from: g */
    public abstract Object mo9466g(Object obj);

    /* renamed from: h */
    public abstract void mo9465h(Object obj, int i, int i2);

    /* renamed from: i */
    public abstract void mo9464i(Object obj, int i, long j);

    /* renamed from: j */
    public abstract void mo9463j(Object obj, int i, Object obj2);

    /* renamed from: k */
    public abstract void mo9462k(Object obj, int i, AbstractC44175kt7 abstractC44175kt7);

    /* renamed from: l */
    public abstract void mo9461l(Object obj, int i, long j);

    /* renamed from: m */
    public abstract void mo9460m(Object obj);

    /* renamed from: n */
    public abstract void mo9459n(Object obj, Object obj2);

    /* renamed from: o */
    public abstract void mo9458o(Object obj, Object obj2);

    /* renamed from: p */
    public abstract void mo9457p(Object obj, InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException;

    /* renamed from: q */
    public abstract void mo9456q(Object obj, InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException;

    /* renamed from: r */
    public final boolean m13374r(Object obj, InterfaceC33681Iv7 interfaceC33681Iv7) throws IOException {
        int zzd = interfaceC33681Iv7.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                mo9465h(obj, i, interfaceC33681Iv7.mo18518x());
                                return true;
                            }
                            throw zzaqw.m51287a();
                        }
                        return false;
                    }
                    Object mo9467f = mo9467f();
                    int i3 = 4 | (i << 3);
                    while (interfaceC33681Iv7.zzc() != Integer.MAX_VALUE && m13374r(mo9467f, interfaceC33681Iv7)) {
                    }
                    if (i3 == interfaceC33681Iv7.zzd()) {
                        mo9466g(mo9467f);
                        mo9463j(obj, i, mo9467f);
                        return true;
                    }
                    throw zzaqw.m51286b();
                }
                mo9462k(obj, i, interfaceC33681Iv7.mo18538d());
                return true;
            }
            mo9464i(obj, i, interfaceC33681Iv7.mo18541a());
            return true;
        }
        mo9461l(obj, i, interfaceC33681Iv7.mo18532j());
        return true;
    }

    /* renamed from: s */
    public abstract boolean mo9455s(InterfaceC33681Iv7 interfaceC33681Iv7);
}
