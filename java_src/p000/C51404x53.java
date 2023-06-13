package p000;

import android.content.Context;
/* renamed from: x53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51404x53 implements InterfaceC48812sj1<C47626qj0> {

    /* renamed from: a */
    public final P43 f117085a;

    /* renamed from: b */
    public final Y94<Context> f117086b;

    /* renamed from: c */
    public final Y94<C45254mj0> f117087c;

    public C51404x53(P43 p43, Y94<Context> y94, Y94<C45254mj0> y942) {
        this.f117085a = p43;
        this.f117086b = y94;
        this.f117087c = y942;
    }

    /* renamed from: a */
    public static C51404x53 m5858a(P43 p43, Y94<Context> y94, Y94<C45254mj0> y942) {
        return new C51404x53(p43, y94, y942);
    }

    /* renamed from: c */
    public static C47626qj0 m5856c(P43 p43, Context context, C45254mj0 c45254mj0) {
        return (C47626qj0) C51679xZ3.m5002e(p43.m90996I(context, c45254mj0));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C47626qj0 get() {
        return m5856c(this.f117085a, this.f117086b.get(), this.f117087c.get());
    }
}
