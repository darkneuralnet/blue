package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.IntegerOverflowException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: hA0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41965hA0 {

    /* renamed from: a */
    public static final Set<C36312Uc1> f84763a;

    /* renamed from: b */
    public static final Map<Integer, Set<C36312Uc1>> f84764b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C36312Uc1 c36312Uc1 = C36312Uc1.f37664f;
        linkedHashSet.add(c36312Uc1);
        C36312Uc1 c36312Uc12 = C36312Uc1.f37665g;
        linkedHashSet.add(c36312Uc12);
        C36312Uc1 c36312Uc13 = C36312Uc1.f37666h;
        linkedHashSet.add(c36312Uc13);
        C36312Uc1 c36312Uc14 = C36312Uc1.f37669k;
        linkedHashSet.add(c36312Uc14);
        C36312Uc1 c36312Uc15 = C36312Uc1.f37670l;
        linkedHashSet.add(c36312Uc15);
        C36312Uc1 c36312Uc16 = C36312Uc1.f37671m;
        linkedHashSet.add(c36312Uc16);
        C36312Uc1 c36312Uc17 = C36312Uc1.f37667i;
        linkedHashSet.add(c36312Uc17);
        C36312Uc1 c36312Uc18 = C36312Uc1.f37668j;
        linkedHashSet.add(c36312Uc18);
        C36312Uc1 c36312Uc19 = C36312Uc1.f37672n;
        linkedHashSet.add(c36312Uc19);
        f84763a = Collections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(c36312Uc14);
        hashSet2.add(c36312Uc15);
        hashSet3.add(c36312Uc16);
        hashSet3.add(c36312Uc1);
        hashSet3.add(c36312Uc17);
        hashSet3.add(c36312Uc19);
        hashSet4.add(c36312Uc12);
        hashSet5.add(c36312Uc13);
        hashSet5.add(c36312Uc18);
        hashMap.put(128, Collections.unmodifiableSet(hashSet));
        hashMap.put(192, Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, Collections.unmodifiableSet(hashSet3));
        hashMap.put(384, Collections.unmodifiableSet(hashSet4));
        hashMap.put(512, Collections.unmodifiableSet(hashSet5));
        f84764b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static void m36770a(SecretKey secretKey, C36312Uc1 c36312Uc1) throws KeyLengthException {
        try {
            if (c36312Uc1.m81265b() == N70.m94355f(secretKey.getEncoded())) {
                return;
            }
            throw new KeyLengthException("The Content Encryption Key (CEK) length for " + c36312Uc1 + " must be " + c36312Uc1.m81265b() + " bits");
        } catch (IntegerOverflowException e) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static byte[] m36769b(C38696bh2 c38696bh2, C3824Iy c3824Iy, C3824Iy c3824Iy2, C3824Iy c3824Iy3, C3824Iy c3824Iy4, SecretKey secretKey, C39289ch2 c39289ch2) throws JOSEException {
        byte[] m31307c;
        m36770a(secretKey, c38696bh2.m64167t());
        byte[] m62052b = C13360c.m62052b(c38696bh2);
        if (!c38696bh2.m64167t().equals(C36312Uc1.f37664f) && !c38696bh2.m64167t().equals(C36312Uc1.f37665g) && !c38696bh2.m64167t().equals(C36312Uc1.f37666h)) {
            if (!c38696bh2.m64167t().equals(C36312Uc1.f37669k) && !c38696bh2.m64167t().equals(C36312Uc1.f37670l) && !c38696bh2.m64167t().equals(C36312Uc1.f37671m)) {
                if (!c38696bh2.m64167t().equals(C36312Uc1.f37667i) && !c38696bh2.m64167t().equals(C36312Uc1.f37668j)) {
                    if (c38696bh2.m64167t().equals(C36312Uc1.f37672n)) {
                        m31307c = C51520xH6.m5572a(secretKey, c3824Iy2.m104549a(), c3824Iy3.m104549a(), m62052b, c3824Iy4.m104549a());
                    } else {
                        throw new JOSEException(C3900J9.m101094b(c38696bh2.m64167t(), f84763a));
                    }
                } else {
                    m31307c = C24678j.m31306d(c38696bh2, secretKey, c3824Iy, c3824Iy2, c3824Iy3, c3824Iy4, c39289ch2.m61055d(), c39289ch2.m61053f());
                }
            } else {
                m31307c = C25580l.m28037c(secretKey, c3824Iy2.m104549a(), c3824Iy3.m104549a(), m62052b, c3824Iy4.m104549a(), c39289ch2.m61055d());
            }
        } else {
            m31307c = C24678j.m31307c(secretKey, c3824Iy2.m104549a(), c3824Iy3.m104549a(), m62052b, c3824Iy4.m104549a(), c39289ch2.m61055d(), c39289ch2.m61053f());
        }
        return C45748nZ0.m23538b(c38696bh2, m31307c);
    }

    /* renamed from: c */
    public static C37285Yg2 m36768c(C38696bh2 c38696bh2, byte[] bArr, SecretKey secretKey, C3824Iy c3824Iy, C39289ch2 c39289ch2) throws JOSEException {
        byte[] m31302h;
        C1996Eq m31304f;
        byte[] bArr2;
        m36770a(secretKey, c38696bh2.m64167t());
        byte[] m23539a = C45748nZ0.m23539a(c38696bh2, bArr);
        byte[] m62052b = C13360c.m62052b(c38696bh2);
        if (!c38696bh2.m64167t().equals(C36312Uc1.f37664f) && !c38696bh2.m64167t().equals(C36312Uc1.f37665g) && !c38696bh2.m64167t().equals(C36312Uc1.f37666h)) {
            if (!c38696bh2.m64167t().equals(C36312Uc1.f37669k) && !c38696bh2.m64167t().equals(C36312Uc1.f37670l) && !c38696bh2.m64167t().equals(C36312Uc1.f37671m)) {
                if (!c38696bh2.m64167t().equals(C36312Uc1.f37667i) && !c38696bh2.m64167t().equals(C36312Uc1.f37668j)) {
                    if (c38696bh2.m64167t().equals(C36312Uc1.f37672n)) {
                        C50157uz0 c50157uz0 = new C50157uz0(null);
                        m31304f = C51520xH6.m5571b(secretKey, c50157uz0, m23539a, m62052b);
                        bArr2 = (byte[]) c50157uz0.m9420a();
                    } else {
                        throw new JOSEException(C3900J9.m101094b(c38696bh2.m64167t(), f84763a));
                    }
                } else {
                    m31302h = C24678j.m31302h(c39289ch2.m113689b());
                    m31304f = C24678j.m31303g(c38696bh2, secretKey, c3824Iy, m31302h, m23539a, c39289ch2.m61055d(), c39289ch2.m61053f());
                }
            } else {
                C50157uz0 c50157uz02 = new C50157uz0(C25580l.m28035e(c39289ch2.m113689b()));
                m31304f = C25580l.m28036d(secretKey, c50157uz02, m23539a, m62052b, c39289ch2.m61055d());
                bArr2 = (byte[]) c50157uz02.m9420a();
            }
            return new C37285Yg2(c38696bh2, c3824Iy, C3824Iy.m101442e(bArr2), C3824Iy.m101442e(m31304f.m108333b()), C3824Iy.m101442e(m31304f.m108334a()));
        }
        m31302h = C24678j.m31302h(c39289ch2.m113689b());
        m31304f = C24678j.m31304f(secretKey, m31302h, m23539a, m62052b, c39289ch2.m61055d(), c39289ch2.m61053f());
        bArr2 = m31302h;
        return new C37285Yg2(c38696bh2, c3824Iy, C3824Iy.m101442e(bArr2), C3824Iy.m101442e(m31304f.m108333b()), C3824Iy.m101442e(m31304f.m108334a()));
    }

    /* renamed from: d */
    public static SecretKey m36767d(C36312Uc1 c36312Uc1, SecureRandom secureRandom) throws JOSEException {
        Set<C36312Uc1> set = f84763a;
        if (set.contains(c36312Uc1)) {
            byte[] bArr = new byte[N70.m94358c(c36312Uc1.m81265b())];
            secureRandom.nextBytes(bArr);
            return new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        }
        throw new JOSEException(C3900J9.m101094b(c36312Uc1, set));
    }
}
