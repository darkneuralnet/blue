package p000;

import android.hardware.SensorManager;
/* renamed from: Is5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33652Is5 implements InterfaceC48812sj1<C33418Hs5> {

    /* renamed from: a */
    public final Y94<SensorManager> f16354a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f16355b;

    public C33652Is5(Y94<SensorManager> y94, Y94<InterfaceC40001dr4> y942) {
        this.f16354a = y94;
        this.f16355b = y942;
    }

    /* renamed from: a */
    public static C33652Is5 m101574a(Y94<SensorManager> y94, Y94<InterfaceC40001dr4> y942) {
        return new C33652Is5(y94, y942);
    }

    /* renamed from: c */
    public static C33418Hs5 m101572c(SensorManager sensorManager, InterfaceC40001dr4 interfaceC40001dr4) {
        return new C33418Hs5(sensorManager, interfaceC40001dr4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C33418Hs5 get() {
        return m101572c(this.f16354a.get(), this.f16355b.get());
    }
}
