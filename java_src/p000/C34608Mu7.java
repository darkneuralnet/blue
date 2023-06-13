package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
/* renamed from: Mu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C34608Mu7 {

    /* renamed from: c */
    public static final C53068zt7 f23801c = C53068zt7.m154a();

    /* renamed from: a */
    public volatile InterfaceC41230fv7 f23802a;

    /* renamed from: b */
    public volatile AbstractC44175kt7 f23803b;

    /* renamed from: a */
    public final int m94585a() {
        if (this.f23803b != null) {
            return ((C42989it7) this.f23803b).f91659f.length;
        }
        if (this.f23802a != null) {
            return this.f23802a.mo40440w();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC44175kt7 m94584b() {
        if (this.f23803b != null) {
            return this.f23803b;
        }
        synchronized (this) {
            if (this.f23803b != null) {
                return this.f23803b;
            }
            if (this.f23802a == null) {
                this.f23803b = AbstractC44175kt7.f95165c;
            } else {
                this.f23803b = this.f23802a.mo192g();
            }
            return this.f23803b;
        }
    }

    /* renamed from: c */
    public final InterfaceC41230fv7 m94583c(InterfaceC41230fv7 interfaceC41230fv7) {
        InterfaceC41230fv7 interfaceC41230fv72 = this.f23802a;
        this.f23803b = null;
        this.f23802a = interfaceC41230fv7;
        return interfaceC41230fv72;
    }

    /* renamed from: d */
    public final void m94582d(InterfaceC41230fv7 interfaceC41230fv7) {
        if (this.f23802a != null) {
            return;
        }
        synchronized (this) {
            if (this.f23802a == null) {
                try {
                    this.f23802a = interfaceC41230fv7;
                    this.f23803b = AbstractC44175kt7.f95165c;
                } catch (zzaqw unused) {
                    this.f23802a = interfaceC41230fv7;
                    this.f23803b = AbstractC44175kt7.f95165c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34608Mu7)) {
            return false;
        }
        C34608Mu7 c34608Mu7 = (C34608Mu7) obj;
        InterfaceC41230fv7 interfaceC41230fv7 = this.f23802a;
        InterfaceC41230fv7 interfaceC41230fv72 = c34608Mu7.f23802a;
        if (interfaceC41230fv7 == null && interfaceC41230fv72 == null) {
            return m94584b().equals(c34608Mu7.m94584b());
        }
        if (interfaceC41230fv7 != null && interfaceC41230fv72 != null) {
            return interfaceC41230fv7.equals(interfaceC41230fv72);
        }
        if (interfaceC41230fv7 != null) {
            c34608Mu7.m94582d(interfaceC41230fv7.zzw());
            return interfaceC41230fv7.equals(c34608Mu7.f23802a);
        }
        m94582d(interfaceC41230fv72.zzw());
        return this.f23802a.equals(interfaceC41230fv72);
    }

    public int hashCode() {
        return 1;
    }
}
