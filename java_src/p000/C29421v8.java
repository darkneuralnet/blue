package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC35449Qk2;
import p000.C33811Jk2;
import p000.C42301hk2;
/* renamed from: v8 */
/* loaded from: classes6.dex */
public final class C29421v8 extends AbstractC35449Qk2<C28182s8> {

    /* renamed from: v8$a */
    /* loaded from: classes6.dex */
    public class C29422a extends D24<VE2, C28182s8> {
        public C29422a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public VE2 mo2650a(C28182s8 c28182s8) throws GeneralSecurityException {
            return new C47226q24(new C46040o24(c28182s8.m14750J().m47709C()), c28182s8.m14749K().m5826I());
        }
    }

    /* renamed from: v8$b */
    /* loaded from: classes6.dex */
    public class C29423b extends AbstractC35449Qk2.AbstractC6849a<C29062u8, C28182s8> {
        public C29423b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: c */
        public Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<C29062u8>> mo9148c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            C33811Jk2.EnumC4220b enumC4220b = C33811Jk2.EnumC4220b.TINK;
            hashMap.put("AES_CMAC", new AbstractC35449Qk2.AbstractC6849a.C6850a(C29062u8.m10830K().m10826y(32).m10825z(C30042x8.m5825J().m5823y(16).build()).build(), enumC4220b));
            hashMap.put("AES256_CMAC", new AbstractC35449Qk2.AbstractC6849a.C6850a(C29062u8.m10830K().m10826y(32).m10825z(C30042x8.m5825J().m5823y(16).build()).build(), enumC4220b));
            hashMap.put("AES256_CMAC_RAW", new AbstractC35449Qk2.AbstractC6849a.C6850a(C29062u8.m10830K().m10826y(32).m10825z(C30042x8.m5825J().m5823y(16).build()).build(), C33811Jk2.EnumC4220b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C28182s8 mo2648a(C29062u8 c29062u8) throws GeneralSecurityException {
            return C28182s8.m14747M().m14742A(0).m14741y(AbstractC18199g.m47699f(C39961dn4.m43714c(c29062u8.m10832I()))).m14740z(c29062u8.m10831J()).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public C29062u8 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return C29062u8.m10829L(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(C29062u8 c29062u8) throws GeneralSecurityException {
            C29421v8.m9151q(c29062u8.m10831J());
            C29421v8.m9150r(c29062u8.m10832I());
        }
    }

    public C29421v8() {
        super(C28182s8.class, new C29422a(VE2.class));
    }

    /* renamed from: o */
    public static void m9153o(boolean z) throws GeneralSecurityException {
        C34830Nt4.m93223k(new C29421v8(), z);
        C0894C8.m112752d();
    }

    /* renamed from: q */
    public static void m9151q(C30042x8 c30042x8) throws GeneralSecurityException {
        if (c30042x8.m5826I() >= 10) {
            if (c30042x8.m5826I() <= 16) {
                return;
            }
            throw new GeneralSecurityException("tag size too long");
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* renamed from: r */
    public static void m9150r(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C28182s8> mo2658f() {
        return new C29423b(C29062u8.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.SYMMETRIC;
    }

    /* renamed from: m */
    public int m9155m() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: n */
    public C28182s8 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C28182s8.m14746N(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: p */
    public void mo2655j(C28182s8 c28182s8) throws GeneralSecurityException {
        C31700Aj6.m115336c(c28182s8.m14748L(), m9155m());
        m9150r(c28182s8.m14750J().size());
        m9151q(c28182s8.m14749K());
    }
}
