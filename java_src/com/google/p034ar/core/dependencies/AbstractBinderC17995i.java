package com.google.p034ar.core.dependencies;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: com.google.ar.core.dependencies.i */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC17995i extends BinderC17990d implements InterfaceC17996j {
    public AbstractBinderC17995i() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    @Override // com.google.p034ar.core.dependencies.BinderC17990d
    /* renamed from: a */
    public final boolean mo48415a(int i, Parcel parcel) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                Bundle bundle = (Bundle) C17991e.m48422a(parcel, Bundle.CREATOR);
                C17991e.m48421b(parcel);
            } else {
                C17991e.m48421b(parcel);
                mo48384b((Bundle) C17991e.m48422a(parcel, Bundle.CREATOR));
            }
        } else {
            C17991e.m48421b(parcel);
            mo48383c((Bundle) C17991e.m48422a(parcel, Bundle.CREATOR));
        }
        return true;
    }
}
