package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzfi;
/* loaded from: classes5.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public zzfi f70287a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f70287a == null) {
            this.f70287a = new zzfi();
        }
        zzfi.zzb(context, intent);
    }
}