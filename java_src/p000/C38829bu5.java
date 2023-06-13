package p000;

import android.content.Context;
import android.content.Intent;
/* renamed from: bu5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38829bu5 implements InterfaceC48812sj1<AbstractC47767qx1> {

    /* renamed from: a */
    public final Y94<Context> f59744a;

    /* renamed from: b */
    public final Y94<InterfaceC34076Kn6> f59745b;

    /* renamed from: c */
    public final Y94<InterfaceC48847sm6> f59746c;

    /* renamed from: d */
    public final Y94<InterfaceC40001dr4> f59747d;

    /* renamed from: e */
    public final Y94<InterfaceC25136kJ> f59748e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f59749f;

    /* renamed from: g */
    public final Y94<InterfaceC32604Eg1> f59750g;

    /* renamed from: h */
    public final Y94<Intent> f59751h;

    /* renamed from: i */
    public final Y94<InterfaceC1880Ea> f59752i;

    /* renamed from: j */
    public final Y94<YR4> f59753j;

    public C38829bu5(Y94<Context> y94, Y94<InterfaceC34076Kn6> y942, Y94<InterfaceC48847sm6> y943, Y94<InterfaceC40001dr4> y944, Y94<InterfaceC25136kJ> y945, Y94<C36207Tq4> y946, Y94<InterfaceC32604Eg1> y947, Y94<Intent> y948, Y94<InterfaceC1880Ea> y949, Y94<YR4> y9410) {
        this.f59744a = y94;
        this.f59745b = y942;
        this.f59746c = y943;
        this.f59747d = y944;
        this.f59748e = y945;
        this.f59749f = y946;
        this.f59750g = y947;
        this.f59751h = y948;
        this.f59752i = y949;
        this.f59753j = y9410;
    }

    /* renamed from: a */
    public static C38829bu5 m62164a(Y94<Context> y94, Y94<InterfaceC34076Kn6> y942, Y94<InterfaceC48847sm6> y943, Y94<InterfaceC40001dr4> y944, Y94<InterfaceC25136kJ> y945, Y94<C36207Tq4> y946, Y94<InterfaceC32604Eg1> y947, Y94<Intent> y948, Y94<InterfaceC1880Ea> y949, Y94<YR4> y9410) {
        return new C38829bu5(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410);
    }

    /* renamed from: c */
    public static AbstractC47767qx1 m62162c(Context context, InterfaceC34076Kn6 interfaceC34076Kn6, InterfaceC48847sm6 interfaceC48847sm6, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC25136kJ interfaceC25136kJ, C36207Tq4 c36207Tq4, InterfaceC32604Eg1 interfaceC32604Eg1, Intent intent, InterfaceC1880Ea interfaceC1880Ea, YR4 yr4) {
        return (AbstractC47767qx1) C51679xZ3.m5002e(C38236au5.m65294a(context, interfaceC34076Kn6, interfaceC48847sm6, interfaceC40001dr4, interfaceC25136kJ, c36207Tq4, interfaceC32604Eg1, intent, interfaceC1880Ea, yr4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC47767qx1 get() {
        return m62162c(this.f59744a.get(), this.f59745b.get(), this.f59746c.get(), this.f59747d.get(), this.f59748e.get(), this.f59749f.get(), this.f59750g.get(), this.f59751h.get(), this.f59752i.get(), this.f59753j.get());
    }
}
