package p000;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* renamed from: cD1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39011cD1 {

    /* renamed from: a */
    public final InterfaceC49207tO1 f60308a;

    /* renamed from: b */
    public C51721xd6 f60309b;

    /* renamed from: cD1$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13459a {
    }

    /* renamed from: cD1$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13460b {
        View getInfoContents(C40889fM2 c40889fM2);

        View getInfoWindow(C40889fM2 c40889fM2);
    }

    /* renamed from: cD1$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC13461c {
        /* renamed from: a */
        void mo61661a();
    }

    /* renamed from: cD1$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC13462d {
        /* renamed from: a */
        void mo61660a();
    }

    /* renamed from: cD1$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC13463e {
        /* renamed from: a */
        void mo61659a();
    }

    /* renamed from: cD1$f */
    /* loaded from: classes6.dex */
    public interface InterfaceC13464f {
        /* renamed from: a */
        void mo61658a(int i);
    }

    /* renamed from: cD1$g */
    /* loaded from: classes6.dex */
    public interface InterfaceC13465g {
        /* renamed from: a */
        void mo61657a(C40816fE1 c40816fE1);
    }

    /* renamed from: cD1$h */
    /* loaded from: classes6.dex */
    public interface InterfaceC13466h {
        /* renamed from: b */
        void mo27414b(C40889fM2 c40889fM2);
    }

    /* renamed from: cD1$i */
    /* loaded from: classes6.dex */
    public interface InterfaceC13467i {
        /* renamed from: a */
        void mo61656a(C40889fM2 c40889fM2);
    }

    /* renamed from: cD1$j */
    /* loaded from: classes6.dex */
    public interface InterfaceC13468j {
        /* renamed from: a */
        void mo61655a(LatLng latLng);
    }

    /* renamed from: cD1$k */
    /* loaded from: classes6.dex */
    public interface InterfaceC13469k {
        /* renamed from: a */
        void mo61654a(LatLng latLng);
    }

    /* renamed from: cD1$l */
    /* loaded from: classes6.dex */
    public interface InterfaceC13470l {
        /* renamed from: c */
        boolean mo27413c(C40889fM2 c40889fM2);
    }

    /* renamed from: cD1$m */
    /* loaded from: classes6.dex */
    public interface InterfaceC13471m {
        void onMarkerDrag(C40889fM2 c40889fM2);

        void onMarkerDragEnd(C40889fM2 c40889fM2);

        void onMarkerDragStart(C40889fM2 c40889fM2);
    }

    /* renamed from: cD1$n */
    /* loaded from: classes6.dex */
    public interface InterfaceC13472n {
        /* renamed from: a */
        void mo61653a(DX3 dx3);
    }

    /* renamed from: cD1$o */
    /* loaded from: classes6.dex */
    public interface InterfaceC13473o {
    }

    public C39011cD1(InterfaceC49207tO1 interfaceC49207tO1) {
        this.f60308a = (InterfaceC49207tO1) Preconditions.checkNotNull(interfaceC49207tO1);
    }

    /* renamed from: A */
    public final void m61693A(InterfaceC13469k interfaceC13469k) {
        try {
            if (interfaceC13469k == null) {
                this.f60308a.mo12459L2(null);
            } else {
                this.f60308a.mo12459L2(new BinderC50748vy9(this, interfaceC13469k));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: B */
    public final void m61692B(InterfaceC13470l interfaceC13470l) {
        try {
            if (interfaceC13470l == null) {
                this.f60308a.mo12466G3(null);
            } else {
                this.f60308a.mo12466G3(new BinderC33060Ge7(this, interfaceC13470l));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: C */
    public final void m61691C(InterfaceC13471m interfaceC13471m) {
        try {
            if (interfaceC13471m == null) {
                this.f60308a.mo12448p2(null);
            } else {
                this.f60308a.mo12448p2(new BinderC38415bC7(this, interfaceC13471m));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: D */
    public final void m61690D(InterfaceC13472n interfaceC13472n) {
        try {
            if (interfaceC13472n == null) {
                this.f60308a.mo12449o3(null);
            } else {
                this.f60308a.mo12449o3(new BinderC43150j99(this, interfaceC13472n));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: E */
    public final void m61689E(InterfaceC13473o interfaceC13473o) {
        try {
            if (interfaceC13473o == null) {
                this.f60308a.mo12444u2(null);
            } else {
                this.f60308a.mo12444u2(new BinderC43424jd9(this, interfaceC13473o));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: F */
    public final void m61688F(int i, int i2, int i3, int i4) {
        try {
            this.f60308a.mo12452g4(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final C51775xj0 m61687a(CircleOptions circleOptions) {
        try {
            Preconditions.checkNotNull(circleOptions, "CircleOptions must not be null.");
            return new C51775xj0(this.f60308a.mo12468F1(circleOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final C40816fE1 m61686b(GroundOverlayOptions groundOverlayOptions) {
        try {
            Preconditions.checkNotNull(groundOverlayOptions, "GroundOverlayOptions must not be null.");
            C99 mo12464H2 = this.f60308a.mo12464H2(groundOverlayOptions);
            if (mo12464H2 != null) {
                return new C40816fE1(mo12464H2);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final C40889fM2 m61685c(MarkerOptions markerOptions) {
        try {
            Preconditions.checkNotNull(markerOptions, "MarkerOptions must not be null.");
            Ew9 mo12462J1 = this.f60308a.mo12462J1(markerOptions);
            if (mo12462J1 != null) {
                return new C40889fM2(mo12462J1);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final DX3 m61684d(PolygonOptions polygonOptions) {
        try {
            Preconditions.checkNotNull(polygonOptions, "PolygonOptions must not be null");
            return new DX3(this.f60308a.mo12453c0(polygonOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public final MX3 m61683e(PolylineOptions polylineOptions) {
        try {
            Preconditions.checkNotNull(polylineOptions, "PolylineOptions must not be null");
            return new MX3(this.f60308a.mo12469E1(polylineOptions));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public final void m61682f(C47556qc0 c47556qc0) {
        try {
            Preconditions.checkNotNull(c47556qc0, "CameraUpdate must not be null.");
            this.f60308a.mo12460L1(c47556qc0.m17327a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public final void m61681g(C47556qc0 c47556qc0, int i, InterfaceC13459a interfaceC13459a) {
        BinderC32601Ef7 binderC32601Ef7;
        try {
            Preconditions.checkNotNull(c47556qc0, "CameraUpdate must not be null.");
            InterfaceC49207tO1 interfaceC49207tO1 = this.f60308a;
            WO1 m17327a = c47556qc0.m17327a();
            if (interfaceC13459a == null) {
                binderC32601Ef7 = null;
            } else {
                binderC32601Ef7 = new BinderC32601Ef7(interfaceC13459a);
            }
            interfaceC49207tO1.mo12446r4(m17327a, i, binderC32601Ef7);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public final void m61680h() {
        try {
            this.f60308a.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public final CameraPosition m61679i() {
        try {
            return this.f60308a.mo12443v2();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public final float m61678j() {
        try {
            return this.f60308a.mo12463I1();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public final U74 m61677k() {
        try {
            return new U74(this.f60308a.getProjection());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public final C51721xd6 m61676l() {
        try {
            if (this.f60309b == null) {
                this.f60309b = new C51721xd6(this.f60308a.mo12458M1());
            }
            return this.f60309b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public final void m61675m(C47556qc0 c47556qc0) {
        try {
            Preconditions.checkNotNull(c47556qc0, "CameraUpdate must not be null.");
            this.f60308a.mo12465H1(c47556qc0.m17327a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: n */
    public final void m61674n(boolean z) {
        try {
            this.f60308a.mo12461K1(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public final boolean m61673o(boolean z) {
        try {
            return this.f60308a.mo12456R3(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: p */
    public final void m61672p(InterfaceC13460b interfaceC13460b) {
        try {
            if (interfaceC13460b == null) {
                this.f60308a.mo12447r3(null);
            } else {
                this.f60308a.mo12447r3(new BinderC49362te8(this, interfaceC13460b));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: q */
    public boolean m61671q(MapStyleOptions mapStyleOptions) {
        try {
            return this.f60308a.mo12450k4(mapStyleOptions);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: r */
    public final void m61670r(boolean z) {
        try {
            this.f60308a.mo12455U1(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: s */
    public final void m61669s(InterfaceC13461c interfaceC13461c) {
        try {
            if (interfaceC13461c == null) {
                this.f60308a.mo12457Q1(null);
            } else {
                this.f60308a.mo12457Q1(new BinderC50136uw9(this, interfaceC13461c));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: t */
    public final void m61668t(InterfaceC13462d interfaceC13462d) {
        try {
            if (interfaceC13462d == null) {
                this.f60308a.mo12470A2(null);
            } else {
                this.f60308a.mo12470A2(new BinderC44790lv9(this, interfaceC13462d));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: u */
    public final void m61667u(InterfaceC13463e interfaceC13463e) {
        try {
            if (interfaceC13463e == null) {
                this.f60308a.mo12441w3(null);
            } else {
                this.f60308a.mo12441w3(new Nt9(this, interfaceC13463e));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: v */
    public final void m61666v(InterfaceC13464f interfaceC13464f) {
        try {
            if (interfaceC13464f == null) {
                this.f60308a.mo12451i3(null);
            } else {
                this.f60308a.mo12451i3(new BinderC44760ls9(this, interfaceC13464f));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: w */
    public final void m61665w(InterfaceC13465g interfaceC13465g) {
        try {
            if (interfaceC13465g == null) {
                this.f60308a.mo12454a4(null);
            } else {
                this.f60308a.mo12454a4(new BinderC43977kZ8(this, interfaceC13465g));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: x */
    public final void m61664x(InterfaceC13466h interfaceC13466h) {
        try {
            if (interfaceC13466h == null) {
                this.f60308a.mo12442v3(null);
            } else {
                this.f60308a.mo12442v3(new NP7(this, interfaceC13466h));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: y */
    public final void m61663y(InterfaceC13467i interfaceC13467i) {
        try {
            if (interfaceC13467i == null) {
                this.f60308a.mo12445s2(null);
            } else {
                this.f60308a.mo12445s2(new BinderC45491n68(this, interfaceC13467i));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: z */
    public final void m61662z(InterfaceC13468j interfaceC13468j) {
        try {
            if (interfaceC13468j == null) {
                this.f60308a.mo12467G1(null);
            } else {
                this.f60308a.mo12467G1(new BinderC51331wx9(this, interfaceC13468j));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
