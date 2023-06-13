package com.uber.rxdogtag;

import com.uber.rxdogtag.C19549M;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC24541s;
import io.reactivex.Observable;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.observers.InterfaceC24502f;
import io.reactivex.plugins.C24508a;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* renamed from: com.uber.rxdogtag.M */
/* loaded from: classes7.dex */
public final class C19549M {

    /* renamed from: com.uber.rxdogtag.M$a */
    /* loaded from: classes7.dex */
    public static final class C19550a {

        /* renamed from: a */
        public boolean f75593a = true;

        /* renamed from: b */
        public boolean f75594b = false;

        /* renamed from: c */
        public List<InterfaceC19541E> f75595c = new ArrayList();

        /* renamed from: d */
        public Set<String> f75596d = new LinkedHashSet();

        /* renamed from: e */
        public boolean f75597e = true;

        /* renamed from: a */
        public C19550a m45132a(Collection<String> collection) {
            this.f75596d.addAll(collection);
            return this;
        }

        /* renamed from: b */
        public C19550a m45131b(Collection<InterfaceC19541E> collection) {
            this.f75595c.addAll(collection);
            return this;
        }

        /* renamed from: c */
        public C19550a m45130c(InterfaceC19541E... interfaceC19541EArr) {
            return m45131b(Arrays.asList(interfaceC19541EArr));
        }

        /* renamed from: d */
        public C19550a m45129d(InterfaceC19553c interfaceC19553c) {
            interfaceC19553c.mo562a(this);
            return this;
        }

        /* renamed from: e */
        public void m45128e() {
            C19549M.m45142o(new C19551b(this));
        }
    }

    /* renamed from: com.uber.rxdogtag.M$b */
    /* loaded from: classes7.dex */
    public static class C19551b {

        /* renamed from: f */
        public static final Collection<String> f75598f = Arrays.asList(Observable.class.getPackage().getName(), DogTagObserver.class.getPackage().getName());

        /* renamed from: g */
        public static final InterfaceC19541E f75599g = new C19552a();

        /* renamed from: a */
        public final boolean f75600a;

        /* renamed from: b */
        public final List<InterfaceC19541E> f75601b;

        /* renamed from: c */
        public final Set<String> f75602c;

        /* renamed from: d */
        public final boolean f75603d;

        /* renamed from: e */
        public final boolean f75604e;

        /* renamed from: com.uber.rxdogtag.M$b$a */
        /* loaded from: classes7.dex */
        public class C19552a implements InterfaceC19541E {
        }

        public C19551b(C19550a c19550a) {
            this.f75600a = c19550a.f75594b;
            ArrayList arrayList = new ArrayList(c19550a.f75595c);
            arrayList.add(f75599g);
            LinkedHashSet linkedHashSet = new LinkedHashSet(c19550a.f75596d);
            linkedHashSet.addAll(f75598f);
            this.f75601b = Collections.unmodifiableList(arrayList);
            this.f75602c = Collections.unmodifiableSet(linkedHashSet);
            this.f75603d = c19550a.f75597e;
            this.f75604e = c19550a.f75593a;
        }
    }

