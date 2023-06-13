package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.internal.p031authapi.zbp;
import com.google.android.gms.internal.p031authapi.zbu;
/* renamed from: ua7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49914ua7 extends C51601xQ6 {
    public C49914ua7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    /* renamed from: c5 */
    public final void m10010c5(R97 r97, zbp zbpVar) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, r97);
        C49311tZ6.m12044b(zba, zbpVar);
        zbb(3, zba);
    }

    /* renamed from: d5 */
    public final void m10009d5(R97 r97, CredentialRequest credentialRequest) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, r97);
        C49311tZ6.m12044b(zba, credentialRequest);
        zbb(1, zba);
    }

    /* renamed from: e5 */
    public final void m10008e5(R97 r97, zbu zbuVar) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, r97);
        C49311tZ6.m12044b(zba, zbuVar);
        zbb(2, zba);
    }

    /* renamed from: f5 */
    public final void m10007f5(R97 r97) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, r97);
        zbb(4, zba);
    }
}
