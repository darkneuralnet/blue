package p000;

import android.content.Context;
/* renamed from: od5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46385od5 implements InterfaceC49405tj1<C45792nd5> {

    /* renamed from: a */
    public final Z94<Context> f102223a;

    public C46385od5(Z94<Context> z94) {
        this.f102223a = z94;
    }

    /* renamed from: a */
    public static C46385od5 m20766a(Z94<Context> z94) {
        return new C46385od5(z94);
    }

    /* renamed from: c */
    public static C45792nd5 m20764c(Context context) {
        return new C45792nd5(context);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C45792nd5 get() {
        return m20764c(this.f102223a.get());
    }
}
