package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzlj;
import com.stripe.android.model.PaymentMethodOptionsParams;
/* renamed from: Ay8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31837Ay8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Bundle f1494b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f1495c;

    public RunnableC31837Ay8(RC8 rc8, Bundle bundle) {
        this.f1495c = rc8;
        this.f1494b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RC8 rc8 = this.f1495c;
        Bundle bundle = this.f1494b;
        rc8.mo19953e();
        rc8.m6551f();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!rc8.f100966a.m89762l()) {
            rc8.f100966a.mo22258a().m106889s().m42708a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            rc8.f100966a.m89778L().m88553p(new zzac(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), "", new zzlj(checkNotEmpty, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), rc8.f100966a.m89776N().m92039y0(bundle.getString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
