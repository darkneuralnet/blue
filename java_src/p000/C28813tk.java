package p000;

import android.content.Context;
import co.bird.android.manager.localasset.persistence.AssetDatabase;
/* renamed from: tk */
/* loaded from: classes4.dex */
public final class C28813tk implements InterfaceC48812sj1<AssetDatabase> {

    /* renamed from: a */
    public final C22711hj f110950a;

    /* renamed from: b */
    public final Y94<Context> f110951b;

    public C28813tk(C22711hj c22711hj, Y94<Context> y94) {
        this.f110950a = c22711hj;
        this.f110951b = y94;
    }

    /* renamed from: a */
    public static C28813tk m11836a(C22711hj c22711hj, Y94<Context> y94) {
        return new C28813tk(c22711hj, y94);
    }

    /* renamed from: c */
    public static AssetDatabase m11834c(C22711hj c22711hj, Context context) {
        return (AssetDatabase) C51679xZ3.m5002e(c22711hj.m35982m0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AssetDatabase get() {
        return m11834c(this.f110950a, this.f110951b.get());
    }
}
