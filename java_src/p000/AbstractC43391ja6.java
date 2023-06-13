package p000;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
/* renamed from: ja6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC43391ja6 implements Closeable {

    /* renamed from: ja6$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC24949a {
        /* renamed from: a */
        InterfaceC24949a mo30269a(Context context);

        AbstractC43391ja6 build();
    }

    /* renamed from: a */
    public abstract InterfaceC35412Qg1 mo30271a();

    /* renamed from: b */
    public abstract C42798ia6 mo30270b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo30271a().close();
    }
}
