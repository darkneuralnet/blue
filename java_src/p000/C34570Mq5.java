package p000;

import java.security.GeneralSecurityException;
/* renamed from: Mq5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34570Mq5 {

    /* renamed from: a */
    public static final C34570Mq5 f23673a = new C34570Mq5();

    private C34570Mq5() {
    }

    /* renamed from: a */
    public static C34570Mq5 m94690a() {
        return f23673a;
    }

    /* renamed from: b */
    public static C34570Mq5 m94689b(C34570Mq5 c34570Mq5) throws GeneralSecurityException {
        if (c34570Mq5 != null) {
            return c34570Mq5;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
