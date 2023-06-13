package p000;

import android.os.Handler;
import android.os.Looper;
/* renamed from: G80 */
/* loaded from: classes8.dex */
public abstract class G80<E> {
    private boolean canceled = false;

    /* renamed from: G80$a */
    /* loaded from: classes8.dex */
    public class RunnableC2672a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Object f11038b;

        public RunnableC2672a(Object obj) {
            this.f11038b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            G80.this.success(this.f11038b);
        }
    }

    public void cancel() {
        this.canceled = true;
    }

    public void internalSuccess(E e) {
        if (!this.canceled) {
            new Handler(Looper.getMainLooper()).post(new RunnableC2672a(e));
        }
    }

    public abstract void success(E e);
}
