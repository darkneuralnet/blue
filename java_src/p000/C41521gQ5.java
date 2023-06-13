package p000;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.classic.util.ContextSelectorStaticBinder;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.StatusUtil;
import ch.qos.logback.core.util.StatusPrinter;
/* renamed from: gQ5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41521gQ5 {

    /* renamed from: d */
    public static String f82149d = "1.7";

    /* renamed from: e */
    public static C41521gQ5 f82150e;

    /* renamed from: f */
    public static Object f82151f;

    /* renamed from: a */
    public boolean f82152a = false;

    /* renamed from: b */
    public LoggerContext f82153b = new LoggerContext();

    /* renamed from: c */
    public final ContextSelectorStaticBinder f82154c = ContextSelectorStaticBinder.getSingleton();

    static {
        C41521gQ5 c41521gQ5 = new C41521gQ5();
        f82150e = c41521gQ5;
        f82151f = new Object();
        c41521gQ5.m39487d();
    }

    private C41521gQ5() {
        this.f82153b.setName("default");
    }

    /* renamed from: c */
    public static C41521gQ5 m39488c() {
        return f82150e;
    }

    /* renamed from: a */
    public PO1 m39490a() {
        if (this.f82152a) {
            if (this.f82154c.getContextSelector() != null) {
                return this.f82154c.getContextSelector().getLoggerContext();
            }
            throw new IllegalStateException("contextSelector cannot be null. See also http://logback.qos.ch/codes.html#null_CS");
        }
        return this.f82153b;
    }

    /* renamed from: b */
    public String m39489b() {
        return this.f82154c.getClass().getName();
    }

    /* renamed from: d */
    public void m39487d() {
        try {
            try {
                new ContextInitializer(this.f82153b).autoConfig();
            } catch (JoranException e) {
                C49993ui6.m9851d("Failed to auto configure default logger context", e);
            }
            if (!StatusUtil.contextHasStatusListener(this.f82153b)) {
                StatusPrinter.printInCaseOfErrorsOrWarnings(this.f82153b);
            }
            this.f82154c.init(this.f82153b, f82151f);
            this.f82152a = true;
        } catch (Exception e2) {
            C49993ui6.m9851d("Failed to instantiate [" + LoggerContext.class.getName() + "]", e2);
        }
    }
}
