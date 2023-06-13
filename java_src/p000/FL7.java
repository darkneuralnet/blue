package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import p000.WO1;
/* renamed from: FL7 */
/* loaded from: classes5.dex */
public abstract class FL7 extends OB7 implements WL7 {
    public FL7() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static WL7 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof WL7) {
            return (WL7) queryLocalInterface;
        }
        return new C48001rL7(iBinder);
    }

    @Override // p000.OB7
    /* renamed from: c5 */
    public final boolean mo92634c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            AP7.m115815b(parcel);
            InterfaceC38496bL7 newBarcodeScanner = newBarcodeScanner(WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder()), (zzbc) AP7.m115816a(parcel, zzbc.CREATOR));
            parcel2.writeNoException();
            if (newBarcodeScanner == null) {
                parcel2.writeStrongBinder(null);
            } else {
                parcel2.writeStrongBinder(newBarcodeScanner.asBinder());
            }
            return true;
        }
        return false;
    }
}
