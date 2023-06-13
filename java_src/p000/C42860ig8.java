package p000;

import java.io.PrintStream;
/* renamed from: ig8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42860ig8 {

    /* renamed from: a */
    public static final AbstractC36346Uf8 f87734a;

    /* renamed from: b */
    public static final int f87735b;

    /* renamed from: ig8$a */
    /* loaded from: classes6.dex */
    public static final class C23324a extends AbstractC36346Uf8 {
        @Override // p000.AbstractC36346Uf8
        /* renamed from: a */
        public final void mo33598a(Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    static {
        Integer num;
        AbstractC36346Uf8 c23324a;
        int i = 1;
        try {
            num = m33600a();
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        if (num != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                PrintStream printStream = System.err;
                String name = C23324a.class.getName();
                StringBuilder sb = new StringBuilder(name.length() + 133);
                sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb.append(name);
                sb.append("will be used. The error is: ");
                printStream.println(sb.toString());
                th.printStackTrace(System.err);
                c23324a = new C23324a();
                f87734a = c23324a;
                if (num != null) {
                }
                f87735b = i;
            }
            if (num.intValue() >= 19) {
                c23324a = new C33322Hh8();
                f87734a = c23324a;
                if (num != null) {
                    i = num.intValue();
                }
                f87735b = i;
            }
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            c23324a = new C39906dh8();
        } else {
            c23324a = new C23324a();
        }
        f87734a = c23324a;
        if (num != null) {
        }
        f87735b = i;
    }

    /* renamed from: a */
    public static Integer m33600a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* renamed from: b */
    public static void m33599b(Throwable th) {
        f87734a.mo33598a(th);
    }
}
