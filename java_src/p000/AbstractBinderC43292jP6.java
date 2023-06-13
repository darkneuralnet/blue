package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* renamed from: jP6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC43292jP6 extends BinderC44469lO6 implements InterfaceC43885kP6 {
    public AbstractBinderC43292jP6() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // p000.BinderC44469lO6
    /* renamed from: c5 */
    public final boolean mo27338c5(int i, Parcel parcel) throws RemoteException {
        BP6 bp6 = null;
        if (i == 2) {
            Bundle bundle = (Bundle) C48027rO6.m16003a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                bp6 = queryLocalInterface instanceof BP6 ? (BP6) queryLocalInterface : new C44478lP6(readStrongBinder);
            }
            mo29014A4(bundle, bp6);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) C48027rO6.m16003a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                bp6 = queryLocalInterface2 instanceof BP6 ? (BP6) queryLocalInterface2 : new C44478lP6(readStrongBinder2);
            }
            mo29013L4(bp6);
            return true;
        }
    }
}
