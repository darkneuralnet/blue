package p000;

import java.io.IOException;
/* renamed from: e29  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40115e29 implements F39 {

    /* renamed from: a */
    public final InterfaceC47814r19 f77618a;

    /* renamed from: b */
    public final Q69 f77619b;

    /* renamed from: c */
    public final boolean f77620c;

    /* renamed from: d */
    public final AbstractC39755dR8 f77621d;

    public C40115e29(Q69 q69, AbstractC39755dR8 abstractC39755dR8, InterfaceC47814r19 interfaceC47814r19) {
        this.f77619b = q69;
        this.f77620c = abstractC39755dR8.mo23746c(interfaceC47814r19);
        this.f77621d = abstractC39755dR8;
        this.f77618a = interfaceC47814r19;
    }

    /* renamed from: f */
    public static C40115e29 m43314f(Q69 q69, AbstractC39755dR8 abstractC39755dR8, InterfaceC47814r19 interfaceC47814r19) {
        return new C40115e29(q69, abstractC39755dR8, interfaceC47814r19);
    }

    @Override // p000.F39
    /* renamed from: a */
    public final void mo43319a(Object obj, Object obj2) {
        X39.m77470c(this.f77619b, obj, obj2);
        if (!this.f77620c) {
            return;
        }
        this.f77621d.mo23748a(obj2);
        throw null;
    }

    @Override // p000.F39
    /* renamed from: b */
    public final boolean mo43318b(Object obj) {
        this.f77621d.mo23748a(obj);
        throw null;
    }

    @Override // p000.F39
    /* renamed from: c */
    public final boolean mo43317c(Object obj, Object obj2) {
        if (!this.f77619b.mo41973d(obj).equals(this.f77619b.mo41973d(obj2))) {
            return false;
        }
        if (!this.f77620c) {
            return true;
        }
        this.f77621d.mo23748a(obj);
        this.f77621d.mo23748a(obj2);
        throw null;
    }

    @Override // p000.F39
    /* renamed from: d */
    public final void mo43316d(Object obj, InterfaceC38633ba9 interfaceC38633ba9) throws IOException {
        this.f77621d.mo23748a(obj);
        throw null;
    }

    @Override // p000.F39
    /* renamed from: e */
    public final void mo43315e(Object obj, byte[] bArr, int i, int i2, C52735zK8 c52735zK8) throws IOException {
        AbstractC46897pU8 abstractC46897pU8 = (AbstractC46897pU8) obj;
        if (abstractC46897pU8.zzc == Y69.m75687c()) {
            abstractC46897pU8.zzc = Y69.m75684f();
        }
        AbstractC40958fT8 abstractC40958fT8 = (AbstractC40958fT8) obj;
        throw null;
    }

    @Override // p000.F39
    public final int zza(Object obj) {
        Q69 q69 = this.f77619b;
        int mo41975b = q69.mo41975b(q69.mo41973d(obj));
        if (!this.f77620c) {
            return mo41975b;
        }
        this.f77621d.mo23748a(obj);
        throw null;
    }

    @Override // p000.F39
    public final int zzb(Object obj) {
        int hashCode = this.f77619b.mo41973d(obj).hashCode();
        if (!this.f77620c) {
            return hashCode;
        }
        this.f77621d.mo23748a(obj);
        throw null;
    }

    @Override // p000.F39
    public final Object zze() {
        InterfaceC47814r19 interfaceC47814r19 = this.f77618a;
        if (interfaceC47814r19 instanceof AbstractC46897pU8) {
            return ((AbstractC46897pU8) interfaceC47814r19).m19206l();
        }
        return interfaceC47814r19.mo16627e().mo36897R1();
    }

    @Override // p000.F39
    public final void zzf(Object obj) {
        this.f77619b.mo41970g(obj);
        this.f77621d.mo23747b(obj);
    }
}
