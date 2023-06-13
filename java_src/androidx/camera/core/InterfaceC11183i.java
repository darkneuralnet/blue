package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
/* renamed from: androidx.camera.core.i */
/* loaded from: classes.dex */
public interface InterfaceC11183i extends AutoCloseable {

    /* renamed from: androidx.camera.core.i$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11184a {
        /* renamed from: a */
        int mo69478a();

        /* renamed from: b */
        int mo69477b();

        /* renamed from: e */
        ByteBuffer mo69476e();
    }

    @SuppressLint({"ArrayReturn"})
    /* renamed from: A0 */
    InterfaceC11184a[] mo69480A0();

    @Override // java.lang.AutoCloseable
    void close();

    Rect getCropRect();

    int getFormat();

    int getHeight();

    int getWidth();

    /* renamed from: i1 */
    InterfaceC51066wX1 mo40428i1();

    /* renamed from: k3 */
    Image mo69479k3();

    void setCropRect(Rect rect);
}
