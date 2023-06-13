package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: L68 */
/* loaded from: classes5.dex */
public abstract class L68 extends PC7 implements InterfaceC35869Se8 {
    /* renamed from: c5 */
    public static InterfaceC35869Se8 m97762c5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof InterfaceC35869Se8) {
            return (InterfaceC35869Se8) queryLocalInterface;
        }
        return new EY7(iBinder);
    }
}
