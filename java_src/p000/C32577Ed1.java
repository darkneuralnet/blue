package p000;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import p000.InterfaceC33981Kd1;
/* renamed from: Ed1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32577Ed1<T_WRAPPER extends InterfaceC33981Kd1<T_ENGINE>, T_ENGINE> {

    /* renamed from: b */
    public static final Logger f7877b = Logger.getLogger(C32577Ed1.class.getName());

    /* renamed from: c */
    public static final List<Provider> f7878c;

    /* renamed from: d */
    public static final boolean f7879d;

    /* renamed from: e */
    public static final C32577Ed1<InterfaceC33981Kd1.C4509a, Cipher> f7880e;

    /* renamed from: f */
    public static final C32577Ed1<InterfaceC33981Kd1.C4513e, Mac> f7881f;

    /* renamed from: g */
    public static final C32577Ed1<InterfaceC33981Kd1.C4515g, Signature> f7882g;

    /* renamed from: h */
    public static final C32577Ed1<InterfaceC33981Kd1.C4514f, MessageDigest> f7883h;

    /* renamed from: i */
    public static final C32577Ed1<InterfaceC33981Kd1.C4510b, KeyAgreement> f7884i;

    /* renamed from: j */
    public static final C32577Ed1<InterfaceC33981Kd1.C4512d, KeyPairGenerator> f7885j;

    /* renamed from: k */
    public static final C32577Ed1<InterfaceC33981Kd1.C4511c, KeyFactory> f7886k;

    /* renamed from: a */
    public final T_WRAPPER f7887a;

    static {
        if (V46.m80444c()) {
            f7878c = m108638b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f7879d = false;
        } else if (C50441vT5.m8617b()) {
            f7878c = m108638b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f7879d = true;
        } else {
            f7878c = new ArrayList();
            f7879d = true;
        }
        f7880e = new C32577Ed1<>(new InterfaceC33981Kd1.C4509a());
        f7881f = new C32577Ed1<>(new InterfaceC33981Kd1.C4513e());
        f7882g = new C32577Ed1<>(new InterfaceC33981Kd1.C4515g());
        f7883h = new C32577Ed1<>(new InterfaceC33981Kd1.C4514f());
        f7884i = new C32577Ed1<>(new InterfaceC33981Kd1.C4510b());
        f7885j = new C32577Ed1<>(new InterfaceC33981Kd1.C4512d());
        f7886k = new C32577Ed1<>(new InterfaceC33981Kd1.C4511c());
    }

    public C32577Ed1(T_WRAPPER t_wrapper) {
        this.f7887a = t_wrapper;
    }

    /* renamed from: b */
    public static List<Provider> m108638b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f7877b.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public T_ENGINE m108639a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : f7878c) {
            try {
                return (T_ENGINE) this.f7887a.mo98641a(str, provider);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f7879d) {
            return (T_ENGINE) this.f7887a.mo98641a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
