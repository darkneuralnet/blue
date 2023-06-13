package p000;

import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.O80;
/* renamed from: Q22 */
/* loaded from: classes.dex */
public class Q22 implements O22 {

    /* renamed from: a */
    public final MediaCodec f29714a;

    /* renamed from: b */
    public final int f29715b;

    /* renamed from: c */
    public final ByteBuffer f29716c;

    /* renamed from: d */
    public final ListenableFuture<Void> f29717d;

    /* renamed from: e */
    public final O80.C5832a<Void> f29718e;

    /* renamed from: f */
    public final AtomicBoolean f29719f = new AtomicBoolean(false);

    /* renamed from: g */
    public long f29720g = 0;

    /* renamed from: h */
    public boolean f29721h = false;

    public Q22(MediaCodec mediaCodec, int i) throws MediaCodec.CodecException {
        this.f29714a = (MediaCodec) HZ3.m103731g(mediaCodec);
        this.f29715b = HZ3.m103734d(i);
        this.f29716c = mediaCodec.getInputBuffer(i);
        final AtomicReference atomicReference = new AtomicReference();
        this.f29717d = O80.m92864a(new O80.InterfaceC5834c() { // from class: P22
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object obj;
                obj = atomicReference.set(c5832a);
                return obj;
            }
        });
        this.f29718e = (O80.C5832a) HZ3.m103731g((O80.C5832a) atomicReference.get());
    }

    @Override // p000.O22
    /* renamed from: a */
    public void mo89095a(boolean z) {
        m89088h();
        this.f29721h = z;
    }

    @Override // p000.O22
    /* renamed from: b */
    public boolean mo89094b() {
        int i;
        if (this.f29719f.getAndSet(true)) {
            return false;
        }
        try {
            MediaCodec mediaCodec = this.f29714a;
            int i2 = this.f29715b;
            int position = this.f29716c.position();
            int limit = this.f29716c.limit();
            long j = this.f29720g;
            if (this.f29721h) {
                i = 4;
            } else {
                i = 0;
            }
            mediaCodec.queueInputBuffer(i2, position, limit, j, i);
            this.f29718e.m92861c(null);
            return true;
        } catch (IllegalStateException e) {
            this.f29718e.m92858f(e);
            return false;
        }
    }

    @Override // p000.O22
    /* renamed from: c */
    public ListenableFuture<Void> mo89093c() {
        return IA1.m102834j(this.f29717d);
    }

    @Override // p000.O22
    /* renamed from: d */
    public void mo89092d(long j) {
        boolean z;
        m89088h();
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103737a(z);
        this.f29720g = j;
    }

    /* renamed from: f */
    public boolean m89090f() {
        if (this.f29719f.getAndSet(true)) {
            return false;
        }
        try {
            this.f29714a.queueInputBuffer(this.f29715b, 0, 0, 0L, 0);
            this.f29718e.m92861c(null);
        } catch (IllegalStateException e) {
            this.f29718e.m92858f(e);
        }
        return true;
    }

    /* renamed from: h */
    public final void m89088h() {
        if (!this.f29719f.get()) {
            return;
        }
        throw new IllegalStateException("The buffer is submitted or canceled.");
    }
}
