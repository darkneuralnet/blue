package com.bumptech.glide.load.engine;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public final class GlideException extends Exception {

    /* renamed from: h */
    public static final StackTraceElement[] f69168h = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final List<Throwable> f69169b;

    /* renamed from: c */
    public InterfaceC38133ak2 f69170c;

    /* renamed from: d */
    public ZS0 f69171d;

    /* renamed from: e */
    public Class<?> f69172e;

    /* renamed from: f */
    public String f69173f;

    /* renamed from: g */
    public Exception f69174g;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    /* renamed from: b */
    public static void m53085b(List<Throwable> list, Appendable appendable) {
        try {
            m53084c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static void m53084c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m53079h(appendable);
            } else {
                m53083d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public static void m53083d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void m53086a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable th2 : ((GlideException) th).m53082e()) {
                m53086a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: e */
    public List<Throwable> m53082e() {
        return this.f69169b;
    }

    /* renamed from: f */
    public List<Throwable> m53081f() {
        ArrayList arrayList = new ArrayList();
        m53086a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void m53080g(String str) {
        List<Throwable> m53081f = m53081f();
        int size = m53081f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), m53081f.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f69173f);
        String str3 = "";
        if (this.f69172e == null) {
            str = "";
        } else {
            str = ", " + this.f69172e;
        }
        sb.append(str);
        if (this.f69171d == null) {
            str2 = "";
        } else {
            str2 = ", " + this.f69171d;
        }
        sb.append(str2);
        if (this.f69170c != null) {
            str3 = ", " + this.f69170c;
        }
        sb.append(str3);
        List<Throwable> m53081f = m53081f();
        if (m53081f.isEmpty()) {
            return sb.toString();
        }
        if (m53081f.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(m53081f.size());
            sb.append(" root causes:");
        }
        for (Throwable th : m53081f) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(th.getMessage());
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* renamed from: h */
    public final void m53079h(Appendable appendable) {
        m53083d(this, appendable);
        m53085b(m53082e(), new C17133a(appendable));
    }

    /* renamed from: i */
    public void m53078i(InterfaceC38133ak2 interfaceC38133ak2, ZS0 zs0) {
        m53077j(interfaceC38133ak2, zs0, null);
    }

    /* renamed from: j */
    public void m53077j(InterfaceC38133ak2 interfaceC38133ak2, ZS0 zs0, Class<?> cls) {
        this.f69170c = interfaceC38133ak2;
        this.f69171d = zs0;
        this.f69172e = cls;
    }

    /* renamed from: k */
    public void m53076k(Exception exc) {
        this.f69174g = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m53079h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f69173f = str;
        setStackTrace(f69168h);
        this.f69169b = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m53079h(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    /* loaded from: classes5.dex */
    public static final class C17133a implements Appendable {

        /* renamed from: b */
        public final Appendable f69175b;

        /* renamed from: c */
        public boolean f69176c = true;

        public C17133a(Appendable appendable) {
            this.f69175b = appendable;
        }

        /* renamed from: a */
        public final CharSequence m53075a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.f69176c) {
                this.f69176c = false;
                this.f69175b.append("  ");
            }
            this.f69176c = c == '\n';
            this.f69175b.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence m53075a = m53075a(charSequence);
            return append(m53075a, 0, m53075a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence m53075a = m53075a(charSequence);
            boolean z = false;
            if (this.f69176c) {
                this.f69176c = false;
                this.f69175b.append("  ");
            }
            if (m53075a.length() > 0 && m53075a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f69176c = z;
            this.f69175b.append(m53075a, i, i2);
            return this;
        }
    }
}
