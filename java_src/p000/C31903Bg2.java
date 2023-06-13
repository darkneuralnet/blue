package p000;

import java.security.Provider;
import java.security.SecureRandom;
/* renamed from: Bg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31903Bg2 {

    /* renamed from: a */
    public Provider f2682a;

    /* renamed from: b */
    public SecureRandom f2683b;

    public C31903Bg2() {
        this(null, null);
    }

    /* renamed from: a */
    public Provider m113690a() {
        return this.f2682a;
    }

    /* renamed from: b */
    public SecureRandom m113689b() {
        SecureRandom secureRandom = this.f2683b;
        return secureRandom != null ? secureRandom : new SecureRandom();
    }

    /* renamed from: c */
    public void m113688c(Provider provider) {
        this.f2682a = provider;
    }

    public C31903Bg2(Provider provider, SecureRandom secureRandom) {
        this.f2682a = provider;
        this.f2683b = secureRandom;
    }
}
