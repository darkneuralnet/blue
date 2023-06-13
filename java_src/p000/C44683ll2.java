package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import p000.C44090kl2;
import p000.J24;
/* renamed from: ll2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44683ll2 {

    /* renamed from: a */
    public final C44090kl2 f96660a;

    /* renamed from: b */
    public final C51642xV2 f96661b = C51642xV2.f117716b;

    public C44683ll2(C44090kl2 c44090kl2) {
        this.f96660a = c44090kl2;
    }

    /* renamed from: a */
    public static void m26880a(C35844Sc1 c35844Sc1) throws GeneralSecurityException {
        if (c35844Sc1 != null && c35844Sc1.m85196I().size() != 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: b */
    public static void m26879b(C44090kl2 c44090kl2) throws GeneralSecurityException {
        if (c44090kl2 != null && c44090kl2.m28518L() > 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: c */
    public static C44090kl2 m26878c(C35844Sc1 c35844Sc1, InterfaceC27152p8 interfaceC27152p8, byte[] bArr) throws GeneralSecurityException {
        try {
            C44090kl2 m28514P = C44090kl2.m28514P(interfaceC27152p8.mo3715b(c35844Sc1.m85196I().m47709C(), bArr), C18219m.m47528b());
            m26879b(m28514P);
            return m28514P;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: d */
    public static C35844Sc1 m26877d(C44090kl2 c44090kl2, InterfaceC27152p8 interfaceC27152p8, byte[] bArr) throws GeneralSecurityException {
        byte[] mo3716a = interfaceC27152p8.mo3716a(c44090kl2.mo47795e(), bArr);
        try {
            if (C44090kl2.m28514P(interfaceC27152p8.mo3715b(mo3716a, bArr), C18219m.m47528b()).equals(c44090kl2)) {
                return C35844Sc1.m85195J().m85191y(AbstractC18199g.m47699f(mo3716a)).m85190z(C48215ri6.m15554b(c44090kl2)).build();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: e */
    public static final C44683ll2 m26876e(C44090kl2 c44090kl2) throws GeneralSecurityException {
        m26879b(c44090kl2);
        return new C44683ll2(c44090kl2);
    }

    /* renamed from: j */
    public static final C44683ll2 m26871j(InterfaceC46462ol2 interfaceC46462ol2, InterfaceC27152p8 interfaceC27152p8) throws GeneralSecurityException, IOException {
        return m26870k(interfaceC46462ol2, interfaceC27152p8, new byte[0]);
    }

    /* renamed from: k */
    public static final C44683ll2 m26870k(InterfaceC46462ol2 interfaceC46462ol2, InterfaceC27152p8 interfaceC27152p8, byte[] bArr) throws GeneralSecurityException, IOException {
        C35844Sc1 mo20538a = interfaceC46462ol2.mo20538a();
        m26880a(mo20538a);
        return new C44683ll2(m26878c(mo20538a, interfaceC27152p8, bArr));
    }

    /* renamed from: f */
    public C44090kl2 m26875f() {
        return this.f96660a;
    }

    /* renamed from: g */
    public C45276ml2 m26874g() {
        return C48215ri6.m15554b(this.f96660a);
    }

    /* renamed from: h */
    public <P> P m26873h(Class<P> cls) throws GeneralSecurityException {
        Class<?> m93231c = C34830Nt4.m93231c(cls);
        if (m93231c != null) {
            return (P) m26872i(cls, m93231c);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final <B, P> P m26872i(Class<P> cls, Class<B> cls2) throws GeneralSecurityException {
        C48215ri6.m15552d(this.f96660a);
        J24.C3871b m101273j = J24.m101273j(cls2);
        m101273j.m101268e(this.f96661b);
        for (C44090kl2.C25225c c25225c : this.f96660a.m28517M()) {
            if (c25225c.m28499N() == EnumC33577Ik2.ENABLED) {
                Object m93230d = C34830Nt4.m93230d(c25225c.m28502K(), cls2);
                if (c25225c.m28501L() == this.f96660a.m28516N()) {
                    m101273j.m101272a(m93230d, c25225c);
                } else {
                    m101273j.m101271b(m93230d, c25225c);
                }
            }
        }
        return (P) C34830Nt4.m93220n(m101273j.m101269d(), cls);
    }

    /* renamed from: l */
    public void m26869l(InterfaceC47055pl2 interfaceC47055pl2, InterfaceC27152p8 interfaceC27152p8) throws GeneralSecurityException, IOException {
        m26868m(interfaceC47055pl2, interfaceC27152p8, new byte[0]);
    }

    /* renamed from: m */
    public void m26868m(InterfaceC47055pl2 interfaceC47055pl2, InterfaceC27152p8 interfaceC27152p8, byte[] bArr) throws GeneralSecurityException, IOException {
        interfaceC47055pl2.mo18796a(m26877d(this.f96660a, interfaceC27152p8, bArr));
    }

    public String toString() {
        return m26874g().toString();
    }
}
