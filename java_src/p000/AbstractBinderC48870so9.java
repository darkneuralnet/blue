package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: so9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC48870so9 extends UB7 implements InterfaceC51834xo9 {
    /* renamed from: c5 */
    public static InterfaceC51834xo9 m13612c5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        if (queryLocalInterface instanceof InterfaceC51834xo9) {
            return (InterfaceC51834xo9) queryLocalInterface;
        }
        return new C46499oo9(iBinder);
    }
}
