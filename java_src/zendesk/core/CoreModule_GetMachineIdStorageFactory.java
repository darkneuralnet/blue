package zendesk.core;
/* loaded from: classes8.dex */
public final class CoreModule_GetMachineIdStorageFactory implements InterfaceC48812sj1<MachineIdStorage> {
    private final CoreModule module;

    public CoreModule_GetMachineIdStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetMachineIdStorageFactory create(CoreModule coreModule) {
        return new CoreModule_GetMachineIdStorageFactory(coreModule);
    }

    public static MachineIdStorage getMachineIdStorage(CoreModule coreModule) {
        return (MachineIdStorage) C51679xZ3.m5002e(coreModule.getMachineIdStorage());
    }

    @Override // p000.Y94
    public MachineIdStorage get() {
        return getMachineIdStorage(this.module);
    }
}
