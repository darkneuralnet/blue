package p000;

import android.content.Context;
/* renamed from: LN6 */
/* loaded from: classes6.dex */
public final class LN6 implements InterfaceC50972wM6<Object> {

    /* renamed from: a */
    public final InterfaceC50972wM6 f21360a;

    /* renamed from: b */
    public final /* synthetic */ int f21361b = 3;

    public LN6(InterfaceC50972wM6<Context> interfaceC50972wM6, short[] sArr) {
        this.f21360a = interfaceC50972wM6;
    }

    /* renamed from: b */
    public static LN6 m96974b(InterfaceC50972wM6<Context> interfaceC50972wM6) {
        return new LN6(interfaceC50972wM6, null);
    }

    @Override // p000.InterfaceC50972wM6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6967a() {
        int i = this.f21361b;
        if (i != 0) {
            return i != 1 ? i != 2 ? new SO6((Context) this.f21360a.mo6967a()) : new XO6(((TN6) this.f21360a).mo6967a()) : new WJ6(((TN6) this.f21360a).mo6967a());
        }
        ZM6 zm6 = (ZM6) this.f21360a.mo6967a();
        C46814pL6.m19448k(zm6);
        return zm6;
    }
}
