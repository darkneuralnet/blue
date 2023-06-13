package p000;

import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: fd4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41047fd4 implements InterfaceC39862dd4 {

    /* renamed from: a */
    public final AtomicBoolean f80379a = new AtomicBoolean(false);

    /* renamed from: a */
    public synchronized void m41097a() throws InterruptedException {
        while (!this.f80379a.get()) {
            try {
                wait();
            } catch (InterruptedException e) {
                if (!this.f80379a.get()) {
                    C52323ye5.m3110s(e, "Queue's awaitRelease() has been interrupted abruptly while it wasn't released by the release() method.", new Object[0]);
                }
            }
        }
    }

    @Override // p000.InterfaceC39862dd4
    public synchronized void release() {
        if (this.f80379a.compareAndSet(false, true)) {
            notify();
        }
    }
}
