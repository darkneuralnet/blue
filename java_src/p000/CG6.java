package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0003\u0010\u0013\u0016B\u001d\b\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u0012\b\b\u0002\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\f\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0018\u00010\nR\u00020\u0000H\u0002J\u0014\u0010\u000e\u001a\u00020\b2\n\u0010\r\u001a\u00060\nR\u00020\u0000H\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\b\u0018\u00010\nR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0018\u00010\nR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006$"}, m28432d2 = {"LCG6;", "", "Ljava/lang/Runnable;", "callback", "", "addToFront", "LCG6$b;", "f", "", "j", "LCG6$c;", "finished", "i", "node", "h", "Ljava/util/concurrent/locks/ReentrantLock;", C17296a.f69688o, "Ljava/util/concurrent/locks/ReentrantLock;", "workLock", "b", "LCG6$c;", "pendingJobs", "c", "runningJobs", "", DateTokenConverter.CONVERTER_KEY, "I", "runningCount", "e", "maxConcurrent", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(ILjava/util/concurrent/Executor;)V", "g", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: CG6 */
/* loaded from: classes5.dex */
public final class CG6 {

    /* renamed from: g */
    public static final C0975a f3802g = new C0975a(null);

    /* renamed from: a */
    public final ReentrantLock f3803a;

    /* renamed from: b */
    public C0977c f3804b;

    /* renamed from: c */
    public C0977c f3805c;

    /* renamed from: d */
    public int f3806d;

    /* renamed from: e */
    public final int f3807e;

    /* renamed from: f */
    public final Executor f3808f;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LCG6$a;", "", "", "condition", "", "b", "", "DEFAULT_MAX_CONCURRENT", "I", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: CG6$a */
    /* loaded from: classes5.dex */
    public static final class C0975a {
        private C0975a() {
        }

        /* renamed from: b */
        public final void m112476b(boolean z) {
            if (!z) {
                throw new FacebookException("Validation failed");
            }
        }

