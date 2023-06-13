package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: uq9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC50076uq9 extends MB7 implements InterfaceC51854xq9 {
    /* renamed from: c5 */
    public static InterfaceC51854xq9 m9657c5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof InterfaceC51854xq9) {
            return (InterfaceC51854xq9) queryLocalInterface;
        }
        return new C48298rq9(iBinder);
    }
}
