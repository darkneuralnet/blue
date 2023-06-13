package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: RN8 */
/* loaded from: classes5.dex */
public abstract class RN8 extends KB7 implements QT8 {
    /* renamed from: d5 */
    public static QT8 m86782d5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        if (queryLocalInterface instanceof QT8) {
            return (QT8) queryLocalInterface;
        }
        return new C46187oH8(iBinder);
    }
}
