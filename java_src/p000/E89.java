package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: E89 */
/* loaded from: classes5.dex */
public abstract class E89 extends QB7 implements M89 {
    /* renamed from: c5 */
    public static M89 m109344c5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        if (queryLocalInterface instanceof M89) {
            return (M89) queryLocalInterface;
        }
        return new C50847w89(iBinder);
    }
}
