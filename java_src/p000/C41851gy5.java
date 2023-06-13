package p000;

import android.app.Application;
import co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector;
/* renamed from: gy5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41851gy5 implements InterfaceC48812sj1<ShakeToReportDetector> {

    /* renamed from: a */
    public final Y94<Application> f84554a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f84555b;

    /* renamed from: c */
    public final Y94<LifecycleOwner> f84556c;

    /* renamed from: d */
    public final Y94<InterfaceC44647lh6> f84557d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f84558e;

    /* renamed from: f */
    public final Y94<C22454gl> f84559f;

    public C41851gy5(Y94<Application> y94, Y94<InterfaceC40099e13> y942, Y94<LifecycleOwner> y943, Y94<InterfaceC44647lh6> y944, Y94<C36207Tq4> y945, Y94<C22454gl> y946) {
        this.f84554a = y94;
        this.f84555b = y942;
        this.f84556c = y943;
        this.f84557d = y944;
        this.f84558e = y945;
        this.f84559f = y946;
    }

    /* renamed from: a */
    public static C41851gy5 m37264a(Y94<Application> y94, Y94<InterfaceC40099e13> y942, Y94<LifecycleOwner> y943, Y94<InterfaceC44647lh6> y944, Y94<C36207Tq4> y945, Y94<C22454gl> y946) {
        return new C41851gy5(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static ShakeToReportDetector m37262c(Application application, InterfaceC40099e13 interfaceC40099e13, LifecycleOwner lifecycleOwner, InterfaceC44647lh6 interfaceC44647lh6, C36207Tq4 c36207Tq4, C22454gl c22454gl) {
        return new ShakeToReportDetector(application, interfaceC40099e13, lifecycleOwner, interfaceC44647lh6, c36207Tq4, c22454gl);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ShakeToReportDetector get() {
        return m37262c(this.f84554a.get(), this.f84555b.get(), this.f84556c.get(), this.f84557d.get(), this.f84558e.get(), this.f84559f.get());
    }
}
