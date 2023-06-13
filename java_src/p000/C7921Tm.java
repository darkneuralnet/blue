package p000;

import android.content.Context;
/* renamed from: Tm */
/* loaded from: classes3.dex */
public final class C7921Tm implements InterfaceC48812sj1<C7540Sm> {

    /* renamed from: a */
    public final Y94<C36207Tq4> f36048a;

    /* renamed from: b */
    public final Y94<Context> f36049b;

    /* renamed from: c */
    public final Y94<InterfaceC40001dr4> f36050c;

    /* renamed from: d */
    public final Y94<InterfaceC12495bn> f36051d;

    public C7921Tm(Y94<C36207Tq4> y94, Y94<Context> y942, Y94<InterfaceC40001dr4> y943, Y94<InterfaceC12495bn> y944) {
        this.f36048a = y94;
        this.f36049b = y942;
        this.f36050c = y943;
        this.f36051d = y944;
    }

    /* renamed from: a */
    public static C7921Tm m82991a(Y94<C36207Tq4> y94, Y94<Context> y942, Y94<InterfaceC40001dr4> y943, Y94<InterfaceC12495bn> y944) {
        return new C7921Tm(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C7540Sm m82989c(C36207Tq4 c36207Tq4, Context context, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC12495bn interfaceC12495bn) {
        return new C7540Sm(c36207Tq4, context, interfaceC40001dr4, interfaceC12495bn);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C7540Sm get() {
        return m82989c(this.f36048a.get(), this.f36049b.get(), this.f36050c.get(), this.f36051d.get());
    }
}
