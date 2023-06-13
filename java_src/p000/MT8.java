package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
/* renamed from: MT8 */
/* loaded from: classes5.dex */
public abstract class MT8 extends DB7 implements CZ8 {
    public MT8() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    @Override // p000.DB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo6016j0((Status) C51602xQ7.m5273a(parcel, Status.CREATOR), (AccountChangeEventsResponse) C51602xQ7.m5273a(parcel, AccountChangeEventsResponse.CREATOR));
            return true;
        }
        return false;
    }
}
