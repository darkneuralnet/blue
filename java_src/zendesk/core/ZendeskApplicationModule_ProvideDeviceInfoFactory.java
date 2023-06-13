package zendesk.core;

import android.content.Context;
/* loaded from: classes8.dex */
public final class ZendeskApplicationModule_ProvideDeviceInfoFactory implements InterfaceC48812sj1<DeviceInfo> {
    private final Y94<Context> contextProvider;

    public ZendeskApplicationModule_ProvideDeviceInfoFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static ZendeskApplicationModule_ProvideDeviceInfoFactory create(Y94<Context> y94) {
        return new ZendeskApplicationModule_ProvideDeviceInfoFactory(y94);
    }

    public static DeviceInfo provideDeviceInfo(Context context) {
        return (DeviceInfo) C51679xZ3.m5002e(ZendeskApplicationModule.provideDeviceInfo(context));
    }

    @Override // p000.Y94
    public DeviceInfo get() {
        return provideDeviceInfo(this.contextProvider.get());
    }
}
