package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: f59  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC40738f59 extends KB7 implements C99 {
    /* renamed from: d5 */
    public static C99 m42097d5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (queryLocalInterface instanceof C99) {
            return (C99) queryLocalInterface;
        }
        return new HZ8(iBinder);
    }
}
