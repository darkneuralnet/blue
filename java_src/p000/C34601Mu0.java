package p000;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.C18378b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: Mu0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34601Mu0 {

    /* renamed from: d */
    public static final Map<String, C34601Mu0> f23776d = new HashMap();

    /* renamed from: e */
    public static final Executor f23777e = new ExecutorC49647u74();

    /* renamed from: a */
    public final Executor f23778a;

    /* renamed from: b */
    public final C32270Cv0 f23779b;

    /* renamed from: c */
    public Task<C18378b> f23780c = null;

    /* renamed from: Mu0$b */
    /* loaded from: classes6.dex */
    public static class C5419b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a */
        public final CountDownLatch f23781a;

        private C5419b() {
            this.f23781a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public boolean m94594a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f23781a.await(j, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f23781a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f23781a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f23781a.countDown();
        }
    }

    public C34601Mu0(Executor executor, C32270Cv0 c32270Cv0) {
        this.f23778a = executor;
        this.f23779b = c32270Cv0;
    }

    /* renamed from: c */
    public static <TResult> TResult m94605c(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C5419b c5419b = new C5419b();
        Executor executor = f23777e;
        task.addOnSuccessListener(executor, c5419b);
        task.addOnFailureListener(executor, c5419b);
        task.addOnCanceledListener(executor, c5419b);
        if (c5419b.m94594a(j, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    /* renamed from: h */
    public static synchronized C34601Mu0 m94600h(Executor executor, C32270Cv0 c32270Cv0) {
        C34601Mu0 c34601Mu0;
        synchronized (C34601Mu0.class) {
            String m111356b = c32270Cv0.m111356b();
            Map<String, C34601Mu0> map = f23776d;
            if (!map.containsKey(m111356b)) {
                map.put(m111356b, new C34601Mu0(executor, c32270Cv0));
            }
            c34601Mu0 = map.get(m111356b);
        }
        return c34601Mu0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Void m94599i(C18378b c18378b) throws Exception {
        return this.f23779b.m111353e(c18378b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Task m94598j(boolean z, C18378b c18378b, Void r3) throws Exception {
        if (z) {
            m94595m(c18378b);
        }
        return Tasks.forResult(c18378b);
    }

    /* renamed from: d */
    public void m94604d() {
        synchronized (this) {
            this.f23780c = Tasks.forResult(null);
        }
        this.f23779b.m111357a();
    }

    /* renamed from: e */
    public synchronized Task<C18378b> m94603e() {
        Task<C18378b> task = this.f23780c;
        if (task == null || (task.isComplete() && !this.f23780c.isSuccessful())) {
            Executor executor = this.f23778a;
            final C32270Cv0 c32270Cv0 = this.f23779b;
            Objects.requireNonNull(c32270Cv0);
            this.f23780c = Tasks.call(executor, new Callable() { // from class: Ju0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C32270Cv0.this.m111354d();
                }
            });
        }
        return this.f23780c;
    }

    /* renamed from: f */
    public C18378b m94602f() {
        return m94601g(5L);
    }

    /* renamed from: g */
    public C18378b m94601g(long j) {
        synchronized (this) {
            Task<C18378b> task = this.f23780c;
            if (task != null && task.isSuccessful()) {
                return this.f23780c.getResult();
            }
            try {
                return (C18378b) m94605c(m94603e(), j, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e);
                return null;
            }
        }
    }

    /* renamed from: k */
    public Task<C18378b> m94597k(C18378b c18378b) {
        return m94596l(c18378b, true);
    }

    /* renamed from: l */
    public Task<C18378b> m94596l(final C18378b c18378b, final boolean z) {
        return Tasks.call(this.f23778a, new Callable() { // from class: Ku0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m94599i;
                m94599i = C34601Mu0.this.m94599i(c18378b);
                return m94599i;
            }
        }).onSuccessTask(this.f23778a, new SuccessContinuation() { // from class: Lu0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m94598j;
                m94598j = C34601Mu0.this.m94598j(z, c18378b, (Void) obj);
                return m94598j;
            }
        });
    }

    /* renamed from: m */
    public final synchronized void m94595m(C18378b c18378b) {
        this.f23780c = Tasks.forResult(c18378b);
    }
}
