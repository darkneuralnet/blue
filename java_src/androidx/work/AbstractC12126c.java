package androidx.work;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import java.util.concurrent.Executor;
/* renamed from: androidx.work.c */
/* loaded from: classes.dex */
public abstract class AbstractC12126c {

    /* renamed from: b */
    public Context f56217b;

    /* renamed from: c */
    public WorkerParameters f56218c;

    /* renamed from: d */
    public volatile boolean f56219d;

    /* renamed from: e */
    public boolean f56220e;

    /* renamed from: androidx.work.c$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC12127a {

        /* renamed from: androidx.work.c$a$a */
        /* loaded from: classes.dex */
        public static final class C12128a extends AbstractC12127a {

            /* renamed from: a */
            public final C12124b f56221a;

            public C12128a() {
                this(C12124b.f56214c);
            }

            /* renamed from: e */
            public C12124b m65560e() {
                return this.f56221a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C12128a.class == obj.getClass()) {
                    return this.f56221a.equals(((C12128a) obj).f56221a);
                }
                return false;
            }

            public int hashCode() {
                return (C12128a.class.getName().hashCode() * 31) + this.f56221a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f56221a + CoreConstants.CURLY_RIGHT;
            }

            public C12128a(C12124b c12124b) {
                this.f56221a = c12124b;
            }
        }

        /* renamed from: androidx.work.c$a$b */
        /* loaded from: classes.dex */
        public static final class C12129b extends AbstractC12127a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C12129b.class == obj.getClass();
            }

            public int hashCode() {
                return C12129b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.c$a$c */
        /* loaded from: classes.dex */
        public static final class C12130c extends AbstractC12127a {

            /* renamed from: a */
            public final C12124b f56222a;

            public C12130c() {
                this(C12124b.f56214c);
            }

            /* renamed from: e */
            public C12124b m65559e() {
                return this.f56222a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C12130c.class == obj.getClass()) {
                    return this.f56222a.equals(((C12130c) obj).f56222a);
                }
                return false;
            }

            public int hashCode() {
                return (C12130c.class.getName().hashCode() * 31) + this.f56222a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f56222a + CoreConstants.CURLY_RIGHT;
            }

            public C12130c(C12124b c12124b) {
                this.f56222a = c12124b;
            }
        }

        /* renamed from: a */
        public static AbstractC12127a m65564a() {
            return new C12128a();
        }

        /* renamed from: b */
        public static AbstractC12127a m65563b() {
            return new C12129b();
        }

        /* renamed from: c */
        public static AbstractC12127a m65562c() {
            return new C12130c();
        }

        /* renamed from: d */
        public static AbstractC12127a m65561d(C12124b c12124b) {
            return new C12130c(c12124b);
        }
    }

    public AbstractC12126c(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.f56217b = context;
                this.f56218c = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    /* renamed from: b */
    public final Context m65576b() {
        return this.f56217b;
    }

    /* renamed from: c */
    public Executor m65575c() {
        return this.f56218c.m65616a();
    }

    /* renamed from: d */
    public ListenableFuture<C37428Yw1> mo65574d() {
        C40645ew5 m42377t = C40645ew5.m42377t();
        m42377t.mo7593q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return m42377t;
    }

    /* renamed from: e */
    public final UUID m65573e() {
        return this.f56218c.m65614c();
    }

    /* renamed from: g */
    public final C12124b m65572g() {
        return this.f56218c.m65613d();
    }

    /* renamed from: h */
    public final int m65571h() {
        return this.f56218c.m65612e();
    }

    /* renamed from: i */
    public InterfaceC45160mZ5 m65570i() {
        return this.f56218c.m65611f();
    }

    /* renamed from: j */
    public QG6 m65569j() {
        return this.f56218c.m65610g();
    }

    /* renamed from: k */
    public final boolean m65568k() {
        return this.f56219d;
    }

    /* renamed from: l */
    public final boolean m65567l() {
        return this.f56220e;
    }

    /* renamed from: m */
    public void mo65465m() {
    }

    /* renamed from: n */
    public final void m65566n() {
        this.f56220e = true;
    }

    /* renamed from: o */
    public abstract ListenableFuture<AbstractC12127a> mo65464o();

    /* renamed from: p */
    public final void m65565p() {
        this.f56219d = true;
        mo65465m();
    }
}
