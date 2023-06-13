package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* renamed from: rc0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48149rc0 {

    /* renamed from: a */
    public static InterfaceC42685iO1 f107311a;

    private C48149rc0() {
    }

    /* renamed from: a */
    public static C47556qc0 m15709a(CameraPosition cameraPosition) {
        Preconditions.checkNotNull(cameraPosition, "cameraPosition must not be null");
        try {
            return new C47556qc0(m15703g().mo34036Y2(cameraPosition));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public static C47556qc0 m15708b(LatLng latLng) {
        Preconditions.checkNotNull(latLng, "latLng must not be null");
        try {
            return new C47556qc0(m15703g().mo34033i4(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public static C47556qc0 m15707c(LatLngBounds latLngBounds, int i) {
        Preconditions.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            return new C47556qc0(m15703g().mo34035c2(latLngBounds, i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public static C47556qc0 m15706d(LatLngBounds latLngBounds, int i, int i2, int i3) {
        Preconditions.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            return new C47556qc0(m15703g().mo34034h0(latLngBounds, i, i2, i3));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public static C47556qc0 m15705e(LatLng latLng, float f) {
        Preconditions.checkNotNull(latLng, "latLng must not be null");
        try {
            return new C47556qc0(m15703g().mo34032u3(latLng, f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public static void m15704f(InterfaceC42685iO1 interfaceC42685iO1) {
        f107311a = (InterfaceC42685iO1) Preconditions.checkNotNull(interfaceC42685iO1);
    }

    /* renamed from: g */
    public static InterfaceC42685iO1 m15703g() {
        return (InterfaceC42685iO1) Preconditions.checkNotNull(f107311a, "CameraUpdateFactory is not initialized");
    }
}
