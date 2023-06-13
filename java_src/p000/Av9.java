package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: Av9 */
/* loaded from: classes5.dex */
public abstract class Av9 extends KB7 implements Ew9 {
    /* renamed from: d5 */
    public static Ew9 m114831d5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof Ew9) {
            return (Ew9) queryLocalInterface;
        }
        return new C39444cu9(iBinder);
    }
}
