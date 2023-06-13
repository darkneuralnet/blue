package p000;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
/* renamed from: Vh8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36598Vh8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ QM7 f39495b;

    /* renamed from: c */
    public final /* synthetic */ ServiceConnection f39496c;

    /* renamed from: d */
    public final /* synthetic */ ServiceConnectionC44066ki8 f39497d;

    public RunnableC36598Vh8(ServiceConnectionC44066ki8 serviceConnectionC44066ki8, QM7 qm7, ServiceConnection serviceConnection) {
        this.f39497d = serviceConnectionC44066ki8;
        this.f39495b = qm7;
        this.f39496c = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        ServiceConnectionC44066ki8 serviceConnectionC44066ki8 = this.f39497d;
        C51773xi8 c51773xi8 = serviceConnectionC44066ki8.f94814c;
        str = serviceConnectionC44066ki8.f94813b;
        QM7 qm7 = this.f39495b;
        ServiceConnection serviceConnection = this.f39496c;
        c51773xi8.f118008a.mo22257c().mo19953e();
        Bundle bundle2 = new Bundle();
        bundle2.putString(AnalyticsRequestV2Factory.PARAM_PACKAGE_NAME, str);
        try {
            bundle = qm7.mo29038a1(bundle2);
        } catch (Exception e) {
            c51773xi8.f118008a.mo22258a().m106893o().m42707b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        if (bundle == null) {
            c51773xi8.f118008a.mo22258a().m106893o().m42708a("Install Referrer Service returned a null response");
            bundle = null;
        }
        c51773xi8.f118008a.mo22257c().mo19953e();
        C35248Pn8.m89757q();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                c51773xi8.f118008a.mo22258a().m106888t().m42708a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    c51773xi8.f118008a.mo22258a().m106889s().m42707b("InstallReferrer API result", string);
                    OW8 m89776N = c51773xi8.f118008a.m89776N();
                    Uri parse = Uri.parse(CallerData.f61059NA.concat(string));
                    C39336cl9.m60894b();
                    Bundle m92045v0 = m89776N.m92045v0(parse, c51773xi8.f118008a.m89751w().m37502y(null, C37795a98.f50008y0));
                    if (m92045v0 == null) {
                        c51773xi8.f118008a.mo22258a().m106893o().m42708a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = m92045v0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                c51773xi8.f118008a.mo22258a().m106893o().m42708a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                m92045v0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == c51773xi8.f118008a.m89784F().f16067f.m564a()) {
                            c51773xi8.f118008a.mo22258a().m106889s().m42708a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c51773xi8.f118008a.m89762l()) {
                            c51773xi8.f118008a.m89784F().f16067f.m563b(j);
                            c51773xi8.f118008a.mo22258a().m106889s().m42707b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            m92045v0.putString("_cis", "referrer API v2");
                            c51773xi8.f118008a.m89781I().m87158q("auto", "_cmp", m92045v0, str);
                        }
                    }
                } else {
                    c51773xi8.f118008a.mo22258a().m106893o().m42708a("No referrer defined in Install Referrer response");
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(c51773xi8.f118008a.mo22255z(), serviceConnection);
    }
}
