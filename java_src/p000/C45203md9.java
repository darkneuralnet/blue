package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* renamed from: md9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45203md9 implements InterfaceC41231fv8 {

    /* renamed from: a */
    public final InterfaceC38568bT7 f98459a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f98460b;

    public C45203md9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC38568bT7 interfaceC38568bT7) {
        this.f98460b = appMeasurementDynamiteService;
        this.f98459a = interfaceC38568bT7;
    }

    @Override // p000.InterfaceC41231fv8
    /* renamed from: a */
    public final void mo12047a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f98459a.mo8625u(str, str2, bundle, j);
        } catch (RemoteException e) {
            C35248Pn8 c35248Pn8 = this.f98460b.f71515a;
            if (c35248Pn8 != null) {
                c35248Pn8.mo22258a().m106888t().m42707b("Event listener threw exception", e);
            }
        }
    }
}
