package p000;

import android.content.Context;
import co.bird.android.persistence.scraporderview.ScrapOrderViewDatabase;
/* renamed from: Uk */
/* loaded from: classes4.dex */
public final class C8431Uk implements InterfaceC48812sj1<ScrapOrderViewDatabase> {

    /* renamed from: a */
    public final C22711hj f37917a;

    /* renamed from: b */
    public final Y94<Context> f37918b;

    public C8431Uk(C22711hj c22711hj, Y94<Context> y94) {
        this.f37917a = c22711hj;
        this.f37918b = y94;
    }

    /* renamed from: a */
    public static C8431Uk m80954a(C22711hj c22711hj, Y94<Context> y94) {
        return new C8431Uk(c22711hj, y94);
    }

    /* renamed from: c */
    public static ScrapOrderViewDatabase m80952c(C22711hj c22711hj, Context context) {
        return (ScrapOrderViewDatabase) C51679xZ3.m5002e(c22711hj.m36027P0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ScrapOrderViewDatabase get() {
        return m80952c(this.f37917a, this.f37918b.get());
    }
}
