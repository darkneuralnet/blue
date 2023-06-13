package p000;
/* renamed from: nZ5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC45753nZ5 {
    /* renamed from: a */
    public abstract void mo23536a(Runnable runnable);

    /* renamed from: b */
    public void m23535b(Runnable runnable) {
        if (mo23534c()) {
            runnable.run();
        } else {
            mo23533d(runnable);
        }
    }

    /* renamed from: c */
    public abstract boolean mo23534c();

    /* renamed from: d */
    public abstract void mo23533d(Runnable runnable);
}
