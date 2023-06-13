package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* renamed from: UK6 */
/* loaded from: classes6.dex */
public final class UK6 implements InterfaceC42079hM6 {

    /* renamed from: a */
    public final ByteBuffer f37257a;

    public UK6(ByteBuffer byteBuffer) {
        this.f37257a = byteBuffer.slice();
    }

    @Override // p000.InterfaceC42079hM6
    /* renamed from: a */
    public final long mo36508a() {
        return this.f37257a.capacity();
    }

    @Override // p000.InterfaceC42079hM6
    /* renamed from: a */
    public final void mo36507a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f37257a) {
            int i2 = (int) j;
            this.f37257a.position(i2);
            this.f37257a.limit(i2 + i);
            slice = this.f37257a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
