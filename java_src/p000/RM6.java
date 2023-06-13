package p000;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
/* renamed from: RM6 */
/* loaded from: classes6.dex */
public final class RM6 implements InterfaceC42079hM6 {

    /* renamed from: a */
    public final FileChannel f31961a;

    /* renamed from: b */
    public final long f31962b;

    /* renamed from: c */
    public final long f31963c;

    public RM6(FileChannel fileChannel, long j, long j2) {
        this.f31961a = fileChannel;
        this.f31962b = j;
        this.f31963c = j2;
    }

    @Override // p000.InterfaceC42079hM6
    /* renamed from: a */
    public final long mo36508a() {
        return this.f31963c;
    }

    @Override // p000.InterfaceC42079hM6
    /* renamed from: a */
    public final void mo36507a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f31961a.map(FileChannel.MapMode.READ_ONLY, this.f31962b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
