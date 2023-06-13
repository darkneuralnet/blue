package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* renamed from: qA8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC47310qA8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC42134hS7 f104832b;

    /* renamed from: c */
    public final /* synthetic */ AppMeasurementDynamiteService f104833c;

    public RunnableC47310qA8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC42134hS7 interfaceC42134hS7) {
        this.f104833c = appMeasurementDynamiteService;
        this.f104832b = interfaceC42134hS7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f104833c.f71515a.m89778L().m88563R(this.f104832b);
    }
}
