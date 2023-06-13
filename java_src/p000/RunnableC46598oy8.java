package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlj;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
/* renamed from: oy8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC46598oy8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Bundle f102851b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f102852c;

    public RunnableC46598oy8(RC8 rc8, Bundle bundle) {
        this.f102852c = rc8;
        this.f102851b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RC8 rc8 = this.f102852c;
        Bundle bundle = this.f102851b;
        rc8.mo19953e();
        rc8.m6551f();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(AnalyticsRequestV2.HEADER_ORIGIN);
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!rc8.f100966a.m89762l()) {
            rc8.f100966a.mo22258a().m106889s().m42708a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzlj zzljVar = new zzlj(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzaw m92039y0 = rc8.f100966a.m89776N().m92039y0(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            rc8.f100966a.m89778L().m88553p(new zzac(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), string2, zzljVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), rc8.f100966a.m89776N().m92039y0(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), m92039y0, bundle.getLong("time_to_live"), rc8.f100966a.m89776N().m92039y0(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
