package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_GetNetworkInfoProviderFactory implements InterfaceC48812sj1<NetworkInfoProvider> {
    private final CoreModule module;

    public CoreModule_GetNetworkInfoProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetNetworkInfoProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetNetworkInfoProviderFactory(coreModule);
    }

    public static NetworkInfoProvider getNetworkInfoProvider(CoreModule coreModule) {
        return (NetworkInfoProvider) C51679xZ3.m5002e(coreModule.getNetworkInfoProvider());
    }

    @Override // p000.Y94
    public NetworkInfoProvider get() {
        return getNetworkInfoProvider(this.module);
    }
}
