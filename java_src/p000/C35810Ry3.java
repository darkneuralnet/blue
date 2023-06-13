package p000;

import android.content.Context;
import co.bird.android.manager.localization.OtaManagerImpl;
/* renamed from: Ry3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35810Ry3 implements InterfaceC48812sj1<OtaManagerImpl> {

    /* renamed from: a */
    public final Y94<C36207Tq4> f32955a;

    /* renamed from: b */
    public final Y94<InterfaceC33676Iv2> f32956b;

    /* renamed from: c */
    public final Y94<InterfaceC6097Oh> f32957c;

    /* renamed from: d */
    public final Y94<LifecycleOwner> f32958d;

    /* renamed from: e */
    public final Y94<Context> f32959e;

    /* renamed from: f */
    public final Y94<InterfaceC40099e13> f32960f;

    public C35810Ry3(Y94<C36207Tq4> y94, Y94<InterfaceC33676Iv2> y942, Y94<InterfaceC6097Oh> y943, Y94<LifecycleOwner> y944, Y94<Context> y945, Y94<InterfaceC40099e13> y946) {
        this.f32955a = y94;
        this.f32956b = y942;
        this.f32957c = y943;
        this.f32958d = y944;
        this.f32959e = y945;
        this.f32960f = y946;
    }

    /* renamed from: a */
    public static C35810Ry3 m86158a(Y94<C36207Tq4> y94, Y94<InterfaceC33676Iv2> y942, Y94<InterfaceC6097Oh> y943, Y94<LifecycleOwner> y944, Y94<Context> y945, Y94<InterfaceC40099e13> y946) {
        return new C35810Ry3(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static OtaManagerImpl m86156c(C36207Tq4 c36207Tq4, InterfaceC33676Iv2 interfaceC33676Iv2, InterfaceC6097Oh interfaceC6097Oh, LifecycleOwner lifecycleOwner, Context context, InterfaceC40099e13 interfaceC40099e13) {
        return new OtaManagerImpl(c36207Tq4, interfaceC33676Iv2, interfaceC6097Oh, lifecycleOwner, context, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OtaManagerImpl get() {
        return m86156c(this.f32955a.get(), this.f32956b.get(), this.f32957c.get(), this.f32958d.get(), this.f32959e.get(), this.f32960f.get());
    }
}
