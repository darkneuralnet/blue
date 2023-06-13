package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvideSerializerFactory implements InterfaceC48812sj1<Serializer> {
    private final Y94<C46153oE1> gsonProvider;

    public ZendeskStorageModule_ProvideSerializerFactory(Y94<C46153oE1> y94) {
        this.gsonProvider = y94;
    }

    public static ZendeskStorageModule_ProvideSerializerFactory create(Y94<C46153oE1> y94) {
        return new ZendeskStorageModule_ProvideSerializerFactory(y94);
    }

    public static Serializer provideSerializer(C46153oE1 c46153oE1) {
        return (Serializer) C51679xZ3.m5002e(ZendeskStorageModule.provideSerializer(c46153oE1));
    }

    @Override // p000.Y94
    public Serializer get() {
        return provideSerializer(this.gsonProvider.get());
    }
}
