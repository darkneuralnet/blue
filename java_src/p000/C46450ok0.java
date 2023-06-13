package p000;

import android.content.ContentResolver;
import android.content.Context;
import p000.InterfaceC41706gk0;
/* renamed from: ok0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46450ok0 implements InterfaceC49405tj1<ContentResolver> {

    /* renamed from: a */
    public final Z94<Context> f102417a;

    public C46450ok0(Z94<Context> z94) {
        this.f102417a = z94;
    }

    /* renamed from: a */
    public static C46450ok0 m20556a(Z94<Context> z94) {
        return new C46450ok0(z94);
    }

    /* renamed from: c */
    public static ContentResolver m20554c(Context context) {
        return (ContentResolver) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37853h(context));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public ContentResolver get() {
        return m20554c(this.f102417a.get());
    }
}
