package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: Ih7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC33555Ih7 extends KB7 implements InterfaceC32160Ci7 {
    /* renamed from: d5 */
    public static InterfaceC32160Ci7 m101803d5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        if (queryLocalInterface instanceof InterfaceC32160Ci7) {
            return (InterfaceC32160Ci7) queryLocalInterface;
        }
        return new C34716Ng7(iBinder);
    }
}
