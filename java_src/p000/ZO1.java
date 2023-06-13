package p000;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
/* renamed from: ZO1 */
/* loaded from: classes6.dex */
public interface ZO1 extends IInterface {
    /* renamed from: D2 */
    VisibleRegion mo44337D2() throws RemoteException;

    /* renamed from: f1 */
    LatLng mo44336f1(WO1 wo1) throws RemoteException;

    /* renamed from: t2 */
    WO1 mo44335t2(LatLng latLng) throws RemoteException;
}
