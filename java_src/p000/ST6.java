package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;
/* renamed from: ST6 */
/* loaded from: classes5.dex */
public final class ST6 extends C51601xQ6 {
    public ST6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    /* renamed from: c5 */
    public final void m85375c5(InterfaceC39865dd7 interfaceC39865dd7, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, interfaceC39865dd7);
        C49311tZ6.m12044b(zba, beginSignInRequest);
        zbb(1, zba);
    }

    /* renamed from: d5 */
    public final void m85374d5(InterfaceC39753dR6 interfaceC39753dR6, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, interfaceC39753dR6);
        C49311tZ6.m12044b(zba, getSignInIntentRequest);
        zbb(3, zba);
    }

    /* renamed from: e5 */
    public final void m85373e5(IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, iStatusCallback);
        zba.writeString(str);
        zbb(2, zba);
    }
}
