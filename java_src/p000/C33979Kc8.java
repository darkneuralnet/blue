package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
/* renamed from: Kc8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C33979Kc8 {

    /* renamed from: c */
    public static final J28 f19945c = J28.f16697b;

    /* renamed from: a */
    public volatile InterfaceC39926dj8 f19946a;

    /* renamed from: b */
    public volatile AbstractC41604gZ7 f19947b;

    /* renamed from: a */
    public final int m98652a() {
        if (this.f19947b != null) {
            return ((C46330oX7) this.f19947b).f102128f.length;
        }
        if (this.f19946a != null) {
            return this.f19946a.mo43831l();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC41604gZ7 m98651b() {
        if (this.f19947b != null) {
            return this.f19947b;
        }
        synchronized (this) {
            if (this.f19947b != null) {
                return this.f19947b;
            }
            if (this.f19946a == null) {
                this.f19947b = AbstractC41604gZ7.f82424c;
            } else {
                this.f19947b = this.f19946a.mo43830y();
            }
            return this.f19947b;
        }
    }

    /* renamed from: c */
    public final InterfaceC39926dj8 m98650c(InterfaceC39926dj8 interfaceC39926dj8) {
        InterfaceC39926dj8 interfaceC39926dj82 = this.f19946a;
        this.f19947b = null;
        this.f19946a = interfaceC39926dj8;
        return interfaceC39926dj82;
    }

    /* renamed from: d */
    public final void m98649d(InterfaceC39926dj8 interfaceC39926dj8) {
        if (this.f19946a != null) {
            return;
        }
        synchronized (this) {
            if (this.f19946a == null) {
                try {
                    this.f19946a = interfaceC39926dj8;
                    this.f19947b = AbstractC41604gZ7.f82424c;
                } catch (zzeo unused) {
                    this.f19946a = interfaceC39926dj8;
                    this.f19947b = AbstractC41604gZ7.f82424c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33979Kc8)) {
            return false;
        }
        C33979Kc8 c33979Kc8 = (C33979Kc8) obj;
        InterfaceC39926dj8 interfaceC39926dj8 = this.f19946a;
        InterfaceC39926dj8 interfaceC39926dj82 = c33979Kc8.f19946a;
        if (interfaceC39926dj8 == null && interfaceC39926dj82 == null) {
            return m98651b().equals(c33979Kc8.m98651b());
        }
        if (interfaceC39926dj8 != null && interfaceC39926dj82 != null) {
            return interfaceC39926dj8.equals(interfaceC39926dj82);
        }
        if (interfaceC39926dj8 != null) {
            c33979Kc8.m98649d(interfaceC39926dj8.mo15533q());
            return interfaceC39926dj8.equals(c33979Kc8.f19946a);
        }
        m98649d(interfaceC39926dj82.mo15533q());
        return this.f19946a.equals(interfaceC39926dj82);
    }

    public int hashCode() {
        return 1;
    }
}
