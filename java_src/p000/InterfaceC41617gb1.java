package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
/* renamed from: gb1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC41617gb1 extends AutoCloseable {
    /* renamed from: U */
    MediaCodec.BufferInfo mo33778U();

    /* renamed from: Z */
    boolean mo33777Z();

    @Override // java.lang.AutoCloseable
    void close();

    /* renamed from: j2 */
    ByteBuffer mo33772j2();

    /* renamed from: q0 */
    long mo33771q0();

    long size();
}
