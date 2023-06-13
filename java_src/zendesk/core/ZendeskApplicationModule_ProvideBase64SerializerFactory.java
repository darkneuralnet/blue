package zendesk.core;
/* loaded from: classes8.dex */
public final class ZendeskApplicationModule_ProvideBase64SerializerFactory implements InterfaceC48812sj1<Serializer> {
    private final Y94<Serializer> gsonSerializerProvider;
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideBase64SerializerFactory(ZendeskApplicationModule zendeskApplicationModule, Y94<Serializer> y94) {
        this.module = zendeskApplicationModule;
        this.gsonSerializerProvider = y94;
    }

    public static ZendeskApplicationModule_ProvideBase64SerializerFactory create(ZendeskApplicationModule zendeskApplicationModule, Y94<Serializer> y94) {
        return new ZendeskApplicationModule_ProvideBase64SerializerFactory(zendeskApplicationModule, y94);
    }

    public static Serializer provideBase64Serializer(ZendeskApplicationModule zendeskApplicationModule, Object obj) {
        return (Serializer) C51679xZ3.m5002e(zendeskApplicationModule.provideBase64Serializer((Serializer) obj));
    }

    @Override // p000.Y94
    public Serializer get() {
        return provideBase64Serializer(this.module, this.gsonSerializerProvider.get());
    }
}
