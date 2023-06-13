package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* renamed from: n99  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45522n99 implements InterfaceC36013Su8 {

    /* renamed from: a */
    public final InterfaceC38568bT7 f99542a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f99543b;

    public C45522n99(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC38568bT7 interfaceC38568bT7) {
        this.f99543b = appMeasurementDynamiteService;
        this.f99542a = interfaceC38568bT7;
    }

    @Override // p000.InterfaceC36013Su8
    /* renamed from: a */
    public final void mo24271a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f99542a.mo8625u(str, str2, bundle, j);
        } catch (RemoteException e) {
            C35248Pn8 c35248Pn8 = this.f99543b.f71515a;
            if (c35248Pn8 != null) {
                c35248Pn8.mo22258a().m106888t().m42707b("Event interceptor threw exception", e);
            }
        }
    }
}
