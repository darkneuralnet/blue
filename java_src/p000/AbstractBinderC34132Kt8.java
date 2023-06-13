package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: Kt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC34132Kt8 extends KB7 implements MA8 {
    /* renamed from: d5 */
    public static MA8 m98198d5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface instanceof MA8) {
            return (MA8) queryLocalInterface;
        }
        return new C34303Lm8(iBinder);
    }
}
