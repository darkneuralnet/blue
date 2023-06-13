package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.recaptcha.zzx;
import com.google.android.gms.recaptcha.RecaptchaResultData;
/* renamed from: Bg7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC31908Bg7 extends XB7 implements InterfaceC52948zh7 {
    public AbstractBinderC31908Bg7() {
        super("com.google.android.gms.recaptcha.internal.IExecuteCallback");
    }

    @Override // p000.XB7
    /* renamed from: c5 */
    public final boolean mo13786c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            mo537B((Status) KP7.m98912a(parcel, Status.CREATOR), (zzx) KP7.m98912a(parcel, zzx.CREATOR));
        } else {
            mo536O((Status) KP7.m98912a(parcel, Status.CREATOR), (RecaptchaResultData) KP7.m98912a(parcel, RecaptchaResultData.CREATOR));
        }
        return true;
    }
}
