package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.clearcut.f */
/* loaded from: classes5.dex */
public final class C17505f<T> implements InterfaceC51439x88<T> {

    /* renamed from: a */
    public final H28 f70436a;

    /* renamed from: b */
    public final AbstractC32584Ed8<?, ?> f70437b;

    /* renamed from: c */
    public final boolean f70438c;

    /* renamed from: d */
    public final LN7<?> f70439d;

    public C17505f(AbstractC32584Ed8<?, ?> abstractC32584Ed8, LN7<?> ln7, H28 h28) {
        this.f70437b = abstractC32584Ed8;
        this.f70438c = ln7.mo51566g(h28);
        this.f70439d = ln7;
        this.f70436a = h28;
    }

    /* renamed from: i */
    public static <T> C17505f<T> m51497i(AbstractC32584Ed8<?, ?> abstractC32584Ed8, LN7<?> ln7, H28 h28) {
        return new C17505f<>(abstractC32584Ed8, ln7, h28);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061 A[EDGE_INSN: B:49:0x0061->B:27:0x0061 ?: BREAK  , SYNTHETIC] */
    @Override // p000.InterfaceC51439x88
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5813a(T t, byte[] bArr, int i, int i2, C40786fA7 c40786fA7) throws IOException {
        AbstractC17497c abstractC17497c = (AbstractC17497c) t;
        C35626Rd8 c35626Rd8 = abstractC17497c.zzjp;
        if (c35626Rd8 == C35626Rd8.m86522h()) {
            c35626Rd8 = C35626Rd8.m86521i();
            abstractC17497c.zzjp = c35626Rd8;
        }
        C35626Rd8 c35626Rd82 = c35626Rd8;
        while (i < i2) {
            int m2137e = C52535yz7.m2137e(bArr, i, c40786fA7);
            int i3 = c40786fA7.f79635a;
            if (i3 != 11) {
                i = (i3 & 7) == 2 ? C52535yz7.m2139c(i3, bArr, m2137e, i2, c35626Rd82, c40786fA7) : C52535yz7.m2141a(i3, bArr, m2137e, i2, c40786fA7);
            } else {
                int i4 = 0;
                TD7 td7 = null;
                while (m2137e < i2) {
                    m2137e = C52535yz7.m2137e(bArr, m2137e, c40786fA7);
                    int i5 = c40786fA7.f79635a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3 && i7 == 2) {
                            m2137e = C52535yz7.m2129m(bArr, m2137e, c40786fA7);
                            td7 = (TD7) c40786fA7.f79637c;
                        }
                        if (i5 != 12) {
                            break;
                        }
                        m2137e = C52535yz7.m2141a(i5, bArr, m2137e, i2, c40786fA7);
                    } else if (i7 == 0) {
                        m2137e = C52535yz7.m2137e(bArr, m2137e, c40786fA7);
                        i4 = c40786fA7.f79635a;
                    } else if (i5 != 12) {
                    }
                }
                if (td7 != null) {
                    c35626Rd82.m86525e((i4 << 3) | 2, td7);
                }
                i = m2137e;
            }
        }
        if (i != i2) {
            throw zzco.m51354d();
        }
    }

    @Override // p000.InterfaceC51439x88
    /* renamed from: b */
    public final boolean mo5812b(T t, T t2) {
        if (this.f70437b.mo51485k(t).equals(this.f70437b.mo51485k(t2))) {
            if (this.f70438c) {
                return this.f70439d.mo51571b(t).equals(this.f70439d.mo51571b(t2));
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC51439x88
    /* renamed from: c */
    public final void mo5811c(T t, InterfaceC35212Pj8 interfaceC35212Pj8) throws IOException {
        Iterator<Map.Entry<?, Object>> m83692e = this.f70439d.mo51571b(t).m83692e();
        while (m83692e.hasNext()) {
            Map.Entry<?, Object> next = m83692e.next();
            HQ7 hq7 = (HQ7) next.getKey();
            if (hq7.mo51543V() != EnumC31936Bj8.MESSAGE || hq7.mo51540z() || hq7.mo51545A()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            interfaceC35212Pj8.mo34059x(hq7.zzc(), next instanceof UV7 ? ((UV7) next).m81402a().m8535d() : next.getValue());
        }
        AbstractC32584Ed8<?, ?> abstractC32584Ed8 = this.f70437b;
        abstractC32584Ed8.mo51491e(abstractC32584Ed8.mo51485k(t), interfaceC35212Pj8);
    }

    @Override // p000.InterfaceC51439x88
    /* renamed from: d */
    public final T mo5810d() {
        return (T) this.f70436a.mo51555m().mo51551c2();
    }

    @Override // p000.InterfaceC51439x88
    /* renamed from: e */
    public final int mo5809e(T t) {
        int hashCode = this.f70437b.mo51485k(t).hashCode();
        return this.f70438c ? (hashCode * 53) + this.f70439d.mo51571b(t).hashCode() : hashCode;
    }

    @Override // p000.InterfaceC51439x88
    /* renamed from: f */
    public final void mo5808f(T t, T t2) {
        C38981c98.m61835i(this.f70437b, t, t2);
        if (this.f70438c) {
            C38981c98.m61837g(this.f70439d, t, t2);
        }
    }

    @Override // p000.InterfaceC51439x88
    /* renamed from: g */
    public final boolean mo5807g(T t) {
        return this.f70439d.mo51571b(t).m83693d();
    }

    @Override // p000.InterfaceC51439x88
    /* renamed from: h */
    public final int mo5806h(T t) {
        AbstractC32584Ed8<?, ?> abstractC32584Ed8 = this.f70437b;
        int mo51484l = abstractC32584Ed8.mo51484l(abstractC32584Ed8.mo51485k(t)) + 0;
        return this.f70438c ? mo51484l + this.f70439d.mo51571b(t).m83684m() : mo51484l;
    }

    @Override // p000.InterfaceC51439x88
    public final void zzc(T t) {
        this.f70437b.mo51492d(t);
        this.f70439d.mo51567f(t);
    }
}
