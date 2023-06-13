package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C11905h;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C11884d<T> {

    /* renamed from: h */
    public static final Executor f55371h = new ExecutorC11889c();

    /* renamed from: a */
    public final InterfaceC32011Bs2 f55372a;

    /* renamed from: b */
    public final C11882c<T> f55373b;

    /* renamed from: c */
    public Executor f55374c;

    /* renamed from: e */
    public List<T> f55376e;

    /* renamed from: g */
    public int f55378g;

    /* renamed from: d */
    public final List<InterfaceC11888b<T>> f55375d = new CopyOnWriteArrayList();

    /* renamed from: f */
    public List<T> f55377f = Collections.emptyList();

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    public class RunnableC11885a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ List f55379b;

        /* renamed from: c */
        public final /* synthetic */ List f55380c;

        /* renamed from: d */
        public final /* synthetic */ int f55381d;

        /* renamed from: e */
        public final /* synthetic */ Runnable f55382e;

        /* renamed from: androidx.recyclerview.widget.d$a$a */
        /* loaded from: classes.dex */
        public class C11886a extends C11905h.AbstractC11907b {
            public C11886a() {
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public boolean areContentsTheSame(int i, int i2) {
                Object obj = RunnableC11885a.this.f55379b.get(i);
                Object obj2 = RunnableC11885a.this.f55380c.get(i2);
                if (obj != null && obj2 != null) {
                    return C11884d.this.f55373b.m66330b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public boolean areItemsTheSame(int i, int i2) {
                Object obj = RunnableC11885a.this.f55379b.get(i);
                Object obj2 = RunnableC11885a.this.f55380c.get(i2);
                if (obj != null && obj2 != null) {
                    return C11884d.this.f55373b.m66330b().areItemsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public Object getChangePayload(int i, int i2) {
                Object obj = RunnableC11885a.this.f55379b.get(i);
                Object obj2 = RunnableC11885a.this.f55380c.get(i2);
                if (obj != null && obj2 != null) {
                    return C11884d.this.f55373b.m66330b().getChangePayload(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public int getNewListSize() {
                return RunnableC11885a.this.f55380c.size();
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public int getOldListSize() {
                return RunnableC11885a.this.f55379b.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        /* loaded from: classes.dex */
        public class RunnableC11887b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ C11905h.C11910e f55385b;

            public RunnableC11887b(C11905h.C11910e c11910e) {
                this.f55385b = c11910e;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC11885a runnableC11885a = RunnableC11885a.this;
                C11884d c11884d = C11884d.this;
                if (c11884d.f55378g == runnableC11885a.f55381d) {
                    c11884d.m66325c(runnableC11885a.f55380c, this.f55385b, runnableC11885a.f55382e);
                }
            }
        }

        public RunnableC11885a(List list, List list2, int i, Runnable runnable) {
            this.f55379b = list;
            this.f55380c = list2;
            this.f55381d = i;
            this.f55382e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11884d.this.f55374c.execute(new RunnableC11887b(C11905h.m66274b(new C11886a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11888b<T> {
        /* renamed from: a */
        void mo66175a(List<T> list, List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    public static class ExecutorC11889c implements Executor {

        /* renamed from: b */
        public final Handler f55387b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f55387b.post(runnable);
        }
    }

    public C11884d(InterfaceC32011Bs2 interfaceC32011Bs2, C11882c<T> c11882c) {
        this.f55372a = interfaceC32011Bs2;
        this.f55373b = c11882c;
        if (c11882c.m66329c() != null) {
            this.f55374c = c11882c.m66329c();
        } else {
            this.f55374c = f55371h;
        }
    }

    /* renamed from: a */
    public void m66327a(InterfaceC11888b<T> interfaceC11888b) {
        this.f55375d.add(interfaceC11888b);
    }

    /* renamed from: b */
    public List<T> m66326b() {
        return this.f55377f;
    }

    /* renamed from: c */
    public void m66325c(List<T> list, C11905h.C11910e c11910e, Runnable runnable) {
        List<T> list2 = this.f55377f;
        this.f55376e = list;
        this.f55377f = Collections.unmodifiableList(list);
        c11910e.m66262c(this.f55372a);
        m66324d(list2, runnable);
    }

    /* renamed from: d */
    public final void m66324d(List<T> list, Runnable runnable) {
        for (InterfaceC11888b<T> interfaceC11888b : this.f55375d) {
            interfaceC11888b.mo66175a(list, this.f55377f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: e */
    public void m66323e(List<T> list) {
        m66322f(list, null);
    }

    /* renamed from: f */
    public void m66322f(List<T> list, Runnable runnable) {
        int i = this.f55378g + 1;
        this.f55378g = i;
        List<T> list2 = this.f55376e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f55377f;
        if (list == null) {
            int size = list2.size();
            this.f55376e = null;
            this.f55377f = Collections.emptyList();
            this.f55372a.onRemoved(0, size);
            m66324d(list3, runnable);
        } else if (list2 == null) {
            this.f55376e = list;
            this.f55377f = Collections.unmodifiableList(list);
            this.f55372a.onInserted(0, list.size());
            m66324d(list3, runnable);
        } else {
            this.f55373b.m66331a().execute(new RunnableC11885a(list2, list, i, runnable));
        }
    }
}