    /* renamed from: com.uber.rxdogtag.M$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC19553c {
        /* renamed from: a */
        void mo562a(C19550a c19550a);
    }

    /* renamed from: com.uber.rxdogtag.M$d */
    /* loaded from: classes7.dex */
    public interface InterfaceC19554d<T> {
        void accept(T t);
    }

    /* renamed from: com.uber.rxdogtag.M$e */
    /* loaded from: classes7.dex */
    public interface InterfaceC19555e<T> {
        boolean test(T t);
    }

    private C19549M() {
        throw new InstantiationError();
    }

    /* renamed from: i */
    public static C19550a m45148i() {
        return new C19550a();
    }

    /* renamed from: j */
    public static boolean m45147j(String str, Set<String> set) {
        for (String str2 : set) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static OnErrorNotImplementedException m45146k(C19551b c19551b, Throwable th, Throwable th2, String str) {
        OnErrorNotImplementedException onErrorNotImplementedException;
        int i;
        int i2;
        StackTraceElement[] stackTraceElementArr;
        StackTraceElement m45145l = m45145l(th, c19551b.f75602c);
        if (c19551b.f75603d && (th2 instanceof OnErrorNotImplementedException)) {
            th2 = th2.getCause();
        }
        if (th2 instanceof OnErrorNotImplementedException) {
            OnErrorNotImplementedException onErrorNotImplementedException2 = (OnErrorNotImplementedException) th2;
            onErrorNotImplementedException = onErrorNotImplementedException2;
            th2 = onErrorNotImplementedException2.getCause();
        } else {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            onErrorNotImplementedException = new OnErrorNotImplementedException(message, th2);
            onErrorNotImplementedException.setStackTrace(new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        char c = 3;
        if (str != null) {
            i = 4;
        } else {
            i = 3;
        }
        if (c19551b.f75600a) {
            stackTraceElementArr = new StackTraceElement[stackTrace.length + 1];
            stackTraceElementArr[0] = m45145l;
            if (stackTrace.length != 0) {
                System.arraycopy(stackTrace, 0, stackTraceElementArr, 1, stackTrace.length);
            }
        } else {
            int m45143n = m45143n(stackTrace, new InterfaceC19555e() { // from class: com.uber.rxdogtag.F
                @Override // com.uber.rxdogtag.C19549M.InterfaceC19555e
                public final boolean test(Object obj) {
                    boolean m45141p;
                    m45141p = C19549M.m45141p((StackTraceElement) obj);
                    return m45141p;
                }
            });
            if (m45143n != -1) {
                i2 = m45143n + 1;
            } else {
                i2 = 0;
            }
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[(stackTrace.length + i) - i2];
            stackTraceElementArr2[0] = m45145l;
            stackTraceElementArr2[1] = new StackTraceElement("[[ ↑↑ Inferred subscribe point ↑↑ ]]", "", "", 0);
            if (str != null) {
                stackTraceElementArr2[2] = new StackTraceElement(String.format(Locale.US, "[[ Originating callback: %s ]]", str), "", "", 0);
            } else {
                c = 2;
            }
            stackTraceElementArr2[c] = new StackTraceElement("[[ ↓↓ Original trace ↓↓ ]]", "", "", 0);
            if (stackTrace.length != 0) {
                System.arraycopy(stackTrace, i2, stackTraceElementArr2, i, stackTrace.length - i2);
            }
            stackTraceElementArr = stackTraceElementArr2;
        }
        th2.setStackTrace(stackTraceElementArr);
        return onErrorNotImplementedException;
    }

    /* renamed from: l */
    public static StackTraceElement m45145l(Throwable th, Set<String> set) {
        StackTraceElement[] stackTrace;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!m45147j(stackTraceElement.getClassName(), set)) {
                return stackTraceElement;
            }
        }
        return new StackTraceElement("Unknown", "unknown", "unknown", 0);
    }

    /* renamed from: m */
    public static void m45144m(final InterfaceC19554d<Throwable> interfaceC19554d, Runnable runnable) {
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        try {
            try {
                Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.uber.rxdogtag.L
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th) {
                        C19549M.m45140q(uncaughtExceptionHandler, interfaceC19554d, thread, th);
                    }
                });
                runnable.run();
            } finally {
                Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
        } catch (OnErrorNotImplementedException e) {
            interfaceC19554d.accept(e.getCause());
        } catch (Throwable th) {
            interfaceC19554d.accept(th);
        }
    }

    /* renamed from: n */
    public static <T> int m45143n(T[] tArr, InterfaceC19555e<T> interfaceC19555e) {
        for (int length = tArr.length - 1; length >= 0; length--) {
            if (interfaceC19555e.test(tArr[length])) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public static synchronized void m45142o(final C19551b c19551b) {
        synchronized (C19549M.class) {
            C24508a.m32011H(new InterfaceC23480c() { // from class: com.uber.rxdogtag.G
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    InterfaceC23436D m45139r;
                    m45139r = C19549M.m45139r(C19549M.C19551b.this, (Observable) obj, (InterfaceC23436D) obj2);
                    return m45139r;
                }
            });
            C24508a.m32013F(new InterfaceC23480c() { // from class: com.uber.rxdogtag.H
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    InterfaceC42141hT5 m45138s;
                    m45138s = C19549M.m45138s(C19549M.C19551b.this, (AbstractC24490k) obj, (InterfaceC42141hT5) obj2);
                    return m45138s;
                }
            });
            C24508a.m32010I(new InterfaceC23480c() { // from class: com.uber.rxdogtag.I
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    InterfaceC23445I m45137t;
                    m45137t = C19549M.m45137t(C19549M.C19551b.this, (AbstractC23442F) obj, (InterfaceC23445I) obj2);
                    return m45137t;
                }
            });
            C24508a.m32012G(new InterfaceC23480c() { // from class: com.uber.rxdogtag.J
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    InterfaceC24541s m45136u;
                    m45136u = C19549M.m45136u(C19549M.C19551b.this, (AbstractC24507p) obj, (InterfaceC24541s) obj2);
                    return m45136u;
                }
            });
            C24508a.m32014E(new InterfaceC23480c() { // from class: com.uber.rxdogtag.K
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    InterfaceC23476f m45135v;
                    m45135v = C19549M.m45135v(C19549M.C19551b.this, (AbstractC23461c) obj, (InterfaceC23476f) obj2);
                    return m45135v;
                }
            });
        }
    }

    /* renamed from: p */
    public static /* synthetic */ boolean m45141p(StackTraceElement stackTraceElement) {
        return "[[ ↓↓ Original trace ↓↓ ]]".equals(stackTraceElement.getClassName());
    }

    /* renamed from: q */
    public static /* synthetic */ void m45140q(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC19554d interfaceC19554d, Thread thread, Throwable th) {
        Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
        if (th instanceof OnErrorNotImplementedException) {
            interfaceC19554d.accept(th);
        } else if ((th instanceof NullPointerException) && "subscribeActual failed".equals(th.getMessage())) {
            interfaceC19554d.accept(th.getCause());
        } else {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: r */
    public static /* synthetic */ InterfaceC23436D m45139r(C19551b c19551b, Observable observable, InterfaceC23436D interfaceC23436D) throws Exception {
        for (InterfaceC19541E interfaceC19541E : c19551b.f75601b) {
            if (m45133x(interfaceC19541E.mo45124c(observable, interfaceC23436D))) {
                return new DogTagObserver(c19551b, interfaceC23436D);
            }
        }
        return interfaceC23436D;
    }

    /* renamed from: s */
    public static /* synthetic */ InterfaceC42141hT5 m45138s(C19551b c19551b, AbstractC24490k abstractC24490k, InterfaceC42141hT5 interfaceC42141hT5) throws Exception {
        for (InterfaceC19541E interfaceC19541E : c19551b.f75601b) {
            if (m45133x(interfaceC19541E.mo45126a(abstractC24490k, interfaceC42141hT5))) {
                return new C19540D(c19551b, interfaceC42141hT5);
            }
        }
        return interfaceC42141hT5;
    }

    /* renamed from: t */
    public static /* synthetic */ InterfaceC23445I m45137t(C19551b c19551b, AbstractC23442F abstractC23442F, InterfaceC23445I interfaceC23445I) throws Exception {
        for (InterfaceC19541E interfaceC19541E : c19551b.f75601b) {
            if (m45133x(interfaceC19541E.mo45125b(abstractC23442F, interfaceC23445I))) {
                return new C19580w(c19551b, interfaceC23445I);
            }
        }
        return interfaceC23445I;
    }

    /* renamed from: u */
    public static /* synthetic */ InterfaceC24541s m45136u(C19551b c19551b, AbstractC24507p abstractC24507p, InterfaceC24541s interfaceC24541s) throws Exception {
        for (InterfaceC19541E interfaceC19541E : c19551b.f75601b) {
            if (m45133x(interfaceC19541E.mo45122e(abstractC24507p, interfaceC24541s))) {
                return new C19569l(c19551b, interfaceC24541s);
            }
        }
        return interfaceC24541s;
    }

    /* renamed from: v */
    public static /* synthetic */ InterfaceC23476f m45135v(C19551b c19551b, AbstractC23461c abstractC23461c, InterfaceC23476f interfaceC23476f) throws Exception {
        for (InterfaceC19541E interfaceC19541E : c19551b.f75601b) {
            if (m45133x(interfaceC19541E.mo45123d(abstractC23461c, interfaceC23476f))) {
                return new C19562e(c19551b, interfaceC23476f);
            }
        }
        return interfaceC23476f;
    }

    /* renamed from: w */
    public static void m45134w(C19551b c19551b, Throwable th, Throwable th2, String str) {
        C24508a.m31988u(m45146k(c19551b, th, th2, str));
    }

    /* renamed from: x */
    public static boolean m45133x(Object obj) {
        if (obj instanceof InterfaceC24502f) {
            return !((InterfaceC24502f) obj).hasCustomOnError();
        }
        return false;
    }
}
