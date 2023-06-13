package p000;

import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: cH8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractRunnableC39054cH8 implements Runnable {

    /* renamed from: b */
    public final TaskCompletionSource f60360b;

    public AbstractRunnableC39054cH8() {
        this.f60360b = null;
    }

    /* renamed from: a */
    public void mo61624a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f60360b;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* renamed from: b */
    public abstract void mo10054b();

    /* renamed from: c */
    public final TaskCompletionSource m61623c() {
        return this.f60360b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo10054b();
        } catch (Exception e) {
            mo61624a(e);
        }
    }

    public AbstractRunnableC39054cH8(TaskCompletionSource taskCompletionSource) {
        this.f60360b = taskCompletionSource;
    }
}
