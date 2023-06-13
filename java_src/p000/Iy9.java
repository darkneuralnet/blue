package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: Iy9 */
/* loaded from: classes5.dex */
public abstract class Iy9 extends KB7 implements InterfaceC34941Of7 {
    /* renamed from: d5 */
    public static InterfaceC34941Of7 m101413d5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (queryLocalInterface instanceof InterfaceC34941Of7) {
            return (InterfaceC34941Of7) queryLocalInterface;
        }
        return new Ix9(iBinder);
    }
}
