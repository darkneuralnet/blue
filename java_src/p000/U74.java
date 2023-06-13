package p000;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
/* renamed from: U74 */
/* loaded from: classes6.dex */
public final class U74 {

    /* renamed from: a */
    public final ZO1 f36880a;

    public U74(ZO1 zo1) {
        this.f36880a = zo1;
    }

    /* renamed from: a */
    public LatLng m81935a(Point point) {
        Preconditions.checkNotNull(point);
        try {
            return this.f36880a.mo44336f1(BinderC36557Vd3.m79636e5(point));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public VisibleRegion m81934b() {
        try {
            return this.f36880a.mo44337D2();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public Point m81933c(LatLng latLng) {
        Preconditions.checkNotNull(latLng);
        try {
            return (Point) BinderC36557Vd3.m79637d5(this.f36880a.mo44335t2(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
