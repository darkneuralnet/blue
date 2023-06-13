package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* renamed from: yT8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC52223yT8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C45522n99 f119592b;

    /* renamed from: c */
    public final /* synthetic */ AppMeasurementDynamiteService f119593c;

    public RunnableC52223yT8(AppMeasurementDynamiteService appMeasurementDynamiteService, C45522n99 c45522n99) {
        this.f119593c = appMeasurementDynamiteService;
        this.f119592b = c45522n99;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f119593c.f71515a.m89781I().m87188H(this.f119592b);
    }
}
