package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: ac7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38058ac7 implements InterfaceC42819ic7 {

    /* renamed from: a */
    public final InterfaceC36075Tb7 f50816a;

    /* renamed from: b */
    public final AbstractC31872Bc7 f50817b;

    /* renamed from: c */
    public final boolean f50818c;

    /* renamed from: d */
    public final AbstractC35130Pa7 f50819d;

    public C38058ac7(AbstractC31872Bc7 abstractC31872Bc7, AbstractC35130Pa7 abstractC35130Pa7, InterfaceC36075Tb7 interfaceC36075Tb7) {
        this.f50817b = abstractC31872Bc7;
        this.f50818c = abstractC35130Pa7.mo88383g(interfaceC36075Tb7);
        this.f50819d = abstractC35130Pa7;
        this.f50816a = interfaceC36075Tb7;
    }

    /* renamed from: i */
    public static C38058ac7 m71012i(AbstractC31872Bc7 abstractC31872Bc7, AbstractC35130Pa7 abstractC35130Pa7, InterfaceC36075Tb7 interfaceC36075Tb7) {
        return new C38058ac7(abstractC31872Bc7, abstractC35130Pa7, interfaceC36075Tb7);
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: B */
    public final Object mo33748B() {
        InterfaceC36075Tb7 interfaceC36075Tb7 = this.f50816a;
        if (interfaceC36075Tb7 instanceof AbstractC41030fb7) {
            return ((AbstractC41030fb7) interfaceC36075Tb7).m41125x();
        }
        return interfaceC36075Tb7.mo41141f().mo64284u1();
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: a */
    public final int mo33747a(Object obj) {
        AbstractC31872Bc7 abstractC31872Bc7 = this.f50817b;
        int mo110104b = abstractC31872Bc7.mo110104b(abstractC31872Bc7.mo110102d(obj));
        if (this.f50818c) {
            return mo110104b + this.f50819d.mo88388b(obj).m83380c();
        }
        return mo110104b;
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: b */
    public final boolean mo33746b(Object obj, Object obj2) {
        if (!this.f50817b.mo110102d(obj).equals(this.f50817b.mo110102d(obj2))) {
            return false;
        }
        if (this.f50818c) {
            return this.f50819d.mo88388b(obj).equals(this.f50819d.mo88388b(obj2));
        }
        return true;
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: c */
    public final void mo33745c(Object obj, Object obj2) {
        C44005kc7.m28762d(this.f50817b, obj, obj2);
        if (this.f50818c) {
            C44005kc7.m28763c(this.f50819d, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[EDGE_INSN: B:56:0x00bf->B:33:0x00bf ?: BREAK  , SYNTHETIC] */
    @Override // p000.InterfaceC42819ic7
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo33744d(Object obj, byte[] bArr, int i, int i2, C44578la7 c44578la7) throws IOException {
        AbstractC41030fb7 abstractC41030fb7 = (AbstractC41030fb7) obj;
        C32106Cc7 c32106Cc7 = abstractC41030fb7.zbc;
        if (c32106Cc7 == C32106Cc7.m111980c()) {
            c32106Cc7 = C32106Cc7.m111977f();
            abstractC41030fb7.zbc = c32106Cc7;
        }
        C36066Ta7 m61182E = ((AbstractC39234cb7) obj).m61182E();
        Object obj2 = null;
        while (i < i2) {
            int m25395j = C45171ma7.m25395j(bArr, i, c44578la7);
            int i3 = c44578la7.f96359a;
            if (i3 != 11) {
                if ((i3 & 7) == 2) {
                    Object mo88386d = this.f50819d.mo88386d(c44578la7.f96362d, this.f50816a, i3 >>> 3);
                    if (mo88386d != null) {
                        C40437eb7 c40437eb7 = (C40437eb7) mo88386d;
                        i = C45171ma7.m25401d(C41040fc7.m41106a().m41105b(c40437eb7.f78599c.getClass()), bArr, m25395j, i2, c44578la7);
                        m61182E.m83373j(c40437eb7.f78600d, c44578la7.f96361c);
                    } else {
                        i = C45171ma7.m25396i(i3, bArr, m25395j, i2, c32106Cc7, c44578la7);
                    }
                    obj2 = mo88386d;
                } else {
                    i = C45171ma7.m25389p(i3, bArr, m25395j, i2, c44578la7);
                }
            } else {
                int i4 = 0;
                AbstractC32088Ca7 abstractC32088Ca7 = null;
                while (m25395j < i2) {
                    m25395j = C45171ma7.m25395j(bArr, m25395j, c44578la7);
                    int i5 = c44578la7.f96359a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (obj2 != null) {
                                C40437eb7 c40437eb72 = (C40437eb7) obj2;
                                m25395j = C45171ma7.m25401d(C41040fc7.m41106a().m41105b(c40437eb72.f78599c.getClass()), bArr, m25395j, i2, c44578la7);
                                m61182E.m83373j(c40437eb72.f78600d, c44578la7.f96361c);
                            } else if (i7 == 2) {
                                m25395j = C45171ma7.m25404a(bArr, m25395j, c44578la7);
                                abstractC32088Ca7 = (AbstractC32088Ca7) c44578la7.f96361c;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        }
                        m25395j = C45171ma7.m25389p(i5, bArr, m25395j, i2, c44578la7);
                    } else if (i7 == 0) {
                        m25395j = C45171ma7.m25395j(bArr, m25395j, c44578la7);
                        i4 = c44578la7.f96359a;
                        obj2 = this.f50819d.mo88386d(c44578la7.f96362d, this.f50816a, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (abstractC32088Ca7 != null) {
                    c32106Cc7.m111973j((i4 << 3) | 2, abstractC32088Ca7);
                }
                i = m25395j;
            }
        }
        if (i == i2) {
            return;
        }
        throw zbuw.m51258e();
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: e */
    public final boolean mo33743e(Object obj) {
        return this.f50819d.mo88388b(obj).m83370m();
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: f */
    public final void mo33742f(Object obj) {
        this.f50817b.mo110098h(obj);
        this.f50819d.mo88385e(obj);
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: g */
    public final void mo33741g(Object obj, InterfaceC36084Tc7 interfaceC36084Tc7) throws IOException {
        Iterator m83376g = this.f50819d.mo88388b(obj).m83376g();
        while (m83376g.hasNext()) {
            Map.Entry entry = (Map.Entry) m83376g.next();
            InterfaceC35832Sa7 interfaceC35832Sa7 = (InterfaceC35832Sa7) entry.getKey();
            if (interfaceC35832Sa7.mo44033B() == EnumC35850Sc7.MESSAGE) {
                interfaceC35832Sa7.mo44030n0();
                interfaceC35832Sa7.mo44031i0();
                if (entry instanceof C48738sb7) {
                    interfaceC35832Sa7.mo44028y();
                    interfaceC36084Tc7.mo83293c(32149011, ((C48738sb7) entry).m13954a().m3194b());
                } else {
                    interfaceC35832Sa7.mo44028y();
                    interfaceC36084Tc7.mo83293c(32149011, entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        AbstractC31872Bc7 abstractC31872Bc7 = this.f50817b;
        abstractC31872Bc7.mo110095k(abstractC31872Bc7.mo110102d(obj), interfaceC36084Tc7);
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: h */
    public final int mo33740h(Object obj) {
        int hashCode = this.f50817b.mo110102d(obj).hashCode();
        if (this.f50818c) {
            return (hashCode * 53) + this.f50819d.mo88388b(obj).f35709a.hashCode();
        }
        return hashCode;
    }
}
