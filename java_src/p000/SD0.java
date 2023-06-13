package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
/* renamed from: SD0 */
/* loaded from: classes2.dex */
public class SD0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public G10 f33339a;

    /* renamed from: b */
    public Thread.UncaughtExceptionHandler f33340b = Thread.getDefaultUncaughtExceptionHandler();

    public SD0(G10 g10) {
        this.f33339a = g10;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    public static SD0 m85840a(G10 g10) {
        return new SD0(g10);
    }

    /* renamed from: b */
    public void m85839b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f33340b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        if (stringWriter.toString().contains("com.braintreepayments") || stringWriter.toString().contains("com.paypal")) {
            this.f33339a.m105974Ea("crash");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f33340b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
