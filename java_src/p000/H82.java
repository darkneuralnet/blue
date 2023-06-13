package p000;

import android.content.Context;
/* renamed from: H82 */
/* loaded from: classes3.dex */
public final class H82 implements InterfaceC48812sj1<G82> {

    /* renamed from: a */
    public final Y94<Context> f12883a;

    public H82(Y94<Context> y94) {
        this.f12883a = y94;
    }

    /* renamed from: a */
    public static H82 m104365a(Y94<Context> y94) {
        return new H82(y94);
    }

    /* renamed from: c */
    public static G82 m104363c(Context context) {
        return new G82(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public G82 get() {
        return m104363c(this.f12883a.get());
    }
}
