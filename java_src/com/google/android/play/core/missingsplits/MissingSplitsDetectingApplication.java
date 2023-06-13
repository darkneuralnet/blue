package com.google.android.play.core.missingsplits;

import android.app.Application;
@Deprecated
/* loaded from: classes6.dex */
public class MissingSplitsDetectingApplication extends Application {

    /* renamed from: b */
    public boolean f73711b = false;

    @Deprecated
    /* renamed from: a */
    public void m48464a() {
    }

    @Override // android.app.Application
    public final void onCreate() {
        if (this.f73711b) {
            throw new IllegalStateException("The onCreate method must be invoked at most once.");
        }
        this.f73711b = true;
        if (C51040wU2.m6786a(this).mo8610a()) {
            return;
        }
        super.onCreate();
        m48464a();
    }
}
