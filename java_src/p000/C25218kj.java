package p000;

import android.content.Context;
import co.bird.android.model.DynamicLinkConfiguration;
/* renamed from: kj */
/* loaded from: classes4.dex */
public final class C25218kj implements InterfaceC48812sj1<DynamicLinkConfiguration> {

    /* renamed from: a */
    public final C22711hj f94815a;

    /* renamed from: b */
    public final Y94<Context> f94816b;

    public C25218kj(C22711hj c22711hj, Y94<Context> y94) {
        this.f94815a = c22711hj;
        this.f94816b = y94;
    }

    /* renamed from: a */
    public static C25218kj m28577a(C22711hj c22711hj, Y94<Context> y94) {
        return new C25218kj(c22711hj, y94);
    }

    /* renamed from: b */
    public static DynamicLinkConfiguration m28576b(C22711hj c22711hj, Context context) {
        return (DynamicLinkConfiguration) C51679xZ3.m5002e(c22711hj.m36003c(context));
    }

    @Override // p000.Y94
    /* renamed from: c */
    public DynamicLinkConfiguration get() {
        return m28576b(this.f94815a, this.f94816b.get());
    }
}
