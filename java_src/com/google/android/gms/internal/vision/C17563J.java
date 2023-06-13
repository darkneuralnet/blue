package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.vision.J */
/* loaded from: classes6.dex */
public final class C17563J<T> implements InterfaceC52825zU8<T> {

    /* renamed from: a */
    public final InterfaceC44489lQ8 f71258a;

    /* renamed from: b */
    public final AbstractC41003fY8<?, ?> f71259b;

    /* renamed from: c */
    public final boolean f71260c;

    /* renamed from: d */
    public final AbstractC50309vE8<?> f71261d;

    public C17563J(AbstractC41003fY8<?, ?> abstractC41003fY8, AbstractC50309vE8<?> abstractC50309vE8, InterfaceC44489lQ8 interfaceC44489lQ8) {
        this.f71259b = abstractC41003fY8;
        this.f71260c = abstractC50309vE8.mo8963h(interfaceC44489lQ8);
        this.f71261d = abstractC50309vE8;
        this.f71258a = interfaceC44489lQ8;
    }

    /* renamed from: g */
    public static <T> C17563J<T> m50923g(AbstractC41003fY8<?, ?> abstractC41003fY8, AbstractC50309vE8<?> abstractC50309vE8, InterfaceC44489lQ8 interfaceC44489lQ8) {
        return new C17563J<>(abstractC41003fY8, abstractC50309vE8, interfaceC44489lQ8);
    }

    @Override // p000.InterfaceC52825zU8
    /* renamed from: a */
    public final boolean mo1314a(T t) {
        return this.f71261d.mo8967d(t).m17714r();
    }

