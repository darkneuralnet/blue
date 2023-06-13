package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.AbstractC17530c;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.places.f */
/* loaded from: classes5.dex */
public final class C17538f<T> implements LY7<T> {

    /* renamed from: a */
    public final InterfaceC52815zT7 f71186a;

    /* renamed from: b */
    public final I38<?, ?> f71187b;

    /* renamed from: c */
    public final boolean f71188c;

    /* renamed from: d */
    public final AbstractC49521tu7<?> f71189d;

    public C17538f(I38<?, ?> i38, AbstractC49521tu7<?> abstractC49521tu7, InterfaceC52815zT7 interfaceC52815zT7) {
        this.f71187b = i38;
        this.f71188c = abstractC49521tu7.mo11223g(interfaceC52815zT7);
        this.f71189d = abstractC49521tu7;
        this.f71186a = interfaceC52815zT7;
    }

    /* renamed from: i */
    public static <T> C17538f<T> m51164i(I38<?, ?> i38, AbstractC49521tu7<?> abstractC49521tu7, InterfaceC52815zT7 interfaceC52815zT7) {
        return new C17538f<>(i38, abstractC49521tu7, interfaceC52815zT7);
    }

    @Override // p000.LY7
    /* renamed from: a */
    public final void mo51172a(T t) {
        this.f71187b.mo51159d(t);
        this.f71189d.mo11224f(t);
    }

    @Override // p000.LY7
    /* renamed from: b */
    public final boolean mo51171b(T t, T t2) {
        if (!this.f71187b.mo51152k(t).equals(this.f71187b.mo51152k(t2))) {
            return false;
        }
        if (this.f71188c) {
            return this.f71189d.mo11227c(t).equals(this.f71189d.mo11227c(t2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // p000.LY7
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo51170c(T t, byte[] bArr, int i, int i2, C49433tl9 c49433tl9) throws IOException {
        AbstractC17530c abstractC17530c = (AbstractC17530c) t;
        C49611u38 c49611u38 = abstractC17530c.zzih;
        if (c49611u38 == C49611u38.m10923i()) {
            c49611u38 = C49611u38.m10922j();
            abstractC17530c.zzih = c49611u38;
        }
        ((AbstractC17530c.AbstractC17532b) t).m51214s();
        AbstractC17530c.C17535e c17535e = null;
        while (i < i2) {
            int m51129j = C17545l.m51129j(bArr, i, c49433tl9);
            int i3 = c49433tl9.f110994a;
            if (i3 != 11) {
                if ((i3 & 7) == 2) {
                    c17535e = (AbstractC17530c.C17535e) this.f71189d.mo11228b(c49433tl9.f110997d, this.f71186a, i3 >>> 3);
                    if (c17535e == null) {
                        i = C17545l.m51137b(i3, bArr, m51129j, i2, c49611u38, c49433tl9);
                    } else {
                        C48692sW7.m14115a();
                        throw new NoSuchMethodError();
                    }
                } else {
                    i = C17545l.m51136c(i3, bArr, m51129j, i2, c49433tl9);
                }
            } else {
                int i4 = 0;
                AbstractC43604jv9 abstractC43604jv9 = null;
                while (m51129j < i2) {
                    m51129j = C17545l.m51129j(bArr, m51129j, c49433tl9);
                    int i5 = c49433tl9.f110994a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (c17535e == null) {
                                if (i7 == 2) {
                                    m51129j = C17545l.m51122q(bArr, m51129j, c49433tl9);
                                    abstractC43604jv9 = (AbstractC43604jv9) c49433tl9.f110996c;
                                }
                            } else {
                                C48692sW7.m14115a();
                                throw new NoSuchMethodError();
                            }
                        }
                        if (i5 != 12) {
                            break;
                        }
                        m51129j = C17545l.m51136c(i5, bArr, m51129j, i2, c49433tl9);
                    } else if (i7 == 0) {
                        m51129j = C17545l.m51129j(bArr, m51129j, c49433tl9);
                        i4 = c49433tl9.f110994a;
                        c17535e = (AbstractC17530c.C17535e) this.f71189d.mo11228b(c49433tl9.f110997d, this.f71186a, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (abstractC43604jv9 != null) {
                    c49611u38.m10926f((i4 << 3) | 2, abstractC43604jv9);
                }
                i = m51129j;
            }
        }
        if (i == i2) {
            return;
        }
        throw zzbk.m51034e();
    }

    @Override // p000.LY7
    /* renamed from: d */
    public final T mo51169d() {
        return (T) this.f71186a.mo1330f().mo27251v();
    }

    @Override // p000.LY7
    /* renamed from: e */
    public final int mo51168e(T t) {
        int hashCode = this.f71187b.mo51152k(t).hashCode();
        if (this.f71188c) {
            return (hashCode * 53) + this.f71189d.mo11227c(t).hashCode();
        }
        return hashCode;
    }

    @Override // p000.LY7
    /* renamed from: f */
    public final boolean mo51167f(T t) {
        return this.f71189d.mo11227c(t).m104566c();
    }

    @Override // p000.LY7
    /* renamed from: g */
    public final void mo51166g(T t, InterfaceC43393ja8 interfaceC43393ja8) throws IOException {
        Iterator<Map.Entry<?, Object>> m104565d = this.f71189d.mo11227c(t).m104565d();
        while (m104565d.hasNext()) {
            Map.Entry<?, Object> next = m104565d.next();
            InterfaceC44828lz7 interfaceC44828lz7 = (InterfaceC44828lz7) next.getKey();
            if (interfaceC44828lz7.m26558C() == EnumC52286ya8.MESSAGE && !interfaceC44828lz7.m26557O() && !interfaceC44828lz7.m26556Z0()) {
                if (next instanceof C52150yL7) {
                    interfaceC43393ja8.mo15217J(interfaceC44828lz7.m26554z(), ((C52150yL7) next).m3580a().m42994d());
                } else {
                    interfaceC43393ja8.mo15217J(interfaceC44828lz7.m26554z(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        I38<?, ?> i38 = this.f71187b;
        i38.mo51158e(i38.mo51152k(t), interfaceC43393ja8);
    }

    @Override // p000.LY7
    /* renamed from: h */
    public final int mo51165h(T t) {
        I38<?, ?> i38 = this.f71187b;
        int mo51151l = i38.mo51151l(i38.mo51152k(t)) + 0;
        if (this.f71188c) {
            return mo51151l + this.f71189d.mo11227c(t).m104562g();
        }
        return mo51151l;
    }

    @Override // p000.LY7
    public final void zzd(T t, T t2) {
        C46348oZ7.m20856h(this.f71187b, t, t2);
        if (this.f71188c) {
            C46348oZ7.m20858f(this.f71189d, t, t2);
        }
    }
}
