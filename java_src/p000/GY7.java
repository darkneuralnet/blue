package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* renamed from: GY7 */
/* loaded from: classes5.dex */
public abstract class GY7 extends EB7 implements N68 {
    public GY7() {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
    }

    @Override // p000.EB7
    /* renamed from: c5 */
    public final boolean mo81212c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo952D3((Status) C52195yQ7.m3510a(parcel, Status.CREATOR), parcel.readInt());
            return true;
        }
        return false;
    }
}
