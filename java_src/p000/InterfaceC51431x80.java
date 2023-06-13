package p000;

import java.io.IOException;
import okhttp3.Request;
/* renamed from: x80  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC51431x80<T> extends Cloneable {
    /* renamed from: E0 */
    void mo1284E0(H80<T> h80);

    void cancel();

    /* renamed from: clone */
    InterfaceC51431x80<T> mo116227clone();

    HM4<T> execute() throws IOException;

    boolean isCanceled();

    Request request();
}
