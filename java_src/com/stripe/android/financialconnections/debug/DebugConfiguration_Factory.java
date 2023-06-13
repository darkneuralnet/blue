package com.stripe.android.financialconnections.debug;

import android.app.Application;
/* loaded from: classes7.dex */
public final class DebugConfiguration_Factory implements InterfaceC48812sj1<DebugConfiguration> {
    private final Y94<Application> contextProvider;

    public DebugConfiguration_Factory(Y94<Application> y94) {
        this.contextProvider = y94;
    }

    public static DebugConfiguration_Factory create(Y94<Application> y94) {
        return new DebugConfiguration_Factory(y94);
    }

    public static DebugConfiguration newInstance(Application application) {
        return new DebugConfiguration(application);
    }

    @Override // p000.Y94
    public DebugConfiguration get() {
        return newInstance(this.contextProvider.get());
    }
}
