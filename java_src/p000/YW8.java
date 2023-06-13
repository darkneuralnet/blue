package p000;

import com.google.android.gms.internal.measurement.zzll;
/* renamed from: YW8 */
/* loaded from: classes5.dex */
public class YW8 {

    /* renamed from: c */
    public static final TQ8 f45972c = TQ8.f35440c;

    /* renamed from: a */
    public volatile InterfaceC47814r19 f45973a;

    /* renamed from: b */
    public volatile AbstractC40913fO8 f45974b;

    /* renamed from: a */
    public final int m74939a() {
        if (this.f45974b != null) {
            return ((OM8) this.f45974b).f26443f.length;
        }
        if (this.f45973a != null) {
            return this.f45973a.mo16625m();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC40913fO8 m74938b() {
        if (this.f45974b != null) {
            return this.f45974b;
        }
        synchronized (this) {
            if (this.f45974b != null) {
                return this.f45974b;
            }
            if (this.f45973a == null) {
                this.f45974b = AbstractC40913fO8.f80055c;
            } else {
                this.f45974b = this.f45973a.mo16626g();
            }
            return this.f45974b;
        }
    }

    /* renamed from: c */
    public final void m74937c(InterfaceC47814r19 interfaceC47814r19) {
        if (this.f45973a != null) {
            return;
        }
        synchronized (this) {
            if (this.f45973a == null) {
                try {
                    this.f45973a = interfaceC47814r19;
                    this.f45974b = AbstractC40913fO8.f80055c;
                } catch (zzll unused) {
                    this.f45973a = interfaceC47814r19;
                    this.f45974b = AbstractC40913fO8.f80055c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YW8)) {
            return false;
        }
        YW8 yw8 = (YW8) obj;
        InterfaceC47814r19 interfaceC47814r19 = this.f45973a;
        InterfaceC47814r19 interfaceC47814r192 = yw8.f45973a;
        if (interfaceC47814r19 == null && interfaceC47814r192 == null) {
            return m74938b().equals(yw8.m74938b());
        }
        if (interfaceC47814r19 != null && interfaceC47814r192 != null) {
            return interfaceC47814r19.equals(interfaceC47814r192);
        }
        if (interfaceC47814r19 != null) {
            yw8.m74937c(interfaceC47814r19.mo19211f());
            return interfaceC47814r19.equals(yw8.f45973a);
        }
        m74937c(interfaceC47814r192.mo19211f());
        return this.f45973a.equals(interfaceC47814r192);
    }

    public int hashCode() {
        return 1;
    }
}
