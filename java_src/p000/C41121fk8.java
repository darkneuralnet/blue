package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: fk8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41121fk8 implements InterfaceC32449Do8 {

    /* renamed from: a */
    public final InterfaceC39926dj8 f80555a;

    /* renamed from: b */
    public final AbstractC32953Fs8 f80556b;

    /* renamed from: c */
    public final boolean f80557c;

    /* renamed from: d */
    public final W28 f80558d;

    public C41121fk8(AbstractC32953Fs8 abstractC32953Fs8, W28 w28, InterfaceC39926dj8 interfaceC39926dj8) {
        this.f80556b = abstractC32953Fs8;
        this.f80557c = w28.mo24508g(interfaceC39926dj8);
        this.f80558d = w28;
        this.f80555a = interfaceC39926dj8;
    }

    /* renamed from: f */
    public static C41121fk8 m40914f(AbstractC32953Fs8 abstractC32953Fs8, W28 w28, InterfaceC39926dj8 interfaceC39926dj8) {
        return new C41121fk8(abstractC32953Fs8, w28, interfaceC39926dj8);
    }

    @Override // p000.InterfaceC32449Do8
    /* renamed from: a */
    public final void mo40919a(Object obj, Object obj2) {
        C39393cp8.m45024d(this.f80556b, obj, obj2);
        if (this.f80557c) {
            C39393cp8.m45025c(this.f80558d, obj, obj2);
        }
    }

    @Override // p000.InterfaceC32449Do8
    /* renamed from: b */
    public final boolean mo40918b(Object obj) {
        return this.f80558d.mo24513b(obj).m44631k();
    }

    @Override // p000.InterfaceC32449Do8
    /* renamed from: c */
    public final boolean mo40917c(Object obj, Object obj2) {
        if (!this.f80556b.mo82290d(obj).equals(this.f80556b.mo82290d(obj2))) {
            return false;
        }
        if (this.f80557c) {
            return this.f80558d.mo24513b(obj).equals(this.f80558d.mo24513b(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[EDGE_INSN: B:56:0x00bf->B:33:0x00bf ?: BREAK  , SYNTHETIC] */
    @Override // p000.InterfaceC32449Do8
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo40916d(Object obj, byte[] bArr, int i, int i2, FU7 fu7) throws IOException {
        V78 v78 = (V78) obj;
        C36463Us8 c36463Us8 = v78.zzc;
        if (c36463Us8 == C36463Us8.m80680c()) {
            c36463Us8 = C36463Us8.m80677f();
            v78.zzc = c36463Us8;
        }
        C39542d48 m88922H = ((Q58) obj).m88922H();
        Object obj2 = null;
        while (i < i2) {
            int m83552j = TU7.m83552j(bArr, i, fu7);
            int i3 = fu7.f9512a;
            if (i3 != 11) {
                if ((i3 & 7) == 2) {
                    Object mo24511d = this.f80558d.mo24511d(fu7.f9515d, this.f80555a, i3 >>> 3);
                    if (mo24511d != null) {
                        C47280q78 c47280q78 = (C47280q78) mo24511d;
                        i = TU7.m83558d(C48247rl8.m15451a().m15450b(c47280q78.f104760c.getClass()), bArr, m83552j, i2, fu7);
                        m88922H.m44633i(c47280q78.f104761d, fu7.f9514c);
                    } else {
                        i = TU7.m83553i(i3, bArr, m83552j, i2, c36463Us8, fu7);
                    }
                    obj2 = mo24511d;
                } else {
                    i = TU7.m83546p(i3, bArr, m83552j, i2, fu7);
                }
            } else {
                int i4 = 0;
                AbstractC41604gZ7 abstractC41604gZ7 = null;
                while (m83552j < i2) {
                    m83552j = TU7.m83552j(bArr, m83552j, fu7);
                    int i5 = fu7.f9512a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (obj2 != null) {
                                C47280q78 c47280q782 = (C47280q78) obj2;
                                m83552j = TU7.m83558d(C48247rl8.m15451a().m15450b(c47280q782.f104760c.getClass()), bArr, m83552j, i2, fu7);
                                m88922H.m44633i(c47280q782.f104761d, fu7.f9514c);
                            } else if (i7 == 2) {
                                m83552j = TU7.m83561a(bArr, m83552j, fu7);
                                abstractC41604gZ7 = (AbstractC41604gZ7) fu7.f9514c;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        }
                        m83552j = TU7.m83546p(i5, bArr, m83552j, i2, fu7);
                    } else if (i7 == 0) {
                        m83552j = TU7.m83552j(bArr, m83552j, fu7);
                        i4 = fu7.f9512a;
                        obj2 = this.f80558d.mo24511d(fu7.f9515d, this.f80555a, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (abstractC41604gZ7 != null) {
                    c36463Us8.m80673j((i4 << 3) | 2, abstractC41604gZ7);
                }
                i = m83552j;
            }
        }
        if (i == i2) {
            return;
        }
        throw zzeo.m51317e();
    }

    @Override // p000.InterfaceC32449Do8
    /* renamed from: e */
    public final void mo40915e(Object obj, InterfaceC36040Sx8 interfaceC36040Sx8) throws IOException {
        Iterator m44636f = this.f80558d.mo24513b(obj).m44636f();
        while (m44636f.hasNext()) {
            Map.Entry entry = (Map.Entry) m44636f.next();
            O38 o38 = (O38) entry.getKey();
            if (o38.zze() == EnumC33466Hx8.MESSAGE) {
                o38.zzg();
                o38.mo64935x();
                if (entry instanceof C37012Xb8) {
                    interfaceC36040Sx8.mo84560I(o38.zza(), ((C37012Xb8) entry).m76802a().m98651b());
                } else {
                    interfaceC36040Sx8.mo84560I(o38.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        AbstractC32953Fs8 abstractC32953Fs8 = this.f80556b;
        abstractC32953Fs8.mo82285i(abstractC32953Fs8.mo82290d(obj), interfaceC36040Sx8);
    }

    @Override // p000.InterfaceC32449Do8
    public final int zza(Object obj) {
        AbstractC32953Fs8 abstractC32953Fs8 = this.f80556b;
        int mo82292b = abstractC32953Fs8.mo82292b(abstractC32953Fs8.mo82290d(obj));
        if (this.f80557c) {
            return mo82292b + this.f80558d.mo24513b(obj).m44640b();
        }
        return mo82292b;
    }

    @Override // p000.InterfaceC32449Do8
    public final int zzb(Object obj) {
        int hashCode = this.f80556b.mo82290d(obj).hashCode();
        if (this.f80557c) {
            return (hashCode * 53) + this.f80558d.mo24513b(obj).f76101a.hashCode();
        }
        return hashCode;
    }

    @Override // p000.InterfaceC32449Do8
    public final Object zze() {
        InterfaceC39926dj8 interfaceC39926dj8 = this.f80555a;
        if (interfaceC39926dj8 instanceof V78) {
            return ((V78) interfaceC39926dj8).m80347j();
        }
        return interfaceC39926dj8.mo43833A().mo29322a();
    }

    @Override // p000.InterfaceC32449Do8
    public final void zzf(Object obj) {
        this.f80556b.mo82287g(obj);
        this.f80558d.mo24510e(obj);
    }
}
