package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbu;
import java.util.List;
import p000.WO1;
/* renamed from: LK7 */
/* loaded from: classes5.dex */
public abstract class LK7 extends OB7 implements InterfaceC38496bL7 {
    public LK7() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // p000.OB7
    /* renamed from: c5 */
    public final boolean mo92634c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                AP7.m115815b(parcel);
                List mo64637E4 = mo64637E4(WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder()), (zzbu) AP7.m115816a(parcel, zzbu.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(mo64637E4);
            } else {
                zzd();
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
