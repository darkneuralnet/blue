package org.junit.runners.model;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
/* loaded from: classes8.dex */
public class MultipleFailureException extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final List<Throwable> f102660b;

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(String.format("There were %d errors:", Integer.valueOf(this.f102660b.size())));
        for (Throwable th : this.f102660b) {
            sb.append(String.format("%n  %s(%s)", th.getClass().getName(), th.getMessage()));
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        for (Throwable th : this.f102660b) {
            th.printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        for (Throwable th : this.f102660b) {
            th.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        for (Throwable th : this.f102660b) {
            th.printStackTrace(printWriter);
        }
    }
}
