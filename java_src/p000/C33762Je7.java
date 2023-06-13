package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;
/* renamed from: Je7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33762Je7 extends ZX7 {

    /* renamed from: a */
    public final C35248Pn8 f17965a;

    /* renamed from: b */
    public final RC8 f17966b;

    public C33762Je7(C35248Pn8 c35248Pn8) {
        super(null);
        Preconditions.checkNotNull(c35248Pn8);
        this.f17965a = c35248Pn8;
        this.f17966b = c35248Pn8.m89781I();
    }

    @Override // p000.InterfaceC39629dD8
    /* renamed from: a */
    public final String mo14034a() {
        return this.f17966b.m87174V();
    }

    @Override // p000.InterfaceC39629dD8
    /* renamed from: b */
    public final void mo14033b(String str, String str2, Bundle bundle) {
        this.f17966b.m87160o(str, str2, bundle);
    }

    @Override // p000.InterfaceC39629dD8
    /* renamed from: c */
    public final String mo14032c() {
        return this.f17966b.m87172X();
    }

    @Override // p000.InterfaceC39629dD8
    /* renamed from: d */
    public final void mo14031d(String str) {
        this.f17965a.m89752v().m71230i(str, this.f17965a.mo22260A().elapsedRealtime());
    }

    @Override // p000.InterfaceC39629dD8
    /* renamed from: e */
    public final void mo14030e(String str) {
        this.f17965a.m89752v().m71229j(str, this.f17965a.mo22260A().elapsedRealtime());
    }

    @Override // p000.InterfaceC39629dD8
    /* renamed from: f */
    public final Map mo14029f(String str, String str2, boolean z) {
        return this.f17966b.m87169a0(str, str2, z);
    }

    @Override // p000.InterfaceC39629dD8
    /* renamed from: g */
    public final List mo14028g(String str, String str2) {
        return this.f17966b.m87170Z(str, str2);
    }

    @Override // p000.InterfaceC39629dD8
    /* renamed from: h */
    public final void mo14027h(Bundle bundle) {
        this.f17966b.m87192D(bundle);
    }

    @Override // p000.InterfaceC39629dD8
    /* renamed from: i */
    public final void mo14026i(String str, String str2, Bundle bundle) {
        this.f17965a.m89781I().m87163l(str, str2, bundle);
    }

    @Override // p000.InterfaceC39629dD8
    public final int zza(String str) {
        this.f17966b.m87179Q(str);
        return 25;
    }

    @Override // p000.InterfaceC39629dD8
    public final long zzb() {
        return this.f17965a.m89776N().m92049t0();
    }

    @Override // p000.InterfaceC39629dD8
    public final String zzh() {
        return this.f17966b.m87174V();
    }

    @Override // p000.InterfaceC39629dD8
    public final String zzi() {
        return this.f17966b.m87173W();
    }
}
