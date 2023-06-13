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
import p000.V46;
/* renamed from: F8 */
/* loaded from: classes6.dex */
public final class C2170F8 extends AbstractC35449Qk2<C1396D8> {

    /* renamed from: F8$a */
    /* loaded from: classes6.dex */
    public class C2171a extends D24<InterfaceC27152p8, C1396D8> {
        public C2171a(Class cls) {
            super(cls);
        }

        @Override // p000.D24
        /* renamed from: c */
        public InterfaceC27152p8 mo2650a(C1396D8 c1396d8) throws GeneralSecurityException {
            return new C35610Rc1((InterfaceC43656k12) new C3897J8().m88102e(c1396d8.m110897J(), InterfaceC43656k12.class), (VE2) new VM1().m88102e(c1396d8.m110896K(), VE2.class), c1396d8.m110896K().m83741L().m78540K());
        }
    }

    /* renamed from: F8$b */
    /* loaded from: classes6.dex */
    public class C2172b extends AbstractC35449Qk2.AbstractC6849a<C1741E8, C1396D8> {
        public C2172b(Class cls) {
            super(cls);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: c */
        public Map<String, AbstractC35449Qk2.AbstractC6849a.C6850a<C1741E8>> mo9148c() throws GeneralSecurityException {
            HashMap hashMap = new HashMap();
            EnumC49737uH1 enumC49737uH1 = EnumC49737uH1.SHA256;
            C33811Jk2.EnumC4220b enumC4220b = C33811Jk2.EnumC4220b.TINK;
            hashMap.put("AES128_CTR_HMAC_SHA256", C2170F8.m107698m(16, 16, 32, 16, enumC49737uH1, enumC4220b));
            C33811Jk2.EnumC4220b enumC4220b2 = C33811Jk2.EnumC4220b.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C2170F8.m107698m(16, 16, 32, 16, enumC49737uH1, enumC4220b2));
            hashMap.put("AES256_CTR_HMAC_SHA256", C2170F8.m107698m(32, 16, 32, 32, enumC49737uH1, enumC4220b));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C2170F8.m107698m(32, 16, 32, 32, enumC49737uH1, enumC4220b2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: f */
        public C1396D8 mo2648a(C1741E8 c1741e8) throws GeneralSecurityException {
            return C1396D8.m110894M().m110888y(new C3897J8().mo2658f().mo2648a(c1741e8.m109358I())).m110887z(new VM1().mo2658f().mo2648a(c1741e8.m109357J())).m110889A(C2170F8.this.m107697n()).build();
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: g */
        public C1741E8 mo2647d(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
            return C1741E8.m109355L(abstractC18199g, C18219m.m47528b());
        }

        @Override // p000.AbstractC35449Qk2.AbstractC6849a
        /* renamed from: h */
        public void mo2646e(C1741E8 c1741e8) throws GeneralSecurityException {
            new C3897J8().mo2658f().mo2646e(c1741e8.m109358I());
            new VM1().mo2658f().mo2646e(c1741e8.m109357J());
            C31700Aj6.m115338a(c1741e8.m109358I().m102926J());
        }
    }

    public C2170F8() {
        super(C1396D8.class, new C2171a(InterfaceC27152p8.class));
    }

    /* renamed from: l */
    public static C1741E8 m107699l(int i, int i2, int i3, int i4, EnumC49737uH1 enumC49737uH1) {
        return C1741E8.m109356K().m109352y(C3329I8.m102924L().m102919z(C4353K8.m99173J().m99171y(i2).build()).m102920y(i).build()).m109351z(UM1.m81602L().m81597z(WM1.m78539L().m78536y(enumC49737uH1).m78535z(i4).build()).m81598y(i3).build()).build();
    }

    /* renamed from: m */
    public static AbstractC35449Qk2.AbstractC6849a.C6850a<C1741E8> m107698m(int i, int i2, int i3, int i4, EnumC49737uH1 enumC49737uH1, C33811Jk2.EnumC4220b enumC4220b) {
        return new AbstractC35449Qk2.AbstractC6849a.C6850a<>(m107699l(i, i2, i3, i4, enumC49737uH1), enumC4220b);
    }

    /* renamed from: p */
    public static void m107695p(boolean z) throws GeneralSecurityException {
        C34830Nt4.m93223k(new C2170F8(), z);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: a */
    public V46.EnumC8541b mo79950a() {
        return V46.EnumC8541b.f38571c;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: d */
    public String mo2659d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: f */
    public AbstractC35449Qk2.AbstractC6849a<?, C1396D8> mo2658f() {
        return new C2172b(C1741E8.class);
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: g */
    public C42301hk2.EnumC22717c mo2657g() {
        return C42301hk2.EnumC22717c.SYMMETRIC;
    }

    /* renamed from: n */
    public int m107697n() {
        return 0;
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: o */
    public C1396D8 mo2656h(AbstractC18199g abstractC18199g) throws InvalidProtocolBufferException {
        return C1396D8.m110893N(abstractC18199g, C18219m.m47528b());
    }

    @Override // p000.AbstractC35449Qk2
    /* renamed from: q */
    public void mo2655j(C1396D8 c1396d8) throws GeneralSecurityException {
        C31700Aj6.m115336c(c1396d8.m110895L(), m107697n());
        new C3897J8().mo2655j(c1396d8.m110897J());
        new VM1().mo2655j(c1396d8.m110896K());
    }
}
