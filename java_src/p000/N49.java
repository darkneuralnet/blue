package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* renamed from: N49 */
/* loaded from: classes6.dex */
public final class N49 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC42134hS7 f24110b;

    /* renamed from: c */
    public final /* synthetic */ AppMeasurementDynamiteService f24111c;

    public N49(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC42134hS7 interfaceC42134hS7) {
        this.f24111c = appMeasurementDynamiteService;
        this.f24110b = interfaceC42134hS7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24111c.f71515a.m89776N().m92100E(this.f24110b, this.f24111c.f71515a.m89763k());
    }
}
