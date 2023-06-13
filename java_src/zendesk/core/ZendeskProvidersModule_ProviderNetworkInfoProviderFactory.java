package zendesk.core;

import android.net.ConnectivityManager;
/* loaded from: classes8.dex */
public final class ZendeskProvidersModule_ProviderNetworkInfoProviderFactory implements InterfaceC48812sj1<NetworkInfoProvider> {
    private final Y94<ConnectivityManager> connectivityManagerProvider;

    public ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(Y94<ConnectivityManager> y94) {
        this.connectivityManagerProvider = y94;
    }

    public static ZendeskProvidersModule_ProviderNetworkInfoProviderFactory create(Y94<ConnectivityManager> y94) {
        return new ZendeskProvidersModule_ProviderNetworkInfoProviderFactory(y94);
    }

    public static NetworkInfoProvider providerNetworkInfoProvider(ConnectivityManager connectivityManager) {
        return (NetworkInfoProvider) C51679xZ3.m5002e(ZendeskProvidersModule.providerNetworkInfoProvider(connectivityManager));
    }

    @Override // p000.Y94
    public NetworkInfoProvider get() {
        return providerNetworkInfoProvider(this.connectivityManagerProvider.get());
    }
}
