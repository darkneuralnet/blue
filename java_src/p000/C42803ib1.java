package p000;

import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.O80;
/* renamed from: ib1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C42803ib1 implements InterfaceC41617gb1 {

    /* renamed from: b */
    public final MediaCodec f87502b;

    /* renamed from: c */
    public final MediaCodec.BufferInfo f87503c;

    /* renamed from: d */
    public final int f87504d;

    /* renamed from: e */
    public final ByteBuffer f87505e;

    /* renamed from: f */
    public final ListenableFuture<Void> f87506f;

    /* renamed from: g */
    public final O80.C5832a<Void> f87507g;

    /* renamed from: h */
    public final AtomicBoolean f87508h = new AtomicBoolean(false);

    public C42803ib1(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) throws MediaCodec.CodecException {
        this.f87502b = (MediaCodec) HZ3.m103731g(mediaCodec);
        this.f87504d = i;
        this.f87505e = mediaCodec.getOutputBuffer(i);
        this.f87503c = (MediaCodec.BufferInfo) HZ3.m103731g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f87506f = O80.m92864a(new O80.InterfaceC5834c() { // from class: hb1
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object obj;
                obj = atomicReference.set(c5832a);
                return obj;
            }
        });
        this.f87507g = (O80.C5832a) HZ3.m103731g((O80.C5832a) atomicReference.get());
    }

    @Override // p000.InterfaceC41617gb1
    /* renamed from: U */
    public MediaCodec.BufferInfo mo33778U() {
        return this.f87503c;
    }

    @Override // p000.InterfaceC41617gb1
    /* renamed from: Z */
    public boolean mo33777Z() {
        return (this.f87503c.flags & 1) != 0;
    }

    /* renamed from: b */
    public ListenableFuture<Void> m33775b() {
        return IA1.m102834j(this.f87506f);
    }

    @Override // p000.InterfaceC41617gb1, java.lang.AutoCloseable
    public void close() {
        if (this.f87508h.getAndSet(true)) {
            return;
        }
        try {
            this.f87502b.releaseOutputBuffer(this.f87504d, false);
            this.f87507g.m92861c(null);
        } catch (IllegalStateException e) {
            this.f87507g.m92858f(e);
        }
    }

    /* renamed from: d */
    public final void m33773d() {
        if (!this.f87508h.get()) {
            return;
        }
        throw new IllegalStateException("encoded data is closed.");
    }

    @Override // p000.InterfaceC41617gb1
    /* renamed from: j2 */
    public ByteBuffer mo33772j2() {
        m33773d();
        this.f87505e.position(this.f87503c.offset);
        ByteBuffer byteBuffer = this.f87505e;
        MediaCodec.BufferInfo bufferInfo = this.f87503c;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f87505e;
    }

    @Override // p000.InterfaceC41617gb1
    /* renamed from: q0 */
    public long mo33771q0() {
        return this.f87503c.presentationTimeUs;
    }

    @Override // p000.InterfaceC41617gb1
    public long size() {
        return this.f87503c.size;
    }
}
