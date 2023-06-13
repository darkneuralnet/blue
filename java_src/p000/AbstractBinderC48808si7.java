package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.recaptcha.zzai;
import com.google.android.gms.recaptcha.RecaptchaHandle;
/* renamed from: si7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC48808si7 extends XB7 implements InterfaceC45854nj7 {
    public AbstractBinderC48808si7() {
        super("com.google.android.gms.recaptcha.internal.IInitCallback");
    }

    @Override // p000.XB7
    /* renamed from: c5 */
    public final boolean mo13786c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            mo397o4((Status) KP7.m98912a(parcel, Status.CREATOR), (zzai) KP7.m98912a(parcel, zzai.CREATOR));
        } else {
            mo9794q1((Status) KP7.m98912a(parcel, Status.CREATOR), (RecaptchaHandle) KP7.m98912a(parcel, RecaptchaHandle.CREATOR));
        }
        return true;
    }
}
