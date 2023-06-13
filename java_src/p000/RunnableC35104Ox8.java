package p000;

import java.util.concurrent.Executor;
/* renamed from: Ox8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC35104Ox8<T> implements Runnable {

    /* renamed from: b */
    public InterfaceC38952c69<T> f27614b;

    /* renamed from: c */
    public Executor f27615c;

    public RunnableC35104Ox8(InterfaceC38952c69<T> interfaceC38952c69, Executor executor) {
        interfaceC38952c69.getClass();
        this.f27614b = interfaceC38952c69;
        executor.getClass();
        this.f27615c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27614b = null;
        this.f27615c = null;
    }
}
