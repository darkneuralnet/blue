package p000;

import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p000.AbstractC31705Ak2;
import p000.AbstractC33109Gk2;
import p000.C29783w8;
import p000.KE3;
import p000.LE3;
/* renamed from: C8 */
/* loaded from: classes6.dex */
public final class C0894C8 {

    /* renamed from: a */
    public static final Q70 f3488a;

    /* renamed from: b */
    public static final LE3<C29783w8, H94> f3489b;

    /* renamed from: c */
    public static final KE3<H94> f3490c;

    /* renamed from: d */
    public static final AbstractC33109Gk2<C28532t8, G94> f3491d;

    /* renamed from: e */
    public static final AbstractC31705Ak2<G94> f3492e;

    /* renamed from: C8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C0895a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3493a;

        static {
            int[] iArr = new int[EnumC40189eA3.values().length];
            f3493a = iArr;
            try {
                iArr[EnumC40189eA3.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3493a[EnumC40189eA3.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3493a[EnumC40189eA3.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3493a[EnumC40189eA3.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Q70 m13787d = C48807si6.m13787d("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f3488a = m13787d;
        f3489b = LE3.m97512a(new LE3.InterfaceC4763b() { // from class: y8
        }, C29783w8.class, H94.class);
        f3490c = KE3.m99059a(new KE3.InterfaceC4383b() { // from class: z8
        }, m13787d, H94.class);
        f3491d = AbstractC33109Gk2.m104817a(new AbstractC33109Gk2.InterfaceC2931b() { // from class: A8
        }, C28532t8.class, G94.class);
        f3492e = AbstractC31705Ak2.m115327a(new AbstractC31705Ak2.InterfaceC0200b() { // from class: B8
            @Override // p000.AbstractC31705Ak2.InterfaceC0200b
            /* renamed from: a */
            public final AbstractC38726bk2 mo114336a(InterfaceC38226at5 interfaceC38226at5, C34570Mq5 c34570Mq5) {
                C28532t8 m112754b;
                m112754b = C0894C8.m112754b((G94) interfaceC38226at5, c34570Mq5);
                return m112754b;
            }
        }, m13787d, G94.class);
    }

    private C0894C8() {
    }

    /* renamed from: b */
    public static C28532t8 m112754b(G94 g94, C34570Mq5 c34570Mq5) throws GeneralSecurityException {
        if (g94.m105674f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C28182s8 m14746N = C28182s8.m14746N(g94.m105673g(), C18219m.m47528b());
                if (m14746N.m14748L() == 0) {
                    return C28532t8.m13028d(m112753c(m14746N.m14749K(), g94.m105675e()), C34336Lq5.m96302a(m14746N.m14750J().m47709C(), C34570Mq5.m94689b(c34570Mq5)), g94.m105677c());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
    }

    /* renamed from: c */
    public static C29783w8 m112753c(C30042x8 c30042x8, EnumC40189eA3 enumC40189eA3) throws GeneralSecurityException {
        return C29783w8.m7372a(c30042x8.m5826I(), m112750f(enumC40189eA3));
    }

    /* renamed from: d */
    public static void m112752d() throws GeneralSecurityException {
        m112751e(AX2.m115675a());
    }

    /* renamed from: e */
    public static void m112751e(AX2 ax2) throws GeneralSecurityException {
        ax2.m115669g(f3489b);
        ax2.m115670f(f3490c);
        ax2.m115671e(f3491d);
        ax2.m115672d(f3492e);
    }

    /* renamed from: f */
    public static C29783w8.C29784a m112750f(EnumC40189eA3 enumC40189eA3) throws GeneralSecurityException {
        int i = C0895a.f3493a[enumC40189eA3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return C29783w8.C29784a.f115400e;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC40189eA3.getNumber());
                }
                return C29783w8.C29784a.f115399d;
            }
            return C29783w8.C29784a.f115398c;
        }
        return C29783w8.C29784a.f115397b;
    }
}
