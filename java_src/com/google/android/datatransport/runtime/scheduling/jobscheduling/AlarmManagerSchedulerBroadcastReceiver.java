package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p000.T96;
/* loaded from: classes5.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: b */
    public static /* synthetic */ void m51928b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C42798ia6.m33786f(context);
        T96.AbstractC7673a mo16798d = T96.m84269a().mo16800b(queryParameter).mo16798d(R24.m87394b(intValue));
        if (queryParameter2 != null) {
            mo16798d.mo16799c(Base64.decode(queryParameter2, 0));
        }
        C42798ia6.m33789c().m33787e().m2987v(mo16798d.mo16801a(), i, new Runnable() { // from class: j9
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m51928b();
            }
        });
    }
}
