package p000;

import android.content.Context;
/* renamed from: Im5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33598Im5 implements InterfaceC48220rj1<FG6> {

    /* renamed from: a */
    public final Y94<Context> f16185a;

    /* renamed from: b */
    public final Y94<InterfaceC35412Qg1> f16186b;

    /* renamed from: c */
    public final Y94<AbstractC52403ym5> f16187c;

    /* renamed from: d */
    public final Y94<InterfaceC38734bl0> f16188d;

    public C33598Im5(Y94<Context> y94, Y94<InterfaceC35412Qg1> y942, Y94<AbstractC52403ym5> y943, Y94<InterfaceC38734bl0> y944) {
        this.f16185a = y94;
        this.f16186b = y942;
        this.f16187c = y943;
        this.f16188d = y944;
    }

    /* renamed from: a */
    public static C33598Im5 m101726a(Y94<Context> y94, Y94<InterfaceC35412Qg1> y942, Y94<AbstractC52403ym5> y943, Y94<InterfaceC38734bl0> y944) {
        return new C33598Im5(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static FG6 m101724c(Context context, InterfaceC35412Qg1 interfaceC35412Qg1, AbstractC52403ym5 abstractC52403ym5, InterfaceC38734bl0 interfaceC38734bl0) {
        return (FG6) CZ3.m112115c(AbstractC33364Hm5.m103435a(context, interfaceC35412Qg1, abstractC52403ym5, interfaceC38734bl0), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.Y94
    /* renamed from: b */
    public FG6 get() {
        return m101724c(this.f16185a.get(), this.f16186b.get(), this.f16187c.get(), this.f16188d.get());
    }
}
