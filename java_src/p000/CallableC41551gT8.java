package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;
/* renamed from: gT8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC41551gT8 implements Callable {

    /* renamed from: b */
    public final /* synthetic */ zzq f82279b;

    /* renamed from: c */
    public final /* synthetic */ C42162hV8 f82280c;

    public CallableC41551gT8(C42162hV8 c42162hV8, zzq zzqVar) {
        this.f82280c = c42162hV8;
        this.f82279b = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C37110Xm7 m36301V = this.f82280c.m36301V((String) Preconditions.checkNotNull(this.f82279b.f71541b));
        EnumC39344cm7 enumC39344cm7 = EnumC39344cm7.ANALYTICS_STORAGE;
        if (m36301V.m76357i(enumC39344cm7) && C37110Xm7.m76364b(this.f82279b.f71562w).m76357i(enumC39344cm7)) {
            return this.f82280c.m36304S(this.f82279b).m18470j0();
        }
        this.f82280c.mo22258a().m106889s().m42708a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
