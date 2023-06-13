package p000;

import co.bird.android.persistence.announcements.ConfigurableTutorialDatabase;
/* renamed from: Qj */
/* loaded from: classes4.dex */
public final class C6847Qj implements InterfaceC48812sj1<AbstractC35780Rv0> {

    /* renamed from: a */
    public final C22711hj f30791a;

    /* renamed from: b */
    public final Y94<ConfigurableTutorialDatabase> f30792b;

    public C6847Qj(C22711hj c22711hj, Y94<ConfigurableTutorialDatabase> y94) {
        this.f30791a = c22711hj;
        this.f30792b = y94;
    }

    /* renamed from: a */
    public static C6847Qj m88148a(C22711hj c22711hj, Y94<ConfigurableTutorialDatabase> y94) {
        return new C6847Qj(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC35780Rv0 m88146c(C22711hj c22711hj, ConfigurableTutorialDatabase configurableTutorialDatabase) {
        return (AbstractC35780Rv0) C51679xZ3.m5002e(c22711hj.m36040J(configurableTutorialDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC35780Rv0 get() {
        return m88146c(this.f30791a, this.f30792b.get());
    }
}
