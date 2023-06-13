package zendesk.core;

import android.content.Context;
import java.io.File;
/* loaded from: classes8.dex */
public final class ZendeskStorageModule_ProvidesBelvedereDirFactory implements InterfaceC48812sj1<File> {
    private final Y94<Context> contextProvider;

    public ZendeskStorageModule_ProvidesBelvedereDirFactory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static ZendeskStorageModule_ProvidesBelvedereDirFactory create(Y94<Context> y94) {
        return new ZendeskStorageModule_ProvidesBelvedereDirFactory(y94);
    }

    public static File providesBelvedereDir(Context context) {
        return (File) C51679xZ3.m5002e(ZendeskStorageModule.providesBelvedereDir(context));
    }

    @Override // p000.Y94
    public File get() {
        return providesBelvedereDir(this.contextProvider.get());
    }
}
