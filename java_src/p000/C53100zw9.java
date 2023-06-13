package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: zw9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C53100zw9 implements Closeable {

    /* renamed from: b */
    public final /* synthetic */ AZ5 f122508b;

    public /* synthetic */ C53100zw9(AZ5 az5, C50718vv9 c50718vv9) {
        AtomicReference atomicReference;
        boolean z;
        this.f122508b = az5;
        atomicReference = az5.f805d;
        if (((Thread) atomicReference.getAndSet(Thread.currentThread())) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f122508b.f805d;
        atomicReference.set(null);
        this.f122508b.m115546d();
    }
}
