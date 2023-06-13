package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes6.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final C37339Ym2<ScheduledExecutorService> f74240a = new C37339Ym2<>(new X94() { // from class: Mh1
        @Override // p000.X94
        public final Object get() {
            ScheduledExecutorService m47353p;
            m47353p = ExecutorsRegistrar.m47353p();
            return m47353p;
        }
    });

    /* renamed from: b */
    public static final C37339Ym2<ScheduledExecutorService> f74241b = new C37339Ym2<>(new X94() { // from class: Nh1
        @Override // p000.X94
        public final Object get() {
            ScheduledExecutorService m47352q;
            m47352q = ExecutorsRegistrar.m47352q();
            return m47352q;
        }
    });

    /* renamed from: c */
    public static final C37339Ym2<ScheduledExecutorService> f74242c = new C37339Ym2<>(new X94() { // from class: Oh1
        @Override // p000.X94
        public final Object get() {
            ScheduledExecutorService m47351r;
            m47351r = ExecutorsRegistrar.m47351r();
            return m47351r;
        }
    });

    /* renamed from: d */
    public static final C37339Ym2<ScheduledExecutorService> f74243d = new C37339Ym2<>(new X94() { // from class: Ph1
        @Override // p000.X94
        public final Object get() {
            ScheduledExecutorService m47350s;
            m47350s = ExecutorsRegistrar.m47350s();
            return m47350s;
        }
    });

    /* renamed from: i */
    public static StrictMode.ThreadPolicy m47360i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: j */
    public static ThreadFactory m47359j(String str, int i) {
        return new DF0(str, i, null);
    }

    /* renamed from: k */
    public static ThreadFactory m47358k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new DF0(str, i, threadPolicy);
    }

    /* renamed from: l */
    public static /* synthetic */ ScheduledExecutorService m47357l(InterfaceC35051Os0 interfaceC35051Os0) {
        return f74240a.get();
    }

    /* renamed from: m */
    public static /* synthetic */ ScheduledExecutorService m47356m(InterfaceC35051Os0 interfaceC35051Os0) {
        return f74242c.get();
    }

    /* renamed from: n */
    public static /* synthetic */ ScheduledExecutorService m47355n(InterfaceC35051Os0 interfaceC35051Os0) {
        return f74241b.get();
    }

    /* renamed from: p */
    public static /* synthetic */ ScheduledExecutorService m47353p() {
        return m47348u(Executors.newFixedThreadPool(4, m47358k("Firebase Background", 10, m47360i())));
    }

    /* renamed from: q */
    public static /* synthetic */ ScheduledExecutorService m47352q() {
        return m47348u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), m47358k("Firebase Lite", 0, m47349t())));
    }

    /* renamed from: r */
    public static /* synthetic */ ScheduledExecutorService m47351r() {
        return m47348u(Executors.newCachedThreadPool(m47359j("Firebase Blocking", 11)));
    }

    /* renamed from: s */
    public static /* synthetic */ ScheduledExecutorService m47350s() {
        return Executors.newSingleThreadScheduledExecutor(m47359j("Firebase Scheduler", 0));
    }

    /* renamed from: t */
    public static StrictMode.ThreadPolicy m47349t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* renamed from: u */
    public static ScheduledExecutorService m47348u(ExecutorService executorService) {
        return new PZ0(executorService, f74243d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        return Arrays.asList(C32711Es0.m108310d(C52292yb4.m3203a(InterfaceC10076Yv.class, ScheduledExecutorService.class), C52292yb4.m3203a(InterfaceC10076Yv.class, ExecutorService.class), C52292yb4.m3203a(InterfaceC10076Yv.class, Executor.class)).m108288f(new InterfaceC36455Us0() { // from class: Qh1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                ScheduledExecutorService m47357l;
                m47357l = ExecutorsRegistrar.m47357l(interfaceC35051Os0);
                return m47357l;
            }
        }).m108290d(), C32711Es0.m108310d(C52292yb4.m3203a(InterfaceC8305UW.class, ScheduledExecutorService.class), C52292yb4.m3203a(InterfaceC8305UW.class, ExecutorService.class), C52292yb4.m3203a(InterfaceC8305UW.class, Executor.class)).m108288f(new InterfaceC36455Us0() { // from class: Rh1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                ScheduledExecutorService m47356m;
                m47356m = ExecutorsRegistrar.m47356m(interfaceC35051Os0);
                return m47356m;
            }
        }).m108290d(), C32711Es0.m108310d(C52292yb4.m3203a(InterfaceC36673Vq2.class, ScheduledExecutorService.class), C52292yb4.m3203a(InterfaceC36673Vq2.class, ExecutorService.class), C52292yb4.m3203a(InterfaceC36673Vq2.class, Executor.class)).m108288f(new InterfaceC36455Us0() { // from class: Sh1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                ScheduledExecutorService m47355n;
                m47355n = ExecutorsRegistrar.m47355n(interfaceC35051Os0);
                return m47355n;
            }
        }).m108290d(), C32711Es0.m108311c(C52292yb4.m3203a(InterfaceC52314yd6.class, Executor.class)).m108288f(new InterfaceC36455Us0() { // from class: Th1
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                Executor executor;
                executor = EnumC51128wd6.INSTANCE;
                return executor;
            }
        }).m108290d());
    }
}
