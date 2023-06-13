package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import p000.C42301hk2;
import p000.C44090kl2;
import p000.C45276ml2;
/* renamed from: ri6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48215ri6 {

    /* renamed from: a */
    public static final Charset f107510a = Charset.forName(Constants.DEFAULT_ENCODING);

    private C48215ri6() {
    }

    /* renamed from: a */
    public static C45276ml2.C26195c m15555a(C44090kl2.C25225c c25225c) {
        return C45276ml2.C26195c.m25087L().m25081B(c25225c.m28502K().m35927L()).m25082A(c25225c.m28499N()).m25079z(c25225c.m28500M()).m25080y(c25225c.m28501L()).build();
    }

    /* renamed from: b */
    public static C45276ml2 m15554b(C44090kl2 c44090kl2) {
        C45276ml2.C26194b m25094z = C45276ml2.m25097L().m25094z(c44090kl2.m28516N());
        for (C44090kl2.C25225c c25225c : c44090kl2.m28517M()) {
            m25094z.m25095y(m15555a(c25225c));
        }
        return m25094z.build();
    }

    /* renamed from: c */
    public static void m15553c(C44090kl2.C25225c c25225c) throws GeneralSecurityException {
        if (c25225c.m28498O()) {
            if (c25225c.m28500M() != EnumC40189eA3.UNKNOWN_PREFIX) {
                if (c25225c.m28499N() != EnumC33577Ik2.UNKNOWN_STATUS) {
                    return;
                }
                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c25225c.m28501L())));
            }
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c25225c.m28501L())));
        }
        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c25225c.m28501L())));
    }

    /* renamed from: d */
    public static void m15552d(C44090kl2 c44090kl2) throws GeneralSecurityException {
        int m28516N = c44090kl2.m28516N();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (C44090kl2.C25225c c25225c : c44090kl2.m28517M()) {
            if (c25225c.m28499N() == EnumC33577Ik2.ENABLED) {
                m15553c(c25225c);
                if (c25225c.m28501L() == m28516N) {
                    if (!z) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (c25225c.m28502K().m35928K() != C42301hk2.EnumC22717c.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i != 0) {
            if (!z && !z2) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
