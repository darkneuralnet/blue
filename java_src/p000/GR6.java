package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
/* renamed from: GR6 */
/* loaded from: classes5.dex */
public abstract class GR6 extends BinderC46931pY6 implements InterfaceC43319jS6 {
    public GR6() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // p000.BinderC46931pY6
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo30592N((Status) C49311tZ6.m12045a(parcel, Status.CREATOR), (SaveAccountLinkingTokenResult) C49311tZ6.m12045a(parcel, SaveAccountLinkingTokenResult.CREATOR));
            return true;
        }
        return false;
    }
}
