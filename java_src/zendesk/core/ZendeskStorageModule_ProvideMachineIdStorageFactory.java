package zendesk.core;

import android.content.Context;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideMachineIdStorageFactory implements InterfaceC48812sj1<MachineIdStorage> {
    private final Y94<Context> contextProvider;

    public ZendeskStorageModule_ProvideMachineIdStorageFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static ZendeskStorageModule_ProvideMachineIdStorageFactory create(Y94<Context> y94) {
        return new ZendeskStorageModule_ProvideMachineIdStorageFactory(y94);
    }

    public static MachineIdStorage provideMachineIdStorage(Context context) {
        return (MachineIdStorage) C51679xZ3.m5002e(ZendeskStorageModule.provideMachineIdStorage(context));
    }

    @Override // p000.Y94
    public MachineIdStorage get() {
        return provideMachineIdStorage(this.contextProvider.get());
    }
}
