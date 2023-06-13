package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzaw;
/* renamed from: dU8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC39782dU8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f76722b;

    /* renamed from: c */
    public final /* synthetic */ String f76723c = "_err";

    /* renamed from: d */
    public final /* synthetic */ Bundle f76724d;

    /* renamed from: e */
    public final /* synthetic */ C40967fU8 f76725e;

    public RunnableC39782dU8(C40967fU8 c40967fU8, String str, String str2, Bundle bundle) {
        this.f76725e = c40967fU8;
        this.f76722b = str;
        this.f76724d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76725e.f80211a.m36284h((zzaw) Preconditions.checkNotNull(this.f76725e.f80211a.m36283h0().m92039y0(this.f76722b, this.f76723c, this.f76724d, "auto", this.f76725e.f80211a.mo22260A().currentTimeMillis(), false, true)), this.f76722b);
    }
}
