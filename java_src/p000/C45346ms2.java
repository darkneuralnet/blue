package p000;

import android.content.Context;
/* renamed from: ms2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45346ms2 implements InterfaceC48812sj1<C44753ls2> {

    /* renamed from: a */
    public final Y94<Context> f98924a;

    public C45346ms2(Y94<Context> y94) {
        this.f98924a = y94;
    }

    /* renamed from: a */
    public static C45346ms2 m24837a(Y94<Context> y94) {
        return new C45346ms2(y94);
    }

    /* renamed from: c */
    public static C44753ls2 m24835c(Context context) {
        return new C44753ls2(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44753ls2 get() {
        return m24835c(this.f98924a.get());
    }
}
