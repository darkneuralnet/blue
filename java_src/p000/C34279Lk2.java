package p000;

import java.security.GeneralSecurityException;
/* renamed from: Lk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34279Lk2 {
    private C34279Lk2() {
    }

    /* renamed from: a */
    public static C33811Jk2 m96382a(String str) throws GeneralSecurityException {
        C33811Jk2 c33811Jk2 = C34830Nt4.m93226h().get(str);
        if (c33811Jk2 != null) {
            return c33811Jk2;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