        public /* synthetic */ C0975a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, m28432d2 = {"LCG6$b;", "", "", "cancel", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: CG6$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC0976b {
        /* renamed from: a */
        void mo112475a();

        boolean cancel();
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\t\u001a\u00060\u0000R\u00020\u00062\f\u0010\u0007\u001a\b\u0018\u00010\u0000R\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u001a\u0010\n\u001a\b\u0018\u00010\u0000R\u00020\u00062\f\u0010\u0007\u001a\b\u0018\u00010\u0000R\u00020\u0006R0\u0010\u000f\u001a\b\u0018\u00010\u0000R\u00020\u00062\f\u0010\u000b\u001a\b\u0018\u00010\u0000R\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\b\u0018\u00010\u0000R\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\"\u0010\u0017\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0011\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LCG6$c;", "LCG6$b;", "", "cancel", "", C17296a.f69688o, "LCG6;", "list", "addToFront", "b", "e", "<set-?>", "LCG6$c;", "getNext", "()LCG6$c;", "next", "prev", "c", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "f", "(Z)V", "isRunning", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "callback", "<init>", "(LCG6;Ljava/lang/Runnable;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: CG6$c */
    /* loaded from: classes5.dex */
    public final class C0977c implements InterfaceC0976b {

        /* renamed from: a */
        public C0977c f3809a;

        /* renamed from: b */
        public C0977c f3810b;

        /* renamed from: c */
        public boolean f3811c;

        /* renamed from: d */
        public final Runnable f3812d;

        /* renamed from: e */
        public final /* synthetic */ CG6 f3813e;

        public C0977c(CG6 cg6, Runnable callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f3813e = cg6;
            this.f3812d = callback;
        }

        @Override // p000.CG6.InterfaceC0976b
        /* renamed from: a */
        public void mo112475a() {
            ReentrantLock reentrantLock = this.f3813e.f3803a;
            reentrantLock.lock();
            try {
                if (!m112472d()) {
                    CG6 cg6 = this.f3813e;
                    cg6.f3804b = m112471e(cg6.f3804b);
                    CG6 cg62 = this.f3813e;
                    cg62.f3804b = m112474b(cg62.f3804b, true);
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        public final C0977c m112474b(C0977c c0977c, boolean z) {
            boolean z2;
            C0977c c0977c2;
            C0975a c0975a = CG6.f3802g;
            boolean z3 = true;
            if (this.f3809a == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            c0975a.m112476b(z2);
            if (this.f3810b != null) {
                z3 = false;
            }
            c0975a.m112476b(z3);
            if (c0977c == null) {
                this.f3810b = this;
                this.f3809a = this;
                c0977c = this;
            } else {
                this.f3809a = c0977c;
                C0977c c0977c3 = c0977c.f3810b;
                this.f3810b = c0977c3;
                if (c0977c3 != null) {
                    c0977c3.f3809a = this;
                }
                C0977c c0977c4 = this.f3809a;
                if (c0977c4 != null) {
                    if (c0977c3 != null) {
                        c0977c2 = c0977c3.f3809a;
                    } else {
                        c0977c2 = null;
                    }
                    c0977c4.f3810b = c0977c2;
                }
            }
            if (z) {
                return this;
            }
            return c0977c;
        }

        /* renamed from: c */
        public final Runnable m112473c() {
            return this.f3812d;
        }

        @Override // p000.CG6.InterfaceC0976b
        public boolean cancel() {
            ReentrantLock reentrantLock = this.f3813e.f3803a;
            reentrantLock.lock();
            try {
                if (!m112472d()) {
                    CG6 cg6 = this.f3813e;
                    cg6.f3804b = m112471e(cg6.f3804b);
                    reentrantLock.unlock();
                    return true;
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return false;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* renamed from: d */
        public boolean m112472d() {
            return this.f3811c;
        }

        /* renamed from: e */
        public final C0977c m112471e(C0977c c0977c) {
            boolean z;
            C0975a c0975a = CG6.f3802g;
            boolean z2 = true;
            if (this.f3809a != null) {
                z = true;
            } else {
                z = false;
            }
            c0975a.m112476b(z);
            if (this.f3810b == null) {
                z2 = false;
            }
            c0975a.m112476b(z2);
            if (c0977c == this && (c0977c = this.f3809a) == this) {
                c0977c = null;
            }
            C0977c c0977c2 = this.f3809a;
            if (c0977c2 != null) {
                c0977c2.f3810b = this.f3810b;
            }
            C0977c c0977c3 = this.f3810b;
            if (c0977c3 != null) {
                c0977c3.f3809a = c0977c2;
            }
            this.f3810b = null;
            this.f3809a = null;
            return c0977c;
        }

        /* renamed from: f */
        public void m112470f(boolean z) {
            this.f3811c = z;
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: CG6$d */
    /* loaded from: classes5.dex */
    public static final class RunnableC0978d implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ C0977c f3815c;

        public RunnableC0978d(C0977c c0977c) {
            this.f3815c = c0977c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                this.f3815c.m112473c().run();
                CG6.this.m112479i(this.f3815c);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @JvmOverloads
    public CG6() {
        this(0, null, 3, null);
    }

    /* renamed from: g */
    public static /* synthetic */ InterfaceC0976b m112481g(CG6 cg6, Runnable runnable, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return cg6.m112482f(runnable, z);
    }

    @JvmOverloads
    /* renamed from: e */
    public final InterfaceC0976b m112483e(Runnable runnable) {
        return m112481g(this, runnable, false, 2, null);
    }

    @JvmOverloads
    /* renamed from: f */
    public final InterfaceC0976b m112482f(Runnable callback, boolean z) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C0977c c0977c = new C0977c(this, callback);
        ReentrantLock reentrantLock = this.f3803a;
        reentrantLock.lock();
        try {
            this.f3804b = c0977c.m112474b(this.f3804b, z);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            m112478j();
            return c0977c;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public final void m112480h(C0977c c0977c) {
        this.f3808f.execute(new RunnableC0978d(c0977c));
    }

    /* renamed from: i */
    public final void m112479i(C0977c c0977c) {
        C0977c c0977c2;
        this.f3803a.lock();
        if (c0977c != null) {
            this.f3805c = c0977c.m112471e(this.f3805c);
            this.f3806d--;
        }
        if (this.f3806d < this.f3807e) {
            c0977c2 = this.f3804b;
            if (c0977c2 != null) {
                this.f3804b = c0977c2.m112471e(c0977c2);
                this.f3805c = c0977c2.m112474b(this.f3805c, false);
                this.f3806d++;
                c0977c2.m112470f(true);
            }
        } else {
            c0977c2 = null;
        }
        this.f3803a.unlock();
        if (c0977c2 != null) {
            m112480h(c0977c2);
        }
    }

    /* renamed from: j */
    public final void m112478j() {
        m112479i(null);
    }

    @JvmOverloads
    public CG6(int i) {
        this(i, null, 2, null);
    }

    @JvmOverloads
    public CG6(int i, Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f3807e = i;
        this.f3808f = executor;
        this.f3803a = new ReentrantLock();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CG6(int i, Executor executor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, executor);
        i = (i2 & 1) != 0 ? 8 : i;
        if ((i2 & 2) != 0) {
            executor = C17216a.m52731o();
            Intrinsics.checkNotNullExpressionValue(executor, "FacebookSdk.getExecutor()");
        }
    }
}
