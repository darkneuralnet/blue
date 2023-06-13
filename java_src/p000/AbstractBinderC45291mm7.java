package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: mm7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC45291mm7 extends MB7 implements InterfaceC41743gn7 {
    /* renamed from: c5 */
    public static InterfaceC41743gn7 m25022c5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        if (queryLocalInterface instanceof InterfaceC41743gn7) {
            return (InterfaceC41743gn7) queryLocalInterface;
        }
        return new C47060pl7(iBinder);
    }
}
