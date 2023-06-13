package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zzov;
/* renamed from: Rc9 */
/* loaded from: classes5.dex */
public class Rc9 {

    /* renamed from: c */
    public static final N89 f32348c = N89.m94318a();

    /* renamed from: a */
    public volatile InterfaceC47012pg9 f32349a;

    /* renamed from: b */
    public volatile T69 f32350b;

    /* renamed from: a */
    public final int m86542a() {
        if (this.f32350b != null) {
            return ((C50827w69) this.f32350b).f115381f.length;
        }
        if (this.f32349a != null) {
            return this.f32349a.mo9989i();
        }
        return 0;
    }

    /* renamed from: b */
    public final T69 m86541b() {
        if (this.f32350b != null) {
            return this.f32350b;
        }
        synchronized (this) {
            if (this.f32350b != null) {
                return this.f32350b;
            }
            if (this.f32349a == null) {
                this.f32350b = T69.f34797c;
            } else {
                this.f32350b = this.f32349a.mo18995h();
            }
            return this.f32350b;
        }
    }

    /* renamed from: c */
    public final void m86540c(InterfaceC47012pg9 interfaceC47012pg9) {
        if (this.f32349a != null) {
            return;
        }
        synchronized (this) {
            if (this.f32349a == null) {
                try {
                    this.f32349a = interfaceC47012pg9;
                    this.f32350b = T69.f34797c;
                } catch (zzov unused) {
                    this.f32349a = interfaceC47012pg9;
                    this.f32350b = T69.f34797c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rc9)) {
            return false;
        }
        Rc9 rc9 = (Rc9) obj;
        InterfaceC47012pg9 interfaceC47012pg9 = this.f32349a;
        InterfaceC47012pg9 interfaceC47012pg92 = rc9.f32349a;
        if (interfaceC47012pg9 == null && interfaceC47012pg92 == null) {
            return m86541b().equals(rc9.m86541b());
        }
        if (interfaceC47012pg9 != null && interfaceC47012pg92 != null) {
            return interfaceC47012pg9.equals(interfaceC47012pg92);
        }
        if (interfaceC47012pg9 != null) {
            rc9.m86540c(interfaceC47012pg9.mo6491g());
            return interfaceC47012pg9.equals(rc9.f32349a);
        }
        m86540c(interfaceC47012pg92.mo6491g());
        return this.f32349a.equals(interfaceC47012pg92);
    }

    public int hashCode() {
        return 1;
    }
}
