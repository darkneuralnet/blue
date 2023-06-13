package bo.app;

import java.lang.Thread;
/* renamed from: bo.app.x0 */
/* loaded from: classes.dex */
public class C13199x0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    private static final String f59408b = C43664k20.m29433n(C13199x0.class);

    /* renamed from: a */
    private InterfaceC12658g2 f59409a;

    public C13199x0() {
    }

    /* renamed from: a */
    public void m62825a(InterfaceC12658g2 interfaceC12658g2) {
        this.f59409a = interfaceC12658g2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (this.f59409a != null) {
                C43664k20.m29450A(f59408b, "Uncaught exception from thread. Publishing as Throwable event.", th);
                this.f59409a.mo63715a((InterfaceC12658g2) th, (Class<InterfaceC12658g2>) Throwable.class);
            }
        } catch (Exception e) {
            C43664k20.m29450A(f59408b, "Failed to log throwable.", e);
        }
    }

    public C13199x0(InterfaceC12658g2 interfaceC12658g2) {
        this.f59409a = interfaceC12658g2;
    }
}
