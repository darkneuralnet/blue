package p000;

import android.content.Context;
import android.util.Log;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: O56 */
/* loaded from: classes6.dex */
public class O56 {

    /* renamed from: i */
    public static final long f25626i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    public final Context f25627a;

    /* renamed from: b */
    public final ET2 f25628b;

    /* renamed from: c */
    public final ZC1 f25629c;

    /* renamed from: d */
    public final FirebaseMessaging f25630d;

    /* renamed from: f */
    public final ScheduledExecutorService f25632f;

    /* renamed from: h */
    public final M56 f25634h;

    /* renamed from: e */
    public final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f25631e = new C28385so();

    /* renamed from: g */
    public boolean f25633g = false;

    public O56(FirebaseMessaging firebaseMessaging, ET2 et2, M56 m56, ZC1 zc1, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f25630d = firebaseMessaging;
        this.f25628b = et2;
        this.f25634h = m56;
        this.f25629c = zc1;
        this.f25627a = context;
        this.f25632f = scheduledExecutorService;
    }

    /* renamed from: c */
    public static <T> void m92939c(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: f */
    public static Task<O56> m92936f(final FirebaseMessaging firebaseMessaging, final ET2 et2, final ZC1 zc1, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: N56
            @Override // java.util.concurrent.Callable
            public final Object call() {
                O56 m92932j;
                m92932j = O56.m92932j(context, scheduledExecutorService, firebaseMessaging, et2, zc1);
                return m92932j;
            }
        });
    }

    /* renamed from: h */
    public static boolean m92934h() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static /* synthetic */ O56 m92932j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, ET2 et2, ZC1 zc1) throws Exception {
        return new O56(firebaseMessaging, et2, M56.m95830b(context, scheduledExecutorService), zc1, context, scheduledExecutorService);
    }

    /* renamed from: b */
    public final void m92940b(L56 l56, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.f25631e) {
            String m97780e = l56.m97780e();
            if (this.f25631e.containsKey(m97780e)) {
                arrayDeque = this.f25631e.get(m97780e);
            } else {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f25631e.put(m97780e, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    /* renamed from: d */
    public final void m92938d(String str) throws IOException {
        m92939c(this.f25629c.m73621l(this.f25630d.blockingGetToken(), str));
    }

    /* renamed from: e */
    public final void m92937e(String str) throws IOException {
        m92939c(this.f25629c.m73620m(this.f25630d.blockingGetToken(), str));
    }

    /* renamed from: g */
    public boolean m92935g() {
        return this.f25634h.m95829c() != null;
    }

    /* renamed from: i */
    public synchronized boolean m92933i() {
        return this.f25633g;
    }

    /* renamed from: k */
    public final void m92931k(L56 l56) {
        synchronized (this.f25631e) {
            String m97780e = l56.m97780e();
            if (!this.f25631e.containsKey(m97780e)) {
                return;
            }
            ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f25631e.get(m97780e);
            TaskCompletionSource<Void> poll = arrayDeque.poll();
            if (poll != null) {
                poll.setResult(null);
            }
            if (arrayDeque.isEmpty()) {
                this.f25631e.remove(m97780e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: IOException -> 0x00a2, TryCatch #0 {IOException -> 0x00a2, blocks: (B:3:0x0003, B:18:0x0030, B:20:0x0036, B:21:0x0050, B:23:0x005d, B:24:0x0079, B:26:0x0086, B:8:0x0015, B:11:0x001f), top: B:41:0x0003 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m92930l(L56 l56) throws IOException {
        char c;
        try {
            String m97783b = l56.m97783b();
            int hashCode = m97783b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && m97783b.equals("U")) {
                    c = 1;
                    if (c == 0) {
                        if (c != 1) {
                            if (m92934h()) {
                                Log.d("FirebaseMessaging", "Unknown topic operation" + l56 + InstructionFileId.DOT);
                            }
                        } else {
                            m92937e(l56.m97782c());
                            if (m92934h()) {
                                Log.d("FirebaseMessaging", "Unsubscribe from topic: " + l56.m97782c() + " succeeded.");
                            }
                        }
                    } else {
                        m92938d(l56.m97782c());
                        if (m92934h()) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + l56.m97782c() + " succeeded.");
                        }
                    }
                    return true;
                }
                c = 65535;
                if (c == 0) {
                }
                return true;
            }
            if (m97783b.equals("S")) {
                c = 0;
                if (c == 0) {
                }
                return true;
            }
            c = 65535;
            if (c == 0) {
            }
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                if (e.getMessage() == null) {
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                throw e;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    /* renamed from: m */
    public void m92929m(Runnable runnable, long j) {
        this.f25632f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* renamed from: n */
    public Task<Void> m92928n(L56 l56) {
        this.f25634h.m95831a(l56);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        m92940b(l56, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public synchronized void m92927o(boolean z) {
        this.f25633g = z;
    }

    /* renamed from: p */
    public final void m92926p() {
        if (!m92933i()) {
            m92922t(0L);
        }
    }

    /* renamed from: q */
    public void m92925q() {
        if (m92935g()) {
            m92926p();
        }
    }

    /* renamed from: r */
    public Task<Void> m92924r(String str) {
        Task<Void> m92928n = m92928n(L56.m97779f(str));
        m92925q();
        return m92928n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (m92934h() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        return true;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m92923s() throws IOException {
        while (true) {
            synchronized (this) {
                L56 m95829c = this.f25634h.m95829c();
                if (m95829c == null) {
                    break;
                } else if (!m92930l(m95829c)) {
                    return false;
                } else {
                    this.f25634h.m95827e(m95829c);
                    m92931k(m95829c);
                }
            }
        }
    }

    /* renamed from: t */
    public void m92922t(long j) {
        m92929m(new P56(this, this.f25627a, this.f25628b, Math.min(Math.max(30L, 2 * j), f25626i)), j);
        m92927o(true);
    }

    /* renamed from: u */
    public Task<Void> m92921u(String str) {
        Task<Void> m92928n = m92928n(L56.m97778g(str));
        m92925q();
        return m92928n;
    }
}
