package p000;

import android.content.Context;
/* renamed from: H33 */
/* loaded from: classes3.dex */
public final class H33 implements InterfaceC48812sj1<G33> {

    /* renamed from: a */
    public final Y94<Context> f12786a;

    public H33(Y94<Context> y94) {
        this.f12786a = y94;
    }

    /* renamed from: a */
    public static H33 m104469a(Y94<Context> y94) {
        return new H33(y94);
    }

    /* renamed from: c */
    public static G33 m104467c(Context context) {
        return new G33(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public G33 get() {
        return m104467c(this.f12786a.get());
    }
}
