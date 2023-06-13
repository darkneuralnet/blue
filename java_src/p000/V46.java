package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
/* renamed from: V46 */
/* loaded from: classes6.dex */
public final class V46 {

    /* renamed from: a */
    public static final Logger f38568a = Logger.getLogger(V46.class.getName());

    /* renamed from: b */
    public static final AtomicBoolean f38569b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: V46$b */
    /* loaded from: classes6.dex */
    public static abstract class EnumC8541b {

        /* renamed from: b */
        public static final EnumC8541b f38570b;

        /* renamed from: c */
        public static final EnumC8541b f38571c;

        /* renamed from: d */
        public static final /* synthetic */ EnumC8541b[] f38572d;

        /* renamed from: V46$b$a */
        /* loaded from: classes6.dex */
        public enum C8542a extends EnumC8541b {
            public C8542a(String str, int i) {
                super(str, i);
            }

            @Override // p000.V46.EnumC8541b
            /* renamed from: a */
            public boolean mo80443a() {
                return !V46.m80444c();
            }
        }

        /* renamed from: V46$b$b */
        /* loaded from: classes6.dex */
        public enum C8543b extends EnumC8541b {
            public C8543b(String str, int i) {
                super(str, i);
            }

            @Override // p000.V46.EnumC8541b
            /* renamed from: a */
            public boolean mo80443a() {
                return !V46.m80444c() || V46.m80445b();
            }
        }

        static {
            C8542a c8542a = new C8542a("ALGORITHM_NOT_FIPS", 0);
            f38570b = c8542a;
            C8543b c8543b = new C8543b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f38571c = c8543b;
            f38572d = new EnumC8541b[]{c8542a, c8543b};
        }

        public EnumC8541b(String str, int i) {
        }

        public static EnumC8541b valueOf(String str) {
            return (EnumC8541b) Enum.valueOf(EnumC8541b.class, str);
        }

        public static EnumC8541b[] values() {
            return (EnumC8541b[]) f38572d.clone();
        }

        /* renamed from: a */
        public abstract boolean mo80443a();
    }

    private V46() {
    }

    /* renamed from: a */
    public static Boolean m80446a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f38568a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m80445b() {
        return m80446a().booleanValue();
    }

    /* renamed from: c */
    public static boolean m80444c() {
        return U46.m82006a() || f38569b.get();
    }
}
