package zendesk.core;

import java.io.File;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvidesDiskLruStorageFactory implements InterfaceC48812sj1<BaseStorage> {
    private final Y94<File> fileProvider;
    private final Y94<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvidesDiskLruStorageFactory(Y94<File> y94, Y94<Serializer> y942) {
        this.fileProvider = y94;
        this.serializerProvider = y942;
    }

    public static ZendeskStorageModule_ProvidesDiskLruStorageFactory create(Y94<File> y94, Y94<Serializer> y942) {
        return new ZendeskStorageModule_ProvidesDiskLruStorageFactory(y94, y942);
    }

    public static BaseStorage providesDiskLruStorage(File file, Object obj) {
        return (BaseStorage) C51679xZ3.m5002e(ZendeskStorageModule.providesDiskLruStorage(file, (Serializer) obj));
    }

    @Override // p000.Y94
    public BaseStorage get() {
        return providesDiskLruStorage(this.fileProvider.get(), this.serializerProvider.get());
    }
}
