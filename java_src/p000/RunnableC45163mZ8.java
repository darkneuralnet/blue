package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* renamed from: mZ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC45163mZ8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC42134hS7 f98344b;

    /* renamed from: c */
    public final /* synthetic */ String f98345c;

    /* renamed from: d */
    public final /* synthetic */ String f98346d;

    /* renamed from: e */
    public final /* synthetic */ AppMeasurementDynamiteService f98347e;

    public RunnableC45163mZ8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC42134hS7 interfaceC42134hS7, String str, String str2) {
        this.f98347e = appMeasurementDynamiteService;
        this.f98344b = interfaceC42134hS7;
        this.f98345c = str;
        this.f98346d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f98347e.f71515a.m89778L().m88561T(this.f98344b, this.f98345c, this.f98346d);
    }
}
