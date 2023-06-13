package p000;

import java.security.GeneralSecurityException;
import p000.C42301hk2;
/* renamed from: gp2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41758gp2 extends AbstractC38726bk2 {

    /* renamed from: a */
    public final G94 f84325a;

    /* renamed from: gp2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C22482a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f84326a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f84327b;

        static {
            int[] iArr = new int[C42301hk2.EnumC22717c.values().length];
            f84327b = iArr;
            try {
                iArr[C42301hk2.EnumC22717c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84327b[C42301hk2.EnumC22717c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC40189eA3.values().length];
            f84326a = iArr2;
            try {
                iArr2[EnumC40189eA3.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84326a[EnumC40189eA3.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84326a[EnumC40189eA3.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f84326a[EnumC40189eA3.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: gp2$b */
    /* loaded from: classes6.dex */
    public static class C22483b extends JE3 {

        /* renamed from: a */
        public final String f84328a;

        /* renamed from: b */
        public final EnumC40189eA3 f84329b;

        public /* synthetic */ C22483b(String str, EnumC40189eA3 enumC40189eA3, C22482a c22482a) {
            this(str, enumC40189eA3);
        }

        /* renamed from: a */
        public static String m37443a(EnumC40189eA3 enumC40189eA3) {
            int i = C22482a.f84326a[enumC40189eA3.ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        }

        public String toString() {
            return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f84328a, m37443a(this.f84329b));
        }

        public C22483b(String str, EnumC40189eA3 enumC40189eA3) {
            this.f84328a = str;
            this.f84329b = enumC40189eA3;
        }
    }

    public C41758gp2(G94 g94, C34570Mq5 c34570Mq5) throws GeneralSecurityException {
        m37444b(g94, c34570Mq5);
        this.f84325a = g94;
    }

    /* renamed from: b */
    public static void m37444b(G94 g94, C34570Mq5 c34570Mq5) throws GeneralSecurityException {
        int i = C22482a.f84327b[g94.m105676d().ordinal()];
        if (i == 1 || i == 2) {
            C34570Mq5.m94689b(c34570Mq5);
        }
    }

    @Override // p000.AbstractC38726bk2
    /* renamed from: a */
    public JE3 mo13031a() {
        return new C22483b(this.f84325a.m105674f(), this.f84325a.m105675e(), null);
    }
}
