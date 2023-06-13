package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zzov;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: Tg9 */
/* loaded from: classes5.dex */
public final class Tg9 implements Ei9 {

    /* renamed from: a */
    public final InterfaceC47012pg9 f35870a;

    /* renamed from: b */
    public final Mk9 f35871b;

    /* renamed from: c */
    public final boolean f35872c;

    /* renamed from: d */
    public final U89 f35873d;

    public Tg9(Mk9 mk9, U89 u89, InterfaceC47012pg9 interfaceC47012pg9) {
        this.f35871b = mk9;
        this.f35872c = u89.mo81911f(interfaceC47012pg9);
        this.f35873d = u89;
        this.f35870a = interfaceC47012pg9;
    }

    /* renamed from: f */
    public static Tg9 m83161f(Mk9 mk9, U89 u89, InterfaceC47012pg9 interfaceC47012pg9) {
        return new Tg9(mk9, u89, interfaceC47012pg9);
    }

    @Override // p000.Ei9
    /* renamed from: a */
    public final void mo83166a(Object obj, Object obj2) {
        Ti9.m83098f(this.f35871b, obj, obj2);
        if (this.f35872c) {
            Ti9.m83099e(this.f35873d, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[EDGE_INSN: B:56:0x00bf->B:33:0x00bf ?: BREAK  , SYNTHETIC] */
    @Override // p000.Ei9
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo83165b(Object obj, byte[] bArr, int i, int i2, C43100j49 c43100j49) throws IOException {
        AbstractC49926ub9 abstractC49926ub9 = (AbstractC49926ub9) obj;
        Sk9 sk9 = abstractC49926ub9.zzc;
        if (sk9 == Sk9.m84915c()) {
            sk9 = Sk9.m84913e();
            abstractC49926ub9.zzc = sk9;
        }
        C39837da9 m83365u = ((Ta9) obj).m83365u();
        Object obj2 = null;
        while (i < i2) {
            int m16521j = C47844r49.m16521j(bArr, i, c43100j49);
            int i3 = c43100j49.f92111a;
            if (i3 != 11) {
                if ((i3 & 7) == 2) {
                    Object mo81913d = this.f35873d.mo81913d(c43100j49.f92114d, this.f35870a, i3 >>> 3);
                    if (mo81913d != null) {
                        C42218hb9 c42218hb9 = (C42218hb9) mo81913d;
                        i = C47844r49.m16527d(C42288hi9.m36060a().m36059b(c42218hb9.f85600c.getClass()), bArr, m16521j, i2, c43100j49);
                        m83365u.m44102j(c42218hb9.f85601d, c43100j49.f92113c);
                    } else {
                        i = C47844r49.m16522i(i3, bArr, m16521j, i2, sk9, c43100j49);
                    }
                    obj2 = mo81913d;
                } else {
                    i = C47844r49.m16517n(i3, bArr, m16521j, i2, c43100j49);
                }
            } else {
                int i4 = 0;
                T69 t69 = null;
                while (m16521j < i2) {
                    m16521j = C47844r49.m16521j(bArr, m16521j, c43100j49);
                    int i5 = c43100j49.f92111a;
                    int i6 = i5 & 7;
                    int i7 = i5 >>> 3;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (obj2 != null) {
                                C42218hb9 c42218hb92 = (C42218hb9) obj2;
                                m16521j = C47844r49.m16527d(C42288hi9.m36060a().m36059b(c42218hb92.f85600c.getClass()), bArr, m16521j, i2, c43100j49);
                                m83365u.m44102j(c42218hb92.f85601d, c43100j49.f92113c);
                            } else if (i6 == 2) {
                                m16521j = C47844r49.m16530a(bArr, m16521j, c43100j49);
                                t69 = (T69) c43100j49.f92113c;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        }
                        m16521j = C47844r49.m16517n(i5, bArr, m16521j, i2, c43100j49);
                    } else if (i6 == 0) {
                        m16521j = C47844r49.m16521j(bArr, m16521j, c43100j49);
                        i4 = c43100j49.f92111a;
                        obj2 = this.f35873d.mo81913d(c43100j49.f92114d, this.f35870a, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (t69 != null) {
                    sk9.m84910h((i4 << 3) | 2, t69);
                }
                i = m16521j;
            }
        }
        if (i == i2) {
            return;
        }
        throw zzov.m51291e();
    }

    @Override // p000.Ei9
    /* renamed from: c */
    public final boolean mo83164c(Object obj, Object obj2) {
        if (!this.f35871b.mo74329c(obj).equals(this.f35871b.mo74329c(obj2))) {
            return false;
        }
        if (this.f35872c) {
            return this.f35873d.mo81915b(obj).equals(this.f35873d.mo81915b(obj2));
        }
        return true;
    }

    @Override // p000.Ei9
    /* renamed from: d */
    public final void mo83163d(Object obj, C41954h89 c41954h89) throws IOException {
        Iterator m44106f = this.f35873d.mo81915b(obj).m44106f();
        if (m44106f.hasNext()) {
            W99 w99 = (W99) ((Map.Entry) m44106f.next()).getKey();
            if (w99.zzc() == EnumC44710ln9.MESSAGE) {
                w99.zze();
            }
            throw new IllegalStateException("Found invalid MessageSet item.");
        }
        Mk9 mk9 = this.f35871b;
        mk9.mo74323i(mk9.mo74329c(obj), c41954h89);
    }

    @Override // p000.Ei9
    /* renamed from: e */
    public final boolean mo83162e(Object obj) {
        return this.f35873d.mo81915b(obj).m44100l();
    }

    @Override // p000.Ei9
    public final int zza(Object obj) {
        Mk9 mk9 = this.f35871b;
        int mo74330b = mk9.mo74330b(mk9.mo74329c(obj));
        if (this.f35872c) {
            return mo74330b + this.f35873d.mo81915b(obj).m44110b();
        }
        return mo74330b;
    }

    @Override // p000.Ei9
    public final int zzb(Object obj) {
        int hashCode = this.f35871b.mo74329c(obj).hashCode();
        if (this.f35872c) {
            return (hashCode * 53) + this.f35873d.mo81915b(obj).f76816a.hashCode();
        }
        return hashCode;
    }

    @Override // p000.Ei9
    public final Object zze() {
        return this.f35870a.mo9982q().zzs();
    }

    @Override // p000.Ei9
    public final void zzf(Object obj) {
        this.f35871b.mo74325g(obj);
        this.f35873d.mo81912e(obj);
    }
}
