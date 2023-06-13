package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.List;
/* renamed from: DX3 */
/* loaded from: classes6.dex */
public final class DX3 {

    /* renamed from: a */
    public final InterfaceC34941Of7 f5859a;

    public DX3(InterfaceC34941Of7 interfaceC34941Of7) {
        this.f5859a = (InterfaceC34941Of7) Preconditions.checkNotNull(interfaceC34941Of7);
    }

    /* renamed from: a */
    public List<LatLng> m110285a() {
        try {
            return this.f5859a.mo91716b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public boolean m110284b() {
        try {
            return this.f5859a.mo91714l();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public void m110283c() {
        try {
            this.f5859a.mo91715f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public void m110282d(Object obj) {
        try {
            this.f5859a.mo91712r1(BinderC36557Vd3.m79636e5(obj));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public void m110281e(boolean z) {
        try {
            this.f5859a.mo91713q(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DX3)) {
            return false;
        }
        try {
            return this.f5859a.mo91717V4(((DX3) obj).f5859a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f5859a.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
