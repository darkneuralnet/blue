package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: tm8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC49442tm8 extends BinderC50290vC7 implements InterfaceC50105ut8 {
    public AbstractBinderC49442tm8() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // p000.BinderC50290vC7
    /* renamed from: c5 */
    public final boolean mo9023c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            C42116hQ7.m36431b(parcel);
            mo9544v1((Bundle) C42116hQ7.m36432a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
