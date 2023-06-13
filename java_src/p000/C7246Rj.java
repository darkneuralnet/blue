package p000;

import android.content.Context;
import co.bird.android.persistence.announcements.ConfigurableTutorialDatabase;
/* renamed from: Rj */
/* loaded from: classes4.dex */
public final class C7246Rj implements InterfaceC48812sj1<ConfigurableTutorialDatabase> {

    /* renamed from: a */
    public final C22711hj f32472a;

    /* renamed from: b */
    public final Y94<Context> f32473b;

    public C7246Rj(C22711hj c22711hj, Y94<Context> y94) {
        this.f32472a = c22711hj;
        this.f32473b = y94;
    }

    /* renamed from: a */
    public static C7246Rj m86421a(C22711hj c22711hj, Y94<Context> y94) {
        return new C7246Rj(c22711hj, y94);
    }

    /* renamed from: c */
    public static ConfigurableTutorialDatabase m86419c(C22711hj c22711hj, Context context) {
        return (ConfigurableTutorialDatabase) C51679xZ3.m5002e(c22711hj.m36038K(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ConfigurableTutorialDatabase get() {
        return m86419c(this.f32472a, this.f32473b.get());
    }
}
