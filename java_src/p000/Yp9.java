package p000;

import com.google.android.gms.internal.recaptcha.zzrr;
import java.io.IOException;
/* renamed from: Yp9 */
/* loaded from: classes6.dex */
public final class Yp9<T> implements InterfaceC38803br9<T> {

    /* renamed from: a */
    public final Np9 f47432a;

    /* renamed from: b */
    public final Nr9<?, ?> f47433b;

    /* renamed from: c */
    public final boolean f47434c;

    /* renamed from: d */
    public final AbstractC52387yk9<?> f47435d;

    public Yp9(Nr9<?, ?> nr9, AbstractC52387yk9<?> abstractC52387yk9, Np9 np9) {
        this.f47433b = nr9;
        this.f47434c = abstractC52387yk9.mo2662h(np9);
        this.f47435d = abstractC52387yk9;
        this.f47432a = np9;
    }

    /* renamed from: f */
    public static <T> Yp9<T> m74174f(Nr9<?, ?> nr9, AbstractC52387yk9<?> abstractC52387yk9, Np9 np9) {
        return new Yp9<>(nr9, abstractC52387yk9, np9);
    }

    @Override // p000.InterfaceC38803br9
    /* renamed from: a */
    public final void mo62273a(T t) {
        this.f47433b.mo86256m(t);
        this.f47435d.mo2665e(t);
    }

    @Override // p000.InterfaceC38803br9
    /* renamed from: b */
    public final void mo62272b(T t, InterfaceC51261wq9 interfaceC51261wq9, C48830sk9 c48830sk9) throws IOException {
        boolean mo6253k;
        Nr9<?, ?> nr9 = this.f47433b;
        AbstractC52387yk9<?> abstractC52387yk9 = this.f47435d;
        Object mo86266c = nr9.mo86266c(t);
        Vk9<?> mo2668b = abstractC52387yk9.mo2668b(t);
        while (interfaceC51261wq9.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = interfaceC51261wq9.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object mo2667c = abstractC52387yk9.mo2667c(c48830sk9, this.f47432a, zzd >>> 3);
                        if (mo2667c != null) {
                            abstractC52387yk9.mo2664f(interfaceC51261wq9, mo2667c, c48830sk9, mo2668b);
                        } else {
                            mo6253k = nr9.m93274q(mo86266c, interfaceC51261wq9);
                        }
                    } else {
                        mo6253k = interfaceC51261wq9.mo6253k();
                    }
                    if (!mo6253k) {
                        return;
                    }
                } else {
                    Object obj = null;
                    int i = 0;
                    AbstractC45836nh9 abstractC45836nh9 = null;
                    while (interfaceC51261wq9.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = interfaceC51261wq9.zzd();
                        if (zzd2 == 16) {
                            i = interfaceC51261wq9.mo6261c();
                            obj = abstractC52387yk9.mo2667c(c48830sk9, this.f47432a, i);
                        } else if (zzd2 == 26) {
                            if (obj != null) {
                                abstractC52387yk9.mo2664f(interfaceC51261wq9, obj, c48830sk9, mo2668b);
                            } else {
                                abstractC45836nh9 = interfaceC51261wq9.mo6260d();
                            }
                        } else if (!interfaceC51261wq9.mo6253k()) {
                            break;
                        }
                    }
                    if (interfaceC51261wq9.zzd() == 12) {
                        if (abstractC45836nh9 != null) {
                            if (obj != null) {
                                abstractC52387yk9.mo2663g(abstractC45836nh9, obj, c48830sk9, mo2668b);
                            } else {
                                nr9.mo86258k(mo86266c, i, abstractC45836nh9);
                            }
                        }
                    } else {
                        throw zzrr.m51029b();
                    }
                }
            } finally {
                nr9.mo86255n(t, mo86266c);
            }
        }
    }

    @Override // p000.InterfaceC38803br9
    /* renamed from: c */
    public final boolean mo62271c(T t) {
        this.f47435d.mo2669a(t);
        throw null;
    }

    @Override // p000.InterfaceC38803br9
    /* renamed from: d */
    public final boolean mo62270d(T t, T t2) {
        if (!this.f47433b.mo86265d(t).equals(this.f47433b.mo86265d(t2))) {
            return false;
        }
        if (!this.f47434c) {
            return true;
        }
        this.f47435d.mo2669a(t);
        this.f47435d.mo2669a(t2);
        throw null;
    }

    @Override // p000.InterfaceC38803br9
    /* renamed from: e */
    public final void mo62269e(T t, Vs9 vs9) throws IOException {
        this.f47435d.mo2669a(t);
        throw null;
    }

    @Override // p000.InterfaceC38803br9
    public final int zza(T t) {
        Nr9<?, ?> nr9 = this.f47433b;
        int mo86267b = nr9.mo86267b(nr9.mo86265d(t));
        if (!this.f47434c) {
            return mo86267b;
        }
        this.f47435d.mo2669a(t);
        throw null;
    }

    @Override // p000.InterfaceC38803br9
    public final int zzb(T t) {
        int hashCode = this.f47433b.mo86265d(t).hashCode();
        if (!this.f47434c) {
            return hashCode;
        }
        this.f47435d.mo2669a(t);
        throw null;
    }

    @Override // p000.InterfaceC38803br9
    public final T zzc() {
        return (T) this.f47432a.mo81208p().mo64028b();
    }

    @Override // p000.InterfaceC38803br9
    public final void zze(T t, T t2) {
        C42378hr9.m35720f(this.f47433b, t, t2);
        if (this.f47434c) {
            C42378hr9.m35721e(this.f47435d, t, t2);
        }
    }
}
