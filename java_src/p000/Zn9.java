package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: Zn9 */
/* loaded from: classes5.dex */
public abstract class Zn9 extends UB7 implements InterfaceC40569eo9 {
    /* renamed from: c5 */
    public static InterfaceC40569eo9 m72485c5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
        if (queryLocalInterface instanceof InterfaceC40569eo9) {
            return (InterfaceC40569eo9) queryLocalInterface;
        }
        return new Un9(iBinder);
    }
}
