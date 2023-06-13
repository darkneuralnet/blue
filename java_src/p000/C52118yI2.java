package p000;

import android.content.Context;
/* renamed from: yI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52118yI2 implements InterfaceC48812sj1<InterfaceC42163hW0> {

    /* renamed from: a */
    public final VH2 f119303a;

    /* renamed from: b */
    public final Y94<Context> f119304b;

    /* renamed from: c */
    public final Y94<AbstractC34062Km1> f119305c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f119306d;

    public C52118yI2(VH2 vh2, Y94<Context> y94, Y94<AbstractC34062Km1> y942, Y94<InterfaceC1880Ea> y943) {
        this.f119303a = vh2;
        this.f119304b = y94;
        this.f119305c = y942;
        this.f119306d = y943;
    }

    /* renamed from: a */
    public static C52118yI2 m3713a(VH2 vh2, Y94<Context> y94, Y94<AbstractC34062Km1> y942, Y94<InterfaceC1880Ea> y943) {
        return new C52118yI2(vh2, y94, y942, y943);
    }

    /* renamed from: c */
    public static InterfaceC42163hW0 m3711c(VH2 vh2, Context context, AbstractC34062Km1 abstractC34062Km1, InterfaceC1880Ea interfaceC1880Ea) {
        return (InterfaceC42163hW0) C51679xZ3.m5002e(vh2.m80114D(context, abstractC34062Km1, interfaceC1880Ea));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC42163hW0 get() {
        return m3711c(this.f119303a, this.f119304b.get(), this.f119305c.get(), this.f119306d.get());
    }
}
