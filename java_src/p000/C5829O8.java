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
/* renamed from: O8 */
/* loaded from: classes6.dex */
public final class C5829O8 extends AbstractC35449Qk2<C5205M8> {

    /* renamed from: O8$a */
    /* loaded from: classes6.dex */
    public class C5830a extends D24<InterfaceC27152p8, C5205M8> {
        public C5830a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public InterfaceC27152p8 mo2650a(C5205M8 c5205m8) throws GeneralSecurityException {
            return new C4747L8(c5205m8.m95705J().m47709C(), c5205m8.m95704K().m90718I());
        }
    }

    /* renamed from: O8$b */
    /* loaded from: classes6.dex */
    public class C5831b extends AbstractC35449Qk2.AbstractC6849a<C5479N8, C5205M8> {
        public C5831b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: c */
        public Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<C5479N8>> mo9148c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            C33811Jk2.EnumC4220b enumC4220b = C33811Jk2.EnumC4220b.TINK;
            hashMap.put("AES128_EAX", C5829O8.m92873l(16, 16, enumC4220b));
            C33811Jk2.EnumC4220b enumC4220b2 = C33811Jk2.EnumC4220b.RAW;
            hashMap.put("AES128_EAX_RAW", C5829O8.m92873l(16, 16, enumC4220b2));
            hashMap.put("AES256_EAX", C5829O8.m92873l(32, 16, enumC4220b));
            hashMap.put("AES256_EAX_RAW", C5829O8.m92873l(32, 16, enumC4220b2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C5205M8 mo2648a(C5479N8 c5479n8) throws GeneralSecurityException {
            return C5205M8.m95702M().m95696y(AbstractC18199g.m47699f(C39961dn4.m43714c(c5479n8.m94338I()))).m95695z(c5479n8.m94337J()).m95697A(C5829O8.this.m92872m()).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public C5479N8 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return C5479N8.m94335L(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(C5479N8 c5479n8) throws GeneralSecurityException {
            C31700Aj6.m115338a(c5479n8.m94338I());
            if (c5479n8.m94337J().m90718I() != 12 && c5479n8.m94337J().m90718I() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public C5829O8() {
        super(C5205M8.class, new C5830a(InterfaceC27152p8.class));
    }

    /* renamed from: l */
    public static AbstractC35449Qk2.AbstractC6849a.C6850a<C5479N8> m92873l(int i, int i2, C33811Jk2.EnumC4220b enumC4220b) {
        return new AbstractC35449Qk2.AbstractC6849a.C6850a<>(C5479N8.m94336K().m94332y(i).m94331z(C6269P8.m90717J().m90715y(i2).build()).build(), enumC4220b);
    }

    /* renamed from: o */
    public static void m92870o(boolean z) throws GeneralSecurityException {
        C34830Nt4.m93223k(new C5829O8(), z);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C5205M8> mo2658f() {
        return new C5831b(C5479N8.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.SYMMETRIC;
    }

    /* renamed from: m */
    public int m92872m() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: n */
    public C5205M8 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C5205M8.m95701N(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: p */
    public void mo2655j(C5205M8 c5205m8) throws GeneralSecurityException {
        C31700Aj6.m115336c(c5205m8.m95703L(), m92872m());
        C31700Aj6.m115338a(c5205m8.m95705J().size());
        if (c5205m8.m95704K().m90718I() != 12 && c5205m8.m95704K().m90718I() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
