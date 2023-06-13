package p000;

import android.content.Context;
import android.content.Intent;
/* renamed from: uk */
/* loaded from: classes4.dex */
public final class C29293uk implements InterfaceC48812sj1<Intent> {

    /* renamed from: a */
    public final C22711hj f112822a;

    /* renamed from: b */
    public final Y94<Context> f112823b;

    public C29293uk(C22711hj c22711hj, Y94<Context> y94) {
        this.f112822a = c22711hj;
        this.f112823b = y94;
    }

    /* renamed from: a */
    public static C29293uk m9823a(C22711hj c22711hj, Y94<Context> y94) {
        return new C29293uk(c22711hj, y94);
    }

    /* renamed from: c */
    public static Intent m9821c(C22711hj c22711hj, Context context) {
        return (Intent) C51679xZ3.m5002e(c22711hj.m35980n0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Intent get() {
        return m9821c(this.f112822a, this.f112823b.get());
    }
}
