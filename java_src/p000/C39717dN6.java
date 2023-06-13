package p000;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
/* renamed from: dN6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39717dN6 {

    /* renamed from: b */
    public static final C42061hK6 f76536b = new C42061hK6("VerifySliceTaskHandler");

    /* renamed from: a */
    public final HK6 f76537a;

    public C39717dN6(HK6 hk6) {
        this.f76537a = hk6;
    }

    /* renamed from: a */
    public final void m44339a(C39106cN6 c39106cN6) {
        File m103996v = this.f76537a.m103996v(c39106cN6.f110336b, c39106cN6.f60479c, c39106cN6.f60480d, c39106cN6.f60481e);
        if (!m103996v.exists()) {
            throw new C49185tL6(String.format("Cannot find unverified files for slice %s.", c39106cN6.f60481e), c39106cN6.f110335a);
        }
        m44338b(c39106cN6, m103996v);
        File m103995w = this.f76537a.m103995w(c39106cN6.f110336b, c39106cN6.f60479c, c39106cN6.f60480d, c39106cN6.f60481e);
        if (!m103995w.exists()) {
            m103995w.mkdirs();
        }
        if (!m103996v.renameTo(m103995w)) {
            throw new C49185tL6(String.format("Failed to move slice %s after verification.", c39106cN6.f60481e), c39106cN6.f110335a);
        }
    }

    /* renamed from: b */
    public final void m44338b(C39106cN6 c39106cN6, File file) {
        try {
            File m104026C = this.f76537a.m104026C(c39106cN6.f110336b, c39106cN6.f60479c, c39106cN6.f60480d, c39106cN6.f60481e);
            if (!m104026C.exists()) {
                throw new C49185tL6(String.format("Cannot find metadata files for slice %s.", c39106cN6.f60481e), c39106cN6.f110335a);
            }
            try {
                if (!BM6.m114072a(C38513bN6.m64614a(file, m104026C)).equals(c39106cN6.f60482f)) {
                    throw new C49185tL6(String.format("Verification failed for slice %s.", c39106cN6.f60481e), c39106cN6.f110335a);
                }
                f76536b.m36535d("Verification of slice %s of pack %s successful.", c39106cN6.f60481e, c39106cN6.f110336b);
            } catch (IOException e) {
                throw new C49185tL6(String.format("Could not digest file during verification for slice %s.", c39106cN6.f60481e), e, c39106cN6.f110335a);
            } catch (NoSuchAlgorithmException e2) {
                throw new C49185tL6("SHA256 algorithm not supported.", e2, c39106cN6.f110335a);
            }
        } catch (IOException e3) {
            throw new C49185tL6(String.format("Could not reconstruct slice archive during verification for slice %s.", c39106cN6.f60481e), e3, c39106cN6.f110335a);
        }
    }
}
