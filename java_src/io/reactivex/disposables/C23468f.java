package io.reactivex.disposables;
/* renamed from: io.reactivex.disposables.f */
/* loaded from: classes6.dex */
public final class C23468f extends AbstractC23467e<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public C23468f(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.disposables.AbstractC23467e
    /* renamed from: b */
    public void mo33019a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + mo1769e() + ", " + get() + ")";
    }
}
