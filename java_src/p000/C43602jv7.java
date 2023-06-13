package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: jv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43602jv7 implements InterfaceC34851Nv7 {

    /* renamed from: a */
    public final InterfaceC41230fv7 f93534a;

    /* renamed from: b */
    public final AbstractC48948sw7 f93535b;

    /* renamed from: c */
    public final boolean f93536c;

    /* renamed from: d */
    public final AbstractC31791At7 f93537d;

    public C43602jv7(AbstractC48948sw7 abstractC48948sw7, AbstractC31791At7 abstractC31791At7, InterfaceC41230fv7 interfaceC41230fv7) {
        this.f93535b = abstractC48948sw7;
        this.f93536c = abstractC31791At7.mo113387j(interfaceC41230fv7);
        this.f93537d = abstractC31791At7;
        this.f93534a = interfaceC41230fv7;
    }

    /* renamed from: b */
    public static C43602jv7 m29761b(AbstractC48948sw7 abstractC48948sw7, AbstractC31791At7 abstractC31791At7, InterfaceC41230fv7 interfaceC41230fv7) {
        return new C43602jv7(abstractC48948sw7, abstractC31791At7, interfaceC41230fv7);
    }

    @Override // p000.InterfaceC34851Nv7
    /* renamed from: a */
    public final void mo29762a(Object obj, Object obj2) {
        C35319Pv7.m89388f(this.f93535b, obj, obj2);
        if (this.f93536c) {
            C35319Pv7.m89389e(this.f93537d, obj, obj2);
        }
    }

    @Override // p000.InterfaceC34851Nv7
    /* renamed from: d */
    public final boolean mo29760d(Object obj) {
        return this.f93537d.mo113395b(obj).m108236n();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0088 A[EDGE_INSN: B:56:0x0088->B:34:0x0088 ?: BREAK  , SYNTHETIC] */
    @Override // p000.InterfaceC34851Nv7
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo29759e(Object obj, byte[] bArr, int i, int i2, C32952Fs7 c32952Fs7) throws IOException {
        AbstractC40627eu7 abstractC40627eu7 = (AbstractC40627eu7) obj;
        C49541tw7 c49541tw7 = abstractC40627eu7.zzc;
        if (c49541tw7 == C49541tw7.m11184c()) {
            c49541tw7 = C49541tw7.m11182e();
            abstractC40627eu7.zzc = c49541tw7;
        }
        ((AbstractC38831bu7) obj).m62161D();
        Object obj2 = null;
        while (i < i2) {
            int m104631j = C33186Gs7.m104631j(bArr, i, c32952Fs7);
            int i3 = c32952Fs7.f10390a;
            if (i3 != 11) {
                if ((i3 & 7) == 2) {
                    obj2 = this.f93537d.mo113393d(c32952Fs7.f10393d, this.f93534a, i3 >>> 3);
                    if (obj2 == null) {
                        i = C33186Gs7.m104632i(i3, bArr, m104631j, i2, c49541tw7, c32952Fs7);
                    } else {
                        C32979Fv7 c32979Fv7 = C32979Fv7.f10518c;
                        throw null;
                    }
                } else {
                    i = C33186Gs7.m104627n(i3, bArr, m104631j, i2, c32952Fs7);
                }
            } else {
                int i4 = 0;
                AbstractC44175kt7 abstractC44175kt7 = null;
                while (m104631j < i2) {
                    m104631j = C33186Gs7.m104631j(bArr, m104631j, c32952Fs7);
                    int i5 = c32952Fs7.f10390a;
                    int i6 = i5 & 7;
                    int i7 = i5 >>> 3;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (obj2 == null) {
                                if (i6 == 2) {
                                    m104631j = C33186Gs7.m104640a(bArr, m104631j, c32952Fs7);
                                    abstractC44175kt7 = (AbstractC44175kt7) c32952Fs7.f10392c;
                                }
                            } else {
                                C32979Fv7 c32979Fv72 = C32979Fv7.f10518c;
                                throw null;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        }
                        m104631j = C33186Gs7.m104627n(i5, bArr, m104631j, i2, c32952Fs7);
                    } else if (i6 == 0) {
                        m104631j = C33186Gs7.m104631j(bArr, m104631j, c32952Fs7);
                        i4 = c32952Fs7.f10390a;
                        obj2 = this.f93537d.mo113393d(c32952Fs7.f10393d, this.f93534a, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (abstractC44175kt7 != null) {
                    c49541tw7.m11179h((i4 << 3) | 2, abstractC44175kt7);
                }
                i = m104631j;
            }
        }
        if (i == i2) {
            return;
        }
        throw zzaqw.m51281g();
    }

    @Override // p000.InterfaceC34851Nv7
    /* renamed from: f */
    public final void mo29758f(Object obj, InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException {
        Iterator m108242h = this.f93537d.mo113395b(obj).m108242h();
        while (m108242h.hasNext()) {
            Map.Entry entry = (Map.Entry) m108242h.next();
            InterfaceC32493Dt7 interfaceC32493Dt7 = (InterfaceC32493Dt7) entry.getKey();
            if (interfaceC32493Dt7.zze() == EnumC33924Jw7.MESSAGE && !interfaceC32493Dt7.zzg() && !interfaceC32493Dt7.mo44848x()) {
                if (entry instanceof C48336ru7) {
                    interfaceC34158Kw7.mo7844D(interfaceC32493Dt7.zza(), ((C48336ru7) entry).m15088a().m94584b());
                } else {
                    interfaceC34158Kw7.mo7844D(interfaceC32493Dt7.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        AbstractC48948sw7 abstractC48948sw7 = this.f93535b;
        abstractC48948sw7.mo9457p(abstractC48948sw7.mo9469d(obj), interfaceC34158Kw7);
    }

    @Override // p000.InterfaceC34851Nv7
    /* renamed from: g */
    public final boolean mo29757g(Object obj, Object obj2) {
        if (!this.f93535b.mo9469d(obj).equals(this.f93535b.mo9469d(obj2))) {
            return false;
        }
        if (this.f93536c) {
            return this.f93537d.mo113395b(obj).equals(this.f93537d.mo113395b(obj2));
        }
        return true;
    }

    @Override // p000.InterfaceC34851Nv7
    /* renamed from: h */
    public final void mo29756h(Object obj, InterfaceC33681Iv7 interfaceC33681Iv7, C53068zt7 c53068zt7) throws IOException {
        boolean mo18531k;
        AbstractC48948sw7 abstractC48948sw7 = this.f93535b;
        AbstractC31791At7 abstractC31791At7 = this.f93537d;
        Object mo9470c = abstractC48948sw7.mo9470c(obj);
        C32727Et7 mo113394c = abstractC31791At7.mo113394c(obj);
        while (interfaceC33681Iv7.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = interfaceC33681Iv7.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object mo113393d = abstractC31791At7.mo113393d(c53068zt7, this.f93534a, zzd >>> 3);
                        if (mo113393d != null) {
                            abstractC31791At7.mo113390g(interfaceC33681Iv7, mo113393d, c53068zt7, mo113394c);
                        } else {
                            mo18531k = abstractC48948sw7.m13374r(mo9470c, interfaceC33681Iv7);
                        }
                    } else {
                        mo18531k = interfaceC33681Iv7.mo18531k();
                    }
                    if (!mo18531k) {
                        return;
                    }
                } else {
                    Object obj2 = null;
                    int i = 0;
                    AbstractC44175kt7 abstractC44175kt7 = null;
                    while (interfaceC33681Iv7.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = interfaceC33681Iv7.zzd();
                        if (zzd2 == 16) {
                            i = interfaceC33681Iv7.mo18539c();
                            obj2 = abstractC31791At7.mo113393d(c53068zt7, this.f93534a, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                abstractC31791At7.mo113390g(interfaceC33681Iv7, obj2, c53068zt7, mo113394c);
                            } else {
                                abstractC44175kt7 = interfaceC33681Iv7.mo18538d();
                            }
                        } else if (!interfaceC33681Iv7.mo18531k()) {
                            break;
                        }
                    }
                    if (interfaceC33681Iv7.zzd() == 12) {
                        if (abstractC44175kt7 != null) {
                            if (obj2 != null) {
                                abstractC31791At7.mo113389h(abstractC44175kt7, obj2, c53068zt7, mo113394c);
                            } else {
                                abstractC48948sw7.mo9462k(mo9470c, i, abstractC44175kt7);
                            }
                        }
                    } else {
                        throw zzaqw.m51286b();
                    }
                }
            } finally {
                abstractC48948sw7.mo9459n(obj, mo9470c);
            }
        }
    }

    @Override // p000.InterfaceC34851Nv7
    public final int zza(Object obj) {
        AbstractC48948sw7 abstractC48948sw7 = this.f93535b;
        int mo9471b = abstractC48948sw7.mo9471b(abstractC48948sw7.mo9469d(obj));
        if (this.f93536c) {
            return mo9471b + this.f93537d.mo113395b(obj).m108246d();
        }
        return mo9471b;
    }

    @Override // p000.InterfaceC34851Nv7
    public final int zzb(Object obj) {
        int hashCode = this.f93535b.mo9469d(obj).hashCode();
        if (this.f93536c) {
            return (hashCode * 53) + this.f93537d.mo113395b(obj).f8278a.hashCode();
        }
        return hashCode;
    }

    @Override // p000.InterfaceC34851Nv7
    public final Object zze() {
        return this.f93534a.mo191k().zzv();
    }

    @Override // p000.InterfaceC34851Nv7
    public final void zzf(Object obj) {
        this.f93535b.mo9460m(obj);
        this.f93537d.mo113391f(obj);
    }
}
