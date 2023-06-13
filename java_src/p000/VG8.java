package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;
/* renamed from: VG8 */
/* loaded from: classes6.dex */
public final class VG8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC42134hS7 f38822b;

    /* renamed from: c */
    public final /* synthetic */ zzaw f38823c;

    /* renamed from: d */
    public final /* synthetic */ String f38824d;

    /* renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f38825e;

    public VG8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC42134hS7 interfaceC42134hS7, zzaw zzawVar, String str) {
        this.f38825e = appMeasurementDynamiteService;
        this.f38822b = interfaceC42134hS7;
        this.f38823c = zzawVar;
        this.f38824d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38825e.f71515a.m89778L().m88556m(this.f38822b, this.f38823c, this.f38824d);
    }
}
