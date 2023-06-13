package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
/* loaded from: classes6.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements InterfaceC33565Ii8 {

    /* renamed from: c */
    public C34501Mi8 f71513c;

    @Override // p000.InterfaceC33565Ii8
    /* renamed from: a */
    public void mo50593a(Context context, Intent intent) {
        WakefulBroadcastReceiver.m67050c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f71513c == null) {
            this.f71513c = new C34501Mi8(this);
        }
        this.f71513c.m95002a(context, intent);
    }
}
