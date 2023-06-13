package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* renamed from: fE1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40816fE1 {

    /* renamed from: a */
    public final C99 f79705a;

    public C40816fE1(C99 c99) {
        this.f79705a = (C99) Preconditions.checkNotNull(c99);
    }

    /* renamed from: a */
    public Object m41708a() {
        try {
            return BinderC36557Vd3.m79637d5(this.f79705a.mo103722c());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public boolean m41707b() {
        try {
            return this.f79705a.mo103719m();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public void m41706c() {
        try {
            this.f79705a.mo103721e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public void m41705d(float f) {
        try {
            this.f79705a.mo103717p(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public void m41704e(float f) {
        try {
            this.f79705a.mo103720g1(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C40816fE1)) {
            return false;
        }
        try {
            return this.f79705a.mo103725N1(((C40816fE1) obj).f79705a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public void m41703f(C6378PT c6378pt) {
        Preconditions.checkNotNull(c6378pt, "imageDescriptor must not be null");
        try {
            this.f79705a.mo103718n(c6378pt.m90218a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public void m41702g(LatLng latLng) {
        try {
            this.f79705a.mo103723P2(latLng);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public void m41701h(Object obj) {
        try {
            this.f79705a.mo103724P0(BinderC36557Vd3.m79636e5(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f79705a.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public void m41700i(boolean z) {
        try {
            this.f79705a.mo103726A3(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
