package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p000.AbstractC35449Qk2;
import p000.C33811Jk2;
import p000.C42301hk2;
/* renamed from: X8 */
/* loaded from: classes6.dex */
public final class C9317X8 extends AbstractC35449Qk2<C8560V8> {

    /* renamed from: X8$a */
    /* loaded from: classes6.dex */
    public class C9318a extends D24<InterfaceC27152p8, C8560V8> {
        public C9318a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public InterfaceC27152p8 mo2650a(C8560V8 c8560v8) throws GeneralSecurityException {
            return new C8201U8(c8560v8.m80331I().m47709C());
        }
    }

    /* renamed from: X8$b */
    /* loaded from: classes6.dex */
    public class C9319b extends AbstractC35449Qk2.AbstractC6849a<C8941W8, C8560V8> {
        public C9319b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: c */
        public Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<C8941W8>> mo9148c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            C33811Jk2.EnumC4220b enumC4220b = C33811Jk2.EnumC4220b.TINK;
            hashMap.put("AES128_GCM_SIV", C9317X8.m77328m(16, enumC4220b));
            C33811Jk2.EnumC4220b enumC4220b2 = C33811Jk2.EnumC4220b.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", C9317X8.m77328m(16, enumC4220b2));
            hashMap.put("AES256_GCM_SIV", C9317X8.m77328m(32, enumC4220b));
            hashMap.put("AES256_GCM_SIV_RAW", C9317X8.m77328m(32, enumC4220b2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C8560V8 mo2648a(C8941W8 c8941w8) {
            return C8560V8.m80329K().m80325y(AbstractC18199g.m47699f(C39961dn4.m43714c(c8941w8.m78798H()))).m80324z(C9317X8.this.m77327n()).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public C8941W8 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return C8941W8.m78796J(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(C8941W8 c8941w8) throws GeneralSecurityException {
            C31700Aj6.m115338a(c8941w8.m78798H());
        }
    }

    public C9317X8() {
        super(C8560V8.class, new C9318a(InterfaceC27152p8.class));
    }

    /* renamed from: l */
    public static boolean m77329l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static AbstractC35449Qk2.AbstractC6849a.C6850a<C8941W8> m77328m(int i, C33811Jk2.EnumC4220b enumC4220b) {
        return new AbstractC35449Qk2.AbstractC6849a.C6850a<>(C8941W8.m78797I().m78794y(i).build(), enumC4220b);
    }

    /* renamed from: p */
    public static void m77325p(boolean z) throws GeneralSecurityException {
        if (m77329l()) {
            C34830Nt4.m93223k(new C9317X8(), z);
        }
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C8560V8> mo2658f() {
        return new C9319b(C8941W8.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.SYMMETRIC;
    }

    /* renamed from: n */
    public int m77327n() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: o */
    public C8560V8 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C8560V8.m80328L(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: q */
    public void mo2655j(C8560V8 c8560v8) throws GeneralSecurityException {
        C31700Aj6.m115336c(c8560v8.m80330J(), m77327n());
        C31700Aj6.m115338a(c8560v8.m80331I().size());
    }
}
