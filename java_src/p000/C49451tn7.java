package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* renamed from: tn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49451tn7 {

    /* renamed from: j */
    public static final ExecutorService f111018j = Executors.newSingleThreadExecutor();

    /* renamed from: k */
    public static final long f111019k = TimeUnit.DAYS.toSeconds(7);

    /* renamed from: l */
    public static final long f111020l = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: m */
    public static C49451tn7 f111021m;

    /* renamed from: a */
    public final C51822xn7 f111022a;

    /* renamed from: b */
    public final ExecutorService f111023b;

    /* renamed from: c */
    public final C50044un7 f111024c;

    /* renamed from: d */
    public final InterfaceC33375Hn7 f111025d;

    /* renamed from: e */
    public final long f111026e;

    /* renamed from: f */
    public final long f111027f;

    /* renamed from: g */
    public final C53008zn7 f111028g;

    /* renamed from: h */
    public final Object f111029h;

    /* renamed from: i */
    public final C42346ho7 f111030i;

    public C49451tn7(C42346ho7 c42346ho7, ExecutorService executorService, C51822xn7 c51822xn7, C50044un7 c50044un7, long j, long j2) {
        C39364co7 c39364co7 = new C39364co7();
        C53008zn7 c53008zn7 = new C53008zn7();
        this.f111029h = new Object();
        this.f111030i = c42346ho7;
        this.f111023b = executorService;
        this.f111022a = c51822xn7;
        this.f111025d = c39364co7;
        this.f111024c = c50044un7;
        this.f111026e = j;
        this.f111027f = j2;
        this.f111028g = c53008zn7;
    }

    /* renamed from: a */
    public static synchronized C49451tn7 m11768a() {
        C49451tn7 c49451tn7;
        synchronized (C49451tn7.class) {
            if (f111021m == null) {
                f111021m = new C49451tn7(C42346ho7.m35842b(), f111018j, new C51822xn7((Context) C52226yU2.m3451c().m3453a(Context.class)), new C50044un7(), f111019k, f111020l);
            }
            c49451tn7 = f111021m;
        }
        return c49451tn7;
    }

    /* renamed from: b */
    public final Task m11767b(final String str, final String str2, String str3, int i) {
        String m92408J = C53008zn7.m423a().mo2581a().m86964D().m92408J();
        try {
            if (Integer.parseInt(m92408J) < 29) {
                Log.d("AccelerationAllowlist", "Unable to retrieve NNAPI info required by AllowlistServer before Android Q, skipping allowlist fetch.");
                return Tasks.forResult(null);
            }
            Log.d("AccelerationAllowlist", "fetchAccelerationAllowlist");
            final C33141Gn7 c33141Gn7 = new C33141Gn7("com.google.perception", 2);
            c33141Gn7.m104714f();
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f111023b.execute(new Runnable(str, str2, "com.google.perception", 2, c33141Gn7, taskCompletionSource) { // from class: rn7

                /* renamed from: c */
                public final /* synthetic */ String f107622c;

                /* renamed from: d */
                public final /* synthetic */ String f107623d;

                /* renamed from: e */
                public final /* synthetic */ String f107624e = "com.google.perception";

                /* renamed from: f */
                public final /* synthetic */ C33141Gn7 f107625f;

                /* renamed from: g */
                public final /* synthetic */ TaskCompletionSource f107626g;

                {
                    this.f107625f = c33141Gn7;
                    this.f107626g = taskCompletionSource;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C49451tn7.this.m11765d(this.f107622c, this.f107623d, this.f107624e, 2, this.f107625f, this.f107626g);
                }
            });
            return taskCompletionSource.getTask();
        } catch (NumberFormatException e) {
            Log.e("AccelerationAllowlist", String.format("Unable to parse OS version returned by the AndroidSystemInfoProvider '%s'", m92408J), e);
            return Tasks.forException(e);
        }
    }

    /* renamed from: c */
    public final C41250fx7 m11766c(String str, String str2, String str3, int i) {
        C33141Gn7 c33141Gn7 = new C33141Gn7("com.google.perception", 2);
        c33141Gn7.m104714f();
        try {
            return this.f111022a.m4695a(str, str2, "com.google.perception", 2, c33141Gn7, this.f111026e);
        } finally {
            c33141Gn7.m104715e();
            this.f111024c.m9735b(c33141Gn7);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m11765d(String str, String str2, String str3, int i, C33141Gn7 c33141Gn7, TaskCompletionSource taskCompletionSource) {
        C39974do7 m35843a;
        C41250fx7 c41250fx7;
        try {
            try {
                C41250fx7 m4695a = this.f111022a.m4695a(str, str2, "com.google.perception", 2, c33141Gn7, this.f111027f);
                if (m4695a != null) {
                    Log.d("AccelerationAllowlist", "Cached copy available, not calling the server");
                    taskCompletionSource.setResult(m4695a);
                } else {
                    Log.d("AccelerationAllowlist", "fetching allowlist");
                    AbstractC52415yn7 m423a = C53008zn7.m423a();
                    synchronized (this.f111029h) {
                        this.f111030i.m35841c();
                        m35843a = this.f111030i.m35843a();
                    }
                    C48858sn7 c48858sn7 = new C48858sn7(c33141Gn7, str, str2, "com.google.perception", 2, m423a, m35843a, this.f111025d, this.f111024c);
                    if (!C43542jp7.m29865a(c48858sn7)) {
                        c33141Gn7.m104716d(bz9.RPC_EXPONENTIAL_BACKOFF_FAILED);
                        c41250fx7 = null;
                    } else {
                        Log.d("AccelerationAllowlist", "Saving allowlist");
                        C41250fx7 m13665a = c48858sn7.m13665a();
                        this.f111022a.m4693c(m13665a, str, str2, "com.google.perception", 2, c33141Gn7);
                        c41250fx7 = m13665a;
                    }
                    taskCompletionSource.setResult(c41250fx7);
                }
            } finally {
                c33141Gn7.m104715e();
                this.f111024c.m9735b(c33141Gn7);
            }
        } catch (IOException | InterruptedException e) {
            c33141Gn7.m104716d(bz9.RPC_ERROR);
            taskCompletionSource.setException(e);
        }
    }
}
