package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* renamed from: IA8 */
/* loaded from: classes5.dex */
public abstract class IA8 extends EB7 implements InterfaceC44408lH8 {
    public IA8() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // p000.EB7
    /* renamed from: c5 */
    public final boolean mo81212c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb((Status) C52195yQ7.m3510a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