    @Override // p000.InterfaceC52825zU8
    /* renamed from: b */
    public final void mo1313b(T t, InterfaceC37736a39 interfaceC37736a39) throws IOException {
        Iterator<Map.Entry<?, Object>> m17717o = this.f71261d.mo8967d(t).m17717o();
        while (m17717o.hasNext()) {
            Map.Entry<?, Object> next = m17717o.next();
            OF8 of8 = (OF8) next.getKey();
            if (of8.zzc() == EnumC51380x29.MESSAGE && !of8.zzd() && !of8.zze()) {
                if (next instanceof C43851kL8) {
                    interfaceC37736a39.mo21577x(of8.zza(), ((C43851kL8) next).m29048a().m102462d());
                } else {
                    interfaceC37736a39.mo21577x(of8.zza(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        AbstractC41003fY8<?, ?> abstractC41003fY8 = this.f71259b;
        abstractC41003fY8.mo41184n(abstractC41003fY8.mo41187k(t), interfaceC37736a39);
    }

    @Override // p000.InterfaceC52825zU8
    /* renamed from: c */
    public final boolean mo1312c(T t, T t2) {
        if (!this.f71259b.mo41187k(t).equals(this.f71259b.mo41187k(t2))) {
            return false;
        }
        if (this.f71260c) {
            return this.f71261d.mo8967d(t).equals(this.f71261d.mo8967d(t2));
        }
        return true;
    }

    @Override // p000.InterfaceC52825zU8
    /* renamed from: d */
    public final void mo1311d(T t, IU8 iu8, C17551E c17551e) throws IOException {
        boolean z;
        AbstractC41003fY8<?, ?> abstractC41003fY8 = this.f71259b;
        AbstractC50309vE8<?> abstractC50309vE8 = this.f71261d;
        Object mo41183o = abstractC41003fY8.mo41183o(t);
        C47355qF8<?> mo8962i = abstractC50309vE8.mo8962i(t);
        do {
            try {
                if (iu8.zza() == Integer.MAX_VALUE) {
                    return;
                }
                int zzb = iu8.zzb();
                if (zzb != 11) {
                    if ((zzb & 7) == 2) {
                        Object mo8969b = abstractC50309vE8.mo8969b(c17551e, this.f71258a, zzb >>> 3);
                        if (mo8969b != null) {
                            abstractC50309vE8.mo8965f(iu8, mo8969b, c17551e, mo8962i);
                        } else {
                            z = abstractC41003fY8.m41189i(mo41183o, iu8);
                            continue;
                        }
                    } else {
                        z = iu8.zzc();
                        continue;
                    }
                } else {
                    Object obj = null;
                    int i = 0;
                    AbstractC53119zy8 abstractC53119zy8 = null;
                    while (iu8.zza() != Integer.MAX_VALUE) {
                        int zzb2 = iu8.zzb();
                        if (zzb2 == 16) {
                            i = iu8.mo13329f();
                            obj = abstractC50309vE8.mo8969b(c17551e, this.f71258a, i);
                        } else if (zzb2 == 26) {
                            if (obj != null) {
                                abstractC50309vE8.mo8965f(iu8, obj, c17551e, mo8962i);
                            } else {
                                abstractC53119zy8 = iu8.mo13330e();
                            }
                        } else if (!iu8.zzc()) {
                            break;
                        }
                    }
                    if (iu8.zzb() == 12) {
                        if (abstractC53119zy8 != null) {
                            if (obj != null) {
                                abstractC50309vE8.mo8966e(abstractC53119zy8, obj, c17551e, mo8962i);
                            } else {
                                abstractC41003fY8.mo41192f(mo41183o, i, abstractC53119zy8);
                            }
                        }
                    } else {
                        throw zzjk.m50760e();
                    }
                }
                z = true;
                continue;
            } finally {
                abstractC41003fY8.mo41185m(t, mo41183o);
            }
        } while (z);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[EDGE_INSN: B:57:0x00be->B:33:0x00be ?: BREAK  , SYNTHETIC] */
    @Override // p000.InterfaceC52825zU8
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1310e(T t, byte[] bArr, int i, int i2, C41844gx8 c41844gx8) throws IOException {
        AbstractC17554G abstractC17554G = (AbstractC17554G) t;
        HY8 hy8 = abstractC17554G.zzb;
        if (hy8 == HY8.m103758a()) {
            hy8 = HY8.m103752g();
            abstractC17554G.zzb = hy8;
        }
        C47355qF8<AbstractC17554G.C17559e> m50970u = ((AbstractC17554G.AbstractC17557c) t).m50970u();
        AbstractC17554G.C17558d c17558d = null;
        while (i < i2) {
            int m51007i = C17550D.m51007i(bArr, i, c41844gx8);
            int i3 = c41844gx8.f84540a;
            if (i3 != 11) {
                if ((i3 & 7) == 2) {
                    AbstractC17554G.C17558d c17558d2 = (AbstractC17554G.C17558d) this.f71261d.mo8969b(c41844gx8.f84543d, this.f71258a, i3 >>> 3);
                    if (c17558d2 != null) {
                        i = C17550D.m51009g(C40365eT8.m42854a().m42853b(c17558d2.f71226a.getClass()), bArr, m51007i, i2, c41844gx8);
                        m50970u.m17725g(c17558d2.f71227b, c41844gx8.f84542c);
                    } else {
                        i = C17550D.m51013c(i3, bArr, m51007i, i2, hy8, c41844gx8);
                    }
                    c17558d = c17558d2;
                } else {
                    i = C17550D.m51015a(i3, bArr, m51007i, i2, c41844gx8);
                }
            } else {
                int i4 = 0;
                AbstractC53119zy8 abstractC53119zy8 = null;
                while (m51007i < i2) {
                    m51007i = C17550D.m51007i(bArr, m51007i, c41844gx8);
                    int i5 = c41844gx8.f84540a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (c17558d != null) {
                                m51007i = C17550D.m51009g(C40365eT8.m42854a().m42853b(c17558d.f71226a.getClass()), bArr, m51007i, i2, c41844gx8);
                                m50970u.m17725g(c17558d.f71227b, c41844gx8.f84542c);
                            } else if (i7 == 2) {
                                m51007i = C17550D.m50999q(bArr, m51007i, c41844gx8);
                                abstractC53119zy8 = (AbstractC53119zy8) c41844gx8.f84542c;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        }
                        m51007i = C17550D.m51015a(i5, bArr, m51007i, i2, c41844gx8);
                    } else if (i7 == 0) {
                        m51007i = C17550D.m51007i(bArr, m51007i, c41844gx8);
                        i4 = c41844gx8.f84540a;
                        c17558d = (AbstractC17554G.C17558d) this.f71261d.mo8969b(c41844gx8.f84543d, this.f71258a, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (abstractC53119zy8 != null) {
                    hy8.m103756c((i4 << 3) | 2, abstractC53119zy8);
                }
                i = m51007i;
            }
        }
        if (i == i2) {
            return;
        }
        throw zzjk.m50758g();
    }

    @Override // p000.InterfaceC52825zU8
    /* renamed from: f */
    public final void mo1309f(T t, T t2) {
        UU8.m81415p(this.f71259b, t, t2);
        if (this.f71260c) {
            UU8.m81417n(this.f71261d, t, t2);
        }
    }

    @Override // p000.InterfaceC52825zU8
    public final T zza() {
        return (T) this.f71258a.mo27295h().zze();
    }

    @Override // p000.InterfaceC52825zU8
    public final int zzb(T t) {
        AbstractC41003fY8<?, ?> abstractC41003fY8 = this.f71259b;
        int mo41180r = abstractC41003fY8.mo41180r(abstractC41003fY8.mo41187k(t)) + 0;
        if (this.f71260c) {
            return mo41180r + this.f71261d.mo8967d(t).m17713s();
        }
        return mo41180r;
    }

    @Override // p000.InterfaceC52825zU8
    public final void zzc(T t) {
        this.f71259b.mo41181q(t);
        this.f71261d.mo8961j(t);
    }

    @Override // p000.InterfaceC52825zU8
    public final int zza(T t) {
        int hashCode = this.f71259b.mo41187k(t).hashCode();
        return this.f71260c ? (hashCode * 53) + this.f71261d.mo8967d(t).hashCode() : hashCode;
    }
}
