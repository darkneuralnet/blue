package p000;

import co.bird.android.persistence.nestmarker.impl.NestMarkerDatabase;
/* renamed from: yk */
/* loaded from: classes4.dex */
public final class C30689yk implements InterfaceC48812sj1<AbstractC40129e43> {

    /* renamed from: a */
    public final C22711hj f120082a;

    /* renamed from: b */
    public final Y94<NestMarkerDatabase> f120083b;

    public C30689yk(C22711hj c22711hj, Y94<NestMarkerDatabase> y94) {
        this.f120082a = c22711hj;
        this.f120083b = y94;
    }

    /* renamed from: a */
    public static C30689yk m2715a(C22711hj c22711hj, Y94<NestMarkerDatabase> y94) {
        return new C30689yk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC40129e43 m2713c(C22711hj c22711hj, NestMarkerDatabase nestMarkerDatabase) {
        return (AbstractC40129e43) C51679xZ3.m5002e(c22711hj.m35972r0(nestMarkerDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC40129e43 get() {
        return m2713c(this.f120082a, this.f120083b.get());
    }
}
