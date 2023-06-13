package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import p000.AbstractC35449Qk2;
import p000.C33811Jk2;
import p000.C42301hk2;
import p000.V46;
/* renamed from: VM1 */
/* loaded from: classes6.dex */
public final class VM1 extends AbstractC35449Qk2<TM1> {

    /* renamed from: VM1$a */
    /* loaded from: classes6.dex */
    public class C8606a extends D24<VE2, TM1> {
        public C8606a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public VE2 mo2650a(TM1 tm1) throws GeneralSecurityException {
            EnumC49737uH1 m78541J = tm1.m83741L().m78541J();
            SecretKeySpec secretKeySpec = new SecretKeySpec(tm1.m83742K().m47709C(), "HMAC");
            int m78540K = tm1.m83741L().m78540K();
            int i = C8608c.f38898a[m78541J.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return new C47226q24(new C46633p24("HMACSHA512", secretKeySpec), m78540K);
                            }
                            throw new GeneralSecurityException("unknown hash");
                        }
                        return new C47226q24(new C46633p24("HMACSHA384", secretKeySpec), m78540K);
                    }
                    return new C47226q24(new C46633p24("HMACSHA256", secretKeySpec), m78540K);
                }
                return new C47226q24(new C46633p24("HMACSHA224", secretKeySpec), m78540K);
            }
            return new C47226q24(new C46633p24("HMACSHA1", secretKeySpec), m78540K);
        }
    }

    /* renamed from: VM1$b */
    /* loaded from: classes6.dex */
    public class C8607b extends AbstractC35449Qk2.AbstractC6849a<UM1, TM1> {
        public C8607b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: c */
        public Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<UM1>> mo9148c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            EnumC49737uH1 enumC49737uH1 = EnumC49737uH1.SHA256;
            C33811Jk2.EnumC4220b enumC4220b = C33811Jk2.EnumC4220b.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", VM1.m79947m(32, 16, enumC49737uH1, enumC4220b));
            C33811Jk2.EnumC4220b enumC4220b2 = C33811Jk2.EnumC4220b.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", VM1.m79947m(32, 16, enumC49737uH1, enumC4220b2));
            hashMap.put("HMAC_SHA256_256BITTAG", VM1.m79947m(32, 32, enumC49737uH1, enumC4220b));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", VM1.m79947m(32, 32, enumC49737uH1, enumC4220b2));
            EnumC49737uH1 enumC49737uH12 = EnumC49737uH1.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", VM1.m79947m(64, 16, enumC49737uH12, enumC4220b));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", VM1.m79947m(64, 16, enumC49737uH12, enumC4220b2));
            hashMap.put("HMAC_SHA512_256BITTAG", VM1.m79947m(64, 32, enumC49737uH12, enumC4220b));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", VM1.m79947m(64, 32, enumC49737uH12, enumC4220b2));
            hashMap.put("HMAC_SHA512_512BITTAG", VM1.m79947m(64, 64, enumC49737uH12, enumC4220b));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", VM1.m79947m(64, 64, enumC49737uH12, enumC4220b2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public TM1 mo2648a(UM1 um1) throws GeneralSecurityException {
            return TM1.m83739N().m83734A(VM1.this.m79946n()).m83732z(um1.m81603K()).m83733y(AbstractC18199g.m47699f(C39961dn4.m43714c(um1.m81604J()))).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public UM1 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return UM1.m81601M(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(UM1 um1) throws GeneralSecurityException {
            if (um1.m81604J() >= 16) {
                VM1.m79942r(um1.m81603K());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    /* renamed from: VM1$c */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C8608c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38898a;

        static {
            int[] iArr = new int[EnumC49737uH1.values().length];
            f38898a = iArr;
            try {
                iArr[EnumC49737uH1.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38898a[EnumC49737uH1.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38898a[EnumC49737uH1.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38898a[EnumC49737uH1.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38898a[EnumC49737uH1.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public VM1() {
        super(TM1.class, new C8606a(VE2.class));
    }

    /* renamed from: m */
    public static AbstractC35449Qk2.AbstractC6849a.C6850a<UM1> m79947m(int i, int i2, EnumC49737uH1 enumC49737uH1, C33811Jk2.EnumC4220b enumC4220b) {
        return new AbstractC35449Qk2.AbstractC6849a.C6850a<>(UM1.m81602L().m81597z(WM1.m78539L().m78536y(enumC49737uH1).m78535z(i2).build()).m81598y(i).build(), enumC4220b);
    }

    /* renamed from: p */
    public static void m79944p(boolean z) throws GeneralSecurityException {
        C34830Nt4.m93223k(new VM1(), z);
    }

    /* renamed from: r */
    public static void m79942r(WM1 wm1) throws GeneralSecurityException {
        if (wm1.m78540K() >= 10) {
            int i = C8608c.f38898a[wm1.m78541J().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (wm1.m78540K() > 64) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        } else if (wm1.m78540K() > 48) {
                            throw new GeneralSecurityException("tag size too big");
                        } else {
                            return;
                        }
                    } else if (wm1.m78540K() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    } else {
                        return;
                    }
                } else if (wm1.m78540K() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                } else {
                    return;
                }
            } else if (wm1.m78540K() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: a */
    public V46.EnumC8541b mo79950a() {
        return V46.EnumC8541b.f38571c;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, TM1> mo2658f() {
        return new C8607b(UM1.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.SYMMETRIC;
    }

    /* renamed from: n */
    public int m79946n() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: o */
    public TM1 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return TM1.m83738O(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: q */
    public void mo2655j(TM1 tm1) throws GeneralSecurityException {
        C31700Aj6.m115336c(tm1.m83740M(), m79946n());
        if (tm1.m83742K().size() >= 16) {
            m79942r(tm1.m83741L());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
