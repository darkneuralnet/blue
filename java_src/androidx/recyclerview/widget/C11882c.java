package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C11905h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public final class C11882c<T> {

    /* renamed from: a */
    public final Executor f55363a;

    /* renamed from: b */
    public final Executor f55364b;

    /* renamed from: c */
    public final C11905h.AbstractC11911f<T> f55365c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    public static final class C11883a<T> {

        /* renamed from: d */
        public static final Object f55366d = new Object();

        /* renamed from: e */
        public static Executor f55367e;

        /* renamed from: a */
        public Executor f55368a;

        /* renamed from: b */
        public Executor f55369b;

        /* renamed from: c */
        public final C11905h.AbstractC11911f<T> f55370c;

        public C11883a(C11905h.AbstractC11911f<T> abstractC11911f) {
            this.f55370c = abstractC11911f;
        }

        /* renamed from: a */
        public C11882c<T> m66328a() {
            if (this.f55369b == null) {
                synchronized (f55366d) {
                    if (f55367e == null) {
                        f55367e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f55369b = f55367e;
            }
            return new C11882c<>(this.f55368a, this.f55369b, this.f55370c);
        }
    }

    public C11882c(Executor executor, Executor executor2, C11905h.AbstractC11911f<T> abstractC11911f) {
        this.f55363a = executor;
        this.f55364b = executor2;
        this.f55365c = abstractC11911f;
    }

    /* renamed from: a */
    public Executor m66331a() {
        return this.f55364b;
    }

    /* renamed from: b */
    public C11905h.AbstractC11911f<T> m66330b() {
        return this.f55365c;
    }

    /* renamed from: c */
    public Executor m66329c() {
        return this.f55363a;
    }
}
