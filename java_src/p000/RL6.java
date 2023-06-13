package p000;

import java.io.PrintStream;
/* renamed from: RL6 */
/* loaded from: classes6.dex */
public final class RL6 {

    /* renamed from: a */
    public static final FL6 f31934a;

    static {
        FL6 nl6;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            nl6 = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new LL6() : new NL6() : new PL6();
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = NL6.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            nl6 = new NL6();
        }
        f31934a = nl6;
        if (num == null) {
            return;
        }
        num.intValue();
    }

    /* renamed from: a */
    public static void m86831a(Throwable th, Throwable th2) {
        f31934a.mo90446a(th, th2);
    }
}
