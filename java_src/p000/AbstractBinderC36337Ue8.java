package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* renamed from: Ue8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC36337Ue8 extends EB7 implements InterfaceC33367Hm8 {
    public AbstractBinderC36337Ue8() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    @Override // p000.EB7
    /* renamed from: c5 */
    public final boolean mo81212c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo89912k3((Status) C52195yQ7.m3510a(parcel, Status.CREATOR), C52195yQ7.m3508c(parcel));
            return true;
        }
        return false;
    }
}
