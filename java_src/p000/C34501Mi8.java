package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: Mi8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34501Mi8 {

    /* renamed from: a */
    public final InterfaceC33565Ii8 f23430a;

    public C34501Mi8(InterfaceC33565Ii8 interfaceC33565Ii8) {
        Preconditions.checkNotNull(interfaceC33565Ii8);
        this.f23430a = interfaceC33565Ii8;
    }

    /* renamed from: a */
    public final void m95002a(Context context, Intent intent) {
        C35248Pn8 m89782H = C35248Pn8.m89782H(context, null, null);
        C32809Fc8 mo22258a = m89782H.mo22258a();
        if (intent == null) {
            mo22258a.m106888t().m42708a("Receiver called with null intent");
            return;
        }
        m89782H.mo22259C();
        String action = intent.getAction();
        mo22258a.m106889s().m42707b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            mo22258a.m106889s().m42708a("Starting wakeful intent.");
            this.f23430a.mo50593a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            mo22258a.m106888t().m42708a("Install Referrer Broadcasts are deprecated");
        }
    }
}
