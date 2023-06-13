package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProviderConnectivityManagerFactory implements InterfaceC48812sj1<ConnectivityManager> {
    private final Y94<Context> contextProvider;

    public ZendeskProvidersModule_ProviderConnectivityManagerFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static ZendeskProvidersModule_ProviderConnectivityManagerFactory create(Y94<Context> y94) {
        return new ZendeskProvidersModule_ProviderConnectivityManagerFactory(y94);
    }

    public static ConnectivityManager providerConnectivityManager(Context context) {
        return (ConnectivityManager) C51679xZ3.m5002e(ZendeskProvidersModule.providerConnectivityManager(context));
    }

    @Override // p000.Y94
    public ConnectivityManager get() {
        return providerConnectivityManager(this.contextProvider.get());
    }
}
