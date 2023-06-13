package io.reactivex.exceptions;

import ch.qos.logback.classic.net.SyslogAppender;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes6.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: b */
    public final List<Throwable> f88233b;

    /* renamed from: c */
    public final String f88234c;

    /* renamed from: d */
    public Throwable f88235d;

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    /* loaded from: classes6.dex */
    public static final class C23471a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC23472b {
        /* renamed from: a */
        public abstract void mo33011a(Object obj);
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    /* loaded from: classes6.dex */
    public static final class C23473c extends AbstractC23472b {

        /* renamed from: a */
        public final PrintStream f88236a;

        public C23473c(PrintStream printStream) {
            this.f88236a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.AbstractC23472b
        /* renamed from: a */
        public void mo33011a(Object obj) {
            this.f88236a.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$d */
    /* loaded from: classes6.dex */
    public static final class C23474d extends AbstractC23472b {

        /* renamed from: a */
        public final PrintWriter f88237a;

        public C23474d(PrintWriter printWriter) {
            this.f88237a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.AbstractC23472b
        /* renamed from: a */
        public void mo33011a(Object obj) {
            this.f88237a.println(obj);
        }
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    public final void m33016a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m33016a(sb, th.getCause(), "");
        }
    }

    /* renamed from: b */
    public List<Throwable> m33015b() {
        return this.f88233b;
    }

    /* renamed from: c */
    public final List<Throwable> m33014c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public Throwable m33013d(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null && th != cause) {
            while (true) {
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
            return cause;
        }
        return th;
    }

    /* renamed from: e */
    public final void m33012e(AbstractC23472b abstractC23472b) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f88233b) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m33016a(sb, th, SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            i++;
        }
        abstractC23472b.mo33011a(sb.toString());
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f88235d == null) {
            C23471a c23471a = new C23471a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f88233b.iterator();
            C23471a c23471a2 = c23471a;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th : m33014c(next)) {
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        c23471a2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    c23471a2 = m33013d(c23471a2);
                }
            }
            this.f88235d = c23471a;
        }
        return this.f88235d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f88234c;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m33012e(new C23473c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m33012e(new C23474d(printWriter));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).m33015b());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f88233b = unmodifiableList;
            this.f88234c = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
