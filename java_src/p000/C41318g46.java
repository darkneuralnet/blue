package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* renamed from: g46  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41318g46 {

    /* renamed from: a */
    public static final AbstractC20723b[] f81525a;

    /* renamed from: c */
    public static volatile AbstractC20723b[] f81527c;

    /* renamed from: b */
    public static final List<AbstractC20723b> f81526b = new ArrayList();

    /* renamed from: d */
    public static final AbstractC20723b f81528d = new C20722a();

    /* renamed from: g46$a */
    /* loaded from: classes8.dex */
    public static class C20722a extends AbstractC20723b {
        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: a */
        public void mo7228a(String str, Object... objArr) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7228a(str, objArr);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: b */
        public void mo7227b(Throwable th) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7227b(th);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: d */
        public void mo7226d(Throwable th, String str, Object... objArr) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7226d(th, str, objArr);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: e */
        public void mo7225e(String str, Object... objArr) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7225e(str, objArr);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: f */
        public void mo7224f(Throwable th) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7224f(th);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: j */
        public void mo7223j(Throwable th, String str, Object... objArr) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7223j(th, str, objArr);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: o */
        public void mo7221o(String str, Object... objArr) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7221o(str, objArr);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: p */
        public void mo7220p(Throwable th, String str, Object... objArr) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7220p(th, str, objArr);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: t */
        public void mo7218t(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: u */
        public void mo7217u(int i, String str, Object... objArr) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7217u(i, str, objArr);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: w */
        public void mo7215w(String str, Object... objArr) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7215w(str, objArr);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: x */
        public void mo7214x(String str, Object... objArr) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7214x(str, objArr);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: y */
        public void mo7213y(Throwable th) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7213y(th);
            }
        }

        @Override // p000.C41318g46.AbstractC20723b
        /* renamed from: z */
        public void mo7212z(Throwable th, String str, Object... objArr) {
            for (AbstractC20723b abstractC20723b : C41318g46.f81527c) {
                abstractC20723b.mo7212z(th, str, objArr);
            }
        }
    }

    /* renamed from: g46$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC20723b {

        /* renamed from: b */
        public final ThreadLocal<String> f81529b = new ThreadLocal<>();

        /* renamed from: a */
        public void mo7228a(String str, Object... objArr) {
            m40144v(3, null, str, objArr);
        }

        /* renamed from: b */
        public void mo7227b(Throwable th) {
            m40144v(3, th, null, new Object[0]);
        }

        /* renamed from: d */
        public void mo7226d(Throwable th, String str, Object... objArr) {
            m40144v(3, th, str, objArr);
        }

        /* renamed from: e */
        public void mo7225e(String str, Object... objArr) {
            m40144v(6, null, str, objArr);
        }

        /* renamed from: f */
        public void mo7224f(Throwable th) {
            m40144v(6, th, null, new Object[0]);
        }

        /* renamed from: j */
        public void mo7223j(Throwable th, String str, Object... objArr) {
            m40144v(6, th, str, objArr);
        }

        /* renamed from: k */
        public String m40148k(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        /* renamed from: l */
        public final String m40147l(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public String m40146n() {
            String str = this.f81529b.get();
            if (str != null) {
                this.f81529b.remove();
            }
            return str;
        }

        /* renamed from: o */
        public void mo7221o(String str, Object... objArr) {
            m40144v(4, null, str, objArr);
        }

        /* renamed from: p */
        public void mo7220p(Throwable th, String str, Object... objArr) {
            m40144v(4, th, str, objArr);
        }

        @Deprecated
        /* renamed from: q */
        public boolean m40145q(int i) {
            return true;
        }

        /* renamed from: s */
        public boolean mo7219s(String str, int i) {
            return m40145q(i);
        }

        /* renamed from: t */
        public abstract void mo7218t(int i, String str, String str2, Throwable th);

        /* renamed from: u */
        public void mo7217u(int i, String str, Object... objArr) {
            m40144v(i, null, str, objArr);
        }

        /* renamed from: v */
        public final void m40144v(int i, Throwable th, String str, Object... objArr) {
            String m40146n = m40146n();
            if (!mo7219s(m40146n, i)) {
                return;
            }
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str == null) {
                if (th == null) {
                    return;
                }
                str = m40147l(th);
            } else {
                if (objArr != null && objArr.length > 0) {
                    str = m40148k(str, objArr);
                }
                if (th != null) {
                    str = str + "\n" + m40147l(th);
                }
            }
            mo7218t(i, m40146n, str, th);
        }

        /* renamed from: w */
        public void mo7215w(String str, Object... objArr) {
            m40144v(2, null, str, objArr);
        }

        /* renamed from: x */
        public void mo7214x(String str, Object... objArr) {
            m40144v(5, null, str, objArr);
        }

        /* renamed from: y */
        public void mo7213y(Throwable th) {
            m40144v(5, th, null, new Object[0]);
        }

        /* renamed from: z */
        public void mo7212z(Throwable th, String str, Object... objArr) {
            m40144v(5, th, str, objArr);
        }
    }

    static {
        AbstractC20723b[] abstractC20723bArr = new AbstractC20723b[0];
        f81525a = abstractC20723bArr;
        f81527c = abstractC20723bArr;
    }

    private C41318g46() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    public static void m40163a(String str, Object... objArr) {
        f81528d.mo7228a(str, objArr);
    }

    /* renamed from: b */
    public static void m40162b(Throwable th) {
        f81528d.mo7227b(th);
    }

    /* renamed from: c */
    public static void m40161c(Throwable th, String str, Object... objArr) {
        f81528d.mo7226d(th, str, objArr);
    }

    /* renamed from: d */
    public static void m40160d(String str, Object... objArr) {
        f81528d.mo7225e(str, objArr);
    }

    /* renamed from: e */
    public static void m40159e(Throwable th) {
        f81528d.mo7224f(th);
    }

    /* renamed from: f */
    public static void m40158f(Throwable th, String str, Object... objArr) {
        f81528d.mo7223j(th, str, objArr);
    }

    /* renamed from: g */
    public static void m40157g(String str, Object... objArr) {
        f81528d.mo7221o(str, objArr);
    }

    /* renamed from: h */
    public static void m40156h(Throwable th, String str, Object... objArr) {
        f81528d.mo7220p(th, str, objArr);
    }

    /* renamed from: i */
    public static void m40155i(int i, String str, Object... objArr) {
        f81528d.mo7217u(i, str, objArr);
    }

    /* renamed from: j */
    public static void m40154j(AbstractC20723b abstractC20723b) {
        if (abstractC20723b != null) {
            if (abstractC20723b != f81528d) {
                List<AbstractC20723b> list = f81526b;
                synchronized (list) {
                    list.add(abstractC20723b);
                    f81527c = (AbstractC20723b[]) list.toArray(new AbstractC20723b[list.size()]);
                }
                return;
            }
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        throw new NullPointerException("tree == null");
    }

    /* renamed from: k */
    public static AbstractC20723b m40153k(String str) {
        for (AbstractC20723b abstractC20723b : f81527c) {
            abstractC20723b.f81529b.set(str);
        }
        return f81528d;
    }

    /* renamed from: l */
    public static void m40152l(String str, Object... objArr) {
        f81528d.mo7215w(str, objArr);
    }

    /* renamed from: m */
    public static void m40151m(String str, Object... objArr) {
        f81528d.mo7214x(str, objArr);
    }

    /* renamed from: n */
    public static void m40150n(Throwable th) {
        f81528d.mo7213y(th);
    }

    /* renamed from: o */
    public static void m40149o(Throwable th, String str, Object... objArr) {
        f81528d.mo7212z(th, str, objArr);
    }
}
