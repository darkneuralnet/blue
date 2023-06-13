package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* renamed from: a59  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC37756a59 extends DB7 implements InterfaceC50857w99 {
    public AbstractBinderC37756a59() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // p000.DB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo7344j((Status) C51602xQ7.m5273a(parcel, Status.CREATOR), (Bundle) C51602xQ7.m5273a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
