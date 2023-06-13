package p000;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
/* renamed from: yb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52295yb7 {

    /* renamed from: c */
    public static final C34896Oa7 f119807c = C34896Oa7.f26796c;

    /* renamed from: a */
    public volatile InterfaceC36075Tb7 f119808a;

    /* renamed from: b */
    public volatile AbstractC32088Ca7 f119809b;

    /* renamed from: a */
    public final int m3195a() {
        if (this.f119809b != null) {
            return ((C52878za7) this.f119809b).f121563f.length;
        }
        if (this.f119808a != null) {
            return this.f119808a.mo41143d();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC32088Ca7 m3194b() {
        if (this.f119809b != null) {
            return this.f119809b;
        }
        synchronized (this) {
            if (this.f119809b != null) {
                return this.f119809b;
            }
            if (this.f119808a == null) {
                this.f119809b = AbstractC32088Ca7.f4281c;
            } else {
                this.f119809b = this.f119808a.mo41154s();
            }
            return this.f119809b;
        }
    }

    /* renamed from: c */
    public final InterfaceC36075Tb7 m3193c(InterfaceC36075Tb7 interfaceC36075Tb7) {
        InterfaceC36075Tb7 interfaceC36075Tb72 = this.f119808a;
        this.f119809b = null;
        this.f119808a = interfaceC36075Tb7;
        return interfaceC36075Tb72;
    }

    /* renamed from: d */
    public final void m3192d(InterfaceC36075Tb7 interfaceC36075Tb7) {
        if (this.f119808a != null) {
            return;
        }
        synchronized (this) {
            if (this.f119808a == null) {
                try {
                    this.f119808a = interfaceC36075Tb7;
                    this.f119809b = AbstractC32088Ca7.f4281c;
                } catch (zbuw unused) {
                    this.f119808a = interfaceC36075Tb7;
                    this.f119809b = AbstractC32088Ca7.f4281c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52295yb7)) {
            return false;
        }
        C52295yb7 c52295yb7 = (C52295yb7) obj;
        InterfaceC36075Tb7 interfaceC36075Tb7 = this.f119808a;
        InterfaceC36075Tb7 interfaceC36075Tb72 = c52295yb7.f119808a;
        if (interfaceC36075Tb7 == null && interfaceC36075Tb72 == null) {
            return m3194b().equals(c52295yb7.m3194b());
        }
        if (interfaceC36075Tb7 != null && interfaceC36075Tb72 != null) {
            return interfaceC36075Tb7.equals(interfaceC36075Tb72);
        }
        if (interfaceC36075Tb7 != null) {
            c52295yb7.m3192d(interfaceC36075Tb7.mo41139h());
            return interfaceC36075Tb7.equals(c52295yb7.f119808a);
        }
        m3192d(interfaceC36075Tb72.mo41139h());
        return this.f119808a.equals(interfaceC36075Tb72);
    }

    public int hashCode() {
        return 1;
    }
}
