package p000;

import android.content.Context;
/* renamed from: Mo0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34547Mo0 implements InterfaceC48812sj1<C34313Lo0> {

    /* renamed from: a */
    public final Y94<Context> f23609a;

    public C34547Mo0(Y94<Context> y94) {
        this.f23609a = y94;
    }

    /* renamed from: a */
    public static C34547Mo0 m94786a(Y94<Context> y94) {
        return new C34547Mo0(y94);
    }

    /* renamed from: c */
    public static C34313Lo0 m94784c(Context context) {
        return new C34313Lo0(context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34313Lo0 get() {
        return m94784c(this.f23609a.get());
    }
}
