package com.google.p034ar.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.z */
/* loaded from: classes6.dex */
public final class C18018z extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C18011s f73852a;

    public C18018z(C18011s c18011s) {
        this.f73852a = c18011s;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && extras != null && extras.containsKey("install.status")) {
            int i = extras.getInt("install.status");
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    if (i == 6) {
                        this.f73852a.m48402a(EnumC18012t.CANCELLED);
                        return;
                    }
                    return;
                }
                this.f73852a.m48402a(EnumC18012t.COMPLETED);
                return;
            }
            this.f73852a.m48402a(EnumC18012t.ACCEPTED);
        }
    }
}
