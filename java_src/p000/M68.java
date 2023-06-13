package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: M68 */
/* loaded from: classes5.dex */
public abstract class M68 extends DB7 implements InterfaceC36103Te8 {
    /* renamed from: c5 */
    public static InterfaceC36103Te8 m95812c5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface instanceof InterfaceC36103Te8) {
            return (InterfaceC36103Te8) queryLocalInterface;
        }
        return new FY7(iBinder);
    }
}
