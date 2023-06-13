package p000;

import java.security.Provider;
import java.security.SecureRandom;
/* renamed from: ch2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39289ch2 extends C31903Bg2 {

    /* renamed from: c */
    public Provider f61074c;

    /* renamed from: d */
    public Provider f61075d;

    /* renamed from: e */
    public Provider f61076e;

    public C39289ch2() {
        this(null, null, null, null, null);
    }

    /* renamed from: d */
    public Provider m61055d() {
        Provider provider = this.f61075d;
        return provider != null ? provider : m113690a();
    }

    /* renamed from: e */
    public Provider m61054e() {
        Provider provider = this.f61074c;
        return provider != null ? provider : m113690a();
    }

    /* renamed from: f */
    public Provider m61053f() {
        Provider provider = this.f61076e;
        return provider != null ? provider : m113690a();
    }

    public C39289ch2(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.f61074c = provider2;
        this.f61075d = provider3;
        this.f61076e = provider4;
    }
}
