package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: OG8 */
/* loaded from: classes5.dex */
public abstract class OG8 extends UB7 implements InterfaceC48612sN8 {
    /* renamed from: c5 */
    public static InterfaceC48612sN8 m92580c5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
        if (queryLocalInterface instanceof InterfaceC48612sN8) {
            return (InterfaceC48612sN8) queryLocalInterface;
        }
        return new C43752kA8(iBinder);
    }
}
