package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: androidx.work.a */
/* loaded from: classes.dex */
public final class C12120a {

    /* renamed from: a */
    public final Executor f56185a;

    /* renamed from: b */
    public final Executor f56186b;

    /* renamed from: c */
    public final QG6 f56187c;

    /* renamed from: d */
    public final AbstractC42490i32 f56188d;

    /* renamed from: e */
    public final InterfaceC41048fd5 f56189e;

    /* renamed from: f */
    public final InterfaceC48378rz0<Throwable> f56190f;

    /* renamed from: g */
    public final InterfaceC48378rz0<Throwable> f56191g;

    /* renamed from: h */
    public final String f56192h;

    /* renamed from: i */
    public final int f56193i;

    /* renamed from: j */
    public final int f56194j;

    /* renamed from: k */
    public final int f56195k;

    /* renamed from: l */
    public final int f56196l;

    /* renamed from: m */
    public final boolean f56197m;

    /* renamed from: androidx.work.a$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC12121a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f56198b = new AtomicInteger(0);

        /* renamed from: c */
        public final /* synthetic */ boolean f56199c;

        public ThreadFactoryC12121a(boolean z) {
            this.f56199c = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str;
            if (this.f56199c) {
                str = "WM.task-";
            } else {
                str = "androidx.work-";
            }
            return new Thread(runnable, str + this.f56198b.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.a$b */
    /* loaded from: classes.dex */
    public static final class C12122b {

        /* renamed from: a */
        public Executor f56201a;

        /* renamed from: b */
        public QG6 f56202b;

        /* renamed from: c */
        public AbstractC42490i32 f56203c;

        /* renamed from: d */
        public Executor f56204d;

        /* renamed from: e */
        public InterfaceC41048fd5 f56205e;

        /* renamed from: f */
        public InterfaceC48378rz0<Throwable> f56206f;

        /* renamed from: g */
        public InterfaceC48378rz0<Throwable> f56207g;

        /* renamed from: h */
        public String f56208h;

        /* renamed from: i */
        public int f56209i = 4;

        /* renamed from: j */
        public int f56210j = 0;

        /* renamed from: k */
        public int f56211k = Integer.MAX_VALUE;

        /* renamed from: l */
        public int f56212l = 20;

        /* renamed from: a */
        public C12120a m65595a() {
            return new C12120a(this);
        }
    }

    /* renamed from: androidx.work.a$c */
    /* loaded from: classes.dex */
    public interface InterfaceC12123c {
        /* renamed from: a */
        C12120a m65594a();
    }

    public C12120a(C12122b c12122b) {
        Executor executor = c12122b.f56201a;
        if (executor == null) {
            this.f56185a = m65609a(false);
        } else {
            this.f56185a = executor;
        }
        Executor executor2 = c12122b.f56204d;
        if (executor2 == null) {
            this.f56197m = true;
            this.f56186b = m65609a(true);
        } else {
            this.f56197m = false;
            this.f56186b = executor2;
        }
        QG6 qg6 = c12122b.f56202b;
        if (qg6 == null) {
            this.f56187c = QG6.m88675c();
        } else {
            this.f56187c = qg6;
        }
        AbstractC42490i32 abstractC42490i32 = c12122b.f56203c;
        if (abstractC42490i32 == null) {
            this.f56188d = AbstractC42490i32.m34532c();
        } else {
            this.f56188d = abstractC42490i32;
        }
        InterfaceC41048fd5 interfaceC41048fd5 = c12122b.f56205e;
        if (interfaceC41048fd5 == null) {
            this.f56189e = new C50481vY0();
        } else {
            this.f56189e = interfaceC41048fd5;
        }
        this.f56193i = c12122b.f56209i;
        this.f56194j = c12122b.f56210j;
        this.f56195k = c12122b.f56211k;
        this.f56196l = c12122b.f56212l;
        this.f56190f = c12122b.f56206f;
        this.f56191g = c12122b.f56207g;
        this.f56192h = c12122b.f56208h;
    }

    /* renamed from: a */
    public final Executor m65609a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m65608b(z));
    }

    /* renamed from: b */
    public final ThreadFactory m65608b(boolean z) {
        return new ThreadFactoryC12121a(z);
    }

    /* renamed from: c */
    public String m65607c() {
        return this.f56192h;
    }

    /* renamed from: d */
    public Executor m65606d() {
        return this.f56185a;
    }

    /* renamed from: e */
    public InterfaceC48378rz0<Throwable> m65605e() {
        return this.f56190f;
    }

    /* renamed from: f */
    public AbstractC42490i32 m65604f() {
        return this.f56188d;
    }

    /* renamed from: g */
    public int m65603g() {
        return this.f56195k;
    }

    /* renamed from: h */
    public int m65602h() {
        return this.f56196l;
    }

    /* renamed from: i */
    public int m65601i() {
        return this.f56194j;
    }

    /* renamed from: j */
    public int m65600j() {
        return this.f56193i;
    }

    /* renamed from: k */
    public InterfaceC41048fd5 m65599k() {
        return this.f56189e;
    }

    /* renamed from: l */
    public InterfaceC48378rz0<Throwable> m65598l() {
        return this.f56191g;
    }

    /* renamed from: m */
    public Executor m65597m() {
        return this.f56186b;
    }

    /* renamed from: n */
    public QG6 m65596n() {
        return this.f56187c;
    }
}
