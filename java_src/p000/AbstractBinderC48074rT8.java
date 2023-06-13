package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: rT8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC48074rT8 extends QB7 implements InterfaceC41012fZ8 {
    /* renamed from: c5 */
    public static InterfaceC41012fZ8 m15921c5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        if (queryLocalInterface instanceof InterfaceC41012fZ8) {
            return (InterfaceC41012fZ8) queryLocalInterface;
        }
        return new C46834pN8(iBinder);
    }
}
