package p000;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C47274q72;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u000e\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020:09¢\u0006\u0004\b<\u0010=J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0014R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010*\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010-\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00105\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b\u0017\u00102R\u0011\u00108\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b\u001d\u00107¨\u0006>"}, m28432d2 = {"LKb5;", "T", "Landroidx/lifecycle/LiveData;", "", "onActive", "onInactive", "LEb5;", C17296a.f69688o, "LEb5;", "getDatabase", "()LEb5;", "database", "Ln72;", "b", "Ln72;", "container", "", "c", "Z", "getInTransaction", "()Z", "inTransaction", "Ljava/util/concurrent/Callable;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Callable;", "getComputeFunction", "()Ljava/util/concurrent/Callable;", "computeFunction", "Lq72$c;", "e", "Lq72$c;", "getObserver", "()Lq72$c;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "g", "getComputing", "computing", "h", "getRegisteredObserver", "registeredObserver", "Ljava/lang/Runnable;", "i", "Ljava/lang/Runnable;", "getRefreshRunnable", "()Ljava/lang/Runnable;", "refreshRunnable", "j", "invalidationRunnable", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "queryExecutor", "", "", "tableNames", "<init>", "(LEb5;Ln72;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
@SuppressLint({"RestrictedApi"})
/* renamed from: Kb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33967Kb5<T> extends LiveData<T> {

    /* renamed from: a */
    public final AbstractC32563Eb5 f19891a;

    /* renamed from: b */
    public final C45495n72 f19892b;

    /* renamed from: c */
    public final boolean f19893c;

    /* renamed from: d */
    public final Callable<T> f19894d;

    /* renamed from: e */
    public final C47274q72.AbstractC27505c f19895e;

    /* renamed from: f */
    public final AtomicBoolean f19896f;

    /* renamed from: g */
    public final AtomicBoolean f19897g;

    /* renamed from: h */
    public final AtomicBoolean f19898h;

    /* renamed from: i */
    public final Runnable f19899i;

    /* renamed from: j */
    public final Runnable f19900j;

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"Kb5$a", "Lq72$c;", "", "", "tables", "", "c", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Kb5$a */
    /* loaded from: classes.dex */
    public static final class C4496a extends C47274q72.AbstractC27505c {

        /* renamed from: b */
        public final /* synthetic */ C33967Kb5<T> f19901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4496a(String[] strArr, C33967Kb5<T> c33967Kb5) {
            super(strArr);
            this.f19901b = c33967Kb5;
        }

        @Override // p000.C47274q72.AbstractC27505c
        /* renamed from: c */
        public void mo18111c(Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            C1988Em.m108396h().m23535b(this.f19901b.m98708d());
        }
    }

    public C33967Kb5(AbstractC32563Eb5 database, C45495n72 container, boolean z, Callable<T> computeFunction, String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f19891a = database;
        this.f19892b = container;
        this.f19893c = z;
        this.f19894d = computeFunction;
        this.f19895e = new C4496a(tableNames, this);
        this.f19896f = new AtomicBoolean(true);
        this.f19897g = new AtomicBoolean(false);
        this.f19898h = new AtomicBoolean(false);
        this.f19899i = new Runnable() { // from class: Ib5
            @Override // java.lang.Runnable
            public final void run() {
                C33967Kb5.m98705g(C33967Kb5.this);
            }
        };
        this.f19900j = new Runnable() { // from class: Jb5
            @Override // java.lang.Runnable
            public final void run() {
                C33967Kb5.m98706f(C33967Kb5.this);
            }
        };
    }

    /* renamed from: f */
    public static final void m98706f(C33967Kb5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean hasActiveObservers = this$0.hasActiveObservers();
        if (this$0.f19896f.compareAndSet(false, true) && hasActiveObservers) {
            this$0.m98707e().execute(this$0.f19899i);
        }
    }

    /* renamed from: g */
    public static final void m98705g(C33967Kb5 this$0) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f19898h.compareAndSet(false, true)) {
            this$0.f19891a.m108725k().m18143d(this$0.f19895e);
        }
        do {
            if (this$0.f19897g.compareAndSet(false, true)) {
                T t = null;
                z = false;
                while (this$0.f19896f.compareAndSet(true, false)) {
                    try {
                        try {
                            t = this$0.f19894d.call();
                            z = true;
                        } catch (Exception e) {
                            throw new RuntimeException("Exception while computing database live data.", e);
                        }
                    } finally {
                        this$0.f19897g.set(false);
                    }
                }
                if (z) {
                    this$0.postValue(t);
                }
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
        } while (this$0.f19896f.get());
    }

    /* renamed from: d */
    public final Runnable m98708d() {
        return this.f19900j;
    }

    /* renamed from: e */
    public final Executor m98707e() {
        if (this.f19893c) {
            return this.f19891a.m108722p();
        }
        return this.f19891a.m108723m();
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        C45495n72 c45495n72 = this.f19892b;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        c45495n72.m24314b(this);
        m98707e().execute(this.f19899i);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        C45495n72 c45495n72 = this.f19892b;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        c45495n72.m24313c(this);
    }
}
