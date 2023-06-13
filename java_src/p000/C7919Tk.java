package p000;

import co.bird.android.persistence.scraporderview.ScrapOrderViewDatabase;
/* renamed from: Tk */
/* loaded from: classes4.dex */
public final class C7919Tk implements InterfaceC48812sj1<AbstractC42354hp5> {

    /* renamed from: a */
    public final C22711hj f36007a;

    /* renamed from: b */
    public final Y94<ScrapOrderViewDatabase> f36008b;

    public C7919Tk(C22711hj c22711hj, Y94<ScrapOrderViewDatabase> y94) {
        this.f36007a = c22711hj;
        this.f36008b = y94;
    }

    /* renamed from: a */
    public static C7919Tk m83048a(C22711hj c22711hj, Y94<ScrapOrderViewDatabase> y94) {
        return new C7919Tk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AbstractC42354hp5 m83046c(C22711hj c22711hj, ScrapOrderViewDatabase scrapOrderViewDatabase) {
        return (AbstractC42354hp5) C51679xZ3.m5002e(c22711hj.m36029O0(scrapOrderViewDatabase));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC42354hp5 get() {
        return m83046c(this.f36007a, this.f36008b.get());
    }
}
