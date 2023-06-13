package p000;

import com.google.android.gms.internal.recaptcha.zzrr;
/* renamed from: ao9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38180ao9 {

    /* renamed from: c */
    public static final C48830sk9 f56338c = C48830sk9.m13736a();

    /* renamed from: a */
    public volatile Np9 f56339a;

    /* renamed from: b */
    public volatile AbstractC45836nh9 f56340b;

    /* renamed from: a */
    public final int m65454a() {
        if (this.f56340b != null) {
            return ((Xg9) this.f56340b).f43580f.length;
        }
        if (this.f56339a != null) {
            return this.f56339a.mo93341g();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC45836nh9 m65453b() {
        if (this.f56340b != null) {
            return this.f56340b;
        }
        synchronized (this) {
            if (this.f56340b != null) {
                return this.f56340b;
            }
            if (this.f56339a == null) {
                this.f56340b = AbstractC45836nh9.f100361c;
            } else {
                this.f56340b = this.f56339a.mo81210f();
            }
            return this.f56340b;
        }
    }

    /* renamed from: c */
    public final void m65452c(Np9 np9) {
        if (this.f56339a != null) {
            return;
        }
        synchronized (this) {
            if (this.f56339a == null) {
                try {
                    this.f56339a = np9;
                    this.f56340b = AbstractC45836nh9.f100361c;
                } catch (zzrr unused) {
                    this.f56339a = np9;
                    this.f56340b = AbstractC45836nh9.f100361c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38180ao9)) {
            return false;
        }
        C38180ao9 c38180ao9 = (C38180ao9) obj;
        Np9 np9 = this.f56339a;
        Np9 np92 = c38180ao9.f56339a;
        if (np9 == null && np92 == null) {
            return m65453b().equals(c38180ao9.m65453b());
        }
        if (np9 != null && np92 != null) {
            return np9.equals(np92);
        }
        if (np9 != null) {
            c38180ao9.m65452c(np9.mo64027h());
            return np9.equals(c38180ao9.f56339a);
        }
        m65452c(np92.mo64027h());
        return this.f56339a.equals(np92);
    }

    public int hashCode() {
        return 1;
    }
}
