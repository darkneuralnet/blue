package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: A68 */
/* loaded from: classes6.dex */
public abstract class A68 extends BinderC50290vC7 implements InterfaceC33061Ge8 {
    /* renamed from: d5 */
    public static InterfaceC33061Ge8 m116091d5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        if (queryLocalInterface instanceof InterfaceC33061Ge8) {
            return (InterfaceC33061Ge8) queryLocalInterface;
        }
        return new C46932pY7(iBinder);
    }
}
