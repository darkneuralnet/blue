package p000;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
/* renamed from: pm4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47067pm4 {
    private C47067pm4() {
    }

    /* renamed from: a */
    public static Signature m18719a(C42271hh2 c42271hh2, Provider provider) throws JOSEException {
        Signature m18718b;
        Signature m18717c;
        Signature m18718b2;
        Signature m18717c2;
        Signature m18718b3;
        Signature m18717c3;
        Signature m18718b4;
        Signature m18718b5;
        Signature m18718b6;
        if (c42271hh2.equals(C42271hh2.f85666h) && (m18718b6 = m18718b("SHA256withRSA", provider)) != null) {
            return m18718b6;
        }
        if (c42271hh2.equals(C42271hh2.f85667i) && (m18718b5 = m18718b("SHA384withRSA", provider)) != null) {
            return m18718b5;
        }
        if (c42271hh2.equals(C42271hh2.f85668j) && (m18718b4 = m18718b("SHA512withRSA", provider)) != null) {
            return m18718b4;
        }
        C42271hh2 c42271hh22 = C42271hh2.f85673o;
        if (c42271hh2.equals(c42271hh22) && (m18717c3 = m18717c("RSASSA-PSS", provider, new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1))) != null) {
            return m18717c3;
        }
        if (c42271hh2.equals(c42271hh22) && (m18718b3 = m18718b("SHA256withRSAandMGF1", provider)) != null) {
            return m18718b3;
        }
        C42271hh2 c42271hh23 = C42271hh2.f85674p;
        if (c42271hh2.equals(c42271hh23) && (m18717c2 = m18717c("RSASSA-PSS", provider, new PSSParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, 48, 1))) != null) {
            return m18717c2;
        }
        if (c42271hh2.equals(c42271hh23) && (m18718b2 = m18718b("SHA384withRSAandMGF1", provider)) != null) {
            return m18718b2;
        }
        C42271hh2 c42271hh24 = C42271hh2.f85675q;
        if (c42271hh2.equals(c42271hh24) && (m18717c = m18717c("RSASSA-PSS", provider, new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1))) != null) {
            return m18717c;
        }
        if (c42271hh2.equals(c42271hh24) && (m18718b = m18718b("SHA512withRSAandMGF1", provider)) != null) {
            return m18718b;
        }
        throw new JOSEException(C3900J9.m101092d(c42271hh2, AbstractC47660qm4.f105780c));
    }

    /* renamed from: b */
    public static Signature m18718b(String str, Provider provider) throws JOSEException {
        return m18717c(str, provider, null);
    }

    /* renamed from: c */
    public static Signature m18717c(String str, Provider provider, PSSParameterSpec pSSParameterSpec) throws JOSEException {
        Signature signature;
        try {
            if (provider != null) {
                signature = Signature.getInstance(str, provider);
            } else {
                signature = Signature.getInstance(str);
            }
            if (pSSParameterSpec != null) {
                try {
                    signature.setParameter(pSSParameterSpec);
                } catch (InvalidAlgorithmParameterException e) {
                    throw new JOSEException("Invalid RSASSA-PSS salt length parameter: " + e.getMessage(), e);
                }
            }
            return signature;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
