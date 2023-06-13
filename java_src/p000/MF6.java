package p000;

import android.content.Context;
/* renamed from: MF6 */
/* loaded from: classes3.dex */
public final class MF6 implements InterfaceC48812sj1<LF6> {

    /* renamed from: a */
    public final Y94<Context> f22928a;

    public MF6(Y94<Context> y94) {
        this.f22928a = y94;
    }

    /* renamed from: a */
    public static MF6 m95470a(Y94<Context> y94) {
        return new MF6(y94);
    }

    /* renamed from: c */
    public static LF6 m95468c(Context context) {
        return new LF6(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public LF6 get() {
        return m95468c(this.f22928a.get());
    }
}
