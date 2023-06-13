package p000;

import android.content.Context;
/* renamed from: bM1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38499bM1 implements InterfaceC48812sj1<ZL1> {

    /* renamed from: a */
    public final Y94<Context> f57333a;

    /* renamed from: b */
    public final Y94<InterfaceC8601VK> f57334b;

    /* renamed from: c */
    public final Y94<InterfaceC36152Tk3> f57335c;

    /* renamed from: d */
    public final Y94<SL1> f57336d;

    public C38499bM1(Y94<Context> y94, Y94<InterfaceC8601VK> y942, Y94<InterfaceC36152Tk3> y943, Y94<SL1> y944) {
        this.f57333a = y94;
        this.f57334b = y942;
        this.f57335c = y943;
        this.f57336d = y944;
    }

    /* renamed from: a */
    public static C38499bM1 m64635a(Y94<Context> y94, Y94<InterfaceC8601VK> y942, Y94<InterfaceC36152Tk3> y943, Y94<SL1> y944) {
        return new C38499bM1(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static ZL1 m64633c(Context context, InterfaceC8601VK interfaceC8601VK, InterfaceC36152Tk3 interfaceC36152Tk3, SL1 sl1) {
        return new ZL1(context, interfaceC8601VK, interfaceC36152Tk3, sl1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ZL1 get() {
        return m64633c(this.f57333a.get(), this.f57334b.get(), this.f57335c.get(), this.f57336d.get());
    }
}
