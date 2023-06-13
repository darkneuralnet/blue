package p000;

import java.security.SecureRandom;
/* renamed from: dn4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39961dn4 {

    /* renamed from: a */
    public static final ThreadLocal<SecureRandom> f77220a = new C19860a();

    /* renamed from: dn4$a */
    /* loaded from: classes6.dex */
    public class C19860a extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public SecureRandom initialValue() {
            return C39961dn4.m43715b();
        }
    }

    private C39961dn4() {
    }

    /* renamed from: b */
    public static SecureRandom m43715b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: c */
    public static byte[] m43714c(int i) {
        byte[] bArr = new byte[i];
        f77220a.get().nextBytes(bArr);
        return bArr;
    }
}
