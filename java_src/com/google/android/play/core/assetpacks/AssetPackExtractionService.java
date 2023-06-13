package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* loaded from: classes6.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: b */
    public BinderC39088cL6 f73701b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f73701b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        BM6.m114065h(getApplicationContext()).mo17603b(this);
    }
}
