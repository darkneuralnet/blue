package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* renamed from: kH8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractBinderC43815kH8 extends DB7 implements MN8 {
    public AbstractBinderC43815kH8() {
        super("com.google.android.gms.auth.account.data.IBundleCallback");
    }

    @Override // p000.DB7
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo9427j((Status) C51602xQ7.m5273a(parcel, Status.CREATOR), (Bundle) C51602xQ7.m5273a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
