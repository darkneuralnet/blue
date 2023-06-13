package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
/* renamed from: Gd7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33051Gd7 extends C51601xQ6 {
    public C33051Gd7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    /* renamed from: c5 */
    public final void m104942c5(InterfaceC43319jS6 interfaceC43319jS6, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, interfaceC43319jS6);
        C49311tZ6.m12044b(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    /* renamed from: d5 */
    public final void m104941d5(InterfaceC46886pT6 interfaceC46886pT6, SavePasswordRequest savePasswordRequest) throws RemoteException {
        Parcel zba = zba();
        C49311tZ6.m12043c(zba, interfaceC46886pT6);
        C49311tZ6.m12044b(zba, savePasswordRequest);
        zbb(2, zba);
    }
}
