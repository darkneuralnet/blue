package p000;

import android.content.Context;
/* renamed from: Na4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34659Na4 implements InterfaceC48812sj1<InterfaceC39861dd3> {

    /* renamed from: a */
    public final C34425Ma4 f24814a;

    /* renamed from: b */
    public final Y94<Context> f24815b;

    /* renamed from: c */
    public final Y94<ZC6> f24816c;

    public C34659Na4(C34425Ma4 c34425Ma4, Y94<Context> y94, Y94<ZC6> y942) {
        this.f24814a = c34425Ma4;
        this.f24815b = y94;
        this.f24816c = y942;
    }

    /* renamed from: a */
    public static C34659Na4 m93743a(C34425Ma4 c34425Ma4, Y94<Context> y94, Y94<ZC6> y942) {
        return new C34659Na4(c34425Ma4, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC39861dd3 m93741c(C34425Ma4 c34425Ma4, Context context, ZC6 zc6) {
        return (InterfaceC39861dd3) C51679xZ3.m5002e(c34425Ma4.m95158a(context, zc6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC39861dd3 get() {
        return m93741c(this.f24814a, this.f24815b.get(), this.f24816c.get());
    }
}
