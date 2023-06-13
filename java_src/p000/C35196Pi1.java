package p000;

import android.content.Context;
/* renamed from: Pi1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35196Pi1 implements InterfaceC48812sj1<C34962Oi1> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f28932a;

    /* renamed from: b */
    public final Y94<Context> f28933b;

    public C35196Pi1(Y94<InterfaceC40099e13> y94, Y94<Context> y942) {
        this.f28932a = y94;
        this.f28933b = y942;
    }

    /* renamed from: a */
    public static C35196Pi1 m89907a(Y94<InterfaceC40099e13> y94, Y94<Context> y942) {
        return new C35196Pi1(y94, y942);
    }

    /* renamed from: c */
    public static C34962Oi1 m89905c(InterfaceC40099e13 interfaceC40099e13, Context context) {
        return new C34962Oi1(interfaceC40099e13, context);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34962Oi1 get() {
        return m89905c(this.f28932a.get(), this.f28933b.get());
    }
}
