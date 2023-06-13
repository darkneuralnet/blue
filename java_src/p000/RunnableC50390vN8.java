package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* renamed from: vN8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC50390vN8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC42134hS7 f113978b;

    /* renamed from: c */
    public final /* synthetic */ String f113979c;

    /* renamed from: d */
    public final /* synthetic */ String f113980d;

    /* renamed from: e */
    public final /* synthetic */ boolean f113981e;

    /* renamed from: f */
    public final /* synthetic */ AppMeasurementDynamiteService f113982f;

    public RunnableC50390vN8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC42134hS7 interfaceC42134hS7, String str, String str2, boolean z) {
        this.f113982f = appMeasurementDynamiteService;
        this.f113978b = interfaceC42134hS7;
        this.f113979c = str;
        this.f113980d = str2;
        this.f113981e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f113982f.f71515a.m89778L().m88559V(this.f113978b, this.f113979c, this.f113980d, this.f113981e);
    }
}
