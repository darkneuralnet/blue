package p000;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* renamed from: iO1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC42685iO1 extends IInterface {
    /* renamed from: Y2 */
    WO1 mo34036Y2(CameraPosition cameraPosition) throws RemoteException;

    /* renamed from: c2 */
    WO1 mo34035c2(LatLngBounds latLngBounds, int i) throws RemoteException;

    /* renamed from: h0 */
    WO1 mo34034h0(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException;

    /* renamed from: i4 */
    WO1 mo34033i4(LatLng latLng) throws RemoteException;

    /* renamed from: u3 */
    WO1 mo34032u3(LatLng latLng, float f) throws RemoteException;
}
