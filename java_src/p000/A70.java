package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* renamed from: A70 */
/* loaded from: classes5.dex */
public class A70 implements InterfaceC45175mb1<ByteBuffer> {
    @Override // p000.InterfaceC45175mb1
    /* renamed from: c */
    public boolean mo7265b(ByteBuffer byteBuffer, File file, C48964sy3 c48964sy3) {
        try {
            E70.m109377f(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
