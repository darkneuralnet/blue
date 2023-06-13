package p000;

import com.google.android.gms.internal.clearcut.zzco;
/* renamed from: vW7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C50470vW7 {

    /* renamed from: d */
    public static final C50982wN7 f114215d = C50982wN7.m6953b();

    /* renamed from: a */
    public TD7 f114216a;

    /* renamed from: b */
    public volatile H28 f114217b;

    /* renamed from: c */
    public volatile TD7 f114218c;

    /* renamed from: a */
    public final int m8538a() {
        if (this.f114218c != null) {
            return this.f114218c.size();
        }
        if (this.f114217b != null) {
            return this.f114217b.mo51553o();
        }
        return 0;
    }

    /* renamed from: b */
    public final H28 m8537b(H28 h28) {
        if (this.f114217b == null) {
            synchronized (this) {
                if (this.f114217b == null) {
                    try {
                        this.f114217b = h28;
                        this.f114218c = TD7.f34940c;
                    } catch (zzco unused) {
                        this.f114217b = h28;
                        this.f114218c = TD7.f34940c;
                    }
                }
            }
        }
        return this.f114217b;
    }

    /* renamed from: c */
    public final H28 m8536c(H28 h28) {
        H28 h282 = this.f114217b;
        this.f114216a = null;
        this.f114218c = null;
        this.f114217b = h28;
        return h282;
    }

    /* renamed from: d */
    public final TD7 m8535d() {
        if (this.f114218c != null) {
            return this.f114218c;
        }
        synchronized (this) {
            if (this.f114218c != null) {
                return this.f114218c;
            }
            this.f114218c = this.f114217b == null ? TD7.f34940c : this.f114217b.mo51573k();
            return this.f114218c;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50470vW7) {
            C50470vW7 c50470vW7 = (C50470vW7) obj;
            H28 h28 = this.f114217b;
            H28 h282 = c50470vW7.f114217b;
            return (h28 == null && h282 == null) ? m8535d().equals(c50470vW7.m8535d()) : (h28 == null || h282 == null) ? h28 != null ? h28.equals(c50470vW7.m8537b(h28.mo29386v())) : m8537b(h282.mo29386v()).equals(h282) : h28.equals(h282);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
