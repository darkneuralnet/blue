package p000;

import android.content.Context;
import co.bird.android.manager.ride.EndRideManagerImpl;
/* renamed from: yd1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52309yd1 implements InterfaceC48812sj1<EndRideManagerImpl> {

    /* renamed from: a */
    public final Y94<Context> f119860a;

    /* renamed from: b */
    public final Y94<YR4> f119861b;

    /* renamed from: c */
    public final Y94<InterfaceC12495bn> f119862c;

    /* renamed from: d */
    public final Y94<InterfaceC47153pv0> f119863d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f119864e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f119865f;

    /* renamed from: g */
    public final Y94<InterfaceC40001dr4> f119866g;

    /* renamed from: h */
    public final Y94<LifecycleOwner> f119867h;

    public C52309yd1(Y94<Context> y94, Y94<YR4> y942, Y94<InterfaceC12495bn> y943, Y94<InterfaceC47153pv0> y944, Y94<C36207Tq4> y945, Y94<InterfaceC1880Ea> y946, Y94<InterfaceC40001dr4> y947, Y94<LifecycleOwner> y948) {
        this.f119860a = y94;
        this.f119861b = y942;
        this.f119862c = y943;
        this.f119863d = y944;
        this.f119864e = y945;
        this.f119865f = y946;
        this.f119866g = y947;
        this.f119867h = y948;
    }

    /* renamed from: a */
    public static C52309yd1 m3156a(Y94<Context> y94, Y94<YR4> y942, Y94<InterfaceC12495bn> y943, Y94<InterfaceC47153pv0> y944, Y94<C36207Tq4> y945, Y94<InterfaceC1880Ea> y946, Y94<InterfaceC40001dr4> y947, Y94<LifecycleOwner> y948) {
        return new C52309yd1(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static EndRideManagerImpl m3154c(Context context, YR4 yr4, InterfaceC12495bn interfaceC12495bn, InterfaceC47153pv0 interfaceC47153pv0, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, InterfaceC40001dr4 interfaceC40001dr4, LifecycleOwner lifecycleOwner) {
        return new EndRideManagerImpl(context, yr4, interfaceC12495bn, interfaceC47153pv0, c36207Tq4, interfaceC1880Ea, interfaceC40001dr4, lifecycleOwner);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public EndRideManagerImpl get() {
        return m3154c(this.f119860a.get(), this.f119861b.get(), this.f119862c.get(), this.f119863d.get(), this.f119864e.get(), this.f119865f.get(), this.f119866g.get(), this.f119867h.get());
    }
}
