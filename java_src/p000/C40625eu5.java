package p000;

import android.content.Context;
import android.content.Intent;
/* renamed from: eu5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40625eu5 implements InterfaceC48812sj1<AbstractC47767qx1> {

    /* renamed from: a */
    public final Y94<Context> f79098a;

    /* renamed from: b */
    public final Y94<InterfaceC46473om3> f79099b;

    /* renamed from: c */
    public final Y94<InterfaceC35660Rh6> f79100c;

    /* renamed from: d */
    public final Y94<InterfaceC40001dr4> f79101d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f79102e;

    /* renamed from: f */
    public final Y94<AbstractC39873de5> f79103f;

    /* renamed from: g */
    public final Y94<Intent> f79104g;

    /* renamed from: h */
    public final Y94<C22454gl> f79105h;

    /* renamed from: i */
    public final Y94<LifecycleOwner> f79106i;

    public C40625eu5(Y94<Context> y94, Y94<InterfaceC46473om3> y942, Y94<InterfaceC35660Rh6> y943, Y94<InterfaceC40001dr4> y944, Y94<C36207Tq4> y945, Y94<AbstractC39873de5> y946, Y94<Intent> y947, Y94<C22454gl> y948, Y94<LifecycleOwner> y949) {
        this.f79098a = y94;
        this.f79099b = y942;
        this.f79100c = y943;
        this.f79101d = y944;
        this.f79102e = y945;
        this.f79103f = y946;
        this.f79104g = y947;
        this.f79105h = y948;
        this.f79106i = y949;
    }

    /* renamed from: a */
    public static C40625eu5 m42413a(Y94<Context> y94, Y94<InterfaceC46473om3> y942, Y94<InterfaceC35660Rh6> y943, Y94<InterfaceC40001dr4> y944, Y94<C36207Tq4> y945, Y94<AbstractC39873de5> y946, Y94<Intent> y947, Y94<C22454gl> y948, Y94<LifecycleOwner> y949) {
        return new C40625eu5(y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    /* renamed from: c */
    public static AbstractC47767qx1 m42411c(Context context, InterfaceC46473om3 interfaceC46473om3, InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC40001dr4 interfaceC40001dr4, C36207Tq4 c36207Tq4, AbstractC39873de5 abstractC39873de5, Intent intent, C22454gl c22454gl, LifecycleOwner lifecycleOwner) {
        return (AbstractC47767qx1) C51679xZ3.m5002e(C38236au5.m65291d(context, interfaceC46473om3, interfaceC35660Rh6, interfaceC40001dr4, c36207Tq4, abstractC39873de5, intent, c22454gl, lifecycleOwner));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AbstractC47767qx1 get() {
        return m42411c(this.f79098a.get(), this.f79099b.get(), this.f79100c.get(), this.f79101d.get(), this.f79102e.get(), this.f79103f.get(), this.f79104g.get(), this.f79105h.get(), this.f79106i.get());
    }
}
