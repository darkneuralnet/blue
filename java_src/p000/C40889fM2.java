package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* renamed from: fM2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40889fM2 {

    /* renamed from: a */
    public final Ew9 f79914a;

    public C40889fM2(Ew9 ew9) {
        this.f79914a = (Ew9) Preconditions.checkNotNull(ew9);
    }

    /* renamed from: a */
    public String m41533a() {
        try {
            return this.f79914a.mo44839c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public LatLng m41532b() {
        try {
            return this.f79914a.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public Object m41531c() {
        try {
            return BinderC36557Vd3.m79637d5(this.f79914a.zzh());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public void m41530d() {
        try {
            this.f79914a.mo44840b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public boolean m41529e() {
        try {
            return this.f79914a.mo44832o();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C40889fM2)) {
            return false;
        }
        try {
            return this.f79914a.mo44844K4(((C40889fM2) obj).f79914a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public void m41528f() {
        try {
            this.f79914a.mo44838e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public void m41527g(float f) {
        try {
            this.f79914a.mo44831p(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public void m41526h(float f, float f2) {
        try {
            this.f79914a.mo44843W1(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f79914a.zzg();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public void m41525i(boolean z) {
        try {
            this.f79914a.mo44834m1(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public void m41524j(boolean z) {
        try {
            this.f79914a.mo44829y1(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public void m41523k(C6378PT c6378pt) {
        try {
            if (c6378pt == null) {
                this.f79914a.mo44833n(null);
                return;
            }
            this.f79914a.mo44833n(c6378pt.m90218a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public void m41522l(float f, float f2) {
        try {
            this.f79914a.mo44845F2(f, f2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public void m41521m(LatLng latLng) {
        if (latLng != null) {
            try {
                this.f79914a.mo44828z3(latLng);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    /* renamed from: n */
    public void m41520n(float f) {
        try {
            this.f79914a.mo44837k2(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public void m41519o(String str) {
        try {
            this.f79914a.mo44836l4(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: p */
    public void m41518p(Object obj) {
        try {
            this.f79914a.mo44841a2(BinderC36557Vd3.m79636e5(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: q */
    public void m41517q(String str) {
        try {
            this.f79914a.mo44846D4(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: r */
    public void m41516r(boolean z) {
        try {
            this.f79914a.mo44830q(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: s */
    public void m41515s(float f) {
        try {
            this.f79914a.mo44842X(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: t */
    public void m41514t() {
        try {
            this.f79914a.mo44835m();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
